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
// source: google/api/billing.proto

// Protobuf Java Version: 3.25.2
package com.google.api;

public interface BillingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.Billing)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Billing configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations per service, each one must have
   * a different monitored resource type. A metric can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Billing.BillingDestination consumer_destinations = 8;</code>
   */
  java.util.List<com.google.api.Billing.BillingDestination> getConsumerDestinationsList();
  /**
   *
   *
   * <pre>
   * Billing configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations per service, each one must have
   * a different monitored resource type. A metric can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Billing.BillingDestination consumer_destinations = 8;</code>
   */
  com.google.api.Billing.BillingDestination getConsumerDestinations(int index);
  /**
   *
   *
   * <pre>
   * Billing configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations per service, each one must have
   * a different monitored resource type. A metric can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Billing.BillingDestination consumer_destinations = 8;</code>
   */
  int getConsumerDestinationsCount();
  /**
   *
   *
   * <pre>
   * Billing configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations per service, each one must have
   * a different monitored resource type. A metric can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Billing.BillingDestination consumer_destinations = 8;</code>
   */
  java.util.List<? extends com.google.api.Billing.BillingDestinationOrBuilder>
      getConsumerDestinationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Billing configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations per service, each one must have
   * a different monitored resource type. A metric can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Billing.BillingDestination consumer_destinations = 8;</code>
   */
  com.google.api.Billing.BillingDestinationOrBuilder getConsumerDestinationsOrBuilder(int index);
}
