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

// [START REGION TAG]
import com.google.cloud.compute.v1small.Address;
import com.google.cloud.compute.v1small.AddressesClient;

public class ListStringStringStringIterateAll {

  public static void main(String[] args) throws Exception {
    listStringStringStringIterateAll();
  }

  public static void listStringStringStringIterateAll() throws Exception {
    try (AddressesClient addressesClient = AddressesClient.create()) {
      String project = "project-309310695";
      String region = "region-934795532";
      String orderBy = "orderBy-1207110587";
      for (Address element : addressesClient.list(project, region, orderBy).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END REGION TAG]