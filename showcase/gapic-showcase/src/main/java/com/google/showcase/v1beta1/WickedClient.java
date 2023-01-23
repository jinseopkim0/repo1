/*
 * Copyright 2022 Google LLC
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

package com.google.showcase.v1beta1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.ClientStreamingCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.showcase.v1beta1.stub.WickedStub;
import com.google.showcase.v1beta1.stub.WickedStubSettings;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: This service is used to show a Service with either non-enabled or
 * non-eligible RPCs for HttpJson (Http 1.1). Non-Enabled: Missing the (google.api.http) annotation
 * to enabled it Non-Eligible: BIDI and Client side streaming are not supported with Http 1.1
 * Service name is reference to `No REST for the Wicked`
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (WickedClient wickedClient = WickedClient.create()) {
 *   EvilRequest request =
 *       EvilRequest.newBuilder().setMaliciousIdea("maliciousIdea712541645").build();
 *   EvilResponse response = wickedClient.craftEvilPlan(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the WickedClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of WickedSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * WickedSettings wickedSettings =
 *     WickedSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * WickedClient wickedClient = WickedClient.create(wickedSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * WickedSettings wickedSettings = WickedSettings.newBuilder().setEndpoint(myEndpoint).build();
 * WickedClient wickedClient = WickedClient.create(wickedSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class WickedClient implements BackgroundResource {
  private final WickedSettings settings;
  private final WickedStub stub;

  /** Constructs an instance of WickedClient with default settings. */
  public static final WickedClient create() throws IOException {
    return create(WickedSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of WickedClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final WickedClient create(WickedSettings settings) throws IOException {
    return new WickedClient(settings);
  }

  /**
   * Constructs an instance of WickedClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(WickedSettings).
   */
  public static final WickedClient create(WickedStub stub) {
    return new WickedClient(stub);
  }

  /**
   * Constructs an instance of WickedClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected WickedClient(WickedSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((WickedStubSettings) settings.getStubSettings()).createStub();
  }

  protected WickedClient(WickedStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final WickedSettings getSettings() {
    return settings;
  }

  public WickedStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WickedClient wickedClient = WickedClient.create()) {
   *   EvilRequest request =
   *       EvilRequest.newBuilder().setMaliciousIdea("maliciousIdea712541645").build();
   *   EvilResponse response = wickedClient.craftEvilPlan(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EvilResponse craftEvilPlan(EvilRequest request) {
    return craftEvilPlanCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WickedClient wickedClient = WickedClient.create()) {
   *   EvilRequest request =
   *       EvilRequest.newBuilder().setMaliciousIdea("maliciousIdea712541645").build();
   *   ApiFuture<EvilResponse> future = wickedClient.craftEvilPlanCallable().futureCall(request);
   *   // Do something.
   *   EvilResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<EvilRequest, EvilResponse> craftEvilPlanCallable() {
    return stub.craftEvilPlanCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WickedClient wickedClient = WickedClient.create()) {
   *   BidiStream<EvilRequest, EvilResponse> bidiStream =
   *       wickedClient.brainstormEvilPlansCallable().call();
   *   EvilRequest request =
   *       EvilRequest.newBuilder().setMaliciousIdea("maliciousIdea712541645").build();
   *   bidiStream.send(request);
   *   for (EvilResponse response : bidiStream) {
   *     // Do something when a response is received.
   *   }
   * }
   * }</pre>
   */
  public final BidiStreamingCallable<EvilRequest, EvilResponse> brainstormEvilPlansCallable() {
    return stub.brainstormEvilPlansCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WickedClient wickedClient = WickedClient.create()) {
   *   ApiStreamObserver<EvilRequest> responseObserver =
   *       new ApiStreamObserver<EvilRequest>() {
   *         {@literal @}Override
   *         public void onNext(EvilResponse response) {
   *           // Do something when a response is received.
   *         }
   *
   *         {@literal @}Override
   *         public void onError(Throwable t) {
   *           // Add error-handling
   *         }
   *
   *         {@literal @}Override
   *         public void onCompleted() {
   *           // Do something when complete.
   *         }
   *       };
   *   ApiStreamObserver<EvilRequest> requestObserver =
   *       wickedClient.persuadeEvilPlan().clientStreamingCall(responseObserver);
   *   EvilRequest request =
   *       EvilRequest.newBuilder().setMaliciousIdea("maliciousIdea712541645").build();
   *   requestObserver.onNext(request);
   * }
   * }</pre>
   */
  public final ClientStreamingCallable<EvilRequest, EvilResponse> persuadeEvilPlanCallable() {
    return stub.persuadeEvilPlanCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
