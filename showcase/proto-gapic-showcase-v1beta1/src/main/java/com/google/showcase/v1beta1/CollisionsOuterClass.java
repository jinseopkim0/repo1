// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: showcase/gapic-showcase-extended/proto/collisions.proto

package com.google.showcase.v1beta1;

public final class CollisionsOuterClass {
  private CollisionsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_Annotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_Annotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_Metadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7showcase/gapic-showcase-extended/proto" +
      "/collisions.proto\022\027google.showcase.v1bet" +
      "a1\032\027google/api/client.proto\032#google/long" +
      "running/operations.proto\"\205\001\n\007Request\022\014\n\004" +
      "name\030\001 \001(\t\0227\n\nannotation\030\002 \001(\0132#.google." +
      "showcase.v1beta1.Annotation\0223\n\010metadata\030" +
      "\003 \001(\0132!.google.showcase.v1beta1.Metadata" +
      "\"\032\n\nAnnotation\022\014\n\004name\030\001 \001(\t\"\030\n\010Metadata" +
      "\022\014\n\004name\030\001 \001(\t2\212\001\n\nCollisions\022i\n\013doSomet" +
      "hing\022 .google.showcase.v1beta1.Request\032\035" +
      ".google.longrunning.Operation\"\031\312A\026\n\nAnno" +
      "tation\022\010Metadata\032\021\312A\016localhost:7469B\037\n\033c" +
      "om.google.showcase.v1beta1P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ClientProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
        });
    internal_static_google_showcase_v1beta1_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_showcase_v1beta1_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_Request_descriptor,
        new java.lang.String[] { "Name", "Annotation", "Metadata", });
    internal_static_google_showcase_v1beta1_Annotation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_showcase_v1beta1_Annotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_Annotation_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_showcase_v1beta1_Metadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_showcase_v1beta1_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_Metadata_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ClientProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
