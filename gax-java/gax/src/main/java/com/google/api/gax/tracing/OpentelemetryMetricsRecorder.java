/*
 * Copyright 2024 Google LLC
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google LLC nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.google.api.gax.tracing;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.metrics.DoubleHistogram;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.Meter;
import java.util.Map;

public class OpentelemetryMetricsRecorder implements MetricsRecorder {
  private DoubleHistogram attemptLatencyRecorder;
  private DoubleHistogram operationLatencyRecorder;
  private LongCounter operationCountRecorder;
  private LongCounter attemptCountRecorder;

  public OpentelemetryMetricsRecorder(Meter meter) {
    this.attemptLatencyRecorder =
        meter
            .histogramBuilder("attempt_latency")
            .setDescription("Time an individual attempt took")
            .setUnit("ms")
            .build();
    this.operationLatencyRecorder =
        meter
            .histogramBuilder("operation_latency")
            .setDescription(
                "Total time until final operation success or failure, including retries and backoff.")
            .setUnit("ms")
            .build();
    this.operationCountRecorder =
        meter
            .counterBuilder("operation_count")
            .setDescription("Number of operations made")
            .build();
    this.attemptCountRecorder =
        meter
            .counterBuilder("attempt_count")
            .setDescription("Number of attempts made")
            .build();
  }

  /**
   * Record the latency for an individual attempt. Data is stored in a Histogram.
   *
   * @param attemptLatency Attempt Latency in ms
   * @param attributes Map of the attributes to store
   */
  @Override
  public void recordAttemptLatency(double attemptLatency, Map<String, String> attributes) {
    attemptLatencyRecorder.record(attemptLatency, toOtelAttributes(attributes));
  }

  /**
   * Record an attempt made. The attempt count number is stored in a LongCounter.
   *
   * <p>The count should be set as 1 every time this is invoked (each retry attempt)
   *
   * @param count The number of attempts made
   * @param attributes Map of the attributes to store
   */
  @Override
  public void recordAttemptCount(long count, Map<String, String> attributes) {
    attemptCountRecorder.add(count, toOtelAttributes(attributes));
  }

  /**
   * Record the latency for the entire operation. This is the latency for the entire RPC, including
   * all the retry attempts
   *
   * @param operationLatency Operation Latency in ms
   * @param attributes Map of the attributes to store
   */
  @Override
  public void recordOperationLatency(double operationLatency, Map<String, String> attributes) {
    operationLatencyRecorder.record(operationLatency, toOtelAttributes(attributes));
  }

  /**
   * Record an operation made. The operation count number is stored in a LongCounter.
   *
   * <p>The operation count should always be 1 and this should be invoked once.
   *
   * @param count The number of operations made
   * @param attributes Map of the attributes to store
   */
  @Override
  public void recordOperationCount(long count, Map<String, String> attributes) {
    operationCountRecorder.add(count, toOtelAttributes(attributes));
  }

  @VisibleForTesting
  Attributes toOtelAttributes(Map<String, String> attributes) {
    Preconditions.checkNotNull(attributes, "Attributes map cannot be null");
    AttributesBuilder attributesBuilder = Attributes.builder();
    attributes.forEach(attributesBuilder::put);
    return attributesBuilder.build();
  }
}
