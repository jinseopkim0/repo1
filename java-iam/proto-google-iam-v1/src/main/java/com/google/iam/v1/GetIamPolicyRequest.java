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
// source: google/iam/v1/iam_policy.proto

// Protobuf Java Version: 3.25.3
package com.google.iam.v1;

/**
 *
 *
 * <pre>
 * Request message for `GetIamPolicy` method.
 * </pre>
 *
 * Protobuf type {@code google.iam.v1.GetIamPolicyRequest}
 */
public final class GetIamPolicyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.v1.GetIamPolicyRequest)
    GetIamPolicyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetIamPolicyRequest.newBuilder() to construct.
  private GetIamPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetIamPolicyRequest() {
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetIamPolicyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.v1.IamPolicyProto
        .internal_static_google_iam_v1_GetIamPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.v1.IamPolicyProto
        .internal_static_google_iam_v1_GetIamPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.v1.GetIamPolicyRequest.class,
            com.google.iam.v1.GetIamPolicyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resource_ = "";
  /**
   *
   *
   * <pre>
   * REQUIRED: The resource for which the policy is being requested.
   * See the operation documentation for the appropriate value for this field.
   * </pre>
   *
   * <code>
   * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * REQUIRED: The resource for which the policy is being requested.
   * See the operation documentation for the appropriate value for this field.
   * </pre>
   *
   * <code>
   * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  private com.google.iam.v1.GetPolicyOptions options_;
  /**
   *
   *
   * <pre>
   * OPTIONAL: A `GetPolicyOptions` object for specifying options to
   * `GetIamPolicy`.
   * </pre>
   *
   * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
   *
   * @return Whether the options field is set.
   */
  @java.lang.Override
  public boolean hasOptions() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * OPTIONAL: A `GetPolicyOptions` object for specifying options to
   * `GetIamPolicy`.
   * </pre>
   *
   * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
   *
   * @return The options.
   */
  @java.lang.Override
  public com.google.iam.v1.GetPolicyOptions getOptions() {
    return options_ == null ? com.google.iam.v1.GetPolicyOptions.getDefaultInstance() : options_;
  }
  /**
   *
   *
   * <pre>
   * OPTIONAL: A `GetPolicyOptions` object for specifying options to
   * `GetIamPolicy`.
   * </pre>
   *
   * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
   */
  @java.lang.Override
  public com.google.iam.v1.GetPolicyOptionsOrBuilder getOptionsOrBuilder() {
    return options_ == null ? com.google.iam.v1.GetPolicyOptions.getDefaultInstance() : options_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resource_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getOptions());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resource_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getOptions());
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
    if (!(obj instanceof com.google.iam.v1.GetIamPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.iam.v1.GetIamPolicyRequest other = (com.google.iam.v1.GetIamPolicyRequest) obj;

    if (!getResource().equals(other.getResource())) return false;
    if (hasOptions() != other.hasOptions()) return false;
    if (hasOptions()) {
      if (!getOptions().equals(other.getOptions())) return false;
    }
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
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    if (hasOptions()) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v1.GetIamPolicyRequest parseFrom(
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

  public static Builder newBuilder(com.google.iam.v1.GetIamPolicyRequest prototype) {
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
   * Request message for `GetIamPolicy` method.
   * </pre>
   *
   * Protobuf type {@code google.iam.v1.GetIamPolicyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.v1.GetIamPolicyRequest)
      com.google.iam.v1.GetIamPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.v1.IamPolicyProto
          .internal_static_google_iam_v1_GetIamPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.v1.IamPolicyProto
          .internal_static_google_iam_v1_GetIamPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.v1.GetIamPolicyRequest.class,
              com.google.iam.v1.GetIamPolicyRequest.Builder.class);
    }

    // Construct using com.google.iam.v1.GetIamPolicyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getOptionsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resource_ = "";
      options_ = null;
      if (optionsBuilder_ != null) {
        optionsBuilder_.dispose();
        optionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.v1.IamPolicyProto
          .internal_static_google_iam_v1_GetIamPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.v1.GetIamPolicyRequest getDefaultInstanceForType() {
      return com.google.iam.v1.GetIamPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.v1.GetIamPolicyRequest build() {
      com.google.iam.v1.GetIamPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.v1.GetIamPolicyRequest buildPartial() {
      com.google.iam.v1.GetIamPolicyRequest result =
          new com.google.iam.v1.GetIamPolicyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.iam.v1.GetIamPolicyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resource_ = resource_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.options_ = optionsBuilder_ == null ? options_ : optionsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.iam.v1.GetIamPolicyRequest) {
        return mergeFrom((com.google.iam.v1.GetIamPolicyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.v1.GetIamPolicyRequest other) {
      if (other == com.google.iam.v1.GetIamPolicyRequest.getDefaultInstance()) return this;
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasOptions()) {
        mergeOptions(other.getOptions());
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
                resource_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getOptionsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object resource_ = "";
    /**
     *
     *
     * <pre>
     * REQUIRED: The resource for which the policy is being requested.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The resource for which the policy is being requested.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The resource for which the policy is being requested.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resource_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The resource for which the policy is being requested.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResource() {
      resource_ = getDefaultInstance().getResource();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The resource for which the policy is being requested.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resource_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.iam.v1.GetPolicyOptions options_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v1.GetPolicyOptions,
            com.google.iam.v1.GetPolicyOptions.Builder,
            com.google.iam.v1.GetPolicyOptionsOrBuilder>
        optionsBuilder_;
    /**
     *
     *
     * <pre>
     * OPTIONAL: A `GetPolicyOptions` object for specifying options to
     * `GetIamPolicy`.
     * </pre>
     *
     * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
     *
     * @return Whether the options field is set.
     */
    public boolean hasOptions() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * OPTIONAL: A `GetPolicyOptions` object for specifying options to
     * `GetIamPolicy`.
     * </pre>
     *
     * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
     *
     * @return The options.
     */
    public com.google.iam.v1.GetPolicyOptions getOptions() {
      if (optionsBuilder_ == null) {
        return options_ == null
            ? com.google.iam.v1.GetPolicyOptions.getDefaultInstance()
            : options_;
      } else {
        return optionsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * OPTIONAL: A `GetPolicyOptions` object for specifying options to
     * `GetIamPolicy`.
     * </pre>
     *
     * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
     */
    public Builder setOptions(com.google.iam.v1.GetPolicyOptions value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        options_ = value;
      } else {
        optionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * OPTIONAL: A `GetPolicyOptions` object for specifying options to
     * `GetIamPolicy`.
     * </pre>
     *
     * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
     */
    public Builder setOptions(com.google.iam.v1.GetPolicyOptions.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        options_ = builderForValue.build();
      } else {
        optionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * OPTIONAL: A `GetPolicyOptions` object for specifying options to
     * `GetIamPolicy`.
     * </pre>
     *
     * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
     */
    public Builder mergeOptions(com.google.iam.v1.GetPolicyOptions value) {
      if (optionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && options_ != null
            && options_ != com.google.iam.v1.GetPolicyOptions.getDefaultInstance()) {
          getOptionsBuilder().mergeFrom(value);
        } else {
          options_ = value;
        }
      } else {
        optionsBuilder_.mergeFrom(value);
      }
      if (options_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * OPTIONAL: A `GetPolicyOptions` object for specifying options to
     * `GetIamPolicy`.
     * </pre>
     *
     * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
     */
    public Builder clearOptions() {
      bitField0_ = (bitField0_ & ~0x00000002);
      options_ = null;
      if (optionsBuilder_ != null) {
        optionsBuilder_.dispose();
        optionsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * OPTIONAL: A `GetPolicyOptions` object for specifying options to
     * `GetIamPolicy`.
     * </pre>
     *
     * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
     */
    public com.google.iam.v1.GetPolicyOptions.Builder getOptionsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOptionsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * OPTIONAL: A `GetPolicyOptions` object for specifying options to
     * `GetIamPolicy`.
     * </pre>
     *
     * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
     */
    public com.google.iam.v1.GetPolicyOptionsOrBuilder getOptionsOrBuilder() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilder();
      } else {
        return options_ == null
            ? com.google.iam.v1.GetPolicyOptions.getDefaultInstance()
            : options_;
      }
    }
    /**
     *
     *
     * <pre>
     * OPTIONAL: A `GetPolicyOptions` object for specifying options to
     * `GetIamPolicy`.
     * </pre>
     *
     * <code>.google.iam.v1.GetPolicyOptions options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v1.GetPolicyOptions,
            com.google.iam.v1.GetPolicyOptions.Builder,
            com.google.iam.v1.GetPolicyOptionsOrBuilder>
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.iam.v1.GetPolicyOptions,
                com.google.iam.v1.GetPolicyOptions.Builder,
                com.google.iam.v1.GetPolicyOptionsOrBuilder>(
                getOptions(), getParentForChildren(), isClean());
        options_ = null;
      }
      return optionsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.iam.v1.GetIamPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v1.GetIamPolicyRequest)
  private static final com.google.iam.v1.GetIamPolicyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.v1.GetIamPolicyRequest();
  }

  public static com.google.iam.v1.GetIamPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetIamPolicyRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetIamPolicyRequest>() {
        @java.lang.Override
        public GetIamPolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetIamPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetIamPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.v1.GetIamPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
