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

// [START REGION TAG]
import com.google.storage.v2.CreateHmacKeyResponse;
import com.google.storage.v2.ProjectName;
import com.google.storage.v2.StorageClient;

public class CreateHmacKeyProjectNameProjectStringServiceAccountEmail {

  public static void main(String[] args) throws Exception {
    createHmacKeyProjectNameProjectStringServiceAccountEmail();
  }

  public static void createHmacKeyProjectNameProjectStringServiceAccountEmail() throws Exception {
    try (StorageClient storageClient = StorageClient.create()) {
      ProjectName project = ProjectName.of("[PROJECT]");
      String serviceAccountEmail = "serviceAccountEmail1825953988";
      CreateHmacKeyResponse response = storageClient.createHmacKey(project, serviceAccountEmail);
    }
  }
}
// [END REGION TAG]