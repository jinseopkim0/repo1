/*
 * Copyright 2024 Google LLC
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
// source: google/iam/v2beta/policy.proto

// Protobuf Java Version: 3.25.5
package com.google.iam.v2beta;

public interface ListPoliciesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.v2beta.ListPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Metadata for the policies that are attached to the resource.
   * </pre>
   *
   * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
   */
  java.util.List<com.google.iam.v2beta.Policy> getPoliciesList();
  /**
   *
   *
   * <pre>
   * Metadata for the policies that are attached to the resource.
   * </pre>
   *
   * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
   */
  com.google.iam.v2beta.Policy getPolicies(int index);
  /**
   *
   *
   * <pre>
   * Metadata for the policies that are attached to the resource.
   * </pre>
   *
   * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
   */
  int getPoliciesCount();
  /**
   *
   *
   * <pre>
   * Metadata for the policies that are attached to the resource.
   * </pre>
   *
   * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
   */
  java.util.List<? extends com.google.iam.v2beta.PolicyOrBuilder> getPoliciesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Metadata for the policies that are attached to the resource.
   * </pre>
   *
   * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
   */
  com.google.iam.v2beta.PolicyOrBuilder getPoliciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A page token that you can use in a [ListPoliciesRequest][google.iam.v2beta.ListPoliciesRequest] to retrieve the
   * next page. If this field is omitted, there are no additional pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A page token that you can use in a [ListPoliciesRequest][google.iam.v2beta.ListPoliciesRequest] to retrieve the
   * next page. If this field is omitted, there are no additional pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
