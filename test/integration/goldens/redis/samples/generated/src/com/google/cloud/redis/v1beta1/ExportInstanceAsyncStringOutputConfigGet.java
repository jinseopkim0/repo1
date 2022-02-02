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
import com.google.cloud.redis.v1beta1.CloudRedisClient;
import com.google.cloud.redis.v1beta1.Instance;
import com.google.cloud.redis.v1beta1.OutputConfig;

public class ExportInstanceAsyncStringOutputConfigGet {

  public static void main(String[] args) throws Exception {
    exportInstanceAsyncStringOutputConfigGet();
  }

  public static void exportInstanceAsyncStringOutputConfigGet() throws Exception {
    try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
      String name = "name3373707";
      OutputConfig outputConfig = OutputConfig.newBuilder().build();
      Instance response = cloudRedisClient.exportInstanceAsync(name, outputConfig).get();
    }
  }
}
// [END REGION TAG]