// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/color.proto

// Protobuf Java Version: 3.25.2
package com.google.type;

public final class ColorProto {
  private ColorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_type_Color_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_type_Color_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027google/type/color.proto\022\013google.type\032\036" +
      "google/protobuf/wrappers.proto\"]\n\005Color\022" +
      "\013\n\003red\030\001 \001(\002\022\r\n\005green\030\002 \001(\002\022\014\n\004blue\030\003 \001(" +
      "\002\022*\n\005alpha\030\004 \001(\0132\033.google.protobuf.Float" +
      "ValueB`\n\017com.google.typeB\nColorProtoP\001Z6" +
      "google.golang.org/genproto/googleapis/ty" +
      "pe/color;color\370\001\001\242\002\003GTPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_google_type_Color_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_type_Color_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_type_Color_descriptor,
        new java.lang.String[] { "Red", "Green", "Blue", "Alpha", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
