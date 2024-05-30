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
// source: google/api/annotations.proto

// Protobuf Java Version: 3.25.3
package com.google.api;

public final class AnnotationsProto {
  private AnnotationsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.api.AnnotationsProto.http);
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static final int HTTP_FIELD_NUMBER = 72295728;
  /**
   *
   *
   * <pre>
   * See `HttpRule`.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.MethodOptions, com.google.api.HttpRule>
      http =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.api.HttpRule.class, com.google.api.HttpRule.getDefaultInstance());

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\034google/api/annotations.proto\022\ngoogle.a"
          + "pi\032\025google/api/http.proto\032 google/protob"
          + "uf/descriptor.proto:E\n\004http\022\036.google.pro"
          + "tobuf.MethodOptions\030\260\312\274\" \001(\0132\024.google.ap"
          + "i.HttpRuleBn\n\016com.google.apiB\020Annotation"
          + "sProtoP\001ZAgoogle.golang.org/genproto/goo"
          + "gleapis/api/annotations;annotations\242\002\004GA"
          + "PIb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.HttpProto.getDescriptor(),
              com.google.protobuf.DescriptorProtos.getDescriptor(),
            });
    http.internalInit(descriptor.getExtensions().get(0));
    com.google.api.HttpProto.getDescriptor();
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
