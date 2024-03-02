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
// source: google/type/color.proto

// Protobuf Java Version: 3.25.2
package com.google.type;

public interface ColorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.type.Color)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The amount of red in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float red = 1;</code>
   *
   * @return The red.
   */
  float getRed();

  /**
   *
   *
   * <pre>
   * The amount of green in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float green = 2;</code>
   *
   * @return The green.
   */
  float getGreen();

  /**
   *
   *
   * <pre>
   * The amount of blue in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float blue = 3;</code>
   *
   * @return The blue.
   */
  float getBlue();

  /**
   *
   *
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>.google.protobuf.FloatValue alpha = 4;</code>
   *
   * @return Whether the alpha field is set.
   */
  boolean hasAlpha();
  /**
   *
   *
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>.google.protobuf.FloatValue alpha = 4;</code>
   *
   * @return The alpha.
   */
  com.google.protobuf.FloatValue getAlpha();
  /**
   *
   *
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>.google.protobuf.FloatValue alpha = 4;</code>
   */
  com.google.protobuf.FloatValueOrBuilder getAlphaOrBuilder();
}
