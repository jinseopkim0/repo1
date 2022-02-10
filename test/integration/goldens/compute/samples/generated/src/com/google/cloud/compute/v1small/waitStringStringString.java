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

// [START 1.0_10_generated_regionOperationsClient_wait_stringStringString]
import com.google.cloud.compute.v1small.Operation;
import com.google.cloud.compute.v1small.RegionOperationsClient;

public class WaitStringStringString {

  public static void main(String[] args) throws Exception {
    waitStringStringString();
  }

  public static void waitStringStringString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RegionOperationsClient regionOperationsClient = RegionOperationsClient.create()) {
      String project = "project-309310695";
      String region = "region-934795532";
      String operation = "operation1662702951";
      Operation response = regionOperationsClient.wait(project, region, operation);
    }
  }
}
// [END 1.0_10_generated_regionOperationsClient_wait_stringStringString]