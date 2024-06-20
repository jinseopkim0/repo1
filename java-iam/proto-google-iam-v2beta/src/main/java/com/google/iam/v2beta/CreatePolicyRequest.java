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
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/iam/v2beta/policy.proto
// Protobuf Java Version: 4.27.1

package com.google.iam.v2beta;

/**
 *
 *
 * <pre>
 * Request message for `CreatePolicy`.
 * </pre>
 *
 * Protobuf type {@code google.iam.v2beta.CreatePolicyRequest}
 */
public final class CreatePolicyRequest extends com.google.protobuf.GeneratedMessage
    implements
    // @@protoc_insertion_point(message_implements:google.iam.v2beta.CreatePolicyRequest)
    CreatePolicyRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 1,
        /* suffix= */ "",
        CreatePolicyRequest.class.getName());
  }
  // Use CreatePolicyRequest.newBuilder() to construct.
  private CreatePolicyRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }

  private CreatePolicyRequest() {
    parent_ = "";
    policyId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.v2beta.PolicyProto
        .internal_static_google_iam_v2beta_CreatePolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.v2beta.PolicyProto
        .internal_static_google_iam_v2beta_CreatePolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.v2beta.CreatePolicyRequest.class,
            com.google.iam.v2beta.CreatePolicyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource that the policy is attached to, along with the kind of policy
   * to create. Format: `policies/{attachment_point}/denypolicies`
   *
   *
   * The attachment point is identified by its URL-encoded full resource name,
   * which means that the forward-slash character, `/`, must be written as
   * `%2F`. For example,
   * `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-project/denypolicies`.
   *
   * For organizations and folders, use the numeric ID in the full resource
   * name. For projects, you can use the alphanumeric or the numeric ID.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource that the policy is attached to, along with the kind of policy
   * to create. Format: `policies/{attachment_point}/denypolicies`
   *
   *
   * The attachment point is identified by its URL-encoded full resource name,
   * which means that the forward-slash character, `/`, must be written as
   * `%2F`. For example,
   * `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-project/denypolicies`.
   *
   * For organizations and folders, use the numeric ID in the full resource
   * name. For projects, you can use the alphanumeric or the numeric ID.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POLICY_FIELD_NUMBER = 2;
  private com.google.iam.v2beta.Policy policy_;
  /**
   *
   *
   * <pre>
   * Required. The policy to create.
   * </pre>
   *
   * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the policy field is set.
   */
  @java.lang.Override
  public boolean hasPolicy() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The policy to create.
   * </pre>
   *
   * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The policy.
   */
  @java.lang.Override
  public com.google.iam.v2beta.Policy getPolicy() {
    return policy_ == null ? com.google.iam.v2beta.Policy.getDefaultInstance() : policy_;
  }
  /**
   *
   *
   * <pre>
   * Required. The policy to create.
   * </pre>
   *
   * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.iam.v2beta.PolicyOrBuilder getPolicyOrBuilder() {
    return policy_ == null ? com.google.iam.v2beta.Policy.getDefaultInstance() : policy_;
  }

  public static final int POLICY_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object policyId_ = "";
  /**
   *
   *
   * <pre>
   * The ID to use for this policy, which will become the final component of
   * the policy's resource name. The ID must contain 3 to 63 characters. It can
   * contain lowercase letters and numbers, as well as dashes (`-`) and periods
   * (`.`). The first character must be a lowercase letter.
   * </pre>
   *
   * <code>string policy_id = 3;</code>
   *
   * @return The policyId.
   */
  @java.lang.Override
  public java.lang.String getPolicyId() {
    java.lang.Object ref = policyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      policyId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID to use for this policy, which will become the final component of
   * the policy's resource name. The ID must contain 3 to 63 characters. It can
   * contain lowercase letters and numbers, as well as dashes (`-`) and periods
   * (`.`). The first character must be a lowercase letter.
   * </pre>
   *
   * <code>string policy_id = 3;</code>
   *
   * @return The bytes for policyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPolicyIdBytes() {
    java.lang.Object ref = policyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      policyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getPolicy());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(policyId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, policyId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPolicy());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(policyId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, policyId_);
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
    if (!(obj instanceof com.google.iam.v2beta.CreatePolicyRequest)) {
      return super.equals(obj);
    }
    com.google.iam.v2beta.CreatePolicyRequest other =
        (com.google.iam.v2beta.CreatePolicyRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasPolicy() != other.hasPolicy()) return false;
    if (hasPolicy()) {
      if (!getPolicy().equals(other.getPolicy())) return false;
    }
    if (!getPolicyId().equals(other.getPolicyId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasPolicy()) {
      hash = (37 * hash) + POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getPolicy().hashCode();
    }
    hash = (37 * hash) + POLICY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPolicyId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v2beta.CreatePolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.iam.v2beta.CreatePolicyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for `CreatePolicy`.
   * </pre>
   *
   * Protobuf type {@code google.iam.v2beta.CreatePolicyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.v2beta.CreatePolicyRequest)
      com.google.iam.v2beta.CreatePolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.v2beta.PolicyProto
          .internal_static_google_iam_v2beta_CreatePolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.v2beta.PolicyProto
          .internal_static_google_iam_v2beta_CreatePolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.v2beta.CreatePolicyRequest.class,
              com.google.iam.v2beta.CreatePolicyRequest.Builder.class);
    }

    // Construct using com.google.iam.v2beta.CreatePolicyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getPolicyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      policyId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.v2beta.PolicyProto
          .internal_static_google_iam_v2beta_CreatePolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.v2beta.CreatePolicyRequest getDefaultInstanceForType() {
      return com.google.iam.v2beta.CreatePolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.v2beta.CreatePolicyRequest build() {
      com.google.iam.v2beta.CreatePolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.v2beta.CreatePolicyRequest buildPartial() {
      com.google.iam.v2beta.CreatePolicyRequest result =
          new com.google.iam.v2beta.CreatePolicyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.iam.v2beta.CreatePolicyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.policy_ = policyBuilder_ == null ? policy_ : policyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.policyId_ = policyId_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.iam.v2beta.CreatePolicyRequest) {
        return mergeFrom((com.google.iam.v2beta.CreatePolicyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.v2beta.CreatePolicyRequest other) {
      if (other == com.google.iam.v2beta.CreatePolicyRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPolicy()) {
        mergePolicy(other.getPolicy());
      }
      if (!other.getPolicyId().isEmpty()) {
        policyId_ = other.policyId_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getPolicyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                policyId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource that the policy is attached to, along with the kind of policy
     * to create. Format: `policies/{attachment_point}/denypolicies`
     *
     *
     * The attachment point is identified by its URL-encoded full resource name,
     * which means that the forward-slash character, `/`, must be written as
     * `%2F`. For example,
     * `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-project/denypolicies`.
     *
     * For organizations and folders, use the numeric ID in the full resource
     * name. For projects, you can use the alphanumeric or the numeric ID.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource that the policy is attached to, along with the kind of policy
     * to create. Format: `policies/{attachment_point}/denypolicies`
     *
     *
     * The attachment point is identified by its URL-encoded full resource name,
     * which means that the forward-slash character, `/`, must be written as
     * `%2F`. For example,
     * `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-project/denypolicies`.
     *
     * For organizations and folders, use the numeric ID in the full resource
     * name. For projects, you can use the alphanumeric or the numeric ID.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource that the policy is attached to, along with the kind of policy
     * to create. Format: `policies/{attachment_point}/denypolicies`
     *
     *
     * The attachment point is identified by its URL-encoded full resource name,
     * which means that the forward-slash character, `/`, must be written as
     * `%2F`. For example,
     * `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-project/denypolicies`.
     *
     * For organizations and folders, use the numeric ID in the full resource
     * name. For projects, you can use the alphanumeric or the numeric ID.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource that the policy is attached to, along with the kind of policy
     * to create. Format: `policies/{attachment_point}/denypolicies`
     *
     *
     * The attachment point is identified by its URL-encoded full resource name,
     * which means that the forward-slash character, `/`, must be written as
     * `%2F`. For example,
     * `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-project/denypolicies`.
     *
     * For organizations and folders, use the numeric ID in the full resource
     * name. For projects, you can use the alphanumeric or the numeric ID.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource that the policy is attached to, along with the kind of policy
     * to create. Format: `policies/{attachment_point}/denypolicies`
     *
     *
     * The attachment point is identified by its URL-encoded full resource name,
     * which means that the forward-slash character, `/`, must be written as
     * `%2F`. For example,
     * `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-project/denypolicies`.
     *
     * For organizations and folders, use the numeric ID in the full resource
     * name. For projects, you can use the alphanumeric or the numeric ID.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.iam.v2beta.Policy policy_;
    private com.google.protobuf.SingleFieldBuilder<
            com.google.iam.v2beta.Policy,
            com.google.iam.v2beta.Policy.Builder,
            com.google.iam.v2beta.PolicyOrBuilder>
        policyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The policy to create.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the policy field is set.
     */
    public boolean hasPolicy() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to create.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The policy.
     */
    public com.google.iam.v2beta.Policy getPolicy() {
      if (policyBuilder_ == null) {
        return policy_ == null ? com.google.iam.v2beta.Policy.getDefaultInstance() : policy_;
      } else {
        return policyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to create.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPolicy(com.google.iam.v2beta.Policy value) {
      if (policyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policy_ = value;
      } else {
        policyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to create.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPolicy(com.google.iam.v2beta.Policy.Builder builderForValue) {
      if (policyBuilder_ == null) {
        policy_ = builderForValue.build();
      } else {
        policyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to create.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergePolicy(com.google.iam.v2beta.Policy value) {
      if (policyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && policy_ != null
            && policy_ != com.google.iam.v2beta.Policy.getDefaultInstance()) {
          getPolicyBuilder().mergeFrom(value);
        } else {
          policy_ = value;
        }
      } else {
        policyBuilder_.mergeFrom(value);
      }
      if (policy_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to create.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearPolicy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to create.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.iam.v2beta.Policy.Builder getPolicyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPolicyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to create.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.iam.v2beta.PolicyOrBuilder getPolicyOrBuilder() {
      if (policyBuilder_ != null) {
        return policyBuilder_.getMessageOrBuilder();
      } else {
        return policy_ == null ? com.google.iam.v2beta.Policy.getDefaultInstance() : policy_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to create.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
            com.google.iam.v2beta.Policy,
            com.google.iam.v2beta.Policy.Builder,
            com.google.iam.v2beta.PolicyOrBuilder>
        getPolicyFieldBuilder() {
      if (policyBuilder_ == null) {
        policyBuilder_ =
            new com.google.protobuf.SingleFieldBuilder<
                com.google.iam.v2beta.Policy,
                com.google.iam.v2beta.Policy.Builder,
                com.google.iam.v2beta.PolicyOrBuilder>(
                getPolicy(), getParentForChildren(), isClean());
        policy_ = null;
      }
      return policyBuilder_;
    }

    private java.lang.Object policyId_ = "";
    /**
     *
     *
     * <pre>
     * The ID to use for this policy, which will become the final component of
     * the policy's resource name. The ID must contain 3 to 63 characters. It can
     * contain lowercase letters and numbers, as well as dashes (`-`) and periods
     * (`.`). The first character must be a lowercase letter.
     * </pre>
     *
     * <code>string policy_id = 3;</code>
     *
     * @return The policyId.
     */
    public java.lang.String getPolicyId() {
      java.lang.Object ref = policyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        policyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this policy, which will become the final component of
     * the policy's resource name. The ID must contain 3 to 63 characters. It can
     * contain lowercase letters and numbers, as well as dashes (`-`) and periods
     * (`.`). The first character must be a lowercase letter.
     * </pre>
     *
     * <code>string policy_id = 3;</code>
     *
     * @return The bytes for policyId.
     */
    public com.google.protobuf.ByteString getPolicyIdBytes() {
      java.lang.Object ref = policyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        policyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this policy, which will become the final component of
     * the policy's resource name. The ID must contain 3 to 63 characters. It can
     * contain lowercase letters and numbers, as well as dashes (`-`) and periods
     * (`.`). The first character must be a lowercase letter.
     * </pre>
     *
     * <code>string policy_id = 3;</code>
     *
     * @param value The policyId to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      policyId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this policy, which will become the final component of
     * the policy's resource name. The ID must contain 3 to 63 characters. It can
     * contain lowercase letters and numbers, as well as dashes (`-`) and periods
     * (`.`). The first character must be a lowercase letter.
     * </pre>
     *
     * <code>string policy_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPolicyId() {
      policyId_ = getDefaultInstance().getPolicyId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this policy, which will become the final component of
     * the policy's resource name. The ID must contain 3 to 63 characters. It can
     * contain lowercase letters and numbers, as well as dashes (`-`) and periods
     * (`.`). The first character must be a lowercase letter.
     * </pre>
     *
     * <code>string policy_id = 3;</code>
     *
     * @param value The bytes for policyId to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      policyId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.iam.v2beta.CreatePolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v2beta.CreatePolicyRequest)
  private static final com.google.iam.v2beta.CreatePolicyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.v2beta.CreatePolicyRequest();
  }

  public static com.google.iam.v2beta.CreatePolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePolicyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreatePolicyRequest>() {
        @java.lang.Override
        public CreatePolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.v2beta.CreatePolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
