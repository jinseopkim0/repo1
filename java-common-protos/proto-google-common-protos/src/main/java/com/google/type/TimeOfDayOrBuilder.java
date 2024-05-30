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
// source: google/type/timeofday.proto

// Protobuf Java Version: 3.25.3
package com.google.type;

public interface TimeOfDayOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.type.TimeOfDay)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
   * to allow the value "24:00:00" for scenarios like business closing time.
   * </pre>
   *
   * <code>int32 hours = 1;</code>
   *
   * @return The hours.
   */
  int getHours();

  /**
   *
   *
   * <pre>
   * Minutes of hour of day. Must be from 0 to 59.
   * </pre>
   *
   * <code>int32 minutes = 2;</code>
   *
   * @return The minutes.
   */
  int getMinutes();

  /**
   *
   *
   * <pre>
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
   * allow the value 60 if it allows leap-seconds.
   * </pre>
   *
   * <code>int32 seconds = 3;</code>
   *
   * @return The seconds.
   */
  int getSeconds();

  /**
   *
   *
   * <pre>
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * </pre>
   *
   * <code>int32 nanos = 4;</code>
   *
   * @return The nanos.
   */
  int getNanos();
}
