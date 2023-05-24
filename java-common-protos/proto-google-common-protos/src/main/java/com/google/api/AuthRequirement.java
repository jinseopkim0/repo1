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
// source: google/api/auth.proto

package com.google.api;

/**
 *
 *
 * <pre>
 * User-defined authentication requirements, including support for
 * [JSON Web Token
 * (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 * </pre>
 *
 * Protobuf type {@code google.api.AuthRequirement}
 */
public final class AuthRequirement extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.AuthRequirement)
    AuthRequirementOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AuthRequirement.newBuilder() to construct.
  private AuthRequirement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AuthRequirement() {
    providerId_ = "";
    audiences_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AuthRequirement();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.AuthProto.internal_static_google_api_AuthRequirement_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.AuthProto.internal_static_google_api_AuthRequirement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.AuthRequirement.class, com.google.api.AuthRequirement.Builder.class);
  }

  public static final int PROVIDER_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object providerId_ = "";
  /**
   *
   *
   * <pre>
   * [id][google.api.AuthProvider.id] from authentication provider.
   *
   * Example:
   *
   *     provider_id: bookstore_auth
   * </pre>
   *
   * <code>string provider_id = 1;</code>
   *
   * @return The providerId.
   */
  @java.lang.Override
  public java.lang.String getProviderId() {
    java.lang.Object ref = providerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      providerId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * [id][google.api.AuthProvider.id] from authentication provider.
   *
   * Example:
   *
   *     provider_id: bookstore_auth
   * </pre>
   *
   * <code>string provider_id = 1;</code>
   *
   * @return The bytes for providerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProviderIdBytes() {
    java.lang.Object ref = providerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      providerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUDIENCES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object audiences_ = "";
  /**
   *
   *
   * <pre>
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is
   * implemented and accepted in all the runtime components.
   *
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   *
   * Example:
   *
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>string audiences = 2;</code>
   *
   * @return The audiences.
   */
  @java.lang.Override
  public java.lang.String getAudiences() {
    java.lang.Object ref = audiences_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      audiences_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is
   * implemented and accepted in all the runtime components.
   *
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   *
   * Example:
   *
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>string audiences = 2;</code>
   *
   * @return The bytes for audiences.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAudiencesBytes() {
    java.lang.Object ref = audiences_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      audiences_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(providerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, providerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(audiences_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, audiences_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(providerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, providerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(audiences_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, audiences_);
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
    if (!(obj instanceof com.google.api.AuthRequirement)) {
      return super.equals(obj);
    }
    com.google.api.AuthRequirement other = (com.google.api.AuthRequirement) obj;

    if (!getProviderId().equals(other.getProviderId())) return false;
    if (!getAudiences().equals(other.getAudiences())) return false;
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
    hash = (37 * hash) + PROVIDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProviderId().hashCode();
    hash = (37 * hash) + AUDIENCES_FIELD_NUMBER;
    hash = (53 * hash) + getAudiences().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.AuthRequirement parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.AuthRequirement parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.AuthRequirement parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.AuthRequirement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.AuthRequirement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.AuthRequirement parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.AuthRequirement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.AuthRequirement parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.AuthRequirement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.AuthRequirement parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.AuthRequirement parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.AuthRequirement parseFrom(
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

  public static Builder newBuilder(com.google.api.AuthRequirement prototype) {
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
   * User-defined authentication requirements, including support for
   * [JSON Web Token
   * (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
   * </pre>
   *
   * Protobuf type {@code google.api.AuthRequirement}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.AuthRequirement)
      com.google.api.AuthRequirementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.AuthProto.internal_static_google_api_AuthRequirement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.AuthProto.internal_static_google_api_AuthRequirement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.AuthRequirement.class, com.google.api.AuthRequirement.Builder.class);
    }

    // Construct using com.google.api.AuthRequirement.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      providerId_ = "";
      audiences_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.AuthProto.internal_static_google_api_AuthRequirement_descriptor;
    }

    @java.lang.Override
    public com.google.api.AuthRequirement getDefaultInstanceForType() {
      return com.google.api.AuthRequirement.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.AuthRequirement build() {
      com.google.api.AuthRequirement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.AuthRequirement buildPartial() {
      com.google.api.AuthRequirement result = new com.google.api.AuthRequirement(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.AuthRequirement result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.providerId_ = providerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.audiences_ = audiences_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.AuthRequirement) {
        return mergeFrom((com.google.api.AuthRequirement) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.AuthRequirement other) {
      if (other == com.google.api.AuthRequirement.getDefaultInstance()) return this;
      if (!other.getProviderId().isEmpty()) {
        providerId_ = other.providerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAudiences().isEmpty()) {
        audiences_ = other.audiences_;
        bitField0_ |= 0x00000002;
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
                providerId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                audiences_ = input.readStringRequireUtf8();
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

    private java.lang.Object providerId_ = "";
    /**
     *
     *
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     *
     * Example:
     *
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>string provider_id = 1;</code>
     *
     * @return The providerId.
     */
    public java.lang.String getProviderId() {
      java.lang.Object ref = providerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        providerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     *
     * Example:
     *
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>string provider_id = 1;</code>
     *
     * @return The bytes for providerId.
     */
    public com.google.protobuf.ByteString getProviderIdBytes() {
      java.lang.Object ref = providerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        providerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     *
     * Example:
     *
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>string provider_id = 1;</code>
     *
     * @param value The providerId to set.
     * @return This builder for chaining.
     */
    public Builder setProviderId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      providerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     *
     * Example:
     *
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>string provider_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProviderId() {
      providerId_ = getDefaultInstance().getProviderId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     *
     * Example:
     *
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>string provider_id = 1;</code>
     *
     * @param value The bytes for providerId to set.
     * @return This builder for chaining.
     */
    public Builder setProviderIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      providerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object audiences_ = "";
    /**
     *
     *
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     *
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     *
     * Example:
     *
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>string audiences = 2;</code>
     *
     * @return The audiences.
     */
    public java.lang.String getAudiences() {
      java.lang.Object ref = audiences_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        audiences_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     *
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     *
     * Example:
     *
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>string audiences = 2;</code>
     *
     * @return The bytes for audiences.
     */
    public com.google.protobuf.ByteString getAudiencesBytes() {
      java.lang.Object ref = audiences_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        audiences_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     *
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     *
     * Example:
     *
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>string audiences = 2;</code>
     *
     * @param value The audiences to set.
     * @return This builder for chaining.
     */
    public Builder setAudiences(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      audiences_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     *
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     *
     * Example:
     *
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>string audiences = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAudiences() {
      audiences_ = getDefaultInstance().getAudiences();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     *
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     *
     * Example:
     *
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>string audiences = 2;</code>
     *
     * @param value The bytes for audiences to set.
     * @return This builder for chaining.
     */
    public Builder setAudiencesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      audiences_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.api.AuthRequirement)
  }

  // @@protoc_insertion_point(class_scope:google.api.AuthRequirement)
  private static final com.google.api.AuthRequirement DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.AuthRequirement();
  }

  public static com.google.api.AuthRequirement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthRequirement> PARSER =
      new com.google.protobuf.AbstractParser<AuthRequirement>() {
        @java.lang.Override
        public AuthRequirement parsePartialFrom(
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

  public static com.google.protobuf.Parser<AuthRequirement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthRequirement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.AuthRequirement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
