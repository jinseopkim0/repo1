#!/bin/bash
# This script allows generation of libraries that are composed of more than one
# service version. It is achieved by calling `generate_library.sh` without
# postprocessing for all service versions and then calling
# postprocess_library.sh at the end, once all libraries are ready.
#
# Arguments
# --generation_queries: a single string of comma-separated key-value groups separated by a
# pipe | (i.e. the groups are spearated by pipe, while a group's key-values are
# separated by comma). They key-value groups are in the form of `key=value` and will
# be converted to an argument to generate_library.sh (`--key value`).
#   example: "proto_path=google/cloud/asset/v1,destination_path=google-cloud-asset-v1-java,(...)|proto_path=google/cloud/asset/v1p2beta5,destination_path=google-cloud-asset-v1-java,(...)"
#   In this case, generate_library.sh will be called once with
#     generate_library.sh --proto_path google/cloud/asset/v1 --destination_path google-cloud-asset-v1-java
#     and once with
#     generate_library.sh --proto_path google/cloud/asset/v1p2bet5 --destination_path google-cloud-asset-v1p2beta5-java
# --versions_file: a file of newline-separated version strings in the form "module:released-version:current-version". The versions will be applied to the pom.xml files and readmes
#
# Prerequisites
# - Needs an `output` folder at the location of the calling shell. This folder
# is automatically detected by `generate_library.sh` and this script ensures it
# contains the necessary folders and files, specifically:
#   - A "google" folder found in the googleapis repository
#   - A "grafeas" folder found in the googleapis repository
# Note: googleapis repo is found in https://github.com/googleapis/googleapis.

set -xeo pipefail


script_dir=$(dirname "$(readlink -f "$0")")
library_generation_dir="${script_dir}"
source "${script_dir}/utilities.sh"
output_folder=$(get_output_folder)
mkdir -p "${output_folder}"

while [[ $# -gt 0 ]]; do
key="$1"
case $key in
  -g|--generation_queries)
    generation_queries="$2"
    ;;
  -r|--repository_path)
    repository_path="$2"
    ;;
  -v|--versions_file)
    versions_file="$2"
    ;;
  -p|--enable_postprocessing)
    enable_postprocessing="$2"
    ;;
  *)
    echo "Invalid option: [$1]"
    exit 1
    ;;
esac
shift
shift # past argument or value
done


pushd "${output_folder}"
if [[ "${repository_path}" == google-cloud-java/* ]]; then
  echo 'this is a monorepo library'
  library=$(echo "${repository_path}" | cut -d'/' -f2)
  sparse_clone "https://github.com/googleapis/google-cloud-java.git" "${library} google-cloud-pom-parent google-cloud-jar-parent versions.txt .github"
  versions_file="${versions_file:-"${output_folder}/google-cloud-java/versions.txt"}"
else
  echo 'this is a HW library'
  git clone "https://github.com/googleapis/${repository_path}.git"
  versions_file="${versions_file:-"${output_folder}/${repository_path}/versions.txt"}"
fi

owlbot_cli_source_folder=$(mktemp -d)
popd # output_folder

IFS="|"
for query in $generation_queries; do
  pushd "${output_folder}"
  arguments=$(py_util get_generate_library_arguments "${query}")
  arguments=$(py_util add_argument "${arguments}" "versions_file" "${versions_file}")
  # we postprocess only once after all versions were processed
  arguments=$(py_util add_argument "${arguments}" "enable_postprocessing" "false")
  proto_path=$(py_util get_argument_value_from_query "${query}" "proto_path")
  destination_path=$(py_util get_argument_value_from_query "${query}" "destination_path")

  # generate GAPIC client library
  echo "Generating library from ${proto_path}, to ${destination_path}..."
  echo "${arguments}" | xargs "${library_generation_dir}/generate_library.sh"
  echo "Generate library finished."

  if [[ "${enable_postprocessing}" == "true" ]]; then
    build_owlbot_cli_source_folder "${output_folder}/${repository_path}" "${owlbot_cli_source_folder}" "${output_folder}/${destination_path}"
  fi

  popd # output_folder
done

pushd "${output_folder}"

if [[ "${enable_postprocessing}" == "true" ]]; then
  "${library_generation_dir}"/postprocess_library.sh \
    "${output_folder}/${repository_path}" \
    "" \
    "${versions_file}" \
    "${owlbot_cli_source_folder}"
fi

popd # output_folder
