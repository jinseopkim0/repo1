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
import com.google.cloud.compute.v1small.Operation;
import com.google.cloud.compute.v1small.RegionOperationsClient;

public class GetStringProjectStringRegionStringOperation {

  public static void main(String[] args) throws Exception {
    getStringProjectStringRegionStringOperation();
  }

  public static void getStringProjectStringRegionStringOperation() throws Exception {
    try (RegionOperationsClient regionOperationsClient = RegionOperationsClient.create()) {
      String project = "project-309310695";
      String region = "region-934795532";
      String operation = "operation1662702951";
      Operation response = regionOperationsClient.get(project, region, operation);
    }
  }
}
// [END REGION TAG]