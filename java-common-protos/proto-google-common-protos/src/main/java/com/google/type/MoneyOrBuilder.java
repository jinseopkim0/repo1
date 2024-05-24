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
// source: google/type/money.proto

// Protobuf Java Version: 3.25.3
package com.google.type;

public interface MoneyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.type.Money)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The three-letter currency code defined in ISO 4217.
   * </pre>
   *
   * <code>string currency_code = 1;</code>
   *
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   *
   *
   * <pre>
   * The three-letter currency code defined in ISO 4217.
   * </pre>
   *
   * <code>string currency_code = 1;</code>
   *
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString getCurrencyCodeBytes();

  /**
   *
   *
   * <pre>
   * The whole units of the amount.
   * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
   * </pre>
   *
   * <code>int64 units = 2;</code>
   *
   * @return The units.
   */
  long getUnits();

  /**
   *
   *
   * <pre>
   * Number of nano (10^-9) units of the amount.
   * The value must be between -999,999,999 and +999,999,999 inclusive.
   * If `units` is positive, `nanos` must be positive or zero.
   * If `units` is zero, `nanos` can be positive, zero, or negative.
   * If `units` is negative, `nanos` must be negative or zero.
   * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
   * </pre>
   *
   * <code>int32 nanos = 3;</code>
   *
   * @return The nanos.
   */
  int getNanos();
}
