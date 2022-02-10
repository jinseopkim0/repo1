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
package com.google.cloud.redis.v1beta1.samples;

// [START 1.0_10_generated_cloudRedisClient_listInstances_locationNameIterateAll]
import com.google.cloud.redis.v1beta1.CloudRedisClient;
import com.google.cloud.redis.v1beta1.Instance;
import com.google.cloud.redis.v1beta1.LocationName;

public class ListInstancesLocationNameIterateAll {

  public static void main(String[] args) throws Exception {
    listInstancesLocationNameIterateAll();
  }

  public static void listInstancesLocationNameIterateAll() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      for (Instance element : cloudRedisClient.listInstances(parent).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END 1.0_10_generated_cloudRedisClient_listInstances_locationNameIterateAll]