/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.example.library.v1.samples;

// [START library_v1_generated_libraryserviceclient_movebook_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.example.library.v1.LibraryServiceClient;
import com.google.example.library.v1.Book;
import com.google.example.library.v1.BookName;
import com.google.example.library.v1.MoveBookRequest;
import com.google.example.library.v1.ShelfName;

public class AsyncMoveBook {

  public static void main(String[] args) throws Exception {
    asyncMoveBook();
  }

  public static void asyncMoveBook() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (LibraryServiceClient libraryServiceClient = LibraryServiceClient.create()) {
      MoveBookRequest request =
          MoveBookRequest.newBuilder()
              .setName(BookName.of("[SHELF]", "[BOOK]").toString())
              .setOtherShelfName(ShelfName.of("[SHELF_ID]").toString())
              .build();
      ApiFuture<Book> future = libraryServiceClient.moveBookCallable().futureCall(request);
      // Do something.
      Book response = future.get();
    }
  }
}
// [END library_v1_generated_libraryserviceclient_movebook_async]
