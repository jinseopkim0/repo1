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
package com.google.cloud.logging.v2.samples;

// [START 1.0_10_generated_metricsClient_listLogMetrics_pagedCallableFutureCallListLogMetricsRequest]
import com.google.api.core.ApiFuture;
import com.google.cloud.logging.v2.MetricsClient;
import com.google.logging.v2.ListLogMetricsRequest;
import com.google.logging.v2.LogMetric;
import com.google.logging.v2.ProjectName;

public class ListLogMetricsPagedCallableFutureCallListLogMetricsRequest {

  public static void main(String[] args) throws Exception {
    listLogMetricsPagedCallableFutureCallListLogMetricsRequest();
  }

  public static void listLogMetricsPagedCallableFutureCallListLogMetricsRequest() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (MetricsClient metricsClient = MetricsClient.create()) {
      ListLogMetricsRequest request =
          ListLogMetricsRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      ApiFuture<LogMetric> future = metricsClient.listLogMetricsPagedCallable().futureCall(request);
      // Do something.
      for (LogMetric element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END 1.0_10_generated_metricsClient_listLogMetrics_pagedCallableFutureCallListLogMetricsRequest]