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
// source: google/cloud/extended_operations.proto

package com.google.cloud;

/**
 *
 *
 * <pre>
 * An enum to be used to mark the essential (for polling) fields in an
 * API-specific Operation object. A custom Operation object may contain many
 * different fields, but only few of them are essential to conduct a successful
 * polling process.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.OperationResponseMapping}
 */
public enum OperationResponseMapping implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Do not use.
   * </pre>
   *
   * <code>UNDEFINED = 0;</code>
   */
  UNDEFINED(0),
  /**
   *
   *
   * <pre>
   * A field in an API-specific (custom) Operation object which carries the same
   * meaning as google.longrunning.Operation.name.
   * </pre>
   *
   * <code>NAME = 1;</code>
   */
  NAME(1),
  /**
   *
   *
   * <pre>
   * A field in an API-specific (custom) Operation object which carries the same
   * meaning as google.longrunning.Operation.done. If the annotated field is of
   * an enum type, `annotated_field_name == EnumType.DONE` semantics should be
   * equivalent to `Operation.done == true`. If the annotated field is of type
   * boolean, then it should follow the same semantics as Operation.done.
   * Otherwise, a non-empty value should be treated as `Operation.done == true`.
   * </pre>
   *
   * <code>STATUS = 2;</code>
   */
  STATUS(2),
  /**
   *
   *
   * <pre>
   * A field in an API-specific (custom) Operation object which carries the same
   * meaning as google.longrunning.Operation.error.code.
   * </pre>
   *
   * <code>ERROR_CODE = 3;</code>
   */
  ERROR_CODE(3),
  /**
   *
   *
   * <pre>
   * A field in an API-specific (custom) Operation object which carries the same
   * meaning as google.longrunning.Operation.error.message.
   * </pre>
   *
   * <code>ERROR_MESSAGE = 4;</code>
   */
  ERROR_MESSAGE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Do not use.
   * </pre>
   *
   * <code>UNDEFINED = 0;</code>
   */
  public static final int UNDEFINED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * A field in an API-specific (custom) Operation object which carries the same
   * meaning as google.longrunning.Operation.name.
   * </pre>
   *
   * <code>NAME = 1;</code>
   */
  public static final int NAME_VALUE = 1;
  /**
   *
   *
   * <pre>
   * A field in an API-specific (custom) Operation object which carries the same
   * meaning as google.longrunning.Operation.done. If the annotated field is of
   * an enum type, `annotated_field_name == EnumType.DONE` semantics should be
   * equivalent to `Operation.done == true`. If the annotated field is of type
   * boolean, then it should follow the same semantics as Operation.done.
   * Otherwise, a non-empty value should be treated as `Operation.done == true`.
   * </pre>
   *
   * <code>STATUS = 2;</code>
   */
  public static final int STATUS_VALUE = 2;
  /**
   *
   *
   * <pre>
   * A field in an API-specific (custom) Operation object which carries the same
   * meaning as google.longrunning.Operation.error.code.
   * </pre>
   *
   * <code>ERROR_CODE = 3;</code>
   */
  public static final int ERROR_CODE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * A field in an API-specific (custom) Operation object which carries the same
   * meaning as google.longrunning.Operation.error.message.
   * </pre>
   *
   * <code>ERROR_MESSAGE = 4;</code>
   */
  public static final int ERROR_MESSAGE_VALUE = 4;

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
  public static OperationResponseMapping valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OperationResponseMapping forNumber(int value) {
    switch (value) {
      case 0:
        return UNDEFINED;
      case 1:
        return NAME;
      case 2:
        return STATUS;
      case 3:
        return ERROR_CODE;
      case 4:
        return ERROR_MESSAGE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OperationResponseMapping>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<OperationResponseMapping>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OperationResponseMapping>() {
            public OperationResponseMapping findValueByNumber(int number) {
              return OperationResponseMapping.forNumber(number);
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
    return com.google.cloud.ExtendedOperationsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final OperationResponseMapping[] VALUES = values();

  public static OperationResponseMapping valueOf(
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

  private OperationResponseMapping(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.OperationResponseMapping)
}
