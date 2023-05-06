// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/quota.proto

package com.google.api;

public final class QuotaProto {
  private QuotaProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Quota_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Quota_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MetricRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MetricRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MetricRule_MetricCostsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MetricRule_MetricCostsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_QuotaLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_QuotaLimit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_QuotaLimit_ValuesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_QuotaLimit_ValuesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026google/api/quota.proto\022\ngoogle.api\"]\n\005" +
      "Quota\022&\n\006limits\030\003 \003(\0132\026.google.api.Quota" +
      "Limit\022,\n\014metric_rules\030\004 \003(\0132\026.google.api" +
      ".MetricRule\"\221\001\n\nMetricRule\022\020\n\010selector\030\001" +
      " \001(\t\022=\n\014metric_costs\030\002 \003(\0132\'.google.api." +
      "MetricRule.MetricCostsEntry\0322\n\020MetricCos" +
      "tsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\003:\0028\001\"" +
      "\225\002\n\nQuotaLimit\022\014\n\004name\030\006 \001(\t\022\023\n\013descript" +
      "ion\030\002 \001(\t\022\025\n\rdefault_limit\030\003 \001(\003\022\021\n\tmax_" +
      "limit\030\004 \001(\003\022\021\n\tfree_tier\030\007 \001(\003\022\020\n\010durati" +
      "on\030\005 \001(\t\022\016\n\006metric\030\010 \001(\t\022\014\n\004unit\030\t \001(\t\0222" +
      "\n\006values\030\n \003(\0132\".google.api.QuotaLimit.V" +
      "aluesEntry\022\024\n\014display_name\030\014 \001(\t\032-\n\013Valu" +
      "esEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\003:\0028\001B" +
      "l\n\016com.google.apiB\nQuotaProtoP\001ZEgoogle." +
      "golang.org/genproto/googleapis/api/servi" +
      "ceconfig;serviceconfig\242\002\004GAPIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_api_Quota_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Quota_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Quota_descriptor,
        new java.lang.String[] { "Limits", "MetricRules", });
    internal_static_google_api_MetricRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_MetricRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MetricRule_descriptor,
        new java.lang.String[] { "Selector", "MetricCosts", });
    internal_static_google_api_MetricRule_MetricCostsEntry_descriptor =
      internal_static_google_api_MetricRule_descriptor.getNestedTypes().get(0);
    internal_static_google_api_MetricRule_MetricCostsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MetricRule_MetricCostsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_api_QuotaLimit_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_QuotaLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_QuotaLimit_descriptor,
        new java.lang.String[] { "Name", "Description", "DefaultLimit", "MaxLimit", "FreeTier", "Duration", "Metric", "Unit", "Values", "DisplayName", });
    internal_static_google_api_QuotaLimit_ValuesEntry_descriptor =
      internal_static_google_api_QuotaLimit_descriptor.getNestedTypes().get(0);
    internal_static_google_api_QuotaLimit_ValuesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_QuotaLimit_ValuesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
