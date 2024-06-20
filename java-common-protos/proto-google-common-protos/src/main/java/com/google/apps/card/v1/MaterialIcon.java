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
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/apps/card/v1/card.proto
// Protobuf Java Version: 4.27.1

package com.google.apps.card.v1;

/**
 *
 *
 * <pre>
 * A [Google Material Icon](https://fonts.google.com/icons), which includes over
 * 2500+ options.
 *
 * For example, to display a [checkbox
 * icon](https://fonts.google.com/icons?selected=Material%20Symbols%20Outlined%3Acheck_box%3AFILL%400%3Bwght%40400%3BGRAD%400%3Bopsz%4048)
 * with customized weight and grade, write the following:
 *
 * ```
 * {
 * "name": "check_box",
 * "fill": true,
 * "weight": 300,
 * "grade": -25
 * }
 * ```
 *
 * [Google Chat apps](https://developers.google.com/workspace/chat):
 * </pre>
 *
 * Protobuf type {@code google.apps.card.v1.MaterialIcon}
 */
public final class MaterialIcon extends com.google.protobuf.GeneratedMessage
    implements
    // @@protoc_insertion_point(message_implements:google.apps.card.v1.MaterialIcon)
    MaterialIconOrBuilder {
  private static final long serialVersionUID = 0L;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 1,
        /* suffix= */ "",
        MaterialIcon.class.getName());
  }
  // Use MaterialIcon.newBuilder() to construct.
  private MaterialIcon(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }

  private MaterialIcon() {
    name_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.card.v1.CardProto
        .internal_static_google_apps_card_v1_MaterialIcon_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.card.v1.CardProto
        .internal_static_google_apps_card_v1_MaterialIcon_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.card.v1.MaterialIcon.class,
            com.google.apps.card.v1.MaterialIcon.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * The icon name defined in the [Google Material
   * Icon](https://fonts.google.com/icons), for example, `check_box`. Any
   * invalid names are abandoned and replaced with empty string and
   * results in the icon failing to render.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The icon name defined in the [Google Material
   * Icon](https://fonts.google.com/icons), for example, `check_box`. Any
   * invalid names are abandoned and replaced with empty string and
   * results in the icon failing to render.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILL_FIELD_NUMBER = 2;
  private boolean fill_ = false;
  /**
   *
   *
   * <pre>
   * Whether the icon renders as filled. Default value is false.
   *
   * To preview different icon settings, go to
   * [Google Font Icons](https://fonts.google.com/icons) and adjust the
   * settings under **Customize**.
   * </pre>
   *
   * <code>bool fill = 2;</code>
   *
   * @return The fill.
   */
  @java.lang.Override
  public boolean getFill() {
    return fill_;
  }

  public static final int WEIGHT_FIELD_NUMBER = 3;
  private int weight_ = 0;
  /**
   *
   *
   * <pre>
   * The stroke weight of the icon. Choose from {100, 200, 300, 400,
   * 500, 600, 700}. If absent, default value is 400. If any other value is
   * specified, the default value is used.
   *
   * To preview different icon settings, go to
   * [Google Font Icons](https://fonts.google.com/icons) and adjust the
   * settings under **Customize**.
   * </pre>
   *
   * <code>int32 weight = 3;</code>
   *
   * @return The weight.
   */
  @java.lang.Override
  public int getWeight() {
    return weight_;
  }

  public static final int GRADE_FIELD_NUMBER = 4;
  private int grade_ = 0;
  /**
   *
   *
   * <pre>
   * Weight and grade affect a symbol’s thickness. Adjustments to grade are more
   * granular than adjustments to weight and have a small impact on the size of
   * the symbol. Choose from {-25, 0, 200}. If absent, default value is 0. If
   * any other value is specified, the default value is used.
   *
   * To preview different icon settings, go to
   * [Google Font Icons](https://fonts.google.com/icons) and adjust the
   * settings under **Customize**.
   * </pre>
   *
   * <code>int32 grade = 4;</code>
   *
   * @return The grade.
   */
  @java.lang.Override
  public int getGrade() {
    return grade_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
    }
    if (fill_ != false) {
      output.writeBool(2, fill_);
    }
    if (weight_ != 0) {
      output.writeInt32(3, weight_);
    }
    if (grade_ != 0) {
      output.writeInt32(4, grade_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
    }
    if (fill_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, fill_);
    }
    if (weight_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, weight_);
    }
    if (grade_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, grade_);
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
    if (!(obj instanceof com.google.apps.card.v1.MaterialIcon)) {
      return super.equals(obj);
    }
    com.google.apps.card.v1.MaterialIcon other = (com.google.apps.card.v1.MaterialIcon) obj;

    if (!getName().equals(other.getName())) return false;
    if (getFill() != other.getFill()) return false;
    if (getWeight() != other.getWeight()) return false;
    if (getGrade() != other.getGrade()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + FILL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getFill());
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getWeight();
    hash = (37 * hash) + GRADE_FIELD_NUMBER;
    hash = (53 * hash) + getGrade();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.card.v1.MaterialIcon parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.card.v1.MaterialIcon parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.card.v1.MaterialIcon parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.card.v1.MaterialIcon parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.card.v1.MaterialIcon parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.card.v1.MaterialIcon parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.card.v1.MaterialIcon parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.card.v1.MaterialIcon parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.card.v1.MaterialIcon parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.card.v1.MaterialIcon parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.card.v1.MaterialIcon parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.card.v1.MaterialIcon parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.apps.card.v1.MaterialIcon prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A [Google Material Icon](https://fonts.google.com/icons), which includes over
   * 2500+ options.
   *
   * For example, to display a [checkbox
   * icon](https://fonts.google.com/icons?selected=Material%20Symbols%20Outlined%3Acheck_box%3AFILL%400%3Bwght%40400%3BGRAD%400%3Bopsz%4048)
   * with customized weight and grade, write the following:
   *
   * ```
   * {
   * "name": "check_box",
   * "fill": true,
   * "weight": 300,
   * "grade": -25
   * }
   * ```
   *
   * [Google Chat apps](https://developers.google.com/workspace/chat):
   * </pre>
   *
   * Protobuf type {@code google.apps.card.v1.MaterialIcon}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.card.v1.MaterialIcon)
      com.google.apps.card.v1.MaterialIconOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.card.v1.CardProto
          .internal_static_google_apps_card_v1_MaterialIcon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.card.v1.CardProto
          .internal_static_google_apps_card_v1_MaterialIcon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.card.v1.MaterialIcon.class,
              com.google.apps.card.v1.MaterialIcon.Builder.class);
    }

    // Construct using com.google.apps.card.v1.MaterialIcon.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      fill_ = false;
      weight_ = 0;
      grade_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.card.v1.CardProto
          .internal_static_google_apps_card_v1_MaterialIcon_descriptor;
    }

    @java.lang.Override
    public com.google.apps.card.v1.MaterialIcon getDefaultInstanceForType() {
      return com.google.apps.card.v1.MaterialIcon.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.card.v1.MaterialIcon build() {
      com.google.apps.card.v1.MaterialIcon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.card.v1.MaterialIcon buildPartial() {
      com.google.apps.card.v1.MaterialIcon result = new com.google.apps.card.v1.MaterialIcon(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.card.v1.MaterialIcon result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fill_ = fill_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.weight_ = weight_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.grade_ = grade_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.apps.card.v1.MaterialIcon) {
        return mergeFrom((com.google.apps.card.v1.MaterialIcon) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.card.v1.MaterialIcon other) {
      if (other == com.google.apps.card.v1.MaterialIcon.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getFill() != false) {
        setFill(other.getFill());
      }
      if (other.getWeight() != 0) {
        setWeight(other.getWeight());
      }
      if (other.getGrade() != 0) {
        setGrade(other.getGrade());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                fill_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                weight_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                grade_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The icon name defined in the [Google Material
     * Icon](https://fonts.google.com/icons), for example, `check_box`. Any
     * invalid names are abandoned and replaced with empty string and
     * results in the icon failing to render.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The icon name defined in the [Google Material
     * Icon](https://fonts.google.com/icons), for example, `check_box`. Any
     * invalid names are abandoned and replaced with empty string and
     * results in the icon failing to render.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The icon name defined in the [Google Material
     * Icon](https://fonts.google.com/icons), for example, `check_box`. Any
     * invalid names are abandoned and replaced with empty string and
     * results in the icon failing to render.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The icon name defined in the [Google Material
     * Icon](https://fonts.google.com/icons), for example, `check_box`. Any
     * invalid names are abandoned and replaced with empty string and
     * results in the icon failing to render.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The icon name defined in the [Google Material
     * Icon](https://fonts.google.com/icons), for example, `check_box`. Any
     * invalid names are abandoned and replaced with empty string and
     * results in the icon failing to render.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean fill_;
    /**
     *
     *
     * <pre>
     * Whether the icon renders as filled. Default value is false.
     *
     * To preview different icon settings, go to
     * [Google Font Icons](https://fonts.google.com/icons) and adjust the
     * settings under **Customize**.
     * </pre>
     *
     * <code>bool fill = 2;</code>
     *
     * @return The fill.
     */
    @java.lang.Override
    public boolean getFill() {
      return fill_;
    }
    /**
     *
     *
     * <pre>
     * Whether the icon renders as filled. Default value is false.
     *
     * To preview different icon settings, go to
     * [Google Font Icons](https://fonts.google.com/icons) and adjust the
     * settings under **Customize**.
     * </pre>
     *
     * <code>bool fill = 2;</code>
     *
     * @param value The fill to set.
     * @return This builder for chaining.
     */
    public Builder setFill(boolean value) {

      fill_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether the icon renders as filled. Default value is false.
     *
     * To preview different icon settings, go to
     * [Google Font Icons](https://fonts.google.com/icons) and adjust the
     * settings under **Customize**.
     * </pre>
     *
     * <code>bool fill = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFill() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fill_ = false;
      onChanged();
      return this;
    }

    private int weight_;
    /**
     *
     *
     * <pre>
     * The stroke weight of the icon. Choose from {100, 200, 300, 400,
     * 500, 600, 700}. If absent, default value is 400. If any other value is
     * specified, the default value is used.
     *
     * To preview different icon settings, go to
     * [Google Font Icons](https://fonts.google.com/icons) and adjust the
     * settings under **Customize**.
     * </pre>
     *
     * <code>int32 weight = 3;</code>
     *
     * @return The weight.
     */
    @java.lang.Override
    public int getWeight() {
      return weight_;
    }
    /**
     *
     *
     * <pre>
     * The stroke weight of the icon. Choose from {100, 200, 300, 400,
     * 500, 600, 700}. If absent, default value is 400. If any other value is
     * specified, the default value is used.
     *
     * To preview different icon settings, go to
     * [Google Font Icons](https://fonts.google.com/icons) and adjust the
     * settings under **Customize**.
     * </pre>
     *
     * <code>int32 weight = 3;</code>
     *
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(int value) {

      weight_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The stroke weight of the icon. Choose from {100, 200, 300, 400,
     * 500, 600, 700}. If absent, default value is 400. If any other value is
     * specified, the default value is used.
     *
     * To preview different icon settings, go to
     * [Google Font Icons](https://fonts.google.com/icons) and adjust the
     * settings under **Customize**.
     * </pre>
     *
     * <code>int32 weight = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      weight_ = 0;
      onChanged();
      return this;
    }

    private int grade_;
    /**
     *
     *
     * <pre>
     * Weight and grade affect a symbol’s thickness. Adjustments to grade are more
     * granular than adjustments to weight and have a small impact on the size of
     * the symbol. Choose from {-25, 0, 200}. If absent, default value is 0. If
     * any other value is specified, the default value is used.
     *
     * To preview different icon settings, go to
     * [Google Font Icons](https://fonts.google.com/icons) and adjust the
     * settings under **Customize**.
     * </pre>
     *
     * <code>int32 grade = 4;</code>
     *
     * @return The grade.
     */
    @java.lang.Override
    public int getGrade() {
      return grade_;
    }
    /**
     *
     *
     * <pre>
     * Weight and grade affect a symbol’s thickness. Adjustments to grade are more
     * granular than adjustments to weight and have a small impact on the size of
     * the symbol. Choose from {-25, 0, 200}. If absent, default value is 0. If
     * any other value is specified, the default value is used.
     *
     * To preview different icon settings, go to
     * [Google Font Icons](https://fonts.google.com/icons) and adjust the
     * settings under **Customize**.
     * </pre>
     *
     * <code>int32 grade = 4;</code>
     *
     * @param value The grade to set.
     * @return This builder for chaining.
     */
    public Builder setGrade(int value) {

      grade_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Weight and grade affect a symbol’s thickness. Adjustments to grade are more
     * granular than adjustments to weight and have a small impact on the size of
     * the symbol. Choose from {-25, 0, 200}. If absent, default value is 0. If
     * any other value is specified, the default value is used.
     *
     * To preview different icon settings, go to
     * [Google Font Icons](https://fonts.google.com/icons) and adjust the
     * settings under **Customize**.
     * </pre>
     *
     * <code>int32 grade = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGrade() {
      bitField0_ = (bitField0_ & ~0x00000008);
      grade_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.apps.card.v1.MaterialIcon)
  }

  // @@protoc_insertion_point(class_scope:google.apps.card.v1.MaterialIcon)
  private static final com.google.apps.card.v1.MaterialIcon DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.card.v1.MaterialIcon();
  }

  public static com.google.apps.card.v1.MaterialIcon getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MaterialIcon> PARSER =
      new com.google.protobuf.AbstractParser<MaterialIcon>() {
        @java.lang.Override
        public MaterialIcon parsePartialFrom(
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

  public static com.google.protobuf.Parser<MaterialIcon> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MaterialIcon> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.card.v1.MaterialIcon getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
