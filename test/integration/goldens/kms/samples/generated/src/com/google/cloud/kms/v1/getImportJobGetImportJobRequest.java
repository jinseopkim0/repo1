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
package com.google.cloud.kms.v1.samples;

// [START 1.0_10_generated_keyManagementServiceClient_getImportJob_getImportJobRequest]
import com.google.cloud.kms.v1.GetImportJobRequest;
import com.google.cloud.kms.v1.ImportJob;
import com.google.cloud.kms.v1.ImportJobName;
import com.google.cloud.kms.v1.KeyManagementServiceClient;

public class GetImportJobGetImportJobRequest {

  public static void main(String[] args) throws Exception {
    getImportJobGetImportJobRequest();
  }

  public static void getImportJobGetImportJobRequest() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (KeyManagementServiceClient keyManagementServiceClient =
        KeyManagementServiceClient.create()) {
      GetImportJobRequest request =
          GetImportJobRequest.newBuilder()
              .setName(
                  ImportJobName.of("[PROJECT]", "[LOCATION]", "[KEY_RING]", "[IMPORT_JOB]")
                      .toString())
              .build();
      ImportJob response = keyManagementServiceClient.getImportJob(request);
    }
  }
}
// [END 1.0_10_generated_keyManagementServiceClient_getImportJob_getImportJobRequest]