// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/echo.proto

// Protobuf Java Version: 3.25.4
package com.google.showcase.v1beta1;

/**
 * Protobuf type {@code google.showcase.v1beta1.PagedExpandLegacyMappedResponse}
 */
public final class PagedExpandLegacyMappedResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.PagedExpandLegacyMappedResponse)
    PagedExpandLegacyMappedResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PagedExpandLegacyMappedResponse.newBuilder() to construct.
  private PagedExpandLegacyMappedResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PagedExpandLegacyMappedResponse() {
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PagedExpandLegacyMappedResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.EchoOuterClass.internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetAlphabetized();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.EchoOuterClass.internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse.class, com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse.Builder.class);
  }

  public static final int ALPHABETIZED_FIELD_NUMBER = 1;
  private static final class AlphabetizedDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList>newDefaultInstance(
                com.google.showcase.v1beta1.EchoOuterClass.internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_AlphabetizedEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.showcase.v1beta1.PagedExpandResponseList.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> alphabetized_;
  private com.google.protobuf.MapField<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList>
  internalGetAlphabetized() {
    if (alphabetized_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AlphabetizedDefaultEntryHolder.defaultEntry);
    }
    return alphabetized_;
  }
  public int getAlphabetizedCount() {
    return internalGetAlphabetized().getMap().size();
  }
  /**
   * <pre>
   * The words that were expanded, indexed by their initial character.
   * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
   *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
   * </pre>
   *
   * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
   */
  @java.lang.Override
  public boolean containsAlphabetized(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetAlphabetized().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAlphabetizedMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> getAlphabetized() {
    return getAlphabetizedMap();
  }
  /**
   * <pre>
   * The words that were expanded, indexed by their initial character.
   * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
   *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
   * </pre>
   *
   * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> getAlphabetizedMap() {
    return internalGetAlphabetized().getMap();
  }
  /**
   * <pre>
   * The words that were expanded, indexed by their initial character.
   * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
   *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
   * </pre>
   *
   * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
com.google.showcase.v1beta1.PagedExpandResponseList getAlphabetizedOrDefault(
      java.lang.String key,
      /* nullable */
com.google.showcase.v1beta1.PagedExpandResponseList defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> map =
        internalGetAlphabetized().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * The words that were expanded, indexed by their initial character.
   * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
   *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
   * </pre>
   *
   * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.PagedExpandResponseList getAlphabetizedOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> map =
        internalGetAlphabetized().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * The next page token.
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
   * The next page token.
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAlphabetized(),
        AlphabetizedDefaultEntryHolder.defaultEntry,
        1);
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
    for (java.util.Map.Entry<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> entry
         : internalGetAlphabetized().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList>
      alphabetized__ = AlphabetizedDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, alphabetized__);
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
    if (!(obj instanceof com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse other = (com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse) obj;

    if (!internalGetAlphabetized().equals(
        other.internalGetAlphabetized())) return false;
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
    if (!internalGetAlphabetized().getMap().isEmpty()) {
      hash = (37 * hash) + ALPHABETIZED_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAlphabetized().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse parseFrom(
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
  public static Builder newBuilder(com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse prototype) {
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
   * Protobuf type {@code google.showcase.v1beta1.PagedExpandLegacyMappedResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.PagedExpandLegacyMappedResponse)
      com.google.showcase.v1beta1.PagedExpandLegacyMappedResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.EchoOuterClass.internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetAlphabetized();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableAlphabetized();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.EchoOuterClass.internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse.class, com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse.newBuilder()
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
      internalGetMutableAlphabetized().clear();
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.EchoOuterClass.internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse build() {
      com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse buildPartial() {
      com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse result = new com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.alphabetized_ = internalGetAlphabetized().build(AlphabetizedDefaultEntryHolder.defaultEntry);
      }
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
      if (other instanceof com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse) {
        return mergeFrom((com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse other) {
      if (other == com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse.getDefaultInstance()) return this;
      internalGetMutableAlphabetized().mergeFrom(
          other.internalGetAlphabetized());
      bitField0_ |= 0x00000001;
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
              com.google.protobuf.MapEntry<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList>
              alphabetized__ = input.readMessage(
                  AlphabetizedDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableAlphabetized().ensureBuilderMap().put(
                  alphabetized__.getKey(), alphabetized__.getValue());
              bitField0_ |= 0x00000001;
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

    private static final class AlphabetizedConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseListOrBuilder, com.google.showcase.v1beta1.PagedExpandResponseList> {
      @java.lang.Override
      public com.google.showcase.v1beta1.PagedExpandResponseList build(com.google.showcase.v1beta1.PagedExpandResponseListOrBuilder val) {
        if (val instanceof com.google.showcase.v1beta1.PagedExpandResponseList) { return (com.google.showcase.v1beta1.PagedExpandResponseList) val; }
        return ((com.google.showcase.v1beta1.PagedExpandResponseList.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> defaultEntry() {
        return AlphabetizedDefaultEntryHolder.defaultEntry;
      }
    };
    private static final AlphabetizedConverter alphabetizedConverter = new AlphabetizedConverter();

    private com.google.protobuf.MapFieldBuilder<
        java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseListOrBuilder, com.google.showcase.v1beta1.PagedExpandResponseList, com.google.showcase.v1beta1.PagedExpandResponseList.Builder> alphabetized_;
    private com.google.protobuf.MapFieldBuilder<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseListOrBuilder, com.google.showcase.v1beta1.PagedExpandResponseList, com.google.showcase.v1beta1.PagedExpandResponseList.Builder>
        internalGetAlphabetized() {
      if (alphabetized_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(alphabetizedConverter);
      }
      return alphabetized_;
    }
    private com.google.protobuf.MapFieldBuilder<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseListOrBuilder, com.google.showcase.v1beta1.PagedExpandResponseList, com.google.showcase.v1beta1.PagedExpandResponseList.Builder>
        internalGetMutableAlphabetized() {
      if (alphabetized_ == null) {
        alphabetized_ = new com.google.protobuf.MapFieldBuilder<>(alphabetizedConverter);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return alphabetized_;
    }
    public int getAlphabetizedCount() {
      return internalGetAlphabetized().ensureBuilderMap().size();
    }
    /**
     * <pre>
     * The words that were expanded, indexed by their initial character.
     * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
     *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
     * </pre>
     *
     * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
     */
    @java.lang.Override
    public boolean containsAlphabetized(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetAlphabetized().ensureBuilderMap().containsKey(key);
    }
    /**
     * Use {@link #getAlphabetizedMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> getAlphabetized() {
      return getAlphabetizedMap();
    }
    /**
     * <pre>
     * The words that were expanded, indexed by their initial character.
     * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
     *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
     * </pre>
     *
     * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> getAlphabetizedMap() {
      return internalGetAlphabetized().getImmutableMap();
    }
    /**
     * <pre>
     * The words that were expanded, indexed by their initial character.
     * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
     *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
     * </pre>
     *
     * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
com.google.showcase.v1beta1.PagedExpandResponseList getAlphabetizedOrDefault(
        java.lang.String key,
        /* nullable */
com.google.showcase.v1beta1.PagedExpandResponseList defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseListOrBuilder> map = internalGetMutableAlphabetized().ensureBuilderMap();
      return map.containsKey(key) ? alphabetizedConverter.build(map.get(key)) : defaultValue;
    }
    /**
     * <pre>
     * The words that were expanded, indexed by their initial character.
     * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
     *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
     * </pre>
     *
     * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
     */
    @java.lang.Override
    public com.google.showcase.v1beta1.PagedExpandResponseList getAlphabetizedOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseListOrBuilder> map = internalGetMutableAlphabetized().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return alphabetizedConverter.build(map.get(key));
    }
    public Builder clearAlphabetized() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableAlphabetized().clear();
      return this;
    }
    /**
     * <pre>
     * The words that were expanded, indexed by their initial character.
     * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
     *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
     * </pre>
     *
     * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
     */
    public Builder removeAlphabetized(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableAlphabetized().ensureBuilderMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList>
        getMutableAlphabetized() {
      bitField0_ |= 0x00000001;
      return internalGetMutableAlphabetized().ensureMessageMap();
    }
    /**
     * <pre>
     * The words that were expanded, indexed by their initial character.
     * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
     *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
     * </pre>
     *
     * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
     */
    public Builder putAlphabetized(
        java.lang.String key,
        com.google.showcase.v1beta1.PagedExpandResponseList value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableAlphabetized().ensureBuilderMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The words that were expanded, indexed by their initial character.
     * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
     *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
     * </pre>
     *
     * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
     */
    public Builder putAllAlphabetized(
        java.util.Map<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> values) {
      for (java.util.Map.Entry<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseList> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableAlphabetized().ensureBuilderMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The words that were expanded, indexed by their initial character.
     * (-- aip.dev/not-precedent: This is a legacy, non-standard pattern that violates
     *     aip.dev/158. Ordinarily, this should be a `repeated` field, as in PagedExpandResponse. --)
     * </pre>
     *
     * <code>map&lt;string, .google.showcase.v1beta1.PagedExpandResponseList&gt; alphabetized = 1;</code>
     */
    public com.google.showcase.v1beta1.PagedExpandResponseList.Builder putAlphabetizedBuilderIfAbsent(
        java.lang.String key) {
      java.util.Map<java.lang.String, com.google.showcase.v1beta1.PagedExpandResponseListOrBuilder> builderMap = internalGetMutableAlphabetized().ensureBuilderMap();
      com.google.showcase.v1beta1.PagedExpandResponseListOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = com.google.showcase.v1beta1.PagedExpandResponseList.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.google.showcase.v1beta1.PagedExpandResponseList) {
        entry = ((com.google.showcase.v1beta1.PagedExpandResponseList) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.google.showcase.v1beta1.PagedExpandResponseList.Builder) entry;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The next page token.
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
     * The next page token.
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
     * The next page token.
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
     * The next page token.
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
     * The next page token.
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


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.PagedExpandLegacyMappedResponse)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.PagedExpandLegacyMappedResponse)
  private static final com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse();
  }

  public static com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PagedExpandLegacyMappedResponse>
      PARSER = new com.google.protobuf.AbstractParser<PagedExpandLegacyMappedResponse>() {
    @java.lang.Override
    public PagedExpandLegacyMappedResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<PagedExpandLegacyMappedResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PagedExpandLegacyMappedResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.PagedExpandLegacyMappedResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

