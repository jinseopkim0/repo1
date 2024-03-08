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
// source: google/api/documentation.proto

// Protobuf Java Version: 3.25.2
package com.google.api;

public final class DocumentationProto {
  private DocumentationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_Documentation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Documentation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_DocumentationRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_DocumentationRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_Page_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Page_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\036google/api/documentation.proto\022\ngoogle"
          + ".api\"\273\001\n\rDocumentation\022\017\n\007summary\030\001 \001(\t\022"
          + "\037\n\005pages\030\005 \003(\0132\020.google.api.Page\022,\n\005rule"
          + "s\030\003 \003(\0132\035.google.api.DocumentationRule\022\036"
          + "\n\026documentation_root_url\030\004 \001(\t\022\030\n\020servic"
          + "e_root_url\030\006 \001(\t\022\020\n\010overview\030\002 \001(\t\"[\n\021Do"
          + "cumentationRule\022\020\n\010selector\030\001 \001(\t\022\023\n\013des"
          + "cription\030\002 \001(\t\022\037\n\027deprecation_descriptio"
          + "n\030\003 \001(\t\"I\n\004Page\022\014\n\004name\030\001 \001(\t\022\017\n\007content"
          + "\030\002 \001(\t\022\"\n\010subpages\030\003 \003(\0132\020.google.api.Pa"
          + "geBt\n\016com.google.apiB\022DocumentationProto"
          + "P\001ZEgoogle.golang.org/genproto/googleapi"
          + "s/api/serviceconfig;serviceconfig\242\002\004GAPI"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_api_Documentation_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Documentation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_Documentation_descriptor,
            new java.lang.String[] {
              "Summary", "Pages", "Rules", "DocumentationRootUrl", "ServiceRootUrl", "Overview",
            });
    internal_static_google_api_DocumentationRule_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_DocumentationRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_DocumentationRule_descriptor,
            new java.lang.String[] {
              "Selector", "Description", "DeprecationDescription",
            });
    internal_static_google_api_Page_descriptor = getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_Page_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_Page_descriptor,
            new java.lang.String[] {
              "Name", "Content", "Subpages",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
