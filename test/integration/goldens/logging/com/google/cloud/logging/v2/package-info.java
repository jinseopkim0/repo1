/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= LoggingClient =======================
 *
 * <p>Service Description: Service for ingesting and querying logs.
 *
 * <p>Sample for LoggingClient:
 *
 * <pre>{@code
 * package com.google.cloud.logging.v2;
 *
 * import com.google.logging.v2.LogName;
 * import com.google.protobuf.Empty;
 *
 * public class LoggingClientDeleteLog {
 *
 *   public static void main(String[] args) throws Exception {
 *     loggingClientDeleteLog();
 *   }
 *
 *   public static void loggingClientDeleteLog() throws Exception {
 *     try (LoggingClient loggingClient = LoggingClient.create()) {
 *       LogName logName = LogName.ofProjectLogName("[PROJECT]", "[LOG]");
 *       loggingClient.deleteLog(logName);
 *     }
 *   }
 * }
 * }</pre>
 *
 * <p>======================= ConfigClient =======================
 *
 * <p>Service Description: Service for configuring sinks used to route log entries.
 *
 * <p>Sample for ConfigClient:
 *
 * <pre>{@code
 * package com.google.cloud.logging.v2;
 *
 * import com.google.logging.v2.GetBucketRequest;
 * import com.google.logging.v2.LogBucket;
 * import com.google.logging.v2.LogBucketName;
 *
 * public class ConfigClientGetBucket {
 *
 *   public static void main(String[] args) throws Exception {
 *     configClientGetBucket();
 *   }
 *
 *   public static void configClientGetBucket() throws Exception {
 *     try (ConfigClient configClient = ConfigClient.create()) {
 *       GetBucketRequest request =
 *           GetBucketRequest.newBuilder()
 *               .setName(
 *                   LogBucketName.ofProjectLocationBucketName("[PROJECT]", "[LOCATION]", "[BUCKET]")
 *                       .toString())
 *               .build();
 *       LogBucket response = configClient.getBucket(request);
 *     }
 *   }
 * }
 * }</pre>
 *
 * <p>======================= MetricsClient =======================
 *
 * <p>Service Description: Service for configuring logs-based metrics.
 *
 * <p>Sample for MetricsClient:
 *
 * <pre>{@code
 * package com.google.cloud.logging.v2;
 *
 * import com.google.logging.v2.LogMetric;
 * import com.google.logging.v2.LogMetricName;
 *
 * public class MetricsClientGetLogMetric {
 *
 *   public static void main(String[] args) throws Exception {
 *     metricsClientGetLogMetric();
 *   }
 *
 *   public static void metricsClientGetLogMetric() throws Exception {
 *     try (MetricsClient metricsClient = MetricsClient.create()) {
 *       LogMetricName metricName = LogMetricName.of("[PROJECT]", "[METRIC]");
 *       LogMetric response = metricsClient.getLogMetric(metricName);
 *     }
 *   }
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.logging.v2;

import javax.annotation.Generated;
