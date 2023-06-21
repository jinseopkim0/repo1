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
// source: google/iam/v1/policy.proto

package com.google.iam.v1;

public interface PolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.v1.Policy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the format of the policy.
   *
   * Valid values are `0`, `1`, and `3`. Requests that specify an invalid value
   * are rejected.
   *
   * Any operation that affects conditional role bindings must specify version
   * `3`. This requirement applies to the following operations:
   *
   * * Getting a policy that includes a conditional role binding
   * * Adding a conditional role binding to a policy
   * * Changing a conditional role binding in a policy
   * * Removing any role binding, with or without a condition, from a policy
   *   that includes conditions
   *
   * **Important:** If you use IAM Conditions, you must include the `etag` field
   * whenever you call `setIamPolicy`. If you omit this field, then IAM allows
   * you to overwrite a version `3` policy with a version `1` policy, and all of
   * the conditions in the version `3` policy are lost.
   *
   * If a policy does not include any conditions, operations on that policy may
   * specify any valid version or leave the field unset.
   *
   * To learn which resources support conditions in their IAM policies, see the
   * [IAM
   * documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * </pre>
   *
   * <code>int32 version = 1;</code>
   *
   * @return The version.
   */
  int getVersion();

  /**
   *
   *
   * <pre>
   * Associates a list of `members`, or principals, with a `role`. Optionally,
   * may specify a `condition` that determines how and when the `bindings` are
   * applied. Each of the `bindings` must contain at least one principal.
   *
   * The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250
   * of these principals can be Google groups. Each occurrence of a principal
   * counts towards these limits. For example, if the `bindings` grant 50
   * different roles to `user:alice&#64;example.com`, and not to any other
   * principal, then you can add another 1,450 principals to the `bindings` in
   * the `Policy`.
   * </pre>
   *
   * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
   */
  java.util.List<com.google.iam.v1.Binding> getBindingsList();
  /**
   *
   *
   * <pre>
   * Associates a list of `members`, or principals, with a `role`. Optionally,
   * may specify a `condition` that determines how and when the `bindings` are
   * applied. Each of the `bindings` must contain at least one principal.
   *
   * The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250
   * of these principals can be Google groups. Each occurrence of a principal
   * counts towards these limits. For example, if the `bindings` grant 50
   * different roles to `user:alice&#64;example.com`, and not to any other
   * principal, then you can add another 1,450 principals to the `bindings` in
   * the `Policy`.
   * </pre>
   *
   * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
   */
  com.google.iam.v1.Binding getBindings(int index);
  /**
   *
   *
   * <pre>
   * Associates a list of `members`, or principals, with a `role`. Optionally,
   * may specify a `condition` that determines how and when the `bindings` are
   * applied. Each of the `bindings` must contain at least one principal.
   *
   * The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250
   * of these principals can be Google groups. Each occurrence of a principal
   * counts towards these limits. For example, if the `bindings` grant 50
   * different roles to `user:alice&#64;example.com`, and not to any other
   * principal, then you can add another 1,450 principals to the `bindings` in
   * the `Policy`.
   * </pre>
   *
   * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
   */
  int getBindingsCount();
  /**
   *
   *
   * <pre>
   * Associates a list of `members`, or principals, with a `role`. Optionally,
   * may specify a `condition` that determines how and when the `bindings` are
   * applied. Each of the `bindings` must contain at least one principal.
   *
   * The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250
   * of these principals can be Google groups. Each occurrence of a principal
   * counts towards these limits. For example, if the `bindings` grant 50
   * different roles to `user:alice&#64;example.com`, and not to any other
   * principal, then you can add another 1,450 principals to the `bindings` in
   * the `Policy`.
   * </pre>
   *
   * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
   */
  java.util.List<? extends com.google.iam.v1.BindingOrBuilder> getBindingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Associates a list of `members`, or principals, with a `role`. Optionally,
   * may specify a `condition` that determines how and when the `bindings` are
   * applied. Each of the `bindings` must contain at least one principal.
   *
   * The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250
   * of these principals can be Google groups. Each occurrence of a principal
   * counts towards these limits. For example, if the `bindings` grant 50
   * different roles to `user:alice&#64;example.com`, and not to any other
   * principal, then you can add another 1,450 principals to the `bindings` in
   * the `Policy`.
   * </pre>
   *
   * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
   */
  com.google.iam.v1.BindingOrBuilder getBindingsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Specifies cloud audit logging configuration for this policy.
   * </pre>
   *
   * <code>repeated .google.iam.v1.AuditConfig audit_configs = 6;</code>
   */
  java.util.List<com.google.iam.v1.AuditConfig> getAuditConfigsList();
  /**
   *
   *
   * <pre>
   * Specifies cloud audit logging configuration for this policy.
   * </pre>
   *
   * <code>repeated .google.iam.v1.AuditConfig audit_configs = 6;</code>
   */
  com.google.iam.v1.AuditConfig getAuditConfigs(int index);
  /**
   *
   *
   * <pre>
   * Specifies cloud audit logging configuration for this policy.
   * </pre>
   *
   * <code>repeated .google.iam.v1.AuditConfig audit_configs = 6;</code>
   */
  int getAuditConfigsCount();
  /**
   *
   *
   * <pre>
   * Specifies cloud audit logging configuration for this policy.
   * </pre>
   *
   * <code>repeated .google.iam.v1.AuditConfig audit_configs = 6;</code>
   */
  java.util.List<? extends com.google.iam.v1.AuditConfigOrBuilder> getAuditConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specifies cloud audit logging configuration for this policy.
   * </pre>
   *
   * <code>repeated .google.iam.v1.AuditConfig audit_configs = 6;</code>
   */
  com.google.iam.v1.AuditConfigOrBuilder getAuditConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * `etag` is used for optimistic concurrency control as a way to help
   * prevent simultaneous updates of a policy from overwriting each other.
   * It is strongly suggested that systems make use of the `etag` in the
   * read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and
   * systems are expected to put that etag in the request to `setIamPolicy` to
   * ensure that their change will be applied to the same version of the policy.
   *
   * **Important:** If you use IAM Conditions, you must include the `etag` field
   * whenever you call `setIamPolicy`. If you omit this field, then IAM allows
   * you to overwrite a version `3` policy with a version `1` policy, and all of
   * the conditions in the version `3` policy are lost.
   * </pre>
   *
   * <code>bytes etag = 3;</code>
   *
   * @return The etag.
   */
  com.google.protobuf.ByteString getEtag();
}
