// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/echo.proto

package com.google.showcase.v1beta1;

/**
 * <pre>
 * A severity enum used to test enum capabilities in GAPIC surfaces.
 * </pre>
 *
 * Protobuf enum {@code google.showcase.v1beta1.Severity}
 */
public enum Severity
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNNECESSARY = 0;</code>
   */
  UNNECESSARY(0),
  /**
   * <code>NECESSARY = 1;</code>
   */
  NECESSARY(1),
  /**
   * <code>URGENT = 2;</code>
   */
  URGENT(2),
  /**
   * <code>CRITICAL = 3;</code>
   */
  CRITICAL(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNNECESSARY = 0;</code>
   */
  public static final int UNNECESSARY_VALUE = 0;
  /**
   * <code>NECESSARY = 1;</code>
   */
  public static final int NECESSARY_VALUE = 1;
  /**
   * <code>URGENT = 2;</code>
   */
  public static final int URGENT_VALUE = 2;
  /**
   * <code>CRITICAL = 3;</code>
   */
  public static final int CRITICAL_VALUE = 3;


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
  public static Severity valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Severity forNumber(int value) {
    switch (value) {
      case 0: return UNNECESSARY;
      case 1: return NECESSARY;
      case 2: return URGENT;
      case 3: return CRITICAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Severity>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Severity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Severity>() {
          public Severity findValueByNumber(int number) {
            return Severity.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.EchoOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final Severity[] VALUES = values();

  public static Severity valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Severity(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.showcase.v1beta1.Severity)
}

