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
// source: google/longrunning/operations.proto

package com.google.longrunning;

/**
 *
 *
 * <pre>
 * The response message for [Operations.ListOperations][google.longrunning.Operations.ListOperations].
 * </pre>
 *
 * Protobuf type {@code google.longrunning.ListOperationsResponse}
 */
public final class ListOperationsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.longrunning.ListOperationsResponse)
    ListOperationsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListOperationsResponse.newBuilder() to construct.
  private ListOperationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListOperationsResponse() {
    operations_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListOperationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.longrunning.OperationsProto
        .internal_static_google_longrunning_ListOperationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.longrunning.OperationsProto
        .internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.longrunning.ListOperationsResponse.class,
            com.google.longrunning.ListOperationsResponse.Builder.class);
  }

  public static final int OPERATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.longrunning.Operation> operations_;
  /**
   *
   *
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.longrunning.Operation> getOperationsList() {
    return operations_;
  }
  /**
   *
   *
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.longrunning.OperationOrBuilder>
      getOperationsOrBuilderList() {
    return operations_;
  }
  /**
   *
   *
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  @java.lang.Override
  public int getOperationsCount() {
    return operations_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  @java.lang.Override
  public com.google.longrunning.Operation getOperations(int index) {
    return operations_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  @java.lang.Override
  public com.google.longrunning.OperationOrBuilder getOperationsOrBuilder(int index) {
    return operations_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < operations_.size(); i++) {
      output.writeMessage(1, operations_.get(i));
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
    for (int i = 0; i < operations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, operations_.get(i));
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
    if (!(obj instanceof com.google.longrunning.ListOperationsResponse)) {
      return super.equals(obj);
    }
    com.google.longrunning.ListOperationsResponse other =
        (com.google.longrunning.ListOperationsResponse) obj;

    if (!getOperationsList().equals(other.getOperationsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getOperationsCount() > 0) {
      hash = (37 * hash) + OPERATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOperationsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.longrunning.ListOperationsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.longrunning.ListOperationsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(
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

  public static Builder newBuilder(com.google.longrunning.ListOperationsResponse prototype) {
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
   * The response message for [Operations.ListOperations][google.longrunning.Operations.ListOperations].
   * </pre>
   *
   * Protobuf type {@code google.longrunning.ListOperationsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.longrunning.ListOperationsResponse)
      com.google.longrunning.ListOperationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.longrunning.OperationsProto
          .internal_static_google_longrunning_ListOperationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.longrunning.OperationsProto
          .internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.longrunning.ListOperationsResponse.class,
              com.google.longrunning.ListOperationsResponse.Builder.class);
    }

    // Construct using com.google.longrunning.ListOperationsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
      } else {
        operations_ = null;
        operationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.longrunning.OperationsProto
          .internal_static_google_longrunning_ListOperationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.longrunning.ListOperationsResponse getDefaultInstanceForType() {
      return com.google.longrunning.ListOperationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.longrunning.ListOperationsResponse build() {
      com.google.longrunning.ListOperationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.longrunning.ListOperationsResponse buildPartial() {
      com.google.longrunning.ListOperationsResponse result =
          new com.google.longrunning.ListOperationsResponse(this);
      int from_bitField0_ = bitField0_;
      if (operationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          operations_ = java.util.Collections.unmodifiableList(operations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.operations_ = operations_;
      } else {
        result.operations_ = operationsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.longrunning.ListOperationsResponse) {
        return mergeFrom((com.google.longrunning.ListOperationsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.longrunning.ListOperationsResponse other) {
      if (other == com.google.longrunning.ListOperationsResponse.getDefaultInstance()) return this;
      if (operationsBuilder_ == null) {
        if (!other.operations_.isEmpty()) {
          if (operations_.isEmpty()) {
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOperationsIsMutable();
            operations_.addAll(other.operations_);
          }
          onChanged();
        }
      } else {
        if (!other.operations_.isEmpty()) {
          if (operationsBuilder_.isEmpty()) {
            operationsBuilder_.dispose();
            operationsBuilder_ = null;
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            operationsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOperationsFieldBuilder()
                    : null;
          } else {
            operationsBuilder_.addAllMessages(other.operations_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.longrunning.Operation m =
                    input.readMessage(com.google.longrunning.Operation.parser(), extensionRegistry);
                if (operationsBuilder_ == null) {
                  ensureOperationsIsMutable();
                  operations_.add(m);
                } else {
                  operationsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

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

    private java.util.List<com.google.longrunning.Operation> operations_ =
        java.util.Collections.emptyList();

    private void ensureOperationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        operations_ = new java.util.ArrayList<com.google.longrunning.Operation>(operations_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.longrunning.Operation,
            com.google.longrunning.Operation.Builder,
            com.google.longrunning.OperationOrBuilder>
        operationsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public java.util.List<com.google.longrunning.Operation> getOperationsList() {
      if (operationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operations_);
      } else {
        return operationsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public int getOperationsCount() {
      if (operationsBuilder_ == null) {
        return operations_.size();
      } else {
        return operationsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public com.google.longrunning.Operation getOperations(int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);
      } else {
        return operationsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder setOperations(int index, com.google.longrunning.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.set(index, value);
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder setOperations(
        int index, com.google.longrunning.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.set(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(com.google.longrunning.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(int index, com.google.longrunning.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(index, value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(com.google.longrunning.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(
        int index, com.google.longrunning.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addAllOperations(
        java.lang.Iterable<? extends com.google.longrunning.Operation> values) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, operations_);
        onChanged();
      } else {
        operationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder clearOperations() {
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        operationsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder removeOperations(int index) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.remove(index);
        onChanged();
      } else {
        operationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public com.google.longrunning.Operation.Builder getOperationsBuilder(int index) {
      return getOperationsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public com.google.longrunning.OperationOrBuilder getOperationsOrBuilder(int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);
      } else {
        return operationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public java.util.List<? extends com.google.longrunning.OperationOrBuilder>
        getOperationsOrBuilderList() {
      if (operationsBuilder_ != null) {
        return operationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(operations_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public com.google.longrunning.Operation.Builder addOperationsBuilder() {
      return getOperationsFieldBuilder()
          .addBuilder(com.google.longrunning.Operation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public com.google.longrunning.Operation.Builder addOperationsBuilder(int index) {
      return getOperationsFieldBuilder()
          .addBuilder(index, com.google.longrunning.Operation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public java.util.List<com.google.longrunning.Operation.Builder> getOperationsBuilderList() {
      return getOperationsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.longrunning.Operation,
            com.google.longrunning.Operation.Builder,
            com.google.longrunning.OperationOrBuilder>
        getOperationsFieldBuilder() {
      if (operationsBuilder_ == null) {
        operationsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.longrunning.Operation,
                com.google.longrunning.Operation.Builder,
                com.google.longrunning.OperationOrBuilder>(
                operations_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        operations_ = null;
      }
      return operationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.longrunning.ListOperationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.longrunning.ListOperationsResponse)
  private static final com.google.longrunning.ListOperationsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.longrunning.ListOperationsResponse();
  }

  public static com.google.longrunning.ListOperationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOperationsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListOperationsResponse>() {
        @java.lang.Override
        public ListOperationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListOperationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOperationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.longrunning.ListOperationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
