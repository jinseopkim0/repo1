// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/system_parameter.proto

package com.google.api;

/**
 * <pre>
 * Define a system parameter rule mapping system parameter definitions to
 * methods.
 * </pre>
 *
 * Protobuf type {@code google.api.SystemParameterRule}
 */
public  final class SystemParameterRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.SystemParameterRule)
    SystemParameterRuleOrBuilder {
  // Use SystemParameterRule.newBuilder() to construct.
  private SystemParameterRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SystemParameterRule() {
    selector_ = "";
    parameters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SystemParameterRule(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            selector_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              parameters_ = new java.util.ArrayList<com.google.api.SystemParameter>();
              mutable_bitField0_ |= 0x00000002;
            }
            parameters_.add(
                input.readMessage(com.google.api.SystemParameter.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        parameters_ = java.util.Collections.unmodifiableList(parameters_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.SystemParameterProto.internal_static_google_api_SystemParameterRule_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.SystemParameterProto.internal_static_google_api_SystemParameterRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.SystemParameterRule.class, com.google.api.SystemParameterRule.Builder.class);
  }

  private int bitField0_;
  public static final int SELECTOR_FIELD_NUMBER = 1;
  private volatile java.lang.Object selector_;
  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  public java.lang.String getSelector() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      selector_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSelectorBytes() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      selector_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMETERS_FIELD_NUMBER = 2;
  private java.util.List<com.google.api.SystemParameter> parameters_;
  /**
   * <pre>
   * Define parameters. Multiple names may be defined for a parameter.
   * For a given method call, only one of them should be used. If multiple
   * names are used the behavior is implementation-dependent.
   * If none of the specified names are present the behavior is
   * parameter-dependent.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameter parameters = 2;</code>
   */
  public java.util.List<com.google.api.SystemParameter> getParametersList() {
    return parameters_;
  }
  /**
   * <pre>
   * Define parameters. Multiple names may be defined for a parameter.
   * For a given method call, only one of them should be used. If multiple
   * names are used the behavior is implementation-dependent.
   * If none of the specified names are present the behavior is
   * parameter-dependent.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameter parameters = 2;</code>
   */
  public java.util.List<? extends com.google.api.SystemParameterOrBuilder> 
      getParametersOrBuilderList() {
    return parameters_;
  }
  /**
   * <pre>
   * Define parameters. Multiple names may be defined for a parameter.
   * For a given method call, only one of them should be used. If multiple
   * names are used the behavior is implementation-dependent.
   * If none of the specified names are present the behavior is
   * parameter-dependent.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameter parameters = 2;</code>
   */
  public int getParametersCount() {
    return parameters_.size();
  }
  /**
   * <pre>
   * Define parameters. Multiple names may be defined for a parameter.
   * For a given method call, only one of them should be used. If multiple
   * names are used the behavior is implementation-dependent.
   * If none of the specified names are present the behavior is
   * parameter-dependent.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameter parameters = 2;</code>
   */
  public com.google.api.SystemParameter getParameters(int index) {
    return parameters_.get(index);
  }
  /**
   * <pre>
   * Define parameters. Multiple names may be defined for a parameter.
   * For a given method call, only one of them should be used. If multiple
   * names are used the behavior is implementation-dependent.
   * If none of the specified names are present the behavior is
   * parameter-dependent.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameter parameters = 2;</code>
   */
  public com.google.api.SystemParameterOrBuilder getParametersOrBuilder(
      int index) {
    return parameters_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSelectorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, selector_);
    }
    for (int i = 0; i < parameters_.size(); i++) {
      output.writeMessage(2, parameters_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSelectorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, selector_);
    }
    for (int i = 0; i < parameters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, parameters_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.api.SystemParameterRule)) {
      return super.equals(obj);
    }
    com.google.api.SystemParameterRule other = (com.google.api.SystemParameterRule) obj;

    boolean result = true;
    result = result && getSelector()
        .equals(other.getSelector());
    result = result && getParametersList()
        .equals(other.getParametersList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
    hash = (53 * hash) + getSelector().hashCode();
    if (getParametersCount() > 0) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getParametersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.SystemParameterRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.SystemParameterRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.SystemParameterRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.SystemParameterRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.SystemParameterRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.SystemParameterRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.SystemParameterRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.SystemParameterRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.SystemParameterRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.SystemParameterRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.SystemParameterRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.SystemParameterRule parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.SystemParameterRule prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Define a system parameter rule mapping system parameter definitions to
   * methods.
   * </pre>
   *
   * Protobuf type {@code google.api.SystemParameterRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.SystemParameterRule)
      com.google.api.SystemParameterRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.SystemParameterProto.internal_static_google_api_SystemParameterRule_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.SystemParameterProto.internal_static_google_api_SystemParameterRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.SystemParameterRule.class, com.google.api.SystemParameterRule.Builder.class);
    }

    // Construct using com.google.api.SystemParameterRule.newBuilder()
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
        getParametersFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      selector_ = "";

      if (parametersBuilder_ == null) {
        parameters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        parametersBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.SystemParameterProto.internal_static_google_api_SystemParameterRule_descriptor;
    }

    public com.google.api.SystemParameterRule getDefaultInstanceForType() {
      return com.google.api.SystemParameterRule.getDefaultInstance();
    }

    public com.google.api.SystemParameterRule build() {
      com.google.api.SystemParameterRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.SystemParameterRule buildPartial() {
      com.google.api.SystemParameterRule result = new com.google.api.SystemParameterRule(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.selector_ = selector_;
      if (parametersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          parameters_ = java.util.Collections.unmodifiableList(parameters_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.parameters_ = parameters_;
      } else {
        result.parameters_ = parametersBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.SystemParameterRule) {
        return mergeFrom((com.google.api.SystemParameterRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.SystemParameterRule other) {
      if (other == com.google.api.SystemParameterRule.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        onChanged();
      }
      if (parametersBuilder_ == null) {
        if (!other.parameters_.isEmpty()) {
          if (parameters_.isEmpty()) {
            parameters_ = other.parameters_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureParametersIsMutable();
            parameters_.addAll(other.parameters_);
          }
          onChanged();
        }
      } else {
        if (!other.parameters_.isEmpty()) {
          if (parametersBuilder_.isEmpty()) {
            parametersBuilder_.dispose();
            parametersBuilder_ = null;
            parameters_ = other.parameters_;
            bitField0_ = (bitField0_ & ~0x00000002);
            parametersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getParametersFieldBuilder() : null;
          } else {
            parametersBuilder_.addAllMessages(other.parameters_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.SystemParameterRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.SystemParameterRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object selector_ = "";
    /**
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public java.lang.String getSelector() {
      java.lang.Object ref = selector_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        selector_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSelectorBytes() {
      java.lang.Object ref = selector_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        selector_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder setSelector(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      selector_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder clearSelector() {
      
      selector_ = getDefaultInstance().getSelector();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder setSelectorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      selector_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.api.SystemParameter> parameters_ =
      java.util.Collections.emptyList();
    private void ensureParametersIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        parameters_ = new java.util.ArrayList<com.google.api.SystemParameter>(parameters_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.SystemParameter, com.google.api.SystemParameter.Builder, com.google.api.SystemParameterOrBuilder> parametersBuilder_;

    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public java.util.List<com.google.api.SystemParameter> getParametersList() {
      if (parametersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(parameters_);
      } else {
        return parametersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public int getParametersCount() {
      if (parametersBuilder_ == null) {
        return parameters_.size();
      } else {
        return parametersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public com.google.api.SystemParameter getParameters(int index) {
      if (parametersBuilder_ == null) {
        return parameters_.get(index);
      } else {
        return parametersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public Builder setParameters(
        int index, com.google.api.SystemParameter value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParametersIsMutable();
        parameters_.set(index, value);
        onChanged();
      } else {
        parametersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public Builder setParameters(
        int index, com.google.api.SystemParameter.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.set(index, builderForValue.build());
        onChanged();
      } else {
        parametersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public Builder addParameters(com.google.api.SystemParameter value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParametersIsMutable();
        parameters_.add(value);
        onChanged();
      } else {
        parametersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public Builder addParameters(
        int index, com.google.api.SystemParameter value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParametersIsMutable();
        parameters_.add(index, value);
        onChanged();
      } else {
        parametersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public Builder addParameters(
        com.google.api.SystemParameter.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.add(builderForValue.build());
        onChanged();
      } else {
        parametersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public Builder addParameters(
        int index, com.google.api.SystemParameter.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.add(index, builderForValue.build());
        onChanged();
      } else {
        parametersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public Builder addAllParameters(
        java.lang.Iterable<? extends com.google.api.SystemParameter> values) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, parameters_);
        onChanged();
      } else {
        parametersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public Builder clearParameters() {
      if (parametersBuilder_ == null) {
        parameters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        parametersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public Builder removeParameters(int index) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.remove(index);
        onChanged();
      } else {
        parametersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public com.google.api.SystemParameter.Builder getParametersBuilder(
        int index) {
      return getParametersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public com.google.api.SystemParameterOrBuilder getParametersOrBuilder(
        int index) {
      if (parametersBuilder_ == null) {
        return parameters_.get(index);  } else {
        return parametersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public java.util.List<? extends com.google.api.SystemParameterOrBuilder> 
         getParametersOrBuilderList() {
      if (parametersBuilder_ != null) {
        return parametersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(parameters_);
      }
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public com.google.api.SystemParameter.Builder addParametersBuilder() {
      return getParametersFieldBuilder().addBuilder(
          com.google.api.SystemParameter.getDefaultInstance());
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public com.google.api.SystemParameter.Builder addParametersBuilder(
        int index) {
      return getParametersFieldBuilder().addBuilder(
          index, com.google.api.SystemParameter.getDefaultInstance());
    }
    /**
     * <pre>
     * Define parameters. Multiple names may be defined for a parameter.
     * For a given method call, only one of them should be used. If multiple
     * names are used the behavior is implementation-dependent.
     * If none of the specified names are present the behavior is
     * parameter-dependent.
     * </pre>
     *
     * <code>repeated .google.api.SystemParameter parameters = 2;</code>
     */
    public java.util.List<com.google.api.SystemParameter.Builder> 
         getParametersBuilderList() {
      return getParametersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.SystemParameter, com.google.api.SystemParameter.Builder, com.google.api.SystemParameterOrBuilder> 
        getParametersFieldBuilder() {
      if (parametersBuilder_ == null) {
        parametersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.SystemParameter, com.google.api.SystemParameter.Builder, com.google.api.SystemParameterOrBuilder>(
                parameters_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        parameters_ = null;
      }
      return parametersBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.api.SystemParameterRule)
  }

  // @@protoc_insertion_point(class_scope:google.api.SystemParameterRule)
  private static final com.google.api.SystemParameterRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.SystemParameterRule();
  }

  public static com.google.api.SystemParameterRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SystemParameterRule>
      PARSER = new com.google.protobuf.AbstractParser<SystemParameterRule>() {
    public SystemParameterRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SystemParameterRule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SystemParameterRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SystemParameterRule> getParserForType() {
    return PARSER;
  }

  public com.google.api.SystemParameterRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

