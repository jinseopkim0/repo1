// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/postal_address.proto

// Protobuf Java Version: 3.25.2
package com.google.type;

public final class PostalAddressProto {
  private PostalAddressProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_type_PostalAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_type_PostalAddress_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n google/type/postal_address.proto\022\013goog" +
      "le.type\"\375\001\n\rPostalAddress\022\020\n\010revision\030\001 " +
      "\001(\005\022\023\n\013region_code\030\002 \001(\t\022\025\n\rlanguage_cod" +
      "e\030\003 \001(\t\022\023\n\013postal_code\030\004 \001(\t\022\024\n\014sorting_" +
      "code\030\005 \001(\t\022\033\n\023administrative_area\030\006 \001(\t\022" +
      "\020\n\010locality\030\007 \001(\t\022\023\n\013sublocality\030\010 \001(\t\022\025" +
      "\n\raddress_lines\030\t \003(\t\022\022\n\nrecipients\030\n \003(" +
      "\t\022\024\n\014organization\030\013 \001(\tBx\n\017com.google.ty" +
      "peB\022PostalAddressProtoP\001ZFgoogle.golang." +
      "org/genproto/googleapis/type/postaladdre" +
      "ss;postaladdress\370\001\001\242\002\003GTPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_type_PostalAddress_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_type_PostalAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_type_PostalAddress_descriptor,
        new java.lang.String[] { "Revision", "RegionCode", "LanguageCode", "PostalCode", "SortingCode", "AdministrativeArea", "Locality", "Sublocality", "AddressLines", "Recipients", "Organization", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
