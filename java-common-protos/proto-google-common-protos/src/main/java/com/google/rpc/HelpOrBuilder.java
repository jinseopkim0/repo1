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
// source: google/rpc/error_details.proto

// Protobuf Java Version: 3.25.3
package com.google.rpc;

public interface HelpOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.rpc.Help)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link links = 1;</code>
   */
  java.util.List<com.google.rpc.Help.Link> getLinksList();
  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link links = 1;</code>
   */
  com.google.rpc.Help.Link getLinks(int index);
  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link links = 1;</code>
   */
  int getLinksCount();
  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link links = 1;</code>
   */
  java.util.List<? extends com.google.rpc.Help.LinkOrBuilder> getLinksOrBuilderList();
  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link links = 1;</code>
   */
  com.google.rpc.Help.LinkOrBuilder getLinksOrBuilder(int index);
}
