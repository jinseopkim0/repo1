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
package com.google.cloud.compute.v1small.stub.samples;

// [START REGION TAG]
import com.google.cloud.compute.v1small.stub.AddressesStubSettings;
import java.time.Duration;

public class AddressesStubSettingsAggregatedList {

  public static void main(String[] args) throws Exception {
    addressesStubSettingsAggregatedList();
  }

  public static void addressesStubSettingsAggregatedList() throws Exception {
    AddressesStubSettings.Builder addressesSettingsBuilder = AddressesStubSettings.newBuilder();
    addressesSettingsBuilder
        .aggregatedListSettings()
        .setRetrySettings(
            addressesSettingsBuilder
                .aggregatedListSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    AddressesStubSettings addressesSettings = addressesSettingsBuilder.build();
  }
}
// [END REGION TAG]