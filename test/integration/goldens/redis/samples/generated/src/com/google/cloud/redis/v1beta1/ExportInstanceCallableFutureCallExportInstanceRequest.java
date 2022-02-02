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

// [START REGION TAG]
import com.google.api.core.ApiFuture;
import com.google.cloud.redis.v1beta1.CloudRedisClient;
import com.google.cloud.redis.v1beta1.ExportInstanceRequest;
import com.google.cloud.redis.v1beta1.OutputConfig;
import com.google.longrunning.Operation;

public class ExportInstanceCallableFutureCallExportInstanceRequest {

  public static void main(String[] args) throws Exception {
    exportInstanceCallableFutureCallExportInstanceRequest();
  }

  public static void exportInstanceCallableFutureCallExportInstanceRequest() throws Exception {
    try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
      ExportInstanceRequest request =
          ExportInstanceRequest.newBuilder()
              .setName("name3373707")
              .setOutputConfig(OutputConfig.newBuilder().build())
              .build();
      ApiFuture<Operation> future = cloudRedisClient.exportInstanceCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END REGION TAG]