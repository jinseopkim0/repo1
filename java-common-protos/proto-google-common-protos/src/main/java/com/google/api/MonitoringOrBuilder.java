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
// source: google/api/monitoring.proto

// Protobuf Java Version: 3.25.2
package com.google.api;

public interface MonitoringOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.Monitoring)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Monitoring configurations for sending metrics to the producer project.
   * There can be multiple producer destinations. A monitored resource type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination producer_destinations = 1;</code>
   */
  java.util.List<com.google.api.Monitoring.MonitoringDestination> getProducerDestinationsList();
  /**
   *
   *
   * <pre>
   * Monitoring configurations for sending metrics to the producer project.
   * There can be multiple producer destinations. A monitored resource type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination producer_destinations = 1;</code>
   */
  com.google.api.Monitoring.MonitoringDestination getProducerDestinations(int index);
  /**
   *
   *
   * <pre>
   * Monitoring configurations for sending metrics to the producer project.
   * There can be multiple producer destinations. A monitored resource type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination producer_destinations = 1;</code>
   */
  int getProducerDestinationsCount();
  /**
   *
   *
   * <pre>
   * Monitoring configurations for sending metrics to the producer project.
   * There can be multiple producer destinations. A monitored resource type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination producer_destinations = 1;</code>
   */
  java.util.List<? extends com.google.api.Monitoring.MonitoringDestinationOrBuilder>
      getProducerDestinationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Monitoring configurations for sending metrics to the producer project.
   * There can be multiple producer destinations. A monitored resource type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination producer_destinations = 1;</code>
   */
  com.google.api.Monitoring.MonitoringDestinationOrBuilder getProducerDestinationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Monitoring configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations. A monitored resource type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination consumer_destinations = 2;</code>
   */
  java.util.List<com.google.api.Monitoring.MonitoringDestination> getConsumerDestinationsList();
  /**
   *
   *
   * <pre>
   * Monitoring configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations. A monitored resource type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination consumer_destinations = 2;</code>
   */
  com.google.api.Monitoring.MonitoringDestination getConsumerDestinations(int index);
  /**
   *
   *
   * <pre>
   * Monitoring configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations. A monitored resource type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination consumer_destinations = 2;</code>
   */
  int getConsumerDestinationsCount();
  /**
   *
   *
   * <pre>
   * Monitoring configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations. A monitored resource type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination consumer_destinations = 2;</code>
   */
  java.util.List<? extends com.google.api.Monitoring.MonitoringDestinationOrBuilder>
      getConsumerDestinationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Monitoring configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations. A monitored resource type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination consumer_destinations = 2;</code>
   */
  com.google.api.Monitoring.MonitoringDestinationOrBuilder getConsumerDestinationsOrBuilder(
      int index);
}
