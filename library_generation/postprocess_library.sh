#!/bin/bash
#
# Main functions to interact with owlbot post-processor and postprocessing
# scripts


# Runs the owlbot post-processor docker image. The resulting post-processed
# library gets stored in `${output_folder}/workspace`
# Arguments
# 1 - workspace: the location of the grpc,proto and gapic libraries to be
# processed
# 2 - scripts_root: location of the generation scripts
# 3 - preprocessed_sources_path: used to transfer the raw grpc, proto and gapic
# libraries into the workspace via copy-code
# 4 - proto_path: googleapis path of the library. This is used to prepare the
# folder structure to run `owlbot-cli copy-code`
# 5 - versions_file: path to file containing versions to be applied to the poms
# 6 - output_folder: main workspace of the generation process
scripts_root=$(dirname "$(readlink -f "$0")")

workspace=$1
preprocessed_sources_path=$2
proto_path=$3
versions_file=$4
output_folder=$5

source "${scripts_root}"/utilities.sh

repository_root=$(echo "${preprocessed_sources_path}" | cut -d/ -f1)
repo_metadata_json_path=$(get_repo_metadata_json "${preprocessed_sources_path}" "${output_folder}")
cp "${repo_metadata_json_path}" "${workspace}"/.repo-metadata.json
owlbot_sha=$(get_owlbot_sha "${output_folder}" "${repository_root}")

# ensure pyenv scripts are available
eval "$(pyenv init --path)"
eval "$(pyenv init -)"
eval "$(pyenv virtualenv-init -)"
# create python virtualenv
python_version=$(cat "${scripts_root}/configuration/python-version")
if [ $(pyenv versions | grep "${python_version}" | wc -l) -eq 0 ]; then
  pyenv install "${python_version}"
fi
if [ $(pyenv virtualenvs | grep "${python_version}" | grep "postprocessing" | wc -l) -eq 0 ];then
  pyenv virtualenv "${python_version}" "postprocessing"
fi
pyenv activate "postprocessing"

# call owl-bot-copy
owlbot_staging_folder="${workspace}/owl-bot-staging"
mkdir -p "${owlbot_staging_folder}"
owlbot_postprocessor_image="gcr.io/cloud-devrel-public-resources/owlbot-java@sha256:${owlbot_sha}"



# copy existing pom, owlbot and version files if the source of truth repo is present
# pre-processed folders are ommited
if [[ -d "${output_folder}/${preprocessed_sources_path}" ]]; then
  rsync -avm \
    --include='*/' \
    --include='*.xml' \
    --include='owlbot.py' \
    --include='.OwlBot.yaml' \
    --exclude='*' \
    "${output_folder}/${preprocessed_sources_path}/" \
    "${workspace}"
fi

echo 'Running owl-bot-copy'
pre_processed_libs_folder="${output_folder}/pre-processed"
# By default (thanks to generation templates), .OwlBot.yaml `deep-copy` section
# references a wildcard pattern matching a folder
# ending with `-java` at the leaf of proto_path. 
mkdir -p "${pre_processed_libs_folder}/${proto_path}/generated-java"
folder_name=$(extract_folder_name "${preprocessed_sources_path}")
copy_directory_if_exists "${output_folder}/${preprocessed_sources_path}/proto-${folder_name}" \
  "${pre_processed_libs_folder}/${proto_path}/generated-java/proto-google-cloud-${folder_name}"
copy_directory_if_exists "${output_folder}/${preprocessed_sources_path}/grpc-${folder_name}" \
  "${pre_processed_libs_folder}/${proto_path}/generated-java/grpc-google-cloud-${folder_name}"
copy_directory_if_exists "${output_folder}/${preprocessed_sources_path}/gapic-${folder_name}" \
  "${pre_processed_libs_folder}/${proto_path}/generated-java/gapic-google-cloud-${folder_name}"
copy_directory_if_exists "${output_folder}/${preprocessed_sources_path}/samples" \
  "${pre_processed_libs_folder}/${proto_path}/generated-java/samples"
pushd "${pre_processed_libs_folder}"
# create an empty repository so owl-bot-copy can process this as a repo
# (cannot process non-git-repositories)
git init
git commit --allow-empty -m 'empty commit'
popd # pre_processed_libs_folder

owlbot_cli_image_sha=$(cat "${scripts_root}/configuration/owlbot-cli-sha" | grep "sha256")

docker run --rm \
  --user $(id -u):$(id -g) \
  -v "${workspace}:/repo" \
  -v "${pre_processed_libs_folder}:/pre-processed-libraries" \
  -w /repo \
  --env HOME=/tmp \
  gcr.io/cloud-devrel-public-resources/owlbot-cli@"${owlbot_cli_image_sha}" \
  copy-code \
  --source-repo-commit-hash=none \
  --source-repo=/pre-processed-libraries \
  --config-file=.OwlBot.yaml

# we clone the synthtool library and manually build it
pushd "${output_folder}"
if [ ! -d "synthtool" ]; then
  git clone https://github.com/googleapis/synthtool.git
  pushd "synthtool" 
  python3 -m pip install -e .
  python3 -m pip install -r requirements.in
  popd # synthtool
fi
popd # output_folder

# now we use the image to call owlbot.py
echo 'processing owlbot.py'

pushd "${scripts_root}/owlbot/src/"
python3 -m pip install -r requirements.in
popd # owlbot/src

# run the postprocessor
echo 'running owl-bot post-processor'
pushd "${workspace}"
bash "${scripts_root}/owlbot/bin/entrypoint.sh" "${scripts_root}" "${versions_file}" "${synthtool_image_id}"
popd # workspace
