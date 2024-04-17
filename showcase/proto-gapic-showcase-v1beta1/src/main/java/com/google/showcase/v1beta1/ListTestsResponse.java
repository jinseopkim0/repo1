// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/testing.proto

// Protobuf Java Version: 3.25.3
package com.google.showcase.v1beta1;

/**
 * <pre>
 * The response for the ListTests method.
 * </pre>
 *
 * Protobuf type {@code google.showcase.v1beta1.ListTestsResponse}
 */
public final class ListTestsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.ListTestsResponse)
    ListTestsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTestsResponse.newBuilder() to construct.
  private ListTestsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTestsResponse() {
    tests_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTestsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_ListTestsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_ListTestsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.ListTestsResponse.class, com.google.showcase.v1beta1.ListTestsResponse.Builder.class);
  }

  public static final int TESTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.showcase.v1beta1.Test> tests_;
  /**
   * <pre>
   * The tests being returned.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.showcase.v1beta1.Test> getTestsList() {
    return tests_;
  }
  /**
   * <pre>
   * The tests being returned.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.showcase.v1beta1.TestOrBuilder> 
      getTestsOrBuilderList() {
    return tests_;
  }
  /**
   * <pre>
   * The tests being returned.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
   */
  @java.lang.Override
  public int getTestsCount() {
    return tests_.size();
  }
  /**
   * <pre>
   * The tests being returned.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.Test getTests(int index) {
    return tests_.get(index);
  }
  /**
   * <pre>
   * The tests being returned.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.TestOrBuilder getTestsOrBuilder(
      int index) {
    return tests_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * The next page token, if any.
   * An empty value here means the last page has been reached.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The next page token, if any.
   * An empty value here means the last page has been reached.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < tests_.size(); i++) {
      output.writeMessage(1, tests_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tests_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.showcase.v1beta1.ListTestsResponse)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.ListTestsResponse other = (com.google.showcase.v1beta1.ListTestsResponse) obj;

    if (!getTestsList()
        .equals(other.getTestsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getTestsCount() > 0) {
      hash = (37 * hash) + TESTS_FIELD_NUMBER;
      hash = (53 * hash) + getTestsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.ListTestsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ListTestsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ListTestsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ListTestsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ListTestsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ListTestsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ListTestsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.ListTestsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.ListTestsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.ListTestsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ListTestsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.ListTestsResponse parseFrom(
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
  public static Builder newBuilder(com.google.showcase.v1beta1.ListTestsResponse prototype) {
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
   * The response for the ListTests method.
   * </pre>
   *
   * Protobuf type {@code google.showcase.v1beta1.ListTestsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.ListTestsResponse)
      com.google.showcase.v1beta1.ListTestsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_ListTestsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_ListTestsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.ListTestsResponse.class, com.google.showcase.v1beta1.ListTestsResponse.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.ListTestsResponse.newBuilder()
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
      if (testsBuilder_ == null) {
        tests_ = java.util.Collections.emptyList();
      } else {
        tests_ = null;
        testsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_ListTestsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ListTestsResponse getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.ListTestsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ListTestsResponse build() {
      com.google.showcase.v1beta1.ListTestsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ListTestsResponse buildPartial() {
      com.google.showcase.v1beta1.ListTestsResponse result = new com.google.showcase.v1beta1.ListTestsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.showcase.v1beta1.ListTestsResponse result) {
      if (testsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tests_ = java.util.Collections.unmodifiableList(tests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tests_ = tests_;
      } else {
        result.tests_ = testsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.showcase.v1beta1.ListTestsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.showcase.v1beta1.ListTestsResponse) {
        return mergeFrom((com.google.showcase.v1beta1.ListTestsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.ListTestsResponse other) {
      if (other == com.google.showcase.v1beta1.ListTestsResponse.getDefaultInstance()) return this;
      if (testsBuilder_ == null) {
        if (!other.tests_.isEmpty()) {
          if (tests_.isEmpty()) {
            tests_ = other.tests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTestsIsMutable();
            tests_.addAll(other.tests_);
          }
          onChanged();
        }
      } else {
        if (!other.tests_.isEmpty()) {
          if (testsBuilder_.isEmpty()) {
            testsBuilder_.dispose();
            testsBuilder_ = null;
            tests_ = other.tests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            testsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTestsFieldBuilder() : null;
          } else {
            testsBuilder_.addAllMessages(other.tests_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
            case 10: {
              com.google.showcase.v1beta1.Test m =
                  input.readMessage(
                      com.google.showcase.v1beta1.Test.parser(),
                      extensionRegistry);
              if (testsBuilder_ == null) {
                ensureTestsIsMutable();
                tests_.add(m);
              } else {
                testsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<com.google.showcase.v1beta1.Test> tests_ =
      java.util.Collections.emptyList();
    private void ensureTestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tests_ = new java.util.ArrayList<com.google.showcase.v1beta1.Test>(tests_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.showcase.v1beta1.Test, com.google.showcase.v1beta1.Test.Builder, com.google.showcase.v1beta1.TestOrBuilder> testsBuilder_;

    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public java.util.List<com.google.showcase.v1beta1.Test> getTestsList() {
      if (testsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tests_);
      } else {
        return testsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public int getTestsCount() {
      if (testsBuilder_ == null) {
        return tests_.size();
      } else {
        return testsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public com.google.showcase.v1beta1.Test getTests(int index) {
      if (testsBuilder_ == null) {
        return tests_.get(index);
      } else {
        return testsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public Builder setTests(
        int index, com.google.showcase.v1beta1.Test value) {
      if (testsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestsIsMutable();
        tests_.set(index, value);
        onChanged();
      } else {
        testsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public Builder setTests(
        int index, com.google.showcase.v1beta1.Test.Builder builderForValue) {
      if (testsBuilder_ == null) {
        ensureTestsIsMutable();
        tests_.set(index, builderForValue.build());
        onChanged();
      } else {
        testsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public Builder addTests(com.google.showcase.v1beta1.Test value) {
      if (testsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestsIsMutable();
        tests_.add(value);
        onChanged();
      } else {
        testsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public Builder addTests(
        int index, com.google.showcase.v1beta1.Test value) {
      if (testsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestsIsMutable();
        tests_.add(index, value);
        onChanged();
      } else {
        testsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public Builder addTests(
        com.google.showcase.v1beta1.Test.Builder builderForValue) {
      if (testsBuilder_ == null) {
        ensureTestsIsMutable();
        tests_.add(builderForValue.build());
        onChanged();
      } else {
        testsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public Builder addTests(
        int index, com.google.showcase.v1beta1.Test.Builder builderForValue) {
      if (testsBuilder_ == null) {
        ensureTestsIsMutable();
        tests_.add(index, builderForValue.build());
        onChanged();
      } else {
        testsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public Builder addAllTests(
        java.lang.Iterable<? extends com.google.showcase.v1beta1.Test> values) {
      if (testsBuilder_ == null) {
        ensureTestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tests_);
        onChanged();
      } else {
        testsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public Builder clearTests() {
      if (testsBuilder_ == null) {
        tests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        testsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public Builder removeTests(int index) {
      if (testsBuilder_ == null) {
        ensureTestsIsMutable();
        tests_.remove(index);
        onChanged();
      } else {
        testsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public com.google.showcase.v1beta1.Test.Builder getTestsBuilder(
        int index) {
      return getTestsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public com.google.showcase.v1beta1.TestOrBuilder getTestsOrBuilder(
        int index) {
      if (testsBuilder_ == null) {
        return tests_.get(index);  } else {
        return testsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public java.util.List<? extends com.google.showcase.v1beta1.TestOrBuilder> 
         getTestsOrBuilderList() {
      if (testsBuilder_ != null) {
        return testsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tests_);
      }
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public com.google.showcase.v1beta1.Test.Builder addTestsBuilder() {
      return getTestsFieldBuilder().addBuilder(
          com.google.showcase.v1beta1.Test.getDefaultInstance());
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public com.google.showcase.v1beta1.Test.Builder addTestsBuilder(
        int index) {
      return getTestsFieldBuilder().addBuilder(
          index, com.google.showcase.v1beta1.Test.getDefaultInstance());
    }
    /**
     * <pre>
     * The tests being returned.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.Test tests = 1;</code>
     */
    public java.util.List<com.google.showcase.v1beta1.Test.Builder> 
         getTestsBuilderList() {
      return getTestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.showcase.v1beta1.Test, com.google.showcase.v1beta1.Test.Builder, com.google.showcase.v1beta1.TestOrBuilder> 
        getTestsFieldBuilder() {
      if (testsBuilder_ == null) {
        testsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.showcase.v1beta1.Test, com.google.showcase.v1beta1.Test.Builder, com.google.showcase.v1beta1.TestOrBuilder>(
                tests_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tests_ = null;
      }
      return testsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The next page token, if any.
     * An empty value here means the last page has been reached.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The next page token, if any.
     * An empty value here means the last page has been reached.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The next page token, if any.
     * An empty value here means the last page has been reached.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The next page token, if any.
     * An empty value here means the last page has been reached.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The next page token, if any.
     * An empty value here means the last page has been reached.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.ListTestsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.ListTestsResponse)
  private static final com.google.showcase.v1beta1.ListTestsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.ListTestsResponse();
  }

  public static com.google.showcase.v1beta1.ListTestsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTestsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTestsResponse>() {
    @java.lang.Override
    public ListTestsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTestsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTestsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.ListTestsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

