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

// [START 1.0_10_generated_keyManagementServiceClient_importCryptoKeyVersion_callableFutureCallImportCryptoKeyVersionRequest]
import com.google.api.core.ApiFuture;
import com.google.cloud.kms.v1.CryptoKeyName;
import com.google.cloud.kms.v1.CryptoKeyVersion;
import com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest;
import com.google.cloud.kms.v1.KeyManagementServiceClient;

public class ImportCryptoKeyVersionCallableFutureCallImportCryptoKeyVersionRequest {

  public static void main(String[] args) throws Exception {
    importCryptoKeyVersionCallableFutureCallImportCryptoKeyVersionRequest();
  }

  public static void importCryptoKeyVersionCallableFutureCallImportCryptoKeyVersionRequest()
      throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (KeyManagementServiceClient keyManagementServiceClient =
        KeyManagementServiceClient.create()) {
      ImportCryptoKeyVersionRequest request =
          ImportCryptoKeyVersionRequest.newBuilder()
              .setParent(
                  CryptoKeyName.of("[PROJECT]", "[LOCATION]", "[KEY_RING]", "[CRYPTO_KEY]")
                      .toString())
              .setImportJob("importJob-208547368")
              .build();
      ApiFuture<CryptoKeyVersion> future =
          keyManagementServiceClient.importCryptoKeyVersionCallable().futureCall(request);
      // Do something.
      CryptoKeyVersion response = future.get();
    }
  }
}
// [END 1.0_10_generated_keyManagementServiceClient_importCryptoKeyVersion_callableFutureCallImportCryptoKeyVersionRequest]