/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.asset.v1.samples;

// [START 1.0_10_generated_assetServiceClient_searchAllIamPolicies_searchAllIamPoliciesRequestIterateAll]
import com.google.cloud.asset.v1.AssetServiceClient;
import com.google.cloud.asset.v1.IamPolicySearchResult;
import com.google.cloud.asset.v1.SearchAllIamPoliciesRequest;
import java.util.ArrayList;

public class SearchAllIamPoliciesSearchAllIamPoliciesRequestIterateAll {

  public static void main(String[] args) throws Exception {
    searchAllIamPoliciesSearchAllIamPoliciesRequestIterateAll();
  }

  public static void searchAllIamPoliciesSearchAllIamPoliciesRequestIterateAll() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
      SearchAllIamPoliciesRequest request =
          SearchAllIamPoliciesRequest.newBuilder()
              .setScope("scope109264468")
              .setQuery("query107944136")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .addAllAssetTypes(new ArrayList<String>())
              .setOrderBy("orderBy-1207110587")
              .build();
      for (IamPolicySearchResult element :
          assetServiceClient.searchAllIamPolicies(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END 1.0_10_generated_assetServiceClient_searchAllIamPolicies_searchAllIamPoliciesRequestIterateAll]