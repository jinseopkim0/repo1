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
// source: google/apps/card/v1/card.proto

// Protobuf Java Version: 3.25.2
package com.google.apps.card.v1;

public interface OpenLinkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.card.v1.OpenLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URL to open.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   *
   *
   * <pre>
   * The URL to open.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString getUrlBytes();

  /**
   *
   *
   * <pre>
   * How to open a link.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.OpenLink.OpenAs open_as = 2;</code>
   *
   * @return The enum numeric value on the wire for openAs.
   */
  int getOpenAsValue();
  /**
   *
   *
   * <pre>
   * How to open a link.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.OpenLink.OpenAs open_as = 2;</code>
   *
   * @return The openAs.
   */
  com.google.apps.card.v1.OpenLink.OpenAs getOpenAs();

  /**
   *
   *
   * <pre>
   * Whether the client forgets about a link after opening it, or observes it
   * until the window closes.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.OpenLink.OnClose on_close = 3;</code>
   *
   * @return The enum numeric value on the wire for onClose.
   */
  int getOnCloseValue();
  /**
   *
   *
   * <pre>
   * Whether the client forgets about a link after opening it, or observes it
   * until the window closes.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.OpenLink.OnClose on_close = 3;</code>
   *
   * @return The onClose.
   */
  com.google.apps.card.v1.OpenLink.OnClose getOnClose();
}
