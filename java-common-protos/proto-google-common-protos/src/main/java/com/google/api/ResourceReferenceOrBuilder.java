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
// source: google/api/resource.proto
// Protobuf Java Version: 4.27.1

package com.google.api;

public interface ResourceReferenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.ResourceReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource type that the annotated field references.
   *
   * Example:
   *
   * message Subscription {
   * string topic = 2 [(google.api.resource_reference) = {
   * type: "pubsub.googleapis.com/Topic"
   * }];
   * }
   *
   * Occasionally, a field may reference an arbitrary resource. In this case,
   * APIs use the special value * in their resource reference.
   *
   * Example:
   *
   * message GetIamPolicyRequest {
   * string resource = 2 [(google.api.resource_reference) = {
   * type: "*"
   * }];
   * }
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * The resource type that the annotated field references.
   *
   * Example:
   *
   * message Subscription {
   * string topic = 2 [(google.api.resource_reference) = {
   * type: "pubsub.googleapis.com/Topic"
   * }];
   * }
   *
   * Occasionally, a field may reference an arbitrary resource. In this case,
   * APIs use the special value * in their resource reference.
   *
   * Example:
   *
   * message GetIamPolicyRequest {
   * string resource = 2 [(google.api.resource_reference) = {
   * type: "*"
   * }];
   * }
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for annotating the `parent` field that
   * doesn't have a fixed resource type.
   *
   * Example:
   *
   * message ListLogEntriesRequest {
   * string parent = 1 [(google.api.resource_reference) = {
   * child_type: "logging.googleapis.com/LogEntry"
   * };
   * }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   *
   * @return The childType.
   */
  java.lang.String getChildType();
  /**
   *
   *
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for annotating the `parent` field that
   * doesn't have a fixed resource type.
   *
   * Example:
   *
   * message ListLogEntriesRequest {
   * string parent = 1 [(google.api.resource_reference) = {
   * child_type: "logging.googleapis.com/LogEntry"
   * };
   * }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   *
   * @return The bytes for childType.
   */
  com.google.protobuf.ByteString getChildTypeBytes();
}
