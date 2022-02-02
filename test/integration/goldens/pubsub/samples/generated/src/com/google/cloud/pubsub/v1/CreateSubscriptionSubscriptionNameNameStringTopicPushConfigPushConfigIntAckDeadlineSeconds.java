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
import com.google.pubsub.v1.PushConfig;
import com.google.pubsub.v1.Subscription;
import com.google.pubsub.v1.SubscriptionName;
import com.google.pubsub.v1.TopicName;

public
class CreateSubscriptionSubscriptionNameNameStringTopicPushConfigPushConfigIntAckDeadlineSeconds {

  public static void main(String[] args) throws Exception {
    createSubscriptionSubscriptionNameNameStringTopicPushConfigPushConfigIntAckDeadlineSeconds();
  }

  public static void
      createSubscriptionSubscriptionNameNameStringTopicPushConfigPushConfigIntAckDeadlineSeconds()
          throws Exception {
    try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
      SubscriptionName name = SubscriptionName.of("[PROJECT]", "[SUBSCRIPTION]");
      String topic = TopicName.ofProjectTopicName("[PROJECT]", "[TOPIC]").toString();
      PushConfig pushConfig = PushConfig.newBuilder().build();
      int ackDeadlineSeconds = 2135351438;
      Subscription response =
          subscriptionAdminClient.createSubscription(name, topic, pushConfig, ackDeadlineSeconds);
    }
  }
}
// [END REGION TAG]