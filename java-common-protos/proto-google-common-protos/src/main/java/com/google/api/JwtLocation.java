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
 * Specifies a location to extract JWT from an API request.
 * </pre>
 *
 * Protobuf type {@code google.api.JwtLocation}
 */
public final class JwtLocation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.JwtLocation)
    JwtLocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use JwtLocation.newBuilder() to construct.
  private JwtLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private JwtLocation() {
    valuePrefix_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new JwtLocation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.AuthProto.internal_static_google_api_JwtLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.AuthProto.internal_static_google_api_JwtLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.JwtLocation.class, com.google.api.JwtLocation.Builder.class);
  }

  private int inCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object in_;

  public enum InCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    HEADER(1),
    QUERY(2),
    COOKIE(4),
    IN_NOT_SET(0);
    private final int value;

    private InCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InCase valueOf(int value) {
      return forNumber(value);
    }

    public static InCase forNumber(int value) {
      switch (value) {
        case 1:
          return HEADER;
        case 2:
          return QUERY;
        case 4:
          return COOKIE;
        case 0:
          return IN_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public InCase getInCase() {
    return InCase.forNumber(inCase_);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Specifies HTTP header name to extract JWT token.
   * </pre>
   *
   * <code>string header = 1;</code>
   *
   * @return Whether the header field is set.
   */
  public boolean hasHeader() {
    return inCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Specifies HTTP header name to extract JWT token.
   * </pre>
   *
   * <code>string header = 1;</code>
   *
   * @return The header.
   */
  public java.lang.String getHeader() {
    java.lang.Object ref = "";
    if (inCase_ == 1) {
      ref = in_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (inCase_ == 1) {
        in_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies HTTP header name to extract JWT token.
   * </pre>
   *
   * <code>string header = 1;</code>
   *
   * @return The bytes for header.
   */
  public com.google.protobuf.ByteString getHeaderBytes() {
    java.lang.Object ref = "";
    if (inCase_ == 1) {
      ref = in_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (inCase_ == 1) {
        in_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Specifies URL query parameter name to extract JWT token.
   * </pre>
   *
   * <code>string query = 2;</code>
   *
   * @return Whether the query field is set.
   */
  public boolean hasQuery() {
    return inCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Specifies URL query parameter name to extract JWT token.
   * </pre>
   *
   * <code>string query = 2;</code>
   *
   * @return The query.
   */
  public java.lang.String getQuery() {
    java.lang.Object ref = "";
    if (inCase_ == 2) {
      ref = in_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (inCase_ == 2) {
        in_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies URL query parameter name to extract JWT token.
   * </pre>
   *
   * <code>string query = 2;</code>
   *
   * @return The bytes for query.
   */
  public com.google.protobuf.ByteString getQueryBytes() {
    java.lang.Object ref = "";
    if (inCase_ == 2) {
      ref = in_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (inCase_ == 2) {
        in_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COOKIE_FIELD_NUMBER = 4;
  /**
   *
   *
   * <pre>
   * Specifies cookie name to extract JWT token.
   * </pre>
   *
   * <code>string cookie = 4;</code>
   *
   * @return Whether the cookie field is set.
   */
  public boolean hasCookie() {
    return inCase_ == 4;
  }
  /**
   *
   *
   * <pre>
   * Specifies cookie name to extract JWT token.
   * </pre>
   *
   * <code>string cookie = 4;</code>
   *
   * @return The cookie.
   */
  public java.lang.String getCookie() {
    java.lang.Object ref = "";
    if (inCase_ == 4) {
      ref = in_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (inCase_ == 4) {
        in_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies cookie name to extract JWT token.
   * </pre>
   *
   * <code>string cookie = 4;</code>
   *
   * @return The bytes for cookie.
   */
  public com.google.protobuf.ByteString getCookieBytes() {
    java.lang.Object ref = "";
    if (inCase_ == 4) {
      ref = in_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (inCase_ == 4) {
        in_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_PREFIX_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object valuePrefix_ = "";
  /**
   *
   *
   * <pre>
   * The value prefix. The value format is "value_prefix{token}"
   * Only applies to "in" header type. Must be empty for "in" query type.
   * If not empty, the header value has to match (case sensitive) this prefix.
   * If not matched, JWT will not be extracted. If matched, JWT will be
   * extracted after the prefix is removed.
   *
   * For example, for "Authorization: Bearer {JWT}",
   * value_prefix="Bearer " with a space at the end.
   * </pre>
   *
   * <code>string value_prefix = 3;</code>
   *
   * @return The valuePrefix.
   */
  @java.lang.Override
  public java.lang.String getValuePrefix() {
    java.lang.Object ref = valuePrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valuePrefix_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The value prefix. The value format is "value_prefix{token}"
   * Only applies to "in" header type. Must be empty for "in" query type.
   * If not empty, the header value has to match (case sensitive) this prefix.
   * If not matched, JWT will not be extracted. If matched, JWT will be
   * extracted after the prefix is removed.
   *
   * For example, for "Authorization: Bearer {JWT}",
   * value_prefix="Bearer " with a space at the end.
   * </pre>
   *
   * <code>string value_prefix = 3;</code>
   *
   * @return The bytes for valuePrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValuePrefixBytes() {
    java.lang.Object ref = valuePrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      valuePrefix_ = b;
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
    if (inCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, in_);
    }
    if (inCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, in_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valuePrefix_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, valuePrefix_);
    }
    if (inCase_ == 4) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, in_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, in_);
    }
    if (inCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, in_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valuePrefix_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, valuePrefix_);
    }
    if (inCase_ == 4) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, in_);
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
    if (!(obj instanceof com.google.api.JwtLocation)) {
      return super.equals(obj);
    }
    com.google.api.JwtLocation other = (com.google.api.JwtLocation) obj;

    if (!getValuePrefix().equals(other.getValuePrefix())) return false;
    if (!getInCase().equals(other.getInCase())) return false;
    switch (inCase_) {
      case 1:
        if (!getHeader().equals(other.getHeader())) return false;
        break;
      case 2:
        if (!getQuery().equals(other.getQuery())) return false;
        break;
      case 4:
        if (!getCookie().equals(other.getCookie())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + VALUE_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getValuePrefix().hashCode();
    switch (inCase_) {
      case 1:
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + getHeader().hashCode();
        break;
      case 2:
        hash = (37 * hash) + QUERY_FIELD_NUMBER;
        hash = (53 * hash) + getQuery().hashCode();
        break;
      case 4:
        hash = (37 * hash) + COOKIE_FIELD_NUMBER;
        hash = (53 * hash) + getCookie().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.JwtLocation parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.JwtLocation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.JwtLocation parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.JwtLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.JwtLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.JwtLocation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.JwtLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.JwtLocation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.JwtLocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.JwtLocation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.JwtLocation parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.JwtLocation parseFrom(
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

  public static Builder newBuilder(com.google.api.JwtLocation prototype) {
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
   * Specifies a location to extract JWT from an API request.
   * </pre>
   *
   * Protobuf type {@code google.api.JwtLocation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.JwtLocation)
      com.google.api.JwtLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.AuthProto.internal_static_google_api_JwtLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.AuthProto.internal_static_google_api_JwtLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.JwtLocation.class, com.google.api.JwtLocation.Builder.class);
    }

    // Construct using com.google.api.JwtLocation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      valuePrefix_ = "";
      inCase_ = 0;
      in_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.AuthProto.internal_static_google_api_JwtLocation_descriptor;
    }

    @java.lang.Override
    public com.google.api.JwtLocation getDefaultInstanceForType() {
      return com.google.api.JwtLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.JwtLocation build() {
      com.google.api.JwtLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.JwtLocation buildPartial() {
      com.google.api.JwtLocation result = new com.google.api.JwtLocation(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.JwtLocation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.valuePrefix_ = valuePrefix_;
      }
    }

    private void buildPartialOneofs(com.google.api.JwtLocation result) {
      result.inCase_ = inCase_;
      result.in_ = this.in_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.JwtLocation) {
        return mergeFrom((com.google.api.JwtLocation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.JwtLocation other) {
      if (other == com.google.api.JwtLocation.getDefaultInstance()) return this;
      if (!other.getValuePrefix().isEmpty()) {
        valuePrefix_ = other.valuePrefix_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      switch (other.getInCase()) {
        case HEADER:
          {
            inCase_ = 1;
            in_ = other.in_;
            onChanged();
            break;
          }
        case QUERY:
          {
            inCase_ = 2;
            in_ = other.in_;
            onChanged();
            break;
          }
        case COOKIE:
          {
            inCase_ = 4;
            in_ = other.in_;
            onChanged();
            break;
          }
        case IN_NOT_SET:
          {
            break;
          }
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
                java.lang.String s = input.readStringRequireUtf8();
                inCase_ = 1;
                in_ = s;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                inCase_ = 2;
                in_ = s;
                break;
              } // case 18
            case 26:
              {
                valuePrefix_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 26
            case 34:
              {
                java.lang.String s = input.readStringRequireUtf8();
                inCase_ = 4;
                in_ = s;
                break;
              } // case 34
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

    private int inCase_ = 0;
    private java.lang.Object in_;

    public InCase getInCase() {
      return InCase.forNumber(inCase_);
    }

    public Builder clearIn() {
      inCase_ = 0;
      in_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Specifies HTTP header name to extract JWT token.
     * </pre>
     *
     * <code>string header = 1;</code>
     *
     * @return Whether the header field is set.
     */
    @java.lang.Override
    public boolean hasHeader() {
      return inCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Specifies HTTP header name to extract JWT token.
     * </pre>
     *
     * <code>string header = 1;</code>
     *
     * @return The header.
     */
    @java.lang.Override
    public java.lang.String getHeader() {
      java.lang.Object ref = "";
      if (inCase_ == 1) {
        ref = in_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (inCase_ == 1) {
          in_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies HTTP header name to extract JWT token.
     * </pre>
     *
     * <code>string header = 1;</code>
     *
     * @return The bytes for header.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getHeaderBytes() {
      java.lang.Object ref = "";
      if (inCase_ == 1) {
        ref = in_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (inCase_ == 1) {
          in_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies HTTP header name to extract JWT token.
     * </pre>
     *
     * <code>string header = 1;</code>
     *
     * @param value The header to set.
     * @return This builder for chaining.
     */
    public Builder setHeader(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      inCase_ = 1;
      in_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies HTTP header name to extract JWT token.
     * </pre>
     *
     * <code>string header = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHeader() {
      if (inCase_ == 1) {
        inCase_ = 0;
        in_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies HTTP header name to extract JWT token.
     * </pre>
     *
     * <code>string header = 1;</code>
     *
     * @param value The bytes for header to set.
     * @return This builder for chaining.
     */
    public Builder setHeaderBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      inCase_ = 1;
      in_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specifies URL query parameter name to extract JWT token.
     * </pre>
     *
     * <code>string query = 2;</code>
     *
     * @return Whether the query field is set.
     */
    @java.lang.Override
    public boolean hasQuery() {
      return inCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Specifies URL query parameter name to extract JWT token.
     * </pre>
     *
     * <code>string query = 2;</code>
     *
     * @return The query.
     */
    @java.lang.Override
    public java.lang.String getQuery() {
      java.lang.Object ref = "";
      if (inCase_ == 2) {
        ref = in_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (inCase_ == 2) {
          in_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies URL query parameter name to extract JWT token.
     * </pre>
     *
     * <code>string query = 2;</code>
     *
     * @return The bytes for query.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getQueryBytes() {
      java.lang.Object ref = "";
      if (inCase_ == 2) {
        ref = in_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (inCase_ == 2) {
          in_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies URL query parameter name to extract JWT token.
     * </pre>
     *
     * <code>string query = 2;</code>
     *
     * @param value The query to set.
     * @return This builder for chaining.
     */
    public Builder setQuery(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      inCase_ = 2;
      in_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies URL query parameter name to extract JWT token.
     * </pre>
     *
     * <code>string query = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearQuery() {
      if (inCase_ == 2) {
        inCase_ = 0;
        in_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies URL query parameter name to extract JWT token.
     * </pre>
     *
     * <code>string query = 2;</code>
     *
     * @param value The bytes for query to set.
     * @return This builder for chaining.
     */
    public Builder setQueryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      inCase_ = 2;
      in_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specifies cookie name to extract JWT token.
     * </pre>
     *
     * <code>string cookie = 4;</code>
     *
     * @return Whether the cookie field is set.
     */
    @java.lang.Override
    public boolean hasCookie() {
      return inCase_ == 4;
    }
    /**
     *
     *
     * <pre>
     * Specifies cookie name to extract JWT token.
     * </pre>
     *
     * <code>string cookie = 4;</code>
     *
     * @return The cookie.
     */
    @java.lang.Override
    public java.lang.String getCookie() {
      java.lang.Object ref = "";
      if (inCase_ == 4) {
        ref = in_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (inCase_ == 4) {
          in_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies cookie name to extract JWT token.
     * </pre>
     *
     * <code>string cookie = 4;</code>
     *
     * @return The bytes for cookie.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCookieBytes() {
      java.lang.Object ref = "";
      if (inCase_ == 4) {
        ref = in_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (inCase_ == 4) {
          in_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies cookie name to extract JWT token.
     * </pre>
     *
     * <code>string cookie = 4;</code>
     *
     * @param value The cookie to set.
     * @return This builder for chaining.
     */
    public Builder setCookie(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      inCase_ = 4;
      in_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies cookie name to extract JWT token.
     * </pre>
     *
     * <code>string cookie = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCookie() {
      if (inCase_ == 4) {
        inCase_ = 0;
        in_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies cookie name to extract JWT token.
     * </pre>
     *
     * <code>string cookie = 4;</code>
     *
     * @param value The bytes for cookie to set.
     * @return This builder for chaining.
     */
    public Builder setCookieBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      inCase_ = 4;
      in_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object valuePrefix_ = "";
    /**
     *
     *
     * <pre>
     * The value prefix. The value format is "value_prefix{token}"
     * Only applies to "in" header type. Must be empty for "in" query type.
     * If not empty, the header value has to match (case sensitive) this prefix.
     * If not matched, JWT will not be extracted. If matched, JWT will be
     * extracted after the prefix is removed.
     *
     * For example, for "Authorization: Bearer {JWT}",
     * value_prefix="Bearer " with a space at the end.
     * </pre>
     *
     * <code>string value_prefix = 3;</code>
     *
     * @return The valuePrefix.
     */
    public java.lang.String getValuePrefix() {
      java.lang.Object ref = valuePrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valuePrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The value prefix. The value format is "value_prefix{token}"
     * Only applies to "in" header type. Must be empty for "in" query type.
     * If not empty, the header value has to match (case sensitive) this prefix.
     * If not matched, JWT will not be extracted. If matched, JWT will be
     * extracted after the prefix is removed.
     *
     * For example, for "Authorization: Bearer {JWT}",
     * value_prefix="Bearer " with a space at the end.
     * </pre>
     *
     * <code>string value_prefix = 3;</code>
     *
     * @return The bytes for valuePrefix.
     */
    public com.google.protobuf.ByteString getValuePrefixBytes() {
      java.lang.Object ref = valuePrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        valuePrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The value prefix. The value format is "value_prefix{token}"
     * Only applies to "in" header type. Must be empty for "in" query type.
     * If not empty, the header value has to match (case sensitive) this prefix.
     * If not matched, JWT will not be extracted. If matched, JWT will be
     * extracted after the prefix is removed.
     *
     * For example, for "Authorization: Bearer {JWT}",
     * value_prefix="Bearer " with a space at the end.
     * </pre>
     *
     * <code>string value_prefix = 3;</code>
     *
     * @param value The valuePrefix to set.
     * @return This builder for chaining.
     */
    public Builder setValuePrefix(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      valuePrefix_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value prefix. The value format is "value_prefix{token}"
     * Only applies to "in" header type. Must be empty for "in" query type.
     * If not empty, the header value has to match (case sensitive) this prefix.
     * If not matched, JWT will not be extracted. If matched, JWT will be
     * extracted after the prefix is removed.
     *
     * For example, for "Authorization: Bearer {JWT}",
     * value_prefix="Bearer " with a space at the end.
     * </pre>
     *
     * <code>string value_prefix = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValuePrefix() {
      valuePrefix_ = getDefaultInstance().getValuePrefix();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value prefix. The value format is "value_prefix{token}"
     * Only applies to "in" header type. Must be empty for "in" query type.
     * If not empty, the header value has to match (case sensitive) this prefix.
     * If not matched, JWT will not be extracted. If matched, JWT will be
     * extracted after the prefix is removed.
     *
     * For example, for "Authorization: Bearer {JWT}",
     * value_prefix="Bearer " with a space at the end.
     * </pre>
     *
     * <code>string value_prefix = 3;</code>
     *
     * @param value The bytes for valuePrefix to set.
     * @return This builder for chaining.
     */
    public Builder setValuePrefixBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      valuePrefix_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.api.JwtLocation)
  }

  // @@protoc_insertion_point(class_scope:google.api.JwtLocation)
  private static final com.google.api.JwtLocation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.JwtLocation();
  }

  public static com.google.api.JwtLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JwtLocation> PARSER =
      new com.google.protobuf.AbstractParser<JwtLocation>() {
        @java.lang.Override
        public JwtLocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<JwtLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JwtLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.JwtLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
