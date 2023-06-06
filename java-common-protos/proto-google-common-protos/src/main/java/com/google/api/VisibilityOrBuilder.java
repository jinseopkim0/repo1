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
// source: google/api/visibility.proto

package com.google.api;

public interface VisibilityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.Visibility)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  java.util.List<com.google.api.VisibilityRule> getRulesList();
  /**
   *
   *
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  com.google.api.VisibilityRule getRules(int index);
  /**
   *
   *
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  int getRulesCount();
  /**
   *
   *
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  java.util.List<? extends com.google.api.VisibilityRuleOrBuilder> getRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  com.google.api.VisibilityRuleOrBuilder getRulesOrBuilder(int index);
}
