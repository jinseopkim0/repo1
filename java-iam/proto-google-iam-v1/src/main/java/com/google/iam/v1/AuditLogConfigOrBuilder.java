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

public interface AuditLogConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.v1.AuditLogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The log type that this config enables.
   * </pre>
   *
   * <code>.google.iam.v1.AuditLogConfig.LogType log_type = 1;</code>
   *
   * @return The enum numeric value on the wire for logType.
   */
  int getLogTypeValue();
  /**
   *
   *
   * <pre>
   * The log type that this config enables.
   * </pre>
   *
   * <code>.google.iam.v1.AuditLogConfig.LogType log_type = 1;</code>
   *
   * @return The logType.
   */
  com.google.iam.v1.AuditLogConfig.LogType getLogType();

  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of
   * permission.
   * Follows the same format of
   * [Binding.members][google.iam.v1.Binding.members].
   * </pre>
   *
   * <code>repeated string exempted_members = 2;</code>
   *
   * @return A list containing the exemptedMembers.
   */
  java.util.List<java.lang.String> getExemptedMembersList();
  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of
   * permission.
   * Follows the same format of
   * [Binding.members][google.iam.v1.Binding.members].
   * </pre>
   *
   * <code>repeated string exempted_members = 2;</code>
   *
   * @return The count of exemptedMembers.
   */
  int getExemptedMembersCount();
  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of
   * permission.
   * Follows the same format of
   * [Binding.members][google.iam.v1.Binding.members].
   * </pre>
   *
   * <code>repeated string exempted_members = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The exemptedMembers at the given index.
   */
  java.lang.String getExemptedMembers(int index);
  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of
   * permission.
   * Follows the same format of
   * [Binding.members][google.iam.v1.Binding.members].
   * </pre>
   *
   * <code>repeated string exempted_members = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the exemptedMembers at the given index.
   */
  com.google.protobuf.ByteString getExemptedMembersBytes(int index);
}
