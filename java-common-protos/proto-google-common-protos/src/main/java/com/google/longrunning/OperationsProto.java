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
// source: google/longrunning/operations.proto

// Protobuf Java Version: 3.25.2
package com.google.longrunning;

public final class OperationsProto {
  private OperationsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static final int OPERATION_INFO_FIELD_NUMBER = 1049;
  /**
   *
   *
   * <pre>
   * Additional information regarding long-running operations.
   * In particular, this specifies the types that are returned from
   * long-running operations.
   *
   * Required for methods that return `google.longrunning.Operation`; invalid
   * otherwise.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.MethodOptions, com.google.longrunning.OperationInfo>
      operationInfo =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.longrunning.OperationInfo.class,
              com.google.longrunning.OperationInfo.getDefaultInstance());

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_longrunning_Operation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_longrunning_GetOperationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_GetOperationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_longrunning_ListOperationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_ListOperationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_longrunning_ListOperationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_longrunning_CancelOperationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_CancelOperationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_longrunning_DeleteOperationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_DeleteOperationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_longrunning_WaitOperationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_WaitOperationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_longrunning_OperationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_OperationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/longrunning/operations.proto\022\022g"
          + "oogle.longrunning\032\034google/api/annotation"
          + "s.proto\032\027google/api/client.proto\032\031google"
          + "/protobuf/any.proto\032\036google/protobuf/dur"
          + "ation.proto\032\033google/protobuf/empty.proto"
          + "\032\027google/rpc/status.proto\032 google/protob"
          + "uf/descriptor.proto\"\250\001\n\tOperation\022\014\n\004nam"
          + "e\030\001 \001(\t\022&\n\010metadata\030\002 \001(\0132\024.google.proto"
          + "buf.Any\022\014\n\004done\030\003 \001(\010\022#\n\005error\030\004 \001(\0132\022.g"
          + "oogle.rpc.StatusH\000\022(\n\010response\030\005 \001(\0132\024.g"
          + "oogle.protobuf.AnyH\000B\010\n\006result\"#\n\023GetOpe"
          + "rationRequest\022\014\n\004name\030\001 \001(\t\"\\\n\025ListOpera"
          + "tionsRequest\022\014\n\004name\030\004 \001(\t\022\016\n\006filter\030\001 \001"
          + "(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001("
          + "\t\"d\n\026ListOperationsResponse\0221\n\noperation"
          + "s\030\001 \003(\0132\035.google.longrunning.Operation\022\027"
          + "\n\017next_page_token\030\002 \001(\t\"&\n\026CancelOperati"
          + "onRequest\022\014\n\004name\030\001 \001(\t\"&\n\026DeleteOperati"
          + "onRequest\022\014\n\004name\030\001 \001(\t\"P\n\024WaitOperation"
          + "Request\022\014\n\004name\030\001 \001(\t\022*\n\007timeout\030\002 \001(\0132\031"
          + ".google.protobuf.Duration\"=\n\rOperationIn"
          + "fo\022\025\n\rresponse_type\030\001 \001(\t\022\025\n\rmetadata_ty"
          + "pe\030\002 \001(\t2\252\005\n\nOperations\022\224\001\n\016ListOperatio"
          + "ns\022).google.longrunning.ListOperationsRe"
          + "quest\032*.google.longrunning.ListOperation"
          + "sResponse\"+\332A\013name,filter\202\323\344\223\002\027\022\025/v1/{na"
          + "me=operations}\022\177\n\014GetOperation\022\'.google."
          + "longrunning.GetOperationRequest\032\035.google"
          + ".longrunning.Operation\"\'\332A\004name\202\323\344\223\002\032\022\030/"
          + "v1/{name=operations/**}\022~\n\017DeleteOperati"
          + "on\022*.google.longrunning.DeleteOperationR"
          + "equest\032\026.google.protobuf.Empty\"\'\332A\004name\202"
          + "\323\344\223\002\032*\030/v1/{name=operations/**}\022\210\001\n\017Canc"
          + "elOperation\022*.google.longrunning.CancelO"
          + "perationRequest\032\026.google.protobuf.Empty\""
          + "1\332A\004name\202\323\344\223\002$\"\037/v1/{name=operations/**}"
          + ":cancel:\001*\022Z\n\rWaitOperation\022(.google.lon"
          + "grunning.WaitOperationRequest\032\035.google.l"
          + "ongrunning.Operation\"\000\032\035\312A\032longrunning.g"
          + "oogleapis.com:Z\n\016operation_info\022\036.google"
          + ".protobuf.MethodOptions\030\231\010 \001(\0132!.google."
          + "longrunning.OperationInfoB\235\001\n\026com.google"
          + ".longrunningB\017OperationsProtoP\001ZCcloud.g"
          + "oogle.com/go/longrunning/autogen/longrun"
          + "ningpb;longrunningpb\370\001\001\252\002\022Google.LongRun"
          + "ning\312\002\022Google\\LongRunningb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.protobuf.DescriptorProtos.getDescriptor(),
            });
    internal_static_google_longrunning_Operation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_longrunning_Operation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_longrunning_Operation_descriptor,
            new java.lang.String[] {
              "Name", "Metadata", "Done", "Error", "Response", "Result",
            });
    internal_static_google_longrunning_GetOperationRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_longrunning_GetOperationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_longrunning_GetOperationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_longrunning_ListOperationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_longrunning_ListOperationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_longrunning_ListOperationsRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_longrunning_ListOperationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_longrunning_ListOperationsResponse_descriptor,
            new java.lang.String[] {
              "Operations", "NextPageToken",
            });
    internal_static_google_longrunning_CancelOperationRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_longrunning_CancelOperationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_longrunning_CancelOperationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_longrunning_DeleteOperationRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_longrunning_DeleteOperationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_longrunning_DeleteOperationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_longrunning_WaitOperationRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_longrunning_WaitOperationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_longrunning_WaitOperationRequest_descriptor,
            new java.lang.String[] {
              "Name", "Timeout",
            });
    internal_static_google_longrunning_OperationInfo_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_longrunning_OperationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_longrunning_OperationInfo_descriptor,
            new java.lang.String[] {
              "ResponseType", "MetadataType",
            });
    operationInfo.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
