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

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.showcase.v1beta1.stub.WickedStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link WickedClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (localhost) and default port (7469) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of craftEvilPlan to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * WickedSettings.Builder wickedSettingsBuilder = WickedSettings.newBuilder();
 * wickedSettingsBuilder
 *     .craftEvilPlanSettings()
 *     .setRetrySettings(
 *         wickedSettingsBuilder
 *             .craftEvilPlanSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * WickedSettings wickedSettings = wickedSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class WickedSettings extends ClientSettings<WickedSettings> {

  /** Returns the object with the settings used for calls to craftEvilPlan. */
  public UnaryCallSettings<EvilRequest, EvilResponse> craftEvilPlanSettings() {
    return ((WickedStubSettings) getStubSettings()).craftEvilPlanSettings();
  }

  /** Returns the object with the settings used for calls to brainstormEvilPlans. */
  public StreamingCallSettings<EvilRequest, EvilResponse> brainstormEvilPlansSettings() {
    return ((WickedStubSettings) getStubSettings()).brainstormEvilPlansSettings();
  }

  /** Returns the object with the settings used for calls to persuadeEvilPlan. */
  public StreamingCallSettings<EvilRequest, EvilResponse> persuadeEvilPlanSettings() {
    return ((WickedStubSettings) getStubSettings()).persuadeEvilPlanSettings();
  }

  public static final WickedSettings create(WickedStubSettings stub) throws IOException {
    return new WickedSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return WickedStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return WickedStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return WickedStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return WickedStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return WickedStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return WickedStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return WickedStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected WickedSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for WickedSettings. */
  public static class Builder extends ClientSettings.Builder<WickedSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(WickedStubSettings.newBuilder(clientContext));
    }

    protected Builder(WickedSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(WickedStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(WickedStubSettings.newBuilder());
    }

    public WickedStubSettings.Builder getStubSettingsBuilder() {
      return ((WickedStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to craftEvilPlan. */
    public UnaryCallSettings.Builder<EvilRequest, EvilResponse> craftEvilPlanSettings() {
      return getStubSettingsBuilder().craftEvilPlanSettings();
    }

    /** Returns the builder for the settings used for calls to brainstormEvilPlans. */
    public StreamingCallSettings.Builder<EvilRequest, EvilResponse> brainstormEvilPlansSettings() {
      return getStubSettingsBuilder().brainstormEvilPlansSettings();
    }

    /** Returns the builder for the settings used for calls to persuadeEvilPlan. */
    public StreamingCallSettings.Builder<EvilRequest, EvilResponse> persuadeEvilPlanSettings() {
      return getStubSettingsBuilder().persuadeEvilPlanSettings();
    }

    @Override
    public WickedSettings build() throws IOException {
      return new WickedSettings(this);
    }
  }
}
