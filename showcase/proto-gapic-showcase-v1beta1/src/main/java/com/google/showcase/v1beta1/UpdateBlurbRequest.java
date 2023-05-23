// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/messaging.proto

package com.google.showcase.v1beta1;

/**
 * <pre>
 * The request message for the google.showcase.v1beta1.Messaging&#92;UpdateBlurb
 * method.
 * </pre>
 *
 * Protobuf type {@code google.showcase.v1beta1.UpdateBlurbRequest}
 */
public final class UpdateBlurbRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.UpdateBlurbRequest)
    UpdateBlurbRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateBlurbRequest.newBuilder() to construct.
  private UpdateBlurbRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateBlurbRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateBlurbRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.MessagingOuterClass.internal_static_google_showcase_v1beta1_UpdateBlurbRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.MessagingOuterClass.internal_static_google_showcase_v1beta1_UpdateBlurbRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.UpdateBlurbRequest.class, com.google.showcase.v1beta1.UpdateBlurbRequest.Builder.class);
  }

  public static final int BLURB_FIELD_NUMBER = 1;
  private com.google.showcase.v1beta1.Blurb blurb_;
  /**
   * <pre>
   * The blurb to update.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
   * @return Whether the blurb field is set.
   */
  @java.lang.Override
  public boolean hasBlurb() {
    return blurb_ != null;
  }
  /**
   * <pre>
   * The blurb to update.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
   * @return The blurb.
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.Blurb getBlurb() {
    return blurb_ == null ? com.google.showcase.v1beta1.Blurb.getDefaultInstance() : blurb_;
  }
  /**
   * <pre>
   * The blurb to update.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.BlurbOrBuilder getBlurbOrBuilder() {
    return blurb_ == null ? com.google.showcase.v1beta1.Blurb.getDefaultInstance() : blurb_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The field mask to determine wich fields are to be updated. If empty, the
   * server will assume all fields are to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The field mask to determine wich fields are to be updated. If empty, the
   * server will assume all fields are to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The field mask to determine wich fields are to be updated. If empty, the
   * server will assume all fields are to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (blurb_ != null) {
      output.writeMessage(1, getBlurb());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blurb_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBlurb());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.showcase.v1beta1.UpdateBlurbRequest)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.UpdateBlurbRequest other = (com.google.showcase.v1beta1.UpdateBlurbRequest) obj;

    if (hasBlurb() != other.hasBlurb()) return false;
    if (hasBlurb()) {
      if (!getBlurb()
          .equals(other.getBlurb())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasBlurb()) {
      hash = (37 * hash) + BLURB_FIELD_NUMBER;
      hash = (53 * hash) + getBlurb().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.UpdateBlurbRequest parseFrom(
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
  public static Builder newBuilder(com.google.showcase.v1beta1.UpdateBlurbRequest prototype) {
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
   * The request message for the google.showcase.v1beta1.Messaging&#92;UpdateBlurb
   * method.
   * </pre>
   *
   * Protobuf type {@code google.showcase.v1beta1.UpdateBlurbRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.UpdateBlurbRequest)
      com.google.showcase.v1beta1.UpdateBlurbRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.MessagingOuterClass.internal_static_google_showcase_v1beta1_UpdateBlurbRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.MessagingOuterClass.internal_static_google_showcase_v1beta1_UpdateBlurbRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.UpdateBlurbRequest.class, com.google.showcase.v1beta1.UpdateBlurbRequest.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.UpdateBlurbRequest.newBuilder()
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
      blurb_ = null;
      if (blurbBuilder_ != null) {
        blurbBuilder_.dispose();
        blurbBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.MessagingOuterClass.internal_static_google_showcase_v1beta1_UpdateBlurbRequest_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.UpdateBlurbRequest getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.UpdateBlurbRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.UpdateBlurbRequest build() {
      com.google.showcase.v1beta1.UpdateBlurbRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.UpdateBlurbRequest buildPartial() {
      com.google.showcase.v1beta1.UpdateBlurbRequest result = new com.google.showcase.v1beta1.UpdateBlurbRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.showcase.v1beta1.UpdateBlurbRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.blurb_ = blurbBuilder_ == null
            ? blurb_
            : blurbBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.showcase.v1beta1.UpdateBlurbRequest) {
        return mergeFrom((com.google.showcase.v1beta1.UpdateBlurbRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.UpdateBlurbRequest other) {
      if (other == com.google.showcase.v1beta1.UpdateBlurbRequest.getDefaultInstance()) return this;
      if (other.hasBlurb()) {
        mergeBlurb(other.getBlurb());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
              input.readMessage(
                  getBlurbFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.showcase.v1beta1.Blurb blurb_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.showcase.v1beta1.Blurb, com.google.showcase.v1beta1.Blurb.Builder, com.google.showcase.v1beta1.BlurbOrBuilder> blurbBuilder_;
    /**
     * <pre>
     * The blurb to update.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
     * @return Whether the blurb field is set.
     */
    public boolean hasBlurb() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The blurb to update.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
     * @return The blurb.
     */
    public com.google.showcase.v1beta1.Blurb getBlurb() {
      if (blurbBuilder_ == null) {
        return blurb_ == null ? com.google.showcase.v1beta1.Blurb.getDefaultInstance() : blurb_;
      } else {
        return blurbBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The blurb to update.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
     */
    public Builder setBlurb(com.google.showcase.v1beta1.Blurb value) {
      if (blurbBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blurb_ = value;
      } else {
        blurbBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The blurb to update.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
     */
    public Builder setBlurb(
        com.google.showcase.v1beta1.Blurb.Builder builderForValue) {
      if (blurbBuilder_ == null) {
        blurb_ = builderForValue.build();
      } else {
        blurbBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The blurb to update.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
     */
    public Builder mergeBlurb(com.google.showcase.v1beta1.Blurb value) {
      if (blurbBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          blurb_ != null &&
          blurb_ != com.google.showcase.v1beta1.Blurb.getDefaultInstance()) {
          getBlurbBuilder().mergeFrom(value);
        } else {
          blurb_ = value;
        }
      } else {
        blurbBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The blurb to update.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
     */
    public Builder clearBlurb() {
      bitField0_ = (bitField0_ & ~0x00000001);
      blurb_ = null;
      if (blurbBuilder_ != null) {
        blurbBuilder_.dispose();
        blurbBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The blurb to update.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
     */
    public com.google.showcase.v1beta1.Blurb.Builder getBlurbBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBlurbFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The blurb to update.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
     */
    public com.google.showcase.v1beta1.BlurbOrBuilder getBlurbOrBuilder() {
      if (blurbBuilder_ != null) {
        return blurbBuilder_.getMessageOrBuilder();
      } else {
        return blurb_ == null ?
            com.google.showcase.v1beta1.Blurb.getDefaultInstance() : blurb_;
      }
    }
    /**
     * <pre>
     * The blurb to update.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.showcase.v1beta1.Blurb, com.google.showcase.v1beta1.Blurb.Builder, com.google.showcase.v1beta1.BlurbOrBuilder> 
        getBlurbFieldBuilder() {
      if (blurbBuilder_ == null) {
        blurbBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.showcase.v1beta1.Blurb, com.google.showcase.v1beta1.Blurb.Builder, com.google.showcase.v1beta1.BlurbOrBuilder>(
                getBlurb(),
                getParentForChildren(),
                isClean());
        blurb_ = null;
      }
      return blurbBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The field mask to determine wich fields are to be updated. If empty, the
     * server will assume all fields are to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The field mask to determine wich fields are to be updated. If empty, the
     * server will assume all fields are to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The field mask to determine wich fields are to be updated. If empty, the
     * server will assume all fields are to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field mask to determine wich fields are to be updated. If empty, the
     * server will assume all fields are to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field mask to determine wich fields are to be updated. If empty, the
     * server will assume all fields are to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field mask to determine wich fields are to be updated. If empty, the
     * server will assume all fields are to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field mask to determine wich fields are to be updated. If empty, the
     * server will assume all fields are to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The field mask to determine wich fields are to be updated. If empty, the
     * server will assume all fields are to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The field mask to determine wich fields are to be updated. If empty, the
     * server will assume all fields are to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.UpdateBlurbRequest)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.UpdateBlurbRequest)
  private static final com.google.showcase.v1beta1.UpdateBlurbRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.UpdateBlurbRequest();
  }

  public static com.google.showcase.v1beta1.UpdateBlurbRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBlurbRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateBlurbRequest>() {
    @java.lang.Override
    public UpdateBlurbRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateBlurbRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBlurbRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.UpdateBlurbRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

