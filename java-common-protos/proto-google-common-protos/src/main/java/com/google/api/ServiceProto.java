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
// source: google/api/service.proto

package com.google.api;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_Service_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Service_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\030google/api/service.proto\022\ngoogle.api\032\025"
          + "google/api/auth.proto\032\030google/api/backen"
          + "d.proto\032\030google/api/billing.proto\032\027googl"
          + "e/api/client.proto\032\030google/api/context.p"
          + "roto\032\030google/api/control.proto\032\036google/a"
          + "pi/documentation.proto\032\031google/api/endpo"
          + "int.proto\032\025google/api/http.proto\032\024google"
          + "/api/log.proto\032\030google/api/logging.proto"
          + "\032\027google/api/metric.proto\032#google/api/mo"
          + "nitored_resource.proto\032\033google/api/monit"
          + "oring.proto\032\026google/api/quota.proto\032\034goo"
          + "gle/api/source_info.proto\032!google/api/sy"
          + "stem_parameter.proto\032\026google/api/usage.p"
          + "roto\032\031google/protobuf/api.proto\032\032google/"
          + "protobuf/type.proto\032\036google/protobuf/wra"
          + "ppers.proto\"\202\010\n\007Service\022\014\n\004name\030\001 \001(\t\022\r\n"
          + "\005title\030\002 \001(\t\022\033\n\023producer_project_id\030\026 \001("
          + "\t\022\n\n\002id\030! \001(\t\022\"\n\004apis\030\003 \003(\0132\024.google.pro"
          + "tobuf.Api\022$\n\005types\030\004 \003(\0132\025.google.protob"
          + "uf.Type\022$\n\005enums\030\005 \003(\0132\025.google.protobuf"
          + ".Enum\0220\n\rdocumentation\030\006 \001(\0132\031.google.ap"
          + "i.Documentation\022$\n\007backend\030\010 \001(\0132\023.googl"
          + "e.api.Backend\022\036\n\004http\030\t \001(\0132\020.google.api"
          + ".Http\022 \n\005quota\030\n \001(\0132\021.google.api.Quota\022"
          + "2\n\016authentication\030\013 \001(\0132\032.google.api.Aut"
          + "hentication\022$\n\007context\030\014 \001(\0132\023.google.ap"
          + "i.Context\022 \n\005usage\030\017 \001(\0132\021.google.api.Us"
          + "age\022\'\n\tendpoints\030\022 \003(\0132\024.google.api.Endp"
          + "oint\022$\n\007control\030\025 \001(\0132\023.google.api.Contr"
          + "ol\022\'\n\004logs\030\027 \003(\0132\031.google.api.LogDescrip"
          + "tor\022-\n\007metrics\030\030 \003(\0132\034.google.api.Metric"
          + "Descriptor\022D\n\023monitored_resources\030\031 \003(\0132"
          + "\'.google.api.MonitoredResourceDescriptor"
          + "\022$\n\007billing\030\032 \001(\0132\023.google.api.Billing\022$"
          + "\n\007logging\030\033 \001(\0132\023.google.api.Logging\022*\n\n"
          + "monitoring\030\034 \001(\0132\026.google.api.Monitoring"
          + "\0227\n\021system_parameters\030\035 \001(\0132\034.google.api"
          + ".SystemParameters\022+\n\013source_info\030% \001(\0132\026"
          + ".google.api.SourceInfo\022*\n\npublishing\030- \001"
          + "(\0132\026.google.api.Publishing\0224\n\016config_ver"
          + "sion\030\024 \001(\0132\034.google.protobuf.UInt32Value"
          + "Bn\n\016com.google.apiB\014ServiceProtoP\001ZEgoog"
          + "le.golang.org/genproto/googleapis/api/se"
          + "rviceconfig;serviceconfig\242\002\004GAPIb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AuthProto.getDescriptor(),
              com.google.api.BackendProto.getDescriptor(),
              com.google.api.BillingProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.ContextProto.getDescriptor(),
              com.google.api.ControlProto.getDescriptor(),
              com.google.api.DocumentationProto.getDescriptor(),
              com.google.api.EndpointProto.getDescriptor(),
              com.google.api.HttpProto.getDescriptor(),
              com.google.api.LogProto.getDescriptor(),
              com.google.api.LoggingProto.getDescriptor(),
              com.google.api.MetricProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.MonitoringProto.getDescriptor(),
              com.google.api.QuotaProto.getDescriptor(),
              com.google.api.SourceInfoProto.getDescriptor(),
              com.google.api.SystemParameterProto.getDescriptor(),
              com.google.api.UsageProto.getDescriptor(),
              com.google.protobuf.ApiProto.getDescriptor(),
              com.google.protobuf.TypeProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_api_Service_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Service_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_Service_descriptor,
            new java.lang.String[] {
              "Name",
              "Title",
              "ProducerProjectId",
              "Id",
              "Apis",
              "Types",
              "Enums",
              "Documentation",
              "Backend",
              "Http",
              "Quota",
              "Authentication",
              "Context",
              "Usage",
              "Endpoints",
              "Control",
              "Logs",
              "Metrics",
              "MonitoredResources",
              "Billing",
              "Logging",
              "Monitoring",
              "SystemParameters",
              "SourceInfo",
              "Publishing",
              "ConfigVersion",
            });
    com.google.api.AuthProto.getDescriptor();
    com.google.api.BackendProto.getDescriptor();
    com.google.api.BillingProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ContextProto.getDescriptor();
    com.google.api.ControlProto.getDescriptor();
    com.google.api.DocumentationProto.getDescriptor();
    com.google.api.EndpointProto.getDescriptor();
    com.google.api.HttpProto.getDescriptor();
    com.google.api.LogProto.getDescriptor();
    com.google.api.LoggingProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.MonitoringProto.getDescriptor();
    com.google.api.QuotaProto.getDescriptor();
    com.google.api.SourceInfoProto.getDescriptor();
    com.google.api.SystemParameterProto.getDescriptor();
    com.google.api.UsageProto.getDescriptor();
    com.google.protobuf.ApiProto.getDescriptor();
    com.google.protobuf.TypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
