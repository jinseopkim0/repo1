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
// source: google/api/usage.proto

package com.google.api;

/**
 *
 *
 * <pre>
 * Usage configuration rules for the service.
 *
 * NOTE: Under development.
 *
 *
 * Use this rule to configure unregistered calls for the service. Unregistered
 * calls are calls that do not contain consumer project identity.
 * (Example: calls that do not contain an API key).
 * By default, API methods do not allow unregistered calls, and each method call
 * must be identified by a consumer project identity. Use this rule to
 * allow/disallow unregistered calls.
 *
 * Example of an API that wants to allow unregistered calls for entire service.
 *
 *     usage:
 *       rules:
 *       - selector: "*"
 *         allow_unregistered_calls: true
 *
 * Example of a method that wants to allow unregistered calls.
 *
 *     usage:
 *       rules:
 *       - selector: "google.example.library.v1.LibraryService.CreateBook"
 *         allow_unregistered_calls: true
 * </pre>
 *
 * Protobuf type {@code google.api.UsageRule}
 */
public final class UsageRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.UsageRule)
    UsageRuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UsageRule.newBuilder() to construct.
  private UsageRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UsageRule() {
    selector_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UsageRule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.UsageProto.internal_static_google_api_UsageRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.UsageProto.internal_static_google_api_UsageRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.UsageRule.class, com.google.api.UsageRule.Builder.class);
  }

  public static final int SELECTOR_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object selector_ = "";
  /**
   *
   *
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   *
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax
   * details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   *
   * @return The selector.
   */
  @java.lang.Override
  public java.lang.String getSelector() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      selector_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   *
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax
   * details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   *
   * @return The bytes for selector.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSelectorBytes() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      selector_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
  private boolean allowUnregisteredCalls_ = false;
  /**
   *
   *
   * <pre>
   * If true, the selected method allows unregistered calls, e.g. calls
   * that don't identify any user or application.
   * </pre>
   *
   * <code>bool allow_unregistered_calls = 2;</code>
   *
   * @return The allowUnregisteredCalls.
   */
  @java.lang.Override
  public boolean getAllowUnregisteredCalls() {
    return allowUnregisteredCalls_;
  }

  public static final int SKIP_SERVICE_CONTROL_FIELD_NUMBER = 3;
  private boolean skipServiceControl_ = false;
  /**
   *
   *
   * <pre>
   * If true, the selected method should skip service control and the control
   * plane features, such as quota and billing, will not be available.
   * This flag is used by Google Cloud Endpoints to bypass checks for internal
   * methods, such as service health check methods.
   * </pre>
   *
   * <code>bool skip_service_control = 3;</code>
   *
   * @return The skipServiceControl.
   */
  @java.lang.Override
  public boolean getSkipServiceControl() {
    return skipServiceControl_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(selector_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, selector_);
    }
    if (allowUnregisteredCalls_ != false) {
      output.writeBool(2, allowUnregisteredCalls_);
    }
    if (skipServiceControl_ != false) {
      output.writeBool(3, skipServiceControl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(selector_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, selector_);
    }
    if (allowUnregisteredCalls_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, allowUnregisteredCalls_);
    }
    if (skipServiceControl_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, skipServiceControl_);
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
    if (!(obj instanceof com.google.api.UsageRule)) {
      return super.equals(obj);
    }
    com.google.api.UsageRule other = (com.google.api.UsageRule) obj;

    if (!getSelector().equals(other.getSelector())) return false;
    if (getAllowUnregisteredCalls() != other.getAllowUnregisteredCalls()) return false;
    if (getSkipServiceControl() != other.getSkipServiceControl()) return false;
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
    hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
    hash = (53 * hash) + getSelector().hashCode();
    hash = (37 * hash) + ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowUnregisteredCalls());
    hash = (37 * hash) + SKIP_SERVICE_CONTROL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSkipServiceControl());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.UsageRule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.UsageRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.UsageRule parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.UsageRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.UsageRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.UsageRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.UsageRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.UsageRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.UsageRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.UsageRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.UsageRule parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.UsageRule parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.api.UsageRule prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Usage configuration rules for the service.
   *
   * NOTE: Under development.
   *
   *
   * Use this rule to configure unregistered calls for the service. Unregistered
   * calls are calls that do not contain consumer project identity.
   * (Example: calls that do not contain an API key).
   * By default, API methods do not allow unregistered calls, and each method call
   * must be identified by a consumer project identity. Use this rule to
   * allow/disallow unregistered calls.
   *
   * Example of an API that wants to allow unregistered calls for entire service.
   *
   *     usage:
   *       rules:
   *       - selector: "*"
   *         allow_unregistered_calls: true
   *
   * Example of a method that wants to allow unregistered calls.
   *
   *     usage:
   *       rules:
   *       - selector: "google.example.library.v1.LibraryService.CreateBook"
   *         allow_unregistered_calls: true
   * </pre>
   *
   * Protobuf type {@code google.api.UsageRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.UsageRule)
      com.google.api.UsageRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.UsageProto.internal_static_google_api_UsageRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.UsageProto.internal_static_google_api_UsageRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.UsageRule.class, com.google.api.UsageRule.Builder.class);
    }

    // Construct using com.google.api.UsageRule.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      selector_ = "";
      allowUnregisteredCalls_ = false;
      skipServiceControl_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.UsageProto.internal_static_google_api_UsageRule_descriptor;
    }

    @java.lang.Override
    public com.google.api.UsageRule getDefaultInstanceForType() {
      return com.google.api.UsageRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.UsageRule build() {
      com.google.api.UsageRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.UsageRule buildPartial() {
      com.google.api.UsageRule result = new com.google.api.UsageRule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.UsageRule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.selector_ = selector_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.allowUnregisteredCalls_ = allowUnregisteredCalls_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.skipServiceControl_ = skipServiceControl_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.UsageRule) {
        return mergeFrom((com.google.api.UsageRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.UsageRule other) {
      if (other == com.google.api.UsageRule.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAllowUnregisteredCalls() != false) {
        setAllowUnregisteredCalls(other.getAllowUnregisteredCalls());
      }
      if (other.getSkipServiceControl() != false) {
        setSkipServiceControl(other.getSkipServiceControl());
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
            case 10:
              {
                selector_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                allowUnregisteredCalls_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                skipServiceControl_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            default:
              {
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

    private java.lang.Object selector_ = "";
    /**
     *
     *
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax
     * details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     *
     * @return The selector.
     */
    public java.lang.String getSelector() {
      java.lang.Object ref = selector_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        selector_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax
     * details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     *
     * @return The bytes for selector.
     */
    public com.google.protobuf.ByteString getSelectorBytes() {
      java.lang.Object ref = selector_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        selector_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax
     * details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     *
     * @param value The selector to set.
     * @return This builder for chaining.
     */
    public Builder setSelector(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      selector_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax
     * details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSelector() {
      selector_ = getDefaultInstance().getSelector();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax
     * details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     *
     * @param value The bytes for selector to set.
     * @return This builder for chaining.
     */
    public Builder setSelectorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      selector_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean allowUnregisteredCalls_;
    /**
     *
     *
     * <pre>
     * If true, the selected method allows unregistered calls, e.g. calls
     * that don't identify any user or application.
     * </pre>
     *
     * <code>bool allow_unregistered_calls = 2;</code>
     *
     * @return The allowUnregisteredCalls.
     */
    @java.lang.Override
    public boolean getAllowUnregisteredCalls() {
      return allowUnregisteredCalls_;
    }
    /**
     *
     *
     * <pre>
     * If true, the selected method allows unregistered calls, e.g. calls
     * that don't identify any user or application.
     * </pre>
     *
     * <code>bool allow_unregistered_calls = 2;</code>
     *
     * @param value The allowUnregisteredCalls to set.
     * @return This builder for chaining.
     */
    public Builder setAllowUnregisteredCalls(boolean value) {

      allowUnregisteredCalls_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, the selected method allows unregistered calls, e.g. calls
     * that don't identify any user or application.
     * </pre>
     *
     * <code>bool allow_unregistered_calls = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowUnregisteredCalls() {
      bitField0_ = (bitField0_ & ~0x00000002);
      allowUnregisteredCalls_ = false;
      onChanged();
      return this;
    }

    private boolean skipServiceControl_;
    /**
     *
     *
     * <pre>
     * If true, the selected method should skip service control and the control
     * plane features, such as quota and billing, will not be available.
     * This flag is used by Google Cloud Endpoints to bypass checks for internal
     * methods, such as service health check methods.
     * </pre>
     *
     * <code>bool skip_service_control = 3;</code>
     *
     * @return The skipServiceControl.
     */
    @java.lang.Override
    public boolean getSkipServiceControl() {
      return skipServiceControl_;
    }
    /**
     *
     *
     * <pre>
     * If true, the selected method should skip service control and the control
     * plane features, such as quota and billing, will not be available.
     * This flag is used by Google Cloud Endpoints to bypass checks for internal
     * methods, such as service health check methods.
     * </pre>
     *
     * <code>bool skip_service_control = 3;</code>
     *
     * @param value The skipServiceControl to set.
     * @return This builder for chaining.
     */
    public Builder setSkipServiceControl(boolean value) {

      skipServiceControl_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, the selected method should skip service control and the control
     * plane features, such as quota and billing, will not be available.
     * This flag is used by Google Cloud Endpoints to bypass checks for internal
     * methods, such as service health check methods.
     * </pre>
     *
     * <code>bool skip_service_control = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSkipServiceControl() {
      bitField0_ = (bitField0_ & ~0x00000004);
      skipServiceControl_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.api.UsageRule)
  }

  // @@protoc_insertion_point(class_scope:google.api.UsageRule)
  private static final com.google.api.UsageRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.UsageRule();
  }

  public static com.google.api.UsageRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsageRule> PARSER =
      new com.google.protobuf.AbstractParser<UsageRule>() {
        @java.lang.Override
        public UsageRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<UsageRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsageRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.UsageRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
