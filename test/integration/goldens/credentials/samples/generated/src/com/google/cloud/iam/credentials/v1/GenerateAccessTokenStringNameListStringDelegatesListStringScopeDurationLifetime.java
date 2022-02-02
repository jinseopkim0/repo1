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
package com.google.cloud.iam.credentials.v1.samples;

// [START REGION TAG]
import com.google.cloud.iam.credentials.v1.GenerateAccessTokenResponse;
import com.google.cloud.iam.credentials.v1.IamCredentialsClient;
import com.google.cloud.iam.credentials.v1.ServiceAccountName;
import com.google.protobuf.Duration;
import java.util.ArrayList;
import java.util.List;

public class GenerateAccessTokenStringNameListStringDelegatesListStringScopeDurationLifetime {

  public static void main(String[] args) throws Exception {
    generateAccessTokenStringNameListStringDelegatesListStringScopeDurationLifetime();
  }

  public static void
      generateAccessTokenStringNameListStringDelegatesListStringScopeDurationLifetime()
          throws Exception {
    try (IamCredentialsClient iamCredentialsClient = IamCredentialsClient.create()) {
      String name = ServiceAccountName.of("[PROJECT]", "[SERVICE_ACCOUNT]").toString();
      List<String> delegates = new ArrayList<>();
      List<String> scope = new ArrayList<>();
      Duration lifetime = Duration.newBuilder().build();
      GenerateAccessTokenResponse response =
          iamCredentialsClient.generateAccessToken(name, delegates, scope, lifetime);
    }
  }
}
// [END REGION TAG]