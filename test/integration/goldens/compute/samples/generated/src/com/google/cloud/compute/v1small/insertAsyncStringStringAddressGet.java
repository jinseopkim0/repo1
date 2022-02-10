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
package com.google.cloud.compute.v1small.samples;

// [START 1.0_10_generated_addressesClient_insert_asyncStringStringAddressGet]
import com.google.cloud.compute.v1small.Address;
import com.google.cloud.compute.v1small.AddressesClient;
import com.google.cloud.compute.v1small.Operation;

public class InsertAsyncStringStringAddressGet {

  public static void main(String[] args) throws Exception {
    insertAsyncStringStringAddressGet();
  }

  public static void insertAsyncStringStringAddressGet() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AddressesClient addressesClient = AddressesClient.create()) {
      String project = "project-309310695";
      String region = "region-934795532";
      Address addressResource = Address.newBuilder().build();
      Operation response = addressesClient.insertAsync(project, region, addressResource).get();
    }
  }
}
// [END 1.0_10_generated_addressesClient_insert_asyncStringStringAddressGet]