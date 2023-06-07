// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/compliance.proto

package com.google.showcase.v1beta1;

/**
 * Protobuf type {@code google.showcase.v1beta1.ComplianceDataGrandchild}
 */
public final class ComplianceDataGrandchild extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.ComplianceDataGrandchild)
    ComplianceDataGrandchildOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ComplianceDataGrandchild.newBuilder() to construct.
  private ComplianceDataGrandchild(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ComplianceDataGrandchild() {
    fString_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ComplianceDataGrandchild();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.ComplianceOuterClass.internal_static_google_showcase_v1beta1_ComplianceDataGrandchild_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.ComplianceOuterClass.internal_static_google_showcase_v1beta1_ComplianceDataGrandchild_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.ComplianceDataGrandchild.class, com.google.showcase.v1beta1.ComplianceDataGrandchild.Builder.class);
  }

  public static final int F_STRING_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fString_ = "";
  /**
   * <code>string f_string = 1;</code>
   * @return The fString.
   */
  @java.lang.Override
  public java.lang.String getFString() {
    java.lang.Object ref = fString_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fString_ = s;
      return s;
    }
  }
  /**
   * <code>string f_string = 1;</code>
   * @return The bytes for fString.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFStringBytes() {
    java.lang.Object ref = fString_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fString_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int F_DOUBLE_FIELD_NUMBER = 2;
  private double fDouble_ = 0D;
  /**
   * <code>double f_double = 2;</code>
   * @return The fDouble.
   */
  @java.lang.Override
  public double getFDouble() {
    return fDouble_;
  }

  public static final int F_BOOL_FIELD_NUMBER = 3;
  private boolean fBool_ = false;
  /**
   * <code>bool f_bool = 3;</code>
   * @return The fBool.
   */
  @java.lang.Override
  public boolean getFBool() {
    return fBool_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fString_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fString_);
    }
    if (java.lang.Double.doubleToRawLongBits(fDouble_) != 0) {
      output.writeDouble(2, fDouble_);
    }
    if (fBool_ != false) {
      output.writeBool(3, fBool_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fString_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fString_);
    }
    if (java.lang.Double.doubleToRawLongBits(fDouble_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, fDouble_);
    }
    if (fBool_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, fBool_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.showcase.v1beta1.ComplianceDataGrandchild)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.ComplianceDataGrandchild other = (com.google.showcase.v1beta1.ComplianceDataGrandchild) obj;

    if (!getFString()
        .equals(other.getFString())) return false;
    if (java.lang.Double.doubleToLongBits(getFDouble())
        != java.lang.Double.doubleToLongBits(
            other.getFDouble())) return false;
    if (getFBool()
        != other.getFBool()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + F_STRING_FIELD_NUMBER;
    hash = (53 * hash) + getFString().hashCode();
    hash = (37 * hash) + F_DOUBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFDouble()));
    hash = (37 * hash) + F_BOOL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFBool());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.ComplianceDataGrandchild parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.showcase.v1beta1.ComplianceDataGrandchild prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.showcase.v1beta1.ComplianceDataGrandchild}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.ComplianceDataGrandchild)
      com.google.showcase.v1beta1.ComplianceDataGrandchildOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.ComplianceOuterClass.internal_static_google_showcase_v1beta1_ComplianceDataGrandchild_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.ComplianceOuterClass.internal_static_google_showcase_v1beta1_ComplianceDataGrandchild_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.ComplianceDataGrandchild.class, com.google.showcase.v1beta1.ComplianceDataGrandchild.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.ComplianceDataGrandchild.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fString_ = "";
      fDouble_ = 0D;
      fBool_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.ComplianceOuterClass.internal_static_google_showcase_v1beta1_ComplianceDataGrandchild_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ComplianceDataGrandchild getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.ComplianceDataGrandchild.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ComplianceDataGrandchild build() {
      com.google.showcase.v1beta1.ComplianceDataGrandchild result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ComplianceDataGrandchild buildPartial() {
      com.google.showcase.v1beta1.ComplianceDataGrandchild result = new com.google.showcase.v1beta1.ComplianceDataGrandchild(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.showcase.v1beta1.ComplianceDataGrandchild result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fString_ = fString_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fDouble_ = fDouble_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fBool_ = fBool_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.showcase.v1beta1.ComplianceDataGrandchild) {
        return mergeFrom((com.google.showcase.v1beta1.ComplianceDataGrandchild)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.ComplianceDataGrandchild other) {
      if (other == com.google.showcase.v1beta1.ComplianceDataGrandchild.getDefaultInstance()) return this;
      if (!other.getFString().isEmpty()) {
        fString_ = other.fString_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getFDouble() != 0D) {
        setFDouble(other.getFDouble());
      }
      if (other.getFBool() != false) {
        setFBool(other.getFBool());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              fString_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 17: {
              fDouble_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 24: {
              fBool_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object fString_ = "";
    /**
     * <code>string f_string = 1;</code>
     * @return The fString.
     */
    public java.lang.String getFString() {
      java.lang.Object ref = fString_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fString_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string f_string = 1;</code>
     * @return The bytes for fString.
     */
    public com.google.protobuf.ByteString
        getFStringBytes() {
      java.lang.Object ref = fString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string f_string = 1;</code>
     * @param value The fString to set.
     * @return This builder for chaining.
     */
    public Builder setFString(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fString_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string f_string = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFString() {
      fString_ = getDefaultInstance().getFString();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string f_string = 1;</code>
     * @param value The bytes for fString to set.
     * @return This builder for chaining.
     */
    public Builder setFStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fString_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private double fDouble_ ;
    /**
     * <code>double f_double = 2;</code>
     * @return The fDouble.
     */
    @java.lang.Override
    public double getFDouble() {
      return fDouble_;
    }
    /**
     * <code>double f_double = 2;</code>
     * @param value The fDouble to set.
     * @return This builder for chaining.
     */
    public Builder setFDouble(double value) {

      fDouble_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>double f_double = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFDouble() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fDouble_ = 0D;
      onChanged();
      return this;
    }

    private boolean fBool_ ;
    /**
     * <code>bool f_bool = 3;</code>
     * @return The fBool.
     */
    @java.lang.Override
    public boolean getFBool() {
      return fBool_;
    }
    /**
     * <code>bool f_bool = 3;</code>
     * @param value The fBool to set.
     * @return This builder for chaining.
     */
    public Builder setFBool(boolean value) {

      fBool_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool f_bool = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFBool() {
      bitField0_ = (bitField0_ & ~0x00000004);
      fBool_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.ComplianceDataGrandchild)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.ComplianceDataGrandchild)
  private static final com.google.showcase.v1beta1.ComplianceDataGrandchild DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.ComplianceDataGrandchild();
  }

  public static com.google.showcase.v1beta1.ComplianceDataGrandchild getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComplianceDataGrandchild>
      PARSER = new com.google.protobuf.AbstractParser<ComplianceDataGrandchild>() {
    @java.lang.Override
    public ComplianceDataGrandchild parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ComplianceDataGrandchild> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComplianceDataGrandchild> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.ComplianceDataGrandchild getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

