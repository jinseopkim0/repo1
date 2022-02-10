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
package com.google.storage.v2.samples;

// [START 1.0_10_generated_storageClient_deleteBucket_callableFutureCallDeleteBucketRequest]
import com.google.api.core.ApiFuture;
import com.google.protobuf.Empty;
import com.google.storage.v2.BucketName;
import com.google.storage.v2.CommonRequestParams;
import com.google.storage.v2.DeleteBucketRequest;
import com.google.storage.v2.StorageClient;

public class DeleteBucketCallableFutureCallDeleteBucketRequest {

  public static void main(String[] args) throws Exception {
    deleteBucketCallableFutureCallDeleteBucketRequest();
  }

  public static void deleteBucketCallableFutureCallDeleteBucketRequest() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (StorageClient storageClient = StorageClient.create()) {
      DeleteBucketRequest request =
          DeleteBucketRequest.newBuilder()
              .setName(BucketName.of("[PROJECT]", "[BUCKET]").toString())
              .setIfMetagenerationMatch(1043427781)
              .setIfMetagenerationNotMatch(1025430873)
              .setCommonRequestParams(CommonRequestParams.newBuilder().build())
              .build();
      ApiFuture<Empty> future = storageClient.deleteBucketCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END 1.0_10_generated_storageClient_deleteBucket_callableFutureCallDeleteBucketRequest]