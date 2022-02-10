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
package com.google.iam.v1.samples;

// [START 1.0_10_generated_iAMPolicyClient_testIamPermissions_testIamPermissionsRequest]
import com.google.iam.v1.IAMPolicyClient;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import java.util.ArrayList;

public class TestIamPermissionsTestIamPermissionsRequest {

  public static void main(String[] args) throws Exception {
    testIamPermissionsTestIamPermissionsRequest();
  }

  public static void testIamPermissionsTestIamPermissionsRequest() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (IAMPolicyClient iAMPolicyClient = IAMPolicyClient.create()) {
      TestIamPermissionsRequest request =
          TestIamPermissionsRequest.newBuilder()
              .setResource("TestIamPermissionsRequest942398222".toString())
              .addAllPermissions(new ArrayList<String>())
              .build();
      TestIamPermissionsResponse response = iAMPolicyClient.testIamPermissions(request);
    }
  }
}
// [END 1.0_10_generated_iAMPolicyClient_testIamPermissions_testIamPermissionsRequest]