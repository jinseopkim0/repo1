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

// Protobuf Java Version: 3.25.3
package com.google.cloud.audit;

public interface AuthorizationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.audit.AuthorizationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource being accessed, as a REST-style or cloud resource string.
   * For example:
   *
   *     bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID
   * or
   *     projects/PROJECTID/datasets/DATASETID
   * </pre>
   *
   * <code>string resource = 1;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * The resource being accessed, as a REST-style or cloud resource string.
   * For example:
   *
   *     bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID
   * or
   *     projects/PROJECTID/datasets/DATASETID
   * </pre>
   *
   * <code>string resource = 1;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * The required IAM permission.
   * </pre>
   *
   * <code>string permission = 2;</code>
   *
   * @return The permission.
   */
  java.lang.String getPermission();
  /**
   *
   *
   * <pre>
   * The required IAM permission.
   * </pre>
   *
   * <code>string permission = 2;</code>
   *
   * @return The bytes for permission.
   */
  com.google.protobuf.ByteString getPermissionBytes();

  /**
   *
   *
   * <pre>
   * Whether or not authorization for `resource` and `permission`
   * was granted.
   * </pre>
   *
   * <code>bool granted = 3;</code>
   *
   * @return The granted.
   */
  boolean getGranted();

  /**
   *
   *
   * <pre>
   * Resource attributes used in IAM condition evaluation. This field contains
   * resource attributes like resource type and resource name.
   *
   * To get the whole view of the attributes used in IAM
   * condition evaluation, the user must also look into
   * `AuditLog.request_metadata.request_attributes`.
   * </pre>
   *
   * <code>.google.rpc.context.AttributeContext.Resource resource_attributes = 5;</code>
   *
   * @return Whether the resourceAttributes field is set.
   */
  boolean hasResourceAttributes();
  /**
   *
   *
   * <pre>
   * Resource attributes used in IAM condition evaluation. This field contains
   * resource attributes like resource type and resource name.
   *
   * To get the whole view of the attributes used in IAM
   * condition evaluation, the user must also look into
   * `AuditLog.request_metadata.request_attributes`.
   * </pre>
   *
   * <code>.google.rpc.context.AttributeContext.Resource resource_attributes = 5;</code>
   *
   * @return The resourceAttributes.
   */
  com.google.rpc.context.AttributeContext.Resource getResourceAttributes();
  /**
   *
   *
   * <pre>
   * Resource attributes used in IAM condition evaluation. This field contains
   * resource attributes like resource type and resource name.
   *
   * To get the whole view of the attributes used in IAM
   * condition evaluation, the user must also look into
   * `AuditLog.request_metadata.request_attributes`.
   * </pre>
   *
   * <code>.google.rpc.context.AttributeContext.Resource resource_attributes = 5;</code>
   */
  com.google.rpc.context.AttributeContext.ResourceOrBuilder getResourceAttributesOrBuilder();
}
