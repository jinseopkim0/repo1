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
// source: google/rpc/error_details.proto

// Protobuf Java Version: 3.25.2
package com.google.rpc;

public interface LocalizedMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.rpc.LocalizedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The locale used following the specification defined at
   * https://www.rfc-editor.org/rfc/bcp/bcp47.txt.
   * Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>string locale = 1;</code>
   *
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   *
   *
   * <pre>
   * The locale used following the specification defined at
   * https://www.rfc-editor.org/rfc/bcp/bcp47.txt.
   * Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>string locale = 1;</code>
   *
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString getLocaleBytes();

  /**
   *
   *
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>string message = 2;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>string message = 2;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();
}
