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
// source: google/rpc/error_details.proto

// Protobuf Java Version: 3.25.3
package com.google.rpc;

public interface BadRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.rpc.BadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Describes all violations in a client request.
   * </pre>
   *
   * <code>repeated .google.rpc.BadRequest.FieldViolation field_violations = 1;</code>
   */
  java.util.List<com.google.rpc.BadRequest.FieldViolation> getFieldViolationsList();
  /**
   *
   *
   * <pre>
   * Describes all violations in a client request.
   * </pre>
   *
   * <code>repeated .google.rpc.BadRequest.FieldViolation field_violations = 1;</code>
   */
  com.google.rpc.BadRequest.FieldViolation getFieldViolations(int index);
  /**
   *
   *
   * <pre>
   * Describes all violations in a client request.
   * </pre>
   *
   * <code>repeated .google.rpc.BadRequest.FieldViolation field_violations = 1;</code>
   */
  int getFieldViolationsCount();
  /**
   *
   *
   * <pre>
   * Describes all violations in a client request.
   * </pre>
   *
   * <code>repeated .google.rpc.BadRequest.FieldViolation field_violations = 1;</code>
   */
  java.util.List<? extends com.google.rpc.BadRequest.FieldViolationOrBuilder>
      getFieldViolationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Describes all violations in a client request.
   * </pre>
   *
   * <code>repeated .google.rpc.BadRequest.FieldViolation field_violations = 1;</code>
   */
  com.google.rpc.BadRequest.FieldViolationOrBuilder getFieldViolationsOrBuilder(int index);
}
