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
package com.google.cloud.pubsub.v1.samples;

// [START REGION TAG]
import com.google.cloud.pubsub.v1.SubscriptionAdminClient;
import com.google.protobuf.Empty;
import com.google.pubsub.v1.PushConfig;
import com.google.pubsub.v1.SubscriptionName;

public class ModifyPushConfigSubscriptionNameSubscriptionPushConfigPushConfig {

  public static void main(String[] args) throws Exception {
    modifyPushConfigSubscriptionNameSubscriptionPushConfigPushConfig();
  }

  public static void modifyPushConfigSubscriptionNameSubscriptionPushConfigPushConfig()
      throws Exception {
    try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
      SubscriptionName subscription = SubscriptionName.of("[PROJECT]", "[SUBSCRIPTION]");
      PushConfig pushConfig = PushConfig.newBuilder().build();
      subscriptionAdminClient.modifyPushConfig(subscription, pushConfig);
    }
  }
}
// [END REGION TAG]