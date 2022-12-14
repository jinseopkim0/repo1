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
// source: google/api/quota.proto

package com.google.api;

public interface QuotaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.Quota)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of QuotaLimit definitions for the service.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3;</code>
   */
  java.util.List<com.google.api.QuotaLimit> getLimitsList();
  /**
   *
   *
   * <pre>
   * List of QuotaLimit definitions for the service.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3;</code>
   */
  com.google.api.QuotaLimit getLimits(int index);
  /**
   *
   *
   * <pre>
   * List of QuotaLimit definitions for the service.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3;</code>
   */
  int getLimitsCount();
  /**
   *
   *
   * <pre>
   * List of QuotaLimit definitions for the service.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3;</code>
   */
  java.util.List<? extends com.google.api.QuotaLimitOrBuilder> getLimitsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of QuotaLimit definitions for the service.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3;</code>
   */
  com.google.api.QuotaLimitOrBuilder getLimitsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of MetricRule definitions, each one mapping a selected method to one
   * or more metrics.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4;</code>
   */
  java.util.List<com.google.api.MetricRule> getMetricRulesList();
  /**
   *
   *
   * <pre>
   * List of MetricRule definitions, each one mapping a selected method to one
   * or more metrics.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4;</code>
   */
  com.google.api.MetricRule getMetricRules(int index);
  /**
   *
   *
   * <pre>
   * List of MetricRule definitions, each one mapping a selected method to one
   * or more metrics.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4;</code>
   */
  int getMetricRulesCount();
  /**
   *
   *
   * <pre>
   * List of MetricRule definitions, each one mapping a selected method to one
   * or more metrics.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4;</code>
   */
  java.util.List<? extends com.google.api.MetricRuleOrBuilder> getMetricRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of MetricRule definitions, each one mapping a selected method to one
   * or more metrics.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4;</code>
   */
  com.google.api.MetricRuleOrBuilder getMetricRulesOrBuilder(int index);
}
