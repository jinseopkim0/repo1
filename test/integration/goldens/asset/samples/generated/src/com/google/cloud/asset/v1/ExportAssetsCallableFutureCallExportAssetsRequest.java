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
package com.google.cloud.asset.v1.samples;

// [START REGION TAG]
import com.google.api.core.ApiFuture;
import com.google.cloud.asset.v1.AssetServiceClient;
import com.google.cloud.asset.v1.ContentType;
import com.google.cloud.asset.v1.ExportAssetsRequest;
import com.google.cloud.asset.v1.FeedName;
import com.google.cloud.asset.v1.OutputConfig;
import com.google.longrunning.Operation;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;

public class ExportAssetsCallableFutureCallExportAssetsRequest {

  public static void main(String[] args) throws Exception {
    exportAssetsCallableFutureCallExportAssetsRequest();
  }

  public static void exportAssetsCallableFutureCallExportAssetsRequest() throws Exception {
    try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
      ExportAssetsRequest request =
          ExportAssetsRequest.newBuilder()
              .setParent(FeedName.ofProjectFeedName("[PROJECT]", "[FEED]").toString())
              .setReadTime(Timestamp.newBuilder().build())
              .addAllAssetTypes(new ArrayList<String>())
              .setContentType(ContentType.forNumber(0))
              .setOutputConfig(OutputConfig.newBuilder().build())
              .addAllRelationshipTypes(new ArrayList<String>())
              .build();
      ApiFuture<Operation> future = assetServiceClient.exportAssetsCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END REGION TAG]