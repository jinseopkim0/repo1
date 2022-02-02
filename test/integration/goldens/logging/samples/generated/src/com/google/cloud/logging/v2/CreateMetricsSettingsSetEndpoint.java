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

// [START REGION TAG]
import com.google.cloud.logging.v2.MetricsClient;
import com.google.cloud.logging.v2.MetricsSettings;
import com.google.cloud.logging.v2.myEndpoint;

public class CreateMetricsSettingsSetEndpoint {

  public static void main(String[] args) throws Exception {
    createMetricsSettingsSetEndpoint();
  }

  public static void createMetricsSettingsSetEndpoint() throws Exception {
    MetricsSettings metricsSettings = MetricsSettings.newBuilder().setEndpoint(myEndpoint).build();
    MetricsClient metricsClient = MetricsClient.create(metricsSettings);
  }
}
// [END REGION TAG]