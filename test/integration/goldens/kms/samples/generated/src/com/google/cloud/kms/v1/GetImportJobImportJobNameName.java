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

// [START REGION TAG]
import com.google.cloud.kms.v1.ImportJob;
import com.google.cloud.kms.v1.ImportJobName;
import com.google.cloud.kms.v1.KeyManagementServiceClient;

public class GetImportJobImportJobNameName {

  public static void main(String[] args) throws Exception {
    getImportJobImportJobNameName();
  }

  public static void getImportJobImportJobNameName() throws Exception {
    try (KeyManagementServiceClient keyManagementServiceClient =
        KeyManagementServiceClient.create()) {
      ImportJobName name =
          ImportJobName.of("[PROJECT]", "[LOCATION]", "[KEY_RING]", "[IMPORT_JOB]");
      ImportJob response = keyManagementServiceClient.getImportJob(name);
    }
  }
}
// [END REGION TAG]