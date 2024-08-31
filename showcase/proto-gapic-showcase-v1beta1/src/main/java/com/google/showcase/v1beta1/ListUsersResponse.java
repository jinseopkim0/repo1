// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/identity.proto

// Protobuf Java Version: 3.25.4
package com.google.showcase.v1beta1;

/**
 * <pre>
 * The response message for the google.showcase.v1beta1.Identity&#92;ListUsers
 * method.
 * </pre>
 *
 * Protobuf type {@code google.showcase.v1beta1.ListUsersResponse}
 */
public final class ListUsersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.ListUsersResponse)
    ListUsersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUsersResponse.newBuilder() to construct.
  private ListUsersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUsersResponse() {
    users_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListUsersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.IdentityOuterClass.internal_static_google_showcase_v1beta1_ListUsersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.IdentityOuterClass.internal_static_google_showcase_v1beta1_ListUsersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.ListUsersResponse.class, com.google.showcase.v1beta1.ListUsersResponse.Builder.class);
  }

  public static final int USERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.showcase.v1beta1.User> users_;
  /**
   * <pre>
   * The list of users.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.showcase.v1beta1.User> getUsersList() {
    return users_;
  }
  /**
   * <pre>
   * The list of users.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.showcase.v1beta1.UserOrBuilder> 
      getUsersOrBuilderList() {
    return users_;
  }
  /**
   * <pre>
   * The list of users.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
   */
  @java.lang.Override
  public int getUsersCount() {
    return users_.size();
  }
  /**
   * <pre>
   * The list of users.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.User getUsers(int index) {
    return users_.get(index);
  }
  /**
   * <pre>
   * The list of users.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.UserOrBuilder getUsersOrBuilder(
      int index) {
    return users_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass this value in ListUsersRequest.page_token field in the subsequent
   * call to `google.showcase.v1beta1.Message&#92;ListUsers` method to retrieve the
   * next page of results.
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
   * A token to retrieve next page of results.
   * Pass this value in ListUsersRequest.page_token field in the subsequent
   * call to `google.showcase.v1beta1.Message&#92;ListUsers` method to retrieve the
   * next page of results.
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
    for (int i = 0; i < users_.size(); i++) {
      output.writeMessage(1, users_.get(i));
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
    for (int i = 0; i < users_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, users_.get(i));
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
    if (!(obj instanceof com.google.showcase.v1beta1.ListUsersResponse)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.ListUsersResponse other = (com.google.showcase.v1beta1.ListUsersResponse) obj;

    if (!getUsersList()
        .equals(other.getUsersList())) return false;
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
    if (getUsersCount() > 0) {
      hash = (37 * hash) + USERS_FIELD_NUMBER;
      hash = (53 * hash) + getUsersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.ListUsersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ListUsersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ListUsersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ListUsersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ListUsersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.ListUsersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ListUsersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.ListUsersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.ListUsersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.ListUsersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.ListUsersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.ListUsersResponse parseFrom(
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
  public static Builder newBuilder(com.google.showcase.v1beta1.ListUsersResponse prototype) {
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
   * The response message for the google.showcase.v1beta1.Identity&#92;ListUsers
   * method.
   * </pre>
   *
   * Protobuf type {@code google.showcase.v1beta1.ListUsersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.ListUsersResponse)
      com.google.showcase.v1beta1.ListUsersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.IdentityOuterClass.internal_static_google_showcase_v1beta1_ListUsersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.IdentityOuterClass.internal_static_google_showcase_v1beta1_ListUsersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.ListUsersResponse.class, com.google.showcase.v1beta1.ListUsersResponse.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.ListUsersResponse.newBuilder()
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
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
      } else {
        users_ = null;
        usersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.IdentityOuterClass.internal_static_google_showcase_v1beta1_ListUsersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ListUsersResponse getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.ListUsersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ListUsersResponse build() {
      com.google.showcase.v1beta1.ListUsersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.ListUsersResponse buildPartial() {
      com.google.showcase.v1beta1.ListUsersResponse result = new com.google.showcase.v1beta1.ListUsersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.showcase.v1beta1.ListUsersResponse result) {
      if (usersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          users_ = java.util.Collections.unmodifiableList(users_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.users_ = users_;
      } else {
        result.users_ = usersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.showcase.v1beta1.ListUsersResponse result) {
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
      if (other instanceof com.google.showcase.v1beta1.ListUsersResponse) {
        return mergeFrom((com.google.showcase.v1beta1.ListUsersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.ListUsersResponse other) {
      if (other == com.google.showcase.v1beta1.ListUsersResponse.getDefaultInstance()) return this;
      if (usersBuilder_ == null) {
        if (!other.users_.isEmpty()) {
          if (users_.isEmpty()) {
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUsersIsMutable();
            users_.addAll(other.users_);
          }
          onChanged();
        }
      } else {
        if (!other.users_.isEmpty()) {
          if (usersBuilder_.isEmpty()) {
            usersBuilder_.dispose();
            usersBuilder_ = null;
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
            usersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUsersFieldBuilder() : null;
          } else {
            usersBuilder_.addAllMessages(other.users_);
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
              com.google.showcase.v1beta1.User m =
                  input.readMessage(
                      com.google.showcase.v1beta1.User.parser(),
                      extensionRegistry);
              if (usersBuilder_ == null) {
                ensureUsersIsMutable();
                users_.add(m);
              } else {
                usersBuilder_.addMessage(m);
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

    private java.util.List<com.google.showcase.v1beta1.User> users_ =
      java.util.Collections.emptyList();
    private void ensureUsersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        users_ = new java.util.ArrayList<com.google.showcase.v1beta1.User>(users_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.showcase.v1beta1.User, com.google.showcase.v1beta1.User.Builder, com.google.showcase.v1beta1.UserOrBuilder> usersBuilder_;

    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public java.util.List<com.google.showcase.v1beta1.User> getUsersList() {
      if (usersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(users_);
      } else {
        return usersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public int getUsersCount() {
      if (usersBuilder_ == null) {
        return users_.size();
      } else {
        return usersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public com.google.showcase.v1beta1.User getUsers(int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);
      } else {
        return usersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public Builder setUsers(
        int index, com.google.showcase.v1beta1.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.set(index, value);
        onChanged();
      } else {
        usersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public Builder setUsers(
        int index, com.google.showcase.v1beta1.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.set(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public Builder addUsers(com.google.showcase.v1beta1.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(value);
        onChanged();
      } else {
        usersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public Builder addUsers(
        int index, com.google.showcase.v1beta1.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(index, value);
        onChanged();
      } else {
        usersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public Builder addUsers(
        com.google.showcase.v1beta1.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public Builder addUsers(
        int index, com.google.showcase.v1beta1.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public Builder addAllUsers(
        java.lang.Iterable<? extends com.google.showcase.v1beta1.User> values) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, users_);
        onChanged();
      } else {
        usersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public Builder clearUsers() {
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        usersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public Builder removeUsers(int index) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.remove(index);
        onChanged();
      } else {
        usersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public com.google.showcase.v1beta1.User.Builder getUsersBuilder(
        int index) {
      return getUsersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public com.google.showcase.v1beta1.UserOrBuilder getUsersOrBuilder(
        int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);  } else {
        return usersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public java.util.List<? extends com.google.showcase.v1beta1.UserOrBuilder> 
         getUsersOrBuilderList() {
      if (usersBuilder_ != null) {
        return usersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(users_);
      }
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public com.google.showcase.v1beta1.User.Builder addUsersBuilder() {
      return getUsersFieldBuilder().addBuilder(
          com.google.showcase.v1beta1.User.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public com.google.showcase.v1beta1.User.Builder addUsersBuilder(
        int index) {
      return getUsersFieldBuilder().addBuilder(
          index, com.google.showcase.v1beta1.User.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of users.
     * </pre>
     *
     * <code>repeated .google.showcase.v1beta1.User users = 1;</code>
     */
    public java.util.List<com.google.showcase.v1beta1.User.Builder> 
         getUsersBuilderList() {
      return getUsersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.showcase.v1beta1.User, com.google.showcase.v1beta1.User.Builder, com.google.showcase.v1beta1.UserOrBuilder> 
        getUsersFieldBuilder() {
      if (usersBuilder_ == null) {
        usersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.showcase.v1beta1.User, com.google.showcase.v1beta1.User.Builder, com.google.showcase.v1beta1.UserOrBuilder>(
                users_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        users_ = null;
      }
      return usersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass this value in ListUsersRequest.page_token field in the subsequent
     * call to `google.showcase.v1beta1.Message&#92;ListUsers` method to retrieve the
     * next page of results.
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
     * A token to retrieve next page of results.
     * Pass this value in ListUsersRequest.page_token field in the subsequent
     * call to `google.showcase.v1beta1.Message&#92;ListUsers` method to retrieve the
     * next page of results.
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
     * A token to retrieve next page of results.
     * Pass this value in ListUsersRequest.page_token field in the subsequent
     * call to `google.showcase.v1beta1.Message&#92;ListUsers` method to retrieve the
     * next page of results.
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
     * A token to retrieve next page of results.
     * Pass this value in ListUsersRequest.page_token field in the subsequent
     * call to `google.showcase.v1beta1.Message&#92;ListUsers` method to retrieve the
     * next page of results.
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
     * A token to retrieve next page of results.
     * Pass this value in ListUsersRequest.page_token field in the subsequent
     * call to `google.showcase.v1beta1.Message&#92;ListUsers` method to retrieve the
     * next page of results.
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


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.ListUsersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.ListUsersResponse)
  private static final com.google.showcase.v1beta1.ListUsersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.ListUsersResponse();
  }

  public static com.google.showcase.v1beta1.ListUsersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUsersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListUsersResponse>() {
    @java.lang.Override
    public ListUsersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListUsersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUsersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.ListUsersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

