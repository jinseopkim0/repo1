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
// source: google/type/latlng.proto

// Protobuf Java Version: 3.25.3
package com.google.type;

/**
 *
 *
 * <pre>
 * An object that represents a latitude/longitude pair. This is expressed as a
 * pair of doubles to represent degrees latitude and degrees longitude. Unless
 * specified otherwise, this must conform to the
 * &lt;a href="http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf"&gt;WGS84
 * standard&lt;/a&gt;. Values must be within normalized ranges.
 * </pre>
 *
 * Protobuf type {@code google.type.LatLng}
 */
public final class LatLng extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.type.LatLng)
    LatLngOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LatLng.newBuilder() to construct.
  private LatLng(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LatLng() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LatLng();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.type.LatLngProto.internal_static_google_type_LatLng_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.type.LatLngProto.internal_static_google_type_LatLng_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.type.LatLng.class, com.google.type.LatLng.Builder.class);
  }

  public static final int LATITUDE_FIELD_NUMBER = 1;
  private double latitude_ = 0D;
  /**
   *
   *
   * <pre>
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * </pre>
   *
   * <code>double latitude = 1;</code>
   *
   * @return The latitude.
   */
  @java.lang.Override
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private double longitude_ = 0D;
  /**
   *
   *
   * <pre>
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * </pre>
   *
   * <code>double longitude = 2;</code>
   *
   * @return The longitude.
   */
  @java.lang.Override
  public double getLongitude() {
    return longitude_;
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
    if (java.lang.Double.doubleToRawLongBits(latitude_) != 0) {
      output.writeDouble(1, latitude_);
    }
    if (java.lang.Double.doubleToRawLongBits(longitude_) != 0) {
      output.writeDouble(2, longitude_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(latitude_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, latitude_);
    }
    if (java.lang.Double.doubleToRawLongBits(longitude_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, longitude_);
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
    if (!(obj instanceof com.google.type.LatLng)) {
      return super.equals(obj);
    }
    com.google.type.LatLng other = (com.google.type.LatLng) obj;

    if (java.lang.Double.doubleToLongBits(getLatitude())
        != java.lang.Double.doubleToLongBits(other.getLatitude())) return false;
    if (java.lang.Double.doubleToLongBits(getLongitude())
        != java.lang.Double.doubleToLongBits(other.getLongitude())) return false;
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
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.type.LatLng parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.type.LatLng parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.type.LatLng parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.type.LatLng parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.type.LatLng parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.type.LatLng parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.type.LatLng parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.type.LatLng parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.type.LatLng parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.type.LatLng parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.type.LatLng parseFrom(
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

  public static Builder newBuilder(com.google.type.LatLng prototype) {
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
   * An object that represents a latitude/longitude pair. This is expressed as a
   * pair of doubles to represent degrees latitude and degrees longitude. Unless
   * specified otherwise, this must conform to the
   * &lt;a href="http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf"&gt;WGS84
   * standard&lt;/a&gt;. Values must be within normalized ranges.
   * </pre>
   *
   * Protobuf type {@code google.type.LatLng}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.type.LatLng)
      com.google.type.LatLngOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.type.LatLngProto.internal_static_google_type_LatLng_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.type.LatLngProto.internal_static_google_type_LatLng_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.type.LatLng.class, com.google.type.LatLng.Builder.class);
    }

    // Construct using com.google.type.LatLng.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      latitude_ = 0D;
      longitude_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.type.LatLngProto.internal_static_google_type_LatLng_descriptor;
    }

    @java.lang.Override
    public com.google.type.LatLng getDefaultInstanceForType() {
      return com.google.type.LatLng.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.type.LatLng build() {
      com.google.type.LatLng result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.type.LatLng buildPartial() {
      com.google.type.LatLng result = new com.google.type.LatLng(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.type.LatLng result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.latitude_ = latitude_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.longitude_ = longitude_;
      }
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
      if (other instanceof com.google.type.LatLng) {
        return mergeFrom((com.google.type.LatLng) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.type.LatLng other) {
      if (other == com.google.type.LatLng.getDefaultInstance()) return this;
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
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
            case 9:
              {
                latitude_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
            case 17:
              {
                longitude_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
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

    private double latitude_;
    /**
     *
     *
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>double latitude = 1;</code>
     *
     * @return The latitude.
     */
    @java.lang.Override
    public double getLatitude() {
      return latitude_;
    }
    /**
     *
     *
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>double latitude = 1;</code>
     *
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(double value) {

      latitude_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>double latitude = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      bitField0_ = (bitField0_ & ~0x00000001);
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_;
    /**
     *
     *
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>double longitude = 2;</code>
     *
     * @return The longitude.
     */
    @java.lang.Override
    public double getLongitude() {
      return longitude_;
    }
    /**
     *
     *
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>double longitude = 2;</code>
     *
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(double value) {

      longitude_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>double longitude = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      bitField0_ = (bitField0_ & ~0x00000002);
      longitude_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.type.LatLng)
  }

  // @@protoc_insertion_point(class_scope:google.type.LatLng)
  private static final com.google.type.LatLng DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.type.LatLng();
  }

  public static com.google.type.LatLng getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LatLng> PARSER =
      new com.google.protobuf.AbstractParser<LatLng>() {
        @java.lang.Override
        public LatLng parsePartialFrom(
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

  public static com.google.protobuf.Parser<LatLng> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LatLng> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.type.LatLng getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
