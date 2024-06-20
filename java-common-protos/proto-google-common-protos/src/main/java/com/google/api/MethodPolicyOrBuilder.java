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
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/policy.proto
// Protobuf Java Version: 4.27.1

package com.google.api;

public interface MethodPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.MethodPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Selects a method to which these policies should be enforced, for example,
   * "google.pubsub.v1.Subscriber.CreateSubscription".
   *
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax
   * details.
   *
   * NOTE: This field must not be set in the proto annotation. It will be
   * automatically filled by the service config compiler .
   * </pre>
   *
   * <code>string selector = 9;</code>
   *
   * @return The selector.
   */
  java.lang.String getSelector();
  /**
   *
   *
   * <pre>
   * Selects a method to which these policies should be enforced, for example,
   * "google.pubsub.v1.Subscriber.CreateSubscription".
   *
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax
   * details.
   *
   * NOTE: This field must not be set in the proto annotation. It will be
   * automatically filled by the service config compiler .
   * </pre>
   *
   * <code>string selector = 9;</code>
   *
   * @return The bytes for selector.
   */
  com.google.protobuf.ByteString getSelectorBytes();

  /**
   *
   *
   * <pre>
   * Policies that are applicable to the request message.
   * </pre>
   *
   * <code>repeated .google.api.FieldPolicy request_policies = 2;</code>
   */
  java.util.List<com.google.api.FieldPolicy> getRequestPoliciesList();
  /**
   *
   *
   * <pre>
   * Policies that are applicable to the request message.
   * </pre>
   *
   * <code>repeated .google.api.FieldPolicy request_policies = 2;</code>
   */
  com.google.api.FieldPolicy getRequestPolicies(int index);
  /**
   *
   *
   * <pre>
   * Policies that are applicable to the request message.
   * </pre>
   *
   * <code>repeated .google.api.FieldPolicy request_policies = 2;</code>
   */
  int getRequestPoliciesCount();
  /**
   *
   *
   * <pre>
   * Policies that are applicable to the request message.
   * </pre>
   *
   * <code>repeated .google.api.FieldPolicy request_policies = 2;</code>
   */
  java.util.List<? extends com.google.api.FieldPolicyOrBuilder> getRequestPoliciesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Policies that are applicable to the request message.
   * </pre>
   *
   * <code>repeated .google.api.FieldPolicy request_policies = 2;</code>
   */
  com.google.api.FieldPolicyOrBuilder getRequestPoliciesOrBuilder(int index);
}
