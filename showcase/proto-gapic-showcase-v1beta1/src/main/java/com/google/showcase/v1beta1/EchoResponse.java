// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/echo.proto

package com.google.showcase.v1beta1;

/**
 * <pre>
 * The response message for the Echo methods.
 * </pre>
 *
 * Protobuf type {@code google.showcase.v1beta1.EchoResponse}
 */
public final class EchoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.EchoResponse)
    EchoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EchoResponse.newBuilder() to construct.
  private EchoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EchoResponse() {
    content_ = "";
    severity_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EchoResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EchoResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            content_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            severity_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.EchoOuterClass.internal_static_google_showcase_v1beta1_EchoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.EchoOuterClass.internal_static_google_showcase_v1beta1_EchoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.EchoResponse.class, com.google.showcase.v1beta1.EchoResponse.Builder.class);
  }

  public static final int CONTENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object content_;
  /**
   * <pre>
   * The content specified in the request.
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The content specified in the request.
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEVERITY_FIELD_NUMBER = 2;
  private int severity_;
  /**
   * <pre>
   * The severity specified in the request.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Severity severity = 2;</code>
   * @return The enum numeric value on the wire for severity.
   */
  @java.lang.Override public int getSeverityValue() {
    return severity_;
  }
  /**
   * <pre>
   * The severity specified in the request.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Severity severity = 2;</code>
   * @return The severity.
   */
  @java.lang.Override public com.google.showcase.v1beta1.Severity getSeverity() {
    @SuppressWarnings("deprecation")
    com.google.showcase.v1beta1.Severity result = com.google.showcase.v1beta1.Severity.valueOf(severity_);
    return result == null ? com.google.showcase.v1beta1.Severity.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, content_);
    }
    if (severity_ != com.google.showcase.v1beta1.Severity.UNNECESSARY.getNumber()) {
      output.writeEnum(2, severity_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, content_);
    }
    if (severity_ != com.google.showcase.v1beta1.Severity.UNNECESSARY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, severity_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.showcase.v1beta1.EchoResponse)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.EchoResponse other = (com.google.showcase.v1beta1.EchoResponse) obj;

    if (!getContent()
        .equals(other.getContent())) return false;
    if (severity_ != other.severity_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
    hash = (53 * hash) + severity_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.EchoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.EchoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.EchoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.EchoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.EchoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.EchoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.EchoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.EchoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.EchoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.EchoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.EchoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.EchoResponse parseFrom(
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
  public static Builder newBuilder(com.google.showcase.v1beta1.EchoResponse prototype) {
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
   * <pre>
   * The response message for the Echo methods.
   * </pre>
   *
   * Protobuf type {@code google.showcase.v1beta1.EchoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.EchoResponse)
      com.google.showcase.v1beta1.EchoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.EchoOuterClass.internal_static_google_showcase_v1beta1_EchoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.EchoOuterClass.internal_static_google_showcase_v1beta1_EchoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.EchoResponse.class, com.google.showcase.v1beta1.EchoResponse.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.EchoResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      content_ = "";

      severity_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.EchoOuterClass.internal_static_google_showcase_v1beta1_EchoResponse_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.EchoResponse getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.EchoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.EchoResponse build() {
      com.google.showcase.v1beta1.EchoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.EchoResponse buildPartial() {
      com.google.showcase.v1beta1.EchoResponse result = new com.google.showcase.v1beta1.EchoResponse(this);
      result.content_ = content_;
      result.severity_ = severity_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.showcase.v1beta1.EchoResponse) {
        return mergeFrom((com.google.showcase.v1beta1.EchoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.EchoResponse other) {
      if (other == com.google.showcase.v1beta1.EchoResponse.getDefaultInstance()) return this;
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (other.severity_ != 0) {
        setSeverityValue(other.getSeverityValue());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.showcase.v1beta1.EchoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.showcase.v1beta1.EchoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     * <pre>
     * The content specified in the request.
     * </pre>
     *
     * <code>string content = 1;</code>
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The content specified in the request.
     * </pre>
     *
     * <code>string content = 1;</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The content specified in the request.
     * </pre>
     *
     * <code>string content = 1;</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      content_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The content specified in the request.
     * </pre>
     *
     * <code>string content = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The content specified in the request.
     * </pre>
     *
     * <code>string content = 1;</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      content_ = value;
      onChanged();
      return this;
    }

    private int severity_ = 0;
    /**
     * <pre>
     * The severity specified in the request.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Severity severity = 2;</code>
     * @return The enum numeric value on the wire for severity.
     */
    @java.lang.Override public int getSeverityValue() {
      return severity_;
    }
    /**
     * <pre>
     * The severity specified in the request.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Severity severity = 2;</code>
     * @param value The enum numeric value on the wire for severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverityValue(int value) {
      
      severity_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The severity specified in the request.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Severity severity = 2;</code>
     * @return The severity.
     */
    @java.lang.Override
    public com.google.showcase.v1beta1.Severity getSeverity() {
      @SuppressWarnings("deprecation")
      com.google.showcase.v1beta1.Severity result = com.google.showcase.v1beta1.Severity.valueOf(severity_);
      return result == null ? com.google.showcase.v1beta1.Severity.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The severity specified in the request.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Severity severity = 2;</code>
     * @param value The severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverity(com.google.showcase.v1beta1.Severity value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      severity_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The severity specified in the request.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Severity severity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeverity() {
      
      severity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.EchoResponse)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.EchoResponse)
  private static final com.google.showcase.v1beta1.EchoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.EchoResponse();
  }

  public static com.google.showcase.v1beta1.EchoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EchoResponse>
      PARSER = new com.google.protobuf.AbstractParser<EchoResponse>() {
    @java.lang.Override
    public EchoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EchoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EchoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EchoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.EchoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

