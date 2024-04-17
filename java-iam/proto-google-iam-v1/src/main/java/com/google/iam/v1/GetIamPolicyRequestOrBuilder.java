/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1/iam_policy.proto

// Protobuf Java Version: 3.25.3
package com.google.iam.v1;

public interface GetIamPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.v1.GetIamPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * REQUIRED: The resource for which the policy is being requested.
   * See the operation documentation for the appropriate value for this field.
   * </pre>
   *
   * <code>
   * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * REQUIRED: The resource for which the policy is being requested.
   * See the operation documentation for the appropriate value for this field.
   * </pre>
   *
   * <code>
   * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * OPTIONAL: A `GetPolicyOptions` object for specifying options to
   * `GetIamPolicy`.
   * </pre>
   *
   * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
   *
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   *
   *
   * <pre>
   * OPTIONAL: A `GetPolicyOptions` object for specifying options to
   * `GetIamPolicy`.
   * </pre>
   *
   * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
   *
   * @return The options.
   */
  com.google.iam.v1.GetPolicyOptions getOptions();
  /**
   *
   *
   * <pre>
   * OPTIONAL: A `GetPolicyOptions` object for specifying options to
   * `GetIamPolicy`.
   * </pre>
   *
   * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
   */
  com.google.iam.v1.GetPolicyOptionsOrBuilder getOptionsOrBuilder();
}
