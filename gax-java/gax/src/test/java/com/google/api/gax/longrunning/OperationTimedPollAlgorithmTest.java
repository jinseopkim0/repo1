/*
 * Copyright 2023 Google LLC
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
package com.google.api.gax.longrunning;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.api.gax.core.FakeApiClock;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.retrying.TimedAttemptSettings;
import com.google.api.gax.util.FakeLogHandler;
import java.util.concurrent.CancellationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.Duration;

public class OperationTimedPollAlgorithmTest {

  private static final RetrySettings FAST_RETRY_SETTINGS =
      RetrySettings.newBuilder()
          .setInitialRetryDelay(Duration.ofMillis(1L))
          .setRetryDelayMultiplier(1)
          .setMaxRetryDelay(Duration.ofMillis(1L))
          .setInitialRpcTimeout(Duration.ofMillis(1L))
          .setMaxAttempts(0)
          .setJittered(false)
          .setRpcTimeoutMultiplier(1)
          .setMaxRpcTimeout(Duration.ofMillis(1L))
          .setTotalTimeout(Duration.ofMillis(5L))
          .build();

  private FakeLogHandler logHandler;

  @Before
  public void setUp() {
    logHandler = new FakeLogHandler();
    OperationTimedPollAlgorithm.LOGGER.addHandler(logHandler);
  }

  @After
  public void tearDown() {
    OperationTimedPollAlgorithm.LOGGER.removeHandler(logHandler);
    // redundant null assignment for readability - a new log handler will be used
    logHandler = null;
  }

  @Test
  public void testAlgorithmThatShouldRetry_doesNotLogTimeoutHelpMessage() {
    FakeApiClock clock = new FakeApiClock(System.nanoTime());
    OperationTimedPollAlgorithm algorithm =
        OperationTimedPollAlgorithm.create(FAST_RETRY_SETTINGS, clock);
    TimedAttemptSettings settings =
        TimedAttemptSettings.newBuilder()
            .setGlobalSettings(FAST_RETRY_SETTINGS)
            .setRetryDelay(Duration.ofMillis(1l))
            .setRpcTimeout(Duration.ofMillis(1l))
            .setRandomizedRetryDelay(Duration.ofMillis(1l))
            .setAttemptCount(0)
            .setFirstAttemptStartTimeNanos(clock.nanoTime())
            .build();
    try {
      algorithm.shouldRetry(settings);
    } catch (CancellationException ex) {
      fail("Unexpected unsuccessful shouldRetry()");
    }
    assertTrue(
        logHandler.getAllMessages().stream()
            .noneMatch(
                entry -> entry.contains(OperationTimedPollAlgorithm.LRO_TROUBLESHOOTING_LINK)));
  }

  @Test
  public void testAlgorithmThatShouldNotRetry_logsTimeoutHelpMessage() {
    FakeApiClock clock = new FakeApiClock(System.nanoTime());
    OperationTimedPollAlgorithm algorithm =
        OperationTimedPollAlgorithm.create(FAST_RETRY_SETTINGS, clock);
    TimedAttemptSettings settings =
        TimedAttemptSettings.newBuilder()
            .setGlobalSettings(FAST_RETRY_SETTINGS)
            .setRetryDelay(Duration.ofMillis(1l))
            .setRpcTimeout(Duration.ofMillis(1l))
            .setRandomizedRetryDelay(Duration.ofMillis(1l))
            .setAttemptCount(0)
            .setFirstAttemptStartTimeNanos(clock.nanoTime())
            .build();
    clock.incrementNanoTime(1 * 1000 * 1000 * 1000);
    assertThrows(CancellationException.class, () -> algorithm.shouldRetry(settings));
    assertTrue(
        logHandler.getAllMessages().stream()
            .anyMatch(
                entry -> entry.contains(OperationTimedPollAlgorithm.LRO_TROUBLESHOOTING_LINK)));
  }
}
