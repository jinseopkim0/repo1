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
// source: google/cloud/extended_operations.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud;

public final class ExtendedOperationsProto {
  private ExtendedOperationsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.cloud.ExtendedOperationsProto.operationField);
    registry.add(com.google.cloud.ExtendedOperationsProto.operationRequestField);
    registry.add(com.google.cloud.ExtendedOperationsProto.operationResponseField);
    registry.add(com.google.cloud.ExtendedOperationsProto.operationService);
    registry.add(com.google.cloud.ExtendedOperationsProto.operationPollingMethod);
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static final int OPERATION_FIELD_FIELD_NUMBER = 1149;
  /**
   *
   *
   * <pre>
   * A field annotation that maps fields in an API-specific Operation object to
   * their standard counterparts in google.longrunning.Operation. See
   * OperationResponseMapping enum definition.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.FieldOptions,
          com.google.cloud.OperationResponseMapping>
      operationField =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.cloud.OperationResponseMapping.class, null);

  public static final int OPERATION_REQUEST_FIELD_FIELD_NUMBER = 1150;
  /**
   *
   *
   * <pre>
   * A field annotation that maps fields in the initial request message
   * (the one which started the LRO) to their counterparts in the polling
   * request message. For non-standard LRO, the polling response may be missing
   * some of the information needed to make a subsequent polling request. The
   * missing information (for example, project or region ID) is contained in the
   * fields of the initial request message that this annotation must be applied
   * to. The string value of the annotation corresponds to the name of the
   * counterpart field in the polling request message that the annotated field's
   * value will be copied to.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.FieldOptions, java.lang.String>
      operationRequestField =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              java.lang.String.class, null);

  public static final int OPERATION_RESPONSE_FIELD_FIELD_NUMBER = 1151;
  /**
   *
   *
   * <pre>
   * A field annotation that maps fields in the polling request message to their
   * counterparts in the initial and/or polling response message. The initial
   * and the polling methods return an API-specific Operation object. Some of
   * the fields from that response object must be reused in the subsequent
   * request (like operation name/ID) to fully identify the polled operation.
   * This annotation must be applied to the fields in the polling request
   * message, the string value of the annotation must correspond to the name of
   * the counterpart field in the Operation response object whose value will be
   * copied to the annotated field.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.FieldOptions, java.lang.String>
      operationResponseField =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              java.lang.String.class, null);

  public static final int OPERATION_SERVICE_FIELD_NUMBER = 1249;
  /**
   *
   *
   * <pre>
   * A method annotation that maps an LRO method (the one which starts an LRO)
   * to the service, which will be used to poll for the operation status. The
   * annotation must be applied to the method which starts an LRO, the string
   * value of the annotation must correspond to the name of the service used to
   * poll for the operation status.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.MethodOptions, java.lang.String>
      operationService =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              java.lang.String.class, null);

  public static final int OPERATION_POLLING_METHOD_FIELD_NUMBER = 1250;
  /**
   *
   *
   * <pre>
   * A method annotation that marks methods that can be used for polling
   * operation status (e.g. the MyPollingService.Get(MyPollingRequest) method).
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.MethodOptions, java.lang.Boolean>
      operationPollingMethod =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              java.lang.Boolean.class, null);

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/extended_operations.proto"
          + "\022\014google.cloud\032 google/protobuf/descript"
          + "or.proto*b\n\030OperationResponseMapping\022\r\n\t"
          + "UNDEFINED\020\000\022\010\n\004NAME\020\001\022\n\n\006STATUS\020\002\022\016\n\nERR"
          + "OR_CODE\020\003\022\021\n\rERROR_MESSAGE\020\004:_\n\017operatio"
          + "n_field\022\035.google.protobuf.FieldOptions\030\375"
          + "\010 \001(\0162&.google.cloud.OperationResponseMa"
          + "pping:?\n\027operation_request_field\022\035.googl"
          + "e.protobuf.FieldOptions\030\376\010 \001(\t:@\n\030operat"
          + "ion_response_field\022\035.google.protobuf.Fie"
          + "ldOptions\030\377\010 \001(\t::\n\021operation_service\022\036."
          + "google.protobuf.MethodOptions\030\341\t \001(\t:A\n\030"
          + "operation_polling_method\022\036.google.protob"
          + "uf.MethodOptions\030\342\t \001(\010By\n\020com.google.cl"
          + "oudB\027ExtendedOperationsProtoP\001ZCgoogle.g"
          + "olang.org/genproto/googleapis/cloud/exte"
          + "ndedops;extendedops\242\002\004GAPIb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DescriptorProtos.getDescriptor(),
            });
    operationField.internalInit(descriptor.getExtensions().get(0));
    operationRequestField.internalInit(descriptor.getExtensions().get(1));
    operationResponseField.internalInit(descriptor.getExtensions().get(2));
    operationService.internalInit(descriptor.getExtensions().get(3));
    operationPollingMethod.internalInit(descriptor.getExtensions().get(4));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
