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

// [START 1.0_10_generated_subscriptionAdminClient_listSnapshots_stringIterateAll]
import com.google.cloud.pubsub.v1.SubscriptionAdminClient;
import com.google.pubsub.v1.ProjectName;
import com.google.pubsub.v1.Snapshot;

public class ListSnapshotsStringIterateAll {

  public static void main(String[] args) throws Exception {
    listSnapshotsStringIterateAll();
  }

  public static void listSnapshotsStringIterateAll() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
      String project = ProjectName.of("[PROJECT]").toString();
      for (Snapshot element : subscriptionAdminClient.listSnapshots(project).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END 1.0_10_generated_subscriptionAdminClient_listSnapshots_stringIterateAll]