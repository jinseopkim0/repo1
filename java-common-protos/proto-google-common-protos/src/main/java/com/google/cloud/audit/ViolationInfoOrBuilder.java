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
// source: google/cloud/audit/audit_log.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.audit;

public interface ViolationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.audit.ViolationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Constraint name
   * </pre>
   *
   * <code>string constraint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The constraint.
   */
  java.lang.String getConstraint();
  /**
   *
   *
   * <pre>
   * Optional. Constraint name
   * </pre>
   *
   * <code>string constraint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for constraint.
   */
  com.google.protobuf.ByteString getConstraintBytes();

  /**
   *
   *
   * <pre>
   * Optional. Error message that policy is indicating.
   * </pre>
   *
   * <code>string error_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   *
   *
   * <pre>
   * Optional. Error message that policy is indicating.
   * </pre>
   *
   * <code>string error_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString getErrorMessageBytes();

  /**
   *
   *
   * <pre>
   * Optional. Value that is being checked for the policy.
   * This could be in encrypted form (if pii sensitive).
   * This field will only be emitted in LIST_POLICY types
   * </pre>
   *
   * <code>string checked_value = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The checkedValue.
   */
  java.lang.String getCheckedValue();
  /**
   *
   *
   * <pre>
   * Optional. Value that is being checked for the policy.
   * This could be in encrypted form (if pii sensitive).
   * This field will only be emitted in LIST_POLICY types
   * </pre>
   *
   * <code>string checked_value = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for checkedValue.
   */
  com.google.protobuf.ByteString getCheckedValueBytes();

  /**
   *
   *
   * <pre>
   * Optional. Indicates the type of the policy.
   * </pre>
   *
   * <code>
   * .google.cloud.audit.ViolationInfo.PolicyType policy_type = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for policyType.
   */
  int getPolicyTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. Indicates the type of the policy.
   * </pre>
   *
   * <code>
   * .google.cloud.audit.ViolationInfo.PolicyType policy_type = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The policyType.
   */
  com.google.cloud.audit.ViolationInfo.PolicyType getPolicyType();
}
