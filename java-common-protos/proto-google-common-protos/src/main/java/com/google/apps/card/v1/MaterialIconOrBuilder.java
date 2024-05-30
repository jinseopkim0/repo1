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

// Protobuf Java Version: 3.25.3
package com.google.apps.card.v1;

public interface MaterialIconOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.card.v1.MaterialIcon)
    com.google.protobuf.MessageOrBuilder {

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
  java.lang.String getName();
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
  com.google.protobuf.ByteString getNameBytes();

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
  boolean getFill();

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
  int getWeight();

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
  int getGrade();
}
