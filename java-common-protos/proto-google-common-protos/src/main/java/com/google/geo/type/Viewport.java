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
// source: google/geo/type/viewport.proto

package com.google.geo.type;

/**
 *
 *
 * <pre>
 * A latitude-longitude viewport, represented as two diagonally opposite `low`
 * and `high` points. A viewport is considered a closed region, i.e. it includes
 * its boundary. The latitude bounds must range between -90 to 90 degrees
 * inclusive, and the longitude bounds must range between -180 to 180 degrees
 * inclusive. Various cases include:
 *
 *  - If `low` = `high`, the viewport consists of that single point.
 *
 *  - If `low.longitude` &gt; `high.longitude`, the longitude range is inverted
 *    (the viewport crosses the 180 degree longitude line).
 *
 *  - If `low.longitude` = -180 degrees and `high.longitude` = 180 degrees,
 *    the viewport includes all longitudes.
 *
 *  - If `low.longitude` = 180 degrees and `high.longitude` = -180 degrees,
 *    the longitude range is empty.
 *
 *  - If `low.latitude` &gt; `high.latitude`, the latitude range is empty.
 *
 * Both `low` and `high` must be populated, and the represented box cannot be
 * empty (as specified by the definitions above). An empty viewport will result
 * in an error.
 *
 * For example, this viewport fully encloses New York City:
 *
 * {
 *     "low": {
 *         "latitude": 40.477398,
 *         "longitude": -74.259087
 *     },
 *     "high": {
 *         "latitude": 40.91618,
 *         "longitude": -73.70018
 *     }
 * }
 * </pre>
 *
 * Protobuf type {@code google.geo.type.Viewport}
 */
public final class Viewport extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.geo.type.Viewport)
    ViewportOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Viewport.newBuilder() to construct.
  private Viewport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Viewport() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Viewport();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.geo.type.ViewportProto.internal_static_google_geo_type_Viewport_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.geo.type.ViewportProto
        .internal_static_google_geo_type_Viewport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.geo.type.Viewport.class, com.google.geo.type.Viewport.Builder.class);
  }

  public static final int LOW_FIELD_NUMBER = 1;
  private com.google.type.LatLng low_;
  /**
   *
   *
   * <pre>
   * Required. The low point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng low = 1;</code>
   *
   * @return Whether the low field is set.
   */
  @java.lang.Override
  public boolean hasLow() {
    return low_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The low point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng low = 1;</code>
   *
   * @return The low.
   */
  @java.lang.Override
  public com.google.type.LatLng getLow() {
    return low_ == null ? com.google.type.LatLng.getDefaultInstance() : low_;
  }
  /**
   *
   *
   * <pre>
   * Required. The low point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng low = 1;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getLowOrBuilder() {
    return low_ == null ? com.google.type.LatLng.getDefaultInstance() : low_;
  }

  public static final int HIGH_FIELD_NUMBER = 2;
  private com.google.type.LatLng high_;
  /**
   *
   *
   * <pre>
   * Required. The high point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng high = 2;</code>
   *
   * @return Whether the high field is set.
   */
  @java.lang.Override
  public boolean hasHigh() {
    return high_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The high point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng high = 2;</code>
   *
   * @return The high.
   */
  @java.lang.Override
  public com.google.type.LatLng getHigh() {
    return high_ == null ? com.google.type.LatLng.getDefaultInstance() : high_;
  }
  /**
   *
   *
   * <pre>
   * Required. The high point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng high = 2;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getHighOrBuilder() {
    return high_ == null ? com.google.type.LatLng.getDefaultInstance() : high_;
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
    if (low_ != null) {
      output.writeMessage(1, getLow());
    }
    if (high_ != null) {
      output.writeMessage(2, getHigh());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (low_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getLow());
    }
    if (high_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getHigh());
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
    if (!(obj instanceof com.google.geo.type.Viewport)) {
      return super.equals(obj);
    }
    com.google.geo.type.Viewport other = (com.google.geo.type.Viewport) obj;

    if (hasLow() != other.hasLow()) return false;
    if (hasLow()) {
      if (!getLow().equals(other.getLow())) return false;
    }
    if (hasHigh() != other.hasHigh()) return false;
    if (hasHigh()) {
      if (!getHigh().equals(other.getHigh())) return false;
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
    if (hasLow()) {
      hash = (37 * hash) + LOW_FIELD_NUMBER;
      hash = (53 * hash) + getLow().hashCode();
    }
    if (hasHigh()) {
      hash = (37 * hash) + HIGH_FIELD_NUMBER;
      hash = (53 * hash) + getHigh().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.geo.type.Viewport parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.geo.type.Viewport parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.geo.type.Viewport parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.geo.type.Viewport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.geo.type.Viewport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.geo.type.Viewport parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.geo.type.Viewport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.geo.type.Viewport parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.geo.type.Viewport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.geo.type.Viewport parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.geo.type.Viewport parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.geo.type.Viewport parseFrom(
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

  public static Builder newBuilder(com.google.geo.type.Viewport prototype) {
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
   * A latitude-longitude viewport, represented as two diagonally opposite `low`
   * and `high` points. A viewport is considered a closed region, i.e. it includes
   * its boundary. The latitude bounds must range between -90 to 90 degrees
   * inclusive, and the longitude bounds must range between -180 to 180 degrees
   * inclusive. Various cases include:
   *
   *  - If `low` = `high`, the viewport consists of that single point.
   *
   *  - If `low.longitude` &gt; `high.longitude`, the longitude range is inverted
   *    (the viewport crosses the 180 degree longitude line).
   *
   *  - If `low.longitude` = -180 degrees and `high.longitude` = 180 degrees,
   *    the viewport includes all longitudes.
   *
   *  - If `low.longitude` = 180 degrees and `high.longitude` = -180 degrees,
   *    the longitude range is empty.
   *
   *  - If `low.latitude` &gt; `high.latitude`, the latitude range is empty.
   *
   * Both `low` and `high` must be populated, and the represented box cannot be
   * empty (as specified by the definitions above). An empty viewport will result
   * in an error.
   *
   * For example, this viewport fully encloses New York City:
   *
   * {
   *     "low": {
   *         "latitude": 40.477398,
   *         "longitude": -74.259087
   *     },
   *     "high": {
   *         "latitude": 40.91618,
   *         "longitude": -73.70018
   *     }
   * }
   * </pre>
   *
   * Protobuf type {@code google.geo.type.Viewport}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.geo.type.Viewport)
      com.google.geo.type.ViewportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.geo.type.ViewportProto.internal_static_google_geo_type_Viewport_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.geo.type.ViewportProto
          .internal_static_google_geo_type_Viewport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.geo.type.Viewport.class, com.google.geo.type.Viewport.Builder.class);
    }

    // Construct using com.google.geo.type.Viewport.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      low_ = null;
      if (lowBuilder_ != null) {
        lowBuilder_.dispose();
        lowBuilder_ = null;
      }
      high_ = null;
      if (highBuilder_ != null) {
        highBuilder_.dispose();
        highBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.geo.type.ViewportProto.internal_static_google_geo_type_Viewport_descriptor;
    }

    @java.lang.Override
    public com.google.geo.type.Viewport getDefaultInstanceForType() {
      return com.google.geo.type.Viewport.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.geo.type.Viewport build() {
      com.google.geo.type.Viewport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.geo.type.Viewport buildPartial() {
      com.google.geo.type.Viewport result = new com.google.geo.type.Viewport(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.geo.type.Viewport result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.low_ = lowBuilder_ == null ? low_ : lowBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.high_ = highBuilder_ == null ? high_ : highBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.geo.type.Viewport) {
        return mergeFrom((com.google.geo.type.Viewport) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.geo.type.Viewport other) {
      if (other == com.google.geo.type.Viewport.getDefaultInstance()) return this;
      if (other.hasLow()) {
        mergeLow(other.getLow());
      }
      if (other.hasHigh()) {
        mergeHigh(other.getHigh());
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
                input.readMessage(getLowFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getHighFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.type.LatLng low_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        lowBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     *
     * @return Whether the low field is set.
     */
    public boolean hasLow() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     *
     * @return The low.
     */
    public com.google.type.LatLng getLow() {
      if (lowBuilder_ == null) {
        return low_ == null ? com.google.type.LatLng.getDefaultInstance() : low_;
      } else {
        return lowBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public Builder setLow(com.google.type.LatLng value) {
      if (lowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        low_ = value;
      } else {
        lowBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public Builder setLow(com.google.type.LatLng.Builder builderForValue) {
      if (lowBuilder_ == null) {
        low_ = builderForValue.build();
      } else {
        lowBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public Builder mergeLow(com.google.type.LatLng value) {
      if (lowBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && low_ != null
            && low_ != com.google.type.LatLng.getDefaultInstance()) {
          getLowBuilder().mergeFrom(value);
        } else {
          low_ = value;
        }
      } else {
        lowBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public Builder clearLow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      low_ = null;
      if (lowBuilder_ != null) {
        lowBuilder_.dispose();
        lowBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public com.google.type.LatLng.Builder getLowBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLowFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public com.google.type.LatLngOrBuilder getLowOrBuilder() {
      if (lowBuilder_ != null) {
        return lowBuilder_.getMessageOrBuilder();
      } else {
        return low_ == null ? com.google.type.LatLng.getDefaultInstance() : low_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        getLowFieldBuilder() {
      if (lowBuilder_ == null) {
        lowBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.LatLng,
                com.google.type.LatLng.Builder,
                com.google.type.LatLngOrBuilder>(getLow(), getParentForChildren(), isClean());
        low_ = null;
      }
      return lowBuilder_;
    }

    private com.google.type.LatLng high_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        highBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     *
     * @return Whether the high field is set.
     */
    public boolean hasHigh() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     *
     * @return The high.
     */
    public com.google.type.LatLng getHigh() {
      if (highBuilder_ == null) {
        return high_ == null ? com.google.type.LatLng.getDefaultInstance() : high_;
      } else {
        return highBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public Builder setHigh(com.google.type.LatLng value) {
      if (highBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        high_ = value;
      } else {
        highBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public Builder setHigh(com.google.type.LatLng.Builder builderForValue) {
      if (highBuilder_ == null) {
        high_ = builderForValue.build();
      } else {
        highBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public Builder mergeHigh(com.google.type.LatLng value) {
      if (highBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && high_ != null
            && high_ != com.google.type.LatLng.getDefaultInstance()) {
          getHighBuilder().mergeFrom(value);
        } else {
          high_ = value;
        }
      } else {
        highBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public Builder clearHigh() {
      bitField0_ = (bitField0_ & ~0x00000002);
      high_ = null;
      if (highBuilder_ != null) {
        highBuilder_.dispose();
        highBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public com.google.type.LatLng.Builder getHighBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHighFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public com.google.type.LatLngOrBuilder getHighOrBuilder() {
      if (highBuilder_ != null) {
        return highBuilder_.getMessageOrBuilder();
      } else {
        return high_ == null ? com.google.type.LatLng.getDefaultInstance() : high_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        getHighFieldBuilder() {
      if (highBuilder_ == null) {
        highBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.LatLng,
                com.google.type.LatLng.Builder,
                com.google.type.LatLngOrBuilder>(getHigh(), getParentForChildren(), isClean());
        high_ = null;
      }
      return highBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.geo.type.Viewport)
  }

  // @@protoc_insertion_point(class_scope:google.geo.type.Viewport)
  private static final com.google.geo.type.Viewport DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.geo.type.Viewport();
  }

  public static com.google.geo.type.Viewport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Viewport> PARSER =
      new com.google.protobuf.AbstractParser<Viewport>() {
        @java.lang.Override
        public Viewport parsePartialFrom(
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

  public static com.google.protobuf.Parser<Viewport> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Viewport> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.geo.type.Viewport getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
