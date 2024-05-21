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
// source: google/api/quota.proto

// Protobuf Java Version: 3.25.3
package com.google.api;

/**
 *
 *
 * <pre>
 * Bind API methods to metrics. Binding a method to a metric causes that
 * metric's configured quota behaviors to apply to the method call.
 * </pre>
 *
 * Protobuf type {@code google.api.MetricRule}
 */
public final class MetricRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.MetricRule)
    MetricRuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MetricRule.newBuilder() to construct.
  private MetricRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MetricRule() {
    selector_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MetricRule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.QuotaProto.internal_static_google_api_MetricRule_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetMetricCosts();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.QuotaProto.internal_static_google_api_MetricRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.MetricRule.class, com.google.api.MetricRule.Builder.class);
  }

  public static final int SELECTOR_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object selector_ = "";
  /**
   *
   *
   * <pre>
   * Selects the methods to which this rule applies.
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
   * Selects the methods to which this rule applies.
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

  public static final int METRIC_COSTS_FIELD_NUMBER = 2;

  private static final class MetricCostsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.Long>newDefaultInstance(
            com.google.api.QuotaProto
                .internal_static_google_api_MetricRule_MetricCostsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.INT64,
            0L);
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long> metricCosts_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.Long> internalGetMetricCosts() {
    if (metricCosts_ == null) {
      return com.google.protobuf.MapField.emptyMapField(MetricCostsDefaultEntryHolder.defaultEntry);
    }
    return metricCosts_;
  }

  public int getMetricCostsCount() {
    return internalGetMetricCosts().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   *
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */
  @java.lang.Override
  public boolean containsMetricCosts(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetMetricCosts().getMap().containsKey(key);
  }
  /** Use {@link #getMetricCostsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getMetricCosts() {
    return getMetricCostsMap();
  }
  /**
   *
   *
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   *
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Long> getMetricCostsMap() {
    return internalGetMetricCosts().getMap();
  }
  /**
   *
   *
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   *
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */
  @java.lang.Override
  public long getMetricCostsOrDefault(java.lang.String key, long defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.Long> map = internalGetMetricCosts().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   *
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */
  @java.lang.Override
  public long getMetricCostsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.Long> map = internalGetMetricCosts().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetMetricCosts(), MetricCostsDefaultEntryHolder.defaultEntry, 2);
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
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry :
        internalGetMetricCosts().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> metricCosts__ =
          MetricCostsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, metricCosts__);
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
    if (!(obj instanceof com.google.api.MetricRule)) {
      return super.equals(obj);
    }
    com.google.api.MetricRule other = (com.google.api.MetricRule) obj;

    if (!getSelector().equals(other.getSelector())) return false;
    if (!internalGetMetricCosts().equals(other.internalGetMetricCosts())) return false;
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
    if (!internalGetMetricCosts().getMap().isEmpty()) {
      hash = (37 * hash) + METRIC_COSTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMetricCosts().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.MetricRule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.MetricRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.MetricRule parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.MetricRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.MetricRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.MetricRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.MetricRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.MetricRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.MetricRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.MetricRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.MetricRule parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.MetricRule parseFrom(
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

  public static Builder newBuilder(com.google.api.MetricRule prototype) {
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
   * Bind API methods to metrics. Binding a method to a metric causes that
   * metric's configured quota behaviors to apply to the method call.
   * </pre>
   *
   * Protobuf type {@code google.api.MetricRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.MetricRule)
      com.google.api.MetricRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.QuotaProto.internal_static_google_api_MetricRule_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMetricCosts();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableMetricCosts();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.QuotaProto.internal_static_google_api_MetricRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.MetricRule.class, com.google.api.MetricRule.Builder.class);
    }

    // Construct using com.google.api.MetricRule.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      selector_ = "";
      internalGetMutableMetricCosts().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.QuotaProto.internal_static_google_api_MetricRule_descriptor;
    }

    @java.lang.Override
    public com.google.api.MetricRule getDefaultInstanceForType() {
      return com.google.api.MetricRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.MetricRule build() {
      com.google.api.MetricRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.MetricRule buildPartial() {
      com.google.api.MetricRule result = new com.google.api.MetricRule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.MetricRule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.selector_ = selector_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metricCosts_ = internalGetMetricCosts();
        result.metricCosts_.makeImmutable();
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
      if (other instanceof com.google.api.MetricRule) {
        return mergeFrom((com.google.api.MetricRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.MetricRule other) {
      if (other == com.google.api.MetricRule.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableMetricCosts().mergeFrom(other.internalGetMetricCosts());
      bitField0_ |= 0x00000002;
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
                com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> metricCosts__ =
                    input.readMessage(
                        MetricCostsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableMetricCosts()
                    .getMutableMap()
                    .put(metricCosts__.getKey(), metricCosts__.getValue());
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
     * Selects the methods to which this rule applies.
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
     * Selects the methods to which this rule applies.
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
     * Selects the methods to which this rule applies.
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
     * Selects the methods to which this rule applies.
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
     * Selects the methods to which this rule applies.
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long> metricCosts_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetMetricCosts() {
      if (metricCosts_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MetricCostsDefaultEntryHolder.defaultEntry);
      }
      return metricCosts_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetMutableMetricCosts() {
      if (metricCosts_ == null) {
        metricCosts_ =
            com.google.protobuf.MapField.newMapField(MetricCostsDefaultEntryHolder.defaultEntry);
      }
      if (!metricCosts_.isMutable()) {
        metricCosts_ = metricCosts_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return metricCosts_;
    }

    public int getMetricCostsCount() {
      return internalGetMetricCosts().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     *
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */
    @java.lang.Override
    public boolean containsMetricCosts(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetMetricCosts().getMap().containsKey(key);
    }
    /** Use {@link #getMetricCostsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getMetricCosts() {
      return getMetricCostsMap();
    }
    /**
     *
     *
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     *
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Long> getMetricCostsMap() {
      return internalGetMetricCosts().getMap();
    }
    /**
     *
     *
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     *
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */
    @java.lang.Override
    public long getMetricCostsOrDefault(java.lang.String key, long defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.Long> map = internalGetMetricCosts().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     *
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */
    @java.lang.Override
    public long getMetricCostsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.Long> map = internalGetMetricCosts().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMetricCosts() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableMetricCosts().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     *
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */
    public Builder removeMetricCosts(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableMetricCosts().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getMutableMetricCosts() {
      bitField0_ |= 0x00000002;
      return internalGetMutableMetricCosts().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     *
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */
    public Builder putMetricCosts(java.lang.String key, long value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }

      internalGetMutableMetricCosts().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     *
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */
    public Builder putAllMetricCosts(java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableMetricCosts().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.api.MetricRule)
  }

  // @@protoc_insertion_point(class_scope:google.api.MetricRule)
  private static final com.google.api.MetricRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.MetricRule();
  }

  public static com.google.api.MetricRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetricRule> PARSER =
      new com.google.protobuf.AbstractParser<MetricRule>() {
        @java.lang.Override
        public MetricRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<MetricRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetricRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.MetricRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
