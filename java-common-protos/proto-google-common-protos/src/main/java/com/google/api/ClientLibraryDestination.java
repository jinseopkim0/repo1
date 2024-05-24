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
// source: google/api/client.proto

// Protobuf Java Version: 3.25.3
package com.google.api;

/**
 *
 *
 * <pre>
 * To where should client libraries be published?
 * </pre>
 *
 * Protobuf enum {@code google.api.ClientLibraryDestination}
 */
public enum ClientLibraryDestination implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Client libraries will neither be generated nor published to package
   * managers.
   * </pre>
   *
   * <code>CLIENT_LIBRARY_DESTINATION_UNSPECIFIED = 0;</code>
   */
  CLIENT_LIBRARY_DESTINATION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Generate the client library in a repo under github.com/googleapis,
   * but don't publish it to package managers.
   * </pre>
   *
   * <code>GITHUB = 10;</code>
   */
  GITHUB(10),
  /**
   *
   *
   * <pre>
   * Publish the library to package managers like nuget.org and npmjs.com.
   * </pre>
   *
   * <code>PACKAGE_MANAGER = 20;</code>
   */
  PACKAGE_MANAGER(20),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Client libraries will neither be generated nor published to package
   * managers.
   * </pre>
   *
   * <code>CLIENT_LIBRARY_DESTINATION_UNSPECIFIED = 0;</code>
   */
  public static final int CLIENT_LIBRARY_DESTINATION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Generate the client library in a repo under github.com/googleapis,
   * but don't publish it to package managers.
   * </pre>
   *
   * <code>GITHUB = 10;</code>
   */
  public static final int GITHUB_VALUE = 10;
  /**
   *
   *
   * <pre>
   * Publish the library to package managers like nuget.org and npmjs.com.
   * </pre>
   *
   * <code>PACKAGE_MANAGER = 20;</code>
   */
  public static final int PACKAGE_MANAGER_VALUE = 20;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ClientLibraryDestination valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ClientLibraryDestination forNumber(int value) {
    switch (value) {
      case 0:
        return CLIENT_LIBRARY_DESTINATION_UNSPECIFIED;
      case 10:
        return GITHUB;
      case 20:
        return PACKAGE_MANAGER;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ClientLibraryDestination>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ClientLibraryDestination>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ClientLibraryDestination>() {
            public ClientLibraryDestination findValueByNumber(int number) {
              return ClientLibraryDestination.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.api.ClientProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ClientLibraryDestination[] VALUES = values();

  public static ClientLibraryDestination valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ClientLibraryDestination(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.api.ClientLibraryDestination)
}
