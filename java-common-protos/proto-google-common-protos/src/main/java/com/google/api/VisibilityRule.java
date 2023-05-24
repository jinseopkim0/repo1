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
// source: google/api/visibility.proto

package com.google.api;

/**
 *
 *
 * <pre>
 * A visibility rule provides visibility configuration for an individual API
 * element.
 * </pre>
 *
 * Protobuf type {@code google.api.VisibilityRule}
 */
public final class VisibilityRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.VisibilityRule)
    VisibilityRuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VisibilityRule.newBuilder() to construct.
  private VisibilityRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VisibilityRule() {
    selector_ = "";
    restriction_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VisibilityRule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.VisibilityProto.internal_static_google_api_VisibilityRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.VisibilityProto
        .internal_static_google_api_VisibilityRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.VisibilityRule.class, com.google.api.VisibilityRule.Builder.class);
  }

  public static final int SELECTOR_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object selector_ = "";
  /**
   *
   *
   * <pre>
   * Selects methods, messages, fields, enums, etc. to which this rule applies.
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
   * Selects methods, messages, fields, enums, etc. to which this rule applies.
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

  public static final int RESTRICTION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object restriction_ = "";
  /**
   *
   *
   * <pre>
   * A comma-separated list of visibility labels that apply to the `selector`.
   * Any of the listed labels can be used to grant the visibility.
   *
   * If a rule has multiple labels, removing one of the labels but not all of
   * them can break clients.
   *
   * Example:
   *
   *     visibility:
   *       rules:
   *       - selector: google.calendar.Calendar.EnhancedSearch
   *         restriction: INTERNAL, PREVIEW
   *
   * Removing INTERNAL from this restriction will break clients that rely on
   * this method and only had access to it through INTERNAL.
   * </pre>
   *
   * <code>string restriction = 2;</code>
   *
   * @return The restriction.
   */
  @java.lang.Override
  public java.lang.String getRestriction() {
    java.lang.Object ref = restriction_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      restriction_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A comma-separated list of visibility labels that apply to the `selector`.
   * Any of the listed labels can be used to grant the visibility.
   *
   * If a rule has multiple labels, removing one of the labels but not all of
   * them can break clients.
   *
   * Example:
   *
   *     visibility:
   *       rules:
   *       - selector: google.calendar.Calendar.EnhancedSearch
   *         restriction: INTERNAL, PREVIEW
   *
   * Removing INTERNAL from this restriction will break clients that rely on
   * this method and only had access to it through INTERNAL.
   * </pre>
   *
   * <code>string restriction = 2;</code>
   *
   * @return The bytes for restriction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRestrictionBytes() {
    java.lang.Object ref = restriction_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      restriction_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(selector_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, selector_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(restriction_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, restriction_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(restriction_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, restriction_);
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
    if (!(obj instanceof com.google.api.VisibilityRule)) {
      return super.equals(obj);
    }
    com.google.api.VisibilityRule other = (com.google.api.VisibilityRule) obj;

    if (!getSelector().equals(other.getSelector())) return false;
    if (!getRestriction().equals(other.getRestriction())) return false;
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
    hash = (37 * hash) + RESTRICTION_FIELD_NUMBER;
    hash = (53 * hash) + getRestriction().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.VisibilityRule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.VisibilityRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.VisibilityRule parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.VisibilityRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.VisibilityRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.VisibilityRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.VisibilityRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.VisibilityRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.VisibilityRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.VisibilityRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.VisibilityRule parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.VisibilityRule parseFrom(
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

  public static Builder newBuilder(com.google.api.VisibilityRule prototype) {
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
   * A visibility rule provides visibility configuration for an individual API
   * element.
   * </pre>
   *
   * Protobuf type {@code google.api.VisibilityRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.VisibilityRule)
      com.google.api.VisibilityRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.VisibilityProto.internal_static_google_api_VisibilityRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.VisibilityProto
          .internal_static_google_api_VisibilityRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.VisibilityRule.class, com.google.api.VisibilityRule.Builder.class);
    }

    // Construct using com.google.api.VisibilityRule.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      selector_ = "";
      restriction_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.VisibilityProto.internal_static_google_api_VisibilityRule_descriptor;
    }

    @java.lang.Override
    public com.google.api.VisibilityRule getDefaultInstanceForType() {
      return com.google.api.VisibilityRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.VisibilityRule build() {
      com.google.api.VisibilityRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.VisibilityRule buildPartial() {
      com.google.api.VisibilityRule result = new com.google.api.VisibilityRule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.VisibilityRule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.selector_ = selector_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.restriction_ = restriction_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.VisibilityRule) {
        return mergeFrom((com.google.api.VisibilityRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.VisibilityRule other) {
      if (other == com.google.api.VisibilityRule.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRestriction().isEmpty()) {
        restriction_ = other.restriction_;
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
                selector_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                restriction_ = input.readStringRequireUtf8();
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

    private java.lang.Object selector_ = "";
    /**
     *
     *
     * <pre>
     * Selects methods, messages, fields, enums, etc. to which this rule applies.
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
     * Selects methods, messages, fields, enums, etc. to which this rule applies.
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
     * Selects methods, messages, fields, enums, etc. to which this rule applies.
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
     * Selects methods, messages, fields, enums, etc. to which this rule applies.
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
     * Selects methods, messages, fields, enums, etc. to which this rule applies.
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

    private java.lang.Object restriction_ = "";
    /**
     *
     *
     * <pre>
     * A comma-separated list of visibility labels that apply to the `selector`.
     * Any of the listed labels can be used to grant the visibility.
     *
     * If a rule has multiple labels, removing one of the labels but not all of
     * them can break clients.
     *
     * Example:
     *
     *     visibility:
     *       rules:
     *       - selector: google.calendar.Calendar.EnhancedSearch
     *         restriction: INTERNAL, PREVIEW
     *
     * Removing INTERNAL from this restriction will break clients that rely on
     * this method and only had access to it through INTERNAL.
     * </pre>
     *
     * <code>string restriction = 2;</code>
     *
     * @return The restriction.
     */
    public java.lang.String getRestriction() {
      java.lang.Object ref = restriction_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        restriction_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A comma-separated list of visibility labels that apply to the `selector`.
     * Any of the listed labels can be used to grant the visibility.
     *
     * If a rule has multiple labels, removing one of the labels but not all of
     * them can break clients.
     *
     * Example:
     *
     *     visibility:
     *       rules:
     *       - selector: google.calendar.Calendar.EnhancedSearch
     *         restriction: INTERNAL, PREVIEW
     *
     * Removing INTERNAL from this restriction will break clients that rely on
     * this method and only had access to it through INTERNAL.
     * </pre>
     *
     * <code>string restriction = 2;</code>
     *
     * @return The bytes for restriction.
     */
    public com.google.protobuf.ByteString getRestrictionBytes() {
      java.lang.Object ref = restriction_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        restriction_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A comma-separated list of visibility labels that apply to the `selector`.
     * Any of the listed labels can be used to grant the visibility.
     *
     * If a rule has multiple labels, removing one of the labels but not all of
     * them can break clients.
     *
     * Example:
     *
     *     visibility:
     *       rules:
     *       - selector: google.calendar.Calendar.EnhancedSearch
     *         restriction: INTERNAL, PREVIEW
     *
     * Removing INTERNAL from this restriction will break clients that rely on
     * this method and only had access to it through INTERNAL.
     * </pre>
     *
     * <code>string restriction = 2;</code>
     *
     * @param value The restriction to set.
     * @return This builder for chaining.
     */
    public Builder setRestriction(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      restriction_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A comma-separated list of visibility labels that apply to the `selector`.
     * Any of the listed labels can be used to grant the visibility.
     *
     * If a rule has multiple labels, removing one of the labels but not all of
     * them can break clients.
     *
     * Example:
     *
     *     visibility:
     *       rules:
     *       - selector: google.calendar.Calendar.EnhancedSearch
     *         restriction: INTERNAL, PREVIEW
     *
     * Removing INTERNAL from this restriction will break clients that rely on
     * this method and only had access to it through INTERNAL.
     * </pre>
     *
     * <code>string restriction = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRestriction() {
      restriction_ = getDefaultInstance().getRestriction();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A comma-separated list of visibility labels that apply to the `selector`.
     * Any of the listed labels can be used to grant the visibility.
     *
     * If a rule has multiple labels, removing one of the labels but not all of
     * them can break clients.
     *
     * Example:
     *
     *     visibility:
     *       rules:
     *       - selector: google.calendar.Calendar.EnhancedSearch
     *         restriction: INTERNAL, PREVIEW
     *
     * Removing INTERNAL from this restriction will break clients that rely on
     * this method and only had access to it through INTERNAL.
     * </pre>
     *
     * <code>string restriction = 2;</code>
     *
     * @param value The bytes for restriction to set.
     * @return This builder for chaining.
     */
    public Builder setRestrictionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      restriction_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.api.VisibilityRule)
  }

  // @@protoc_insertion_point(class_scope:google.api.VisibilityRule)
  private static final com.google.api.VisibilityRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.VisibilityRule();
  }

  public static com.google.api.VisibilityRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VisibilityRule> PARSER =
      new com.google.protobuf.AbstractParser<VisibilityRule>() {
        @java.lang.Override
        public VisibilityRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<VisibilityRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VisibilityRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.VisibilityRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
