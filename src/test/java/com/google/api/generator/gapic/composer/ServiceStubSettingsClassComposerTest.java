// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.generator.gapic.composer;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import com.google.api.generator.engine.writer.JavaWriterVisitor;
import com.google.api.generator.gapic.model.GapicClass;
import com.google.api.generator.gapic.model.GapicServiceConfig;
import com.google.api.generator.gapic.model.Message;
import com.google.api.generator.gapic.model.ResourceName;
import com.google.api.generator.gapic.model.Service;
import com.google.api.generator.gapic.protoparser.Parser;
import com.google.api.generator.gapic.protoparser.ServiceConfigParser;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.showcase.v1beta1.EchoOuterClass;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class ServiceStubSettingsClassComposerTest {
  private static final String JSON_DIRECTORY =
      "src/test/java/com/google/api/generator/gapic/testdata/";

  private ServiceDescriptor echoService;
  private FileDescriptor echoFileDescriptor;

  @Before
  public void setUp() {
    echoFileDescriptor = EchoOuterClass.getDescriptor();
    echoService = echoFileDescriptor.getServices().get(0);
    assertEquals(echoService.getName(), "Echo");
  }

  @Test
  public void generateServiceClasses() {
    Map<String, Message> messageTypes = Parser.parseMessages(echoFileDescriptor);
    Map<String, ResourceName> resourceNames = Parser.parseResourceNames(echoFileDescriptor);
    Set<ResourceName> outputResourceNames = new HashSet<>();
    List<Service> services =
        Parser.parseService(echoFileDescriptor, messageTypes, resourceNames, outputResourceNames);

    String jsonFilename = "showcase_grpc_service_config.json";
    Path jsonPath = Paths.get(JSON_DIRECTORY, jsonFilename);
    Optional<GapicServiceConfig> configOpt = ServiceConfigParser.parse(jsonPath.toString());
    assertTrue(configOpt.isPresent());
    GapicServiceConfig config = configOpt.get();

    Service echoProtoService = services.get(0);
    GapicClass clazz =
        ServiceStubSettingsClassComposer.instance()
            .generate(echoProtoService, config, messageTypes);

    JavaWriterVisitor visitor = new JavaWriterVisitor();
    clazz.classDefinition().accept(visitor);
    assertEquals(EXPECTED_CLASS_STRING, visitor.write());
  }

  // TODO(miraleung): Update this when a file-diffing test mechanism is in place.
  private static final String EXPECTED_CLASS_STRING =
      "package com.google.showcase.v1beta1.stub;\n"
          + "\n"
          + "import static com.google.showcase.v1beta1.EchoClient.PagedExpandPagedResponse;\n"
          + "\n"
          + "import com.google.api.core.ApiFuture;\n"
          + "import com.google.api.core.BetaApi;\n"
          + "import com.google.api.gax.core.GaxProperties;\n"
          + "import com.google.api.gax.core.GoogleCredentialsProvider;\n"
          + "import com.google.api.gax.core.InstantiatingExecutorProvider;\n"
          + "import com.google.api.gax.grpc.GaxGrpcProperties;\n"
          + "import com.google.api.gax.grpc.GrpcTransportChannel;\n"
          + "import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;\n"
          + "import com.google.api.gax.grpc.ProtoOperationTransformers;\n"
          + "import com.google.api.gax.longrunning.OperationSnapshot;\n"
          + "import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;\n"
          + "import com.google.api.gax.retrying.RetrySettings;\n"
          + "import com.google.api.gax.rpc.ApiCallContext;\n"
          + "import com.google.api.gax.rpc.ApiClientHeaderProvider;\n"
          + "import com.google.api.gax.rpc.ClientContext;\n"
          + "import com.google.api.gax.rpc.OperationCallSettings;\n"
          + "import com.google.api.gax.rpc.PageContext;\n"
          + "import com.google.api.gax.rpc.PagedCallSettings;\n"
          + "import com.google.api.gax.rpc.PagedListDescriptor;\n"
          + "import com.google.api.gax.rpc.PagedListResponseFactory;\n"
          + "import com.google.api.gax.rpc.ServerStreamingCallSettings;\n"
          + "import com.google.api.gax.rpc.StatusCode;\n"
          + "import com.google.api.gax.rpc.StreamingCallSettings;\n"
          + "import com.google.api.gax.rpc.StubSettings;\n"
          + "import com.google.api.gax.rpc.TransportChannelProvider;\n"
          + "import com.google.api.gax.rpc.UnaryCallSettings;\n"
          + "import com.google.api.gax.rpc.UnaryCallable;\n"
          + "import com.google.common.collect.ImmutableList;\n"
          + "import com.google.common.collect.ImmutableMap;\n"
          + "import com.google.common.collect.ImmutableSet;\n"
          + "import com.google.common.collect.Lists;\n"
          + "import com.google.longrunning.Operation;\n"
          + "import com.google.showcase.v1beta1.BlockRequest;\n"
          + "import com.google.showcase.v1beta1.BlockResponse;\n"
          + "import com.google.showcase.v1beta1.EchoRequest;\n"
          + "import com.google.showcase.v1beta1.EchoResponse;\n"
          + "import com.google.showcase.v1beta1.ExpandRequest;\n"
          + "import com.google.showcase.v1beta1.PagedExpandRequest;\n"
          + "import com.google.showcase.v1beta1.PagedExpandResponse;\n"
          + "import com.google.showcase.v1beta1.WaitMetadata;\n"
          + "import com.google.showcase.v1beta1.WaitRequest;\n"
          + "import com.google.showcase.v1beta1.WaitResponse;\n"
          + "import java.io.IOException;\n"
          + "import java.util.List;\n"
          + "import java.util.Objects;\n"
          + "import javax.annotation.Generated;\n"
          + "import org.threeten.bp.Duration;\n"
          + "\n"
          + "@BetaApi\n"
          + "@Generated(\"by gapic-generator-java\")\n"
          + "public class EchoStubSettings extends StubSettings<EchoStubSettings> {\n"
          + "  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =\n"
          + "     "
          + " ImmutableList.<String>builder().add(\"https://www.googleapis.com/auth/cloud-platform\").build();\n"
          + "  private final UnaryCallSettings<EchoRequest, EchoResponse> echoSettings;\n"
          + "  private final ServerStreamingCallSettings<ExpandRequest, EchoResponse>"
          + " expandSettings;\n"
          + "  private final StreamingCallSettings<EchoRequest, EchoResponse> collectSettings;\n"
          + "  private final StreamingCallSettings<EchoRequest, EchoResponse> chatSettings;\n"
          + "  private final StreamingCallSettings<EchoRequest, EchoResponse> chatAgainSettings;\n"
          + "  private final PagedCallSettings<PagedExpandRequest, PagedExpandResponse,"
          + " PagedExpandPagedResponse>\n"
          + "      pagedExpandSettings;\n"
          + "  private final UnaryCallSettings<WaitRequest, Operation> waitSettings;\n"
          + "  private final OperationCallSettings<WaitRequest, WaitResponse, WaitMetadata>\n"
          + "      waitOperationSettings;\n"
          + "  private final UnaryCallSettings<BlockRequest, BlockResponse> blockSettings;\n"
          + "  private static final PagedListDescriptor<PagedExpandRequest, PagedExpandResponse,"
          + " EchoResponse>\n"
          + "      PAGED_EXPAND_PAGE_STR_DESC =\n"
          + "          new PagedListDescriptor<PagedExpandRequest, PagedExpandResponse,"
          + " EchoResponse>() {\n"
          + "            @Override\n"
          + "            public String emptyToken() {\n"
          + "              return \"\";\n"
          + "            }\n"
          + "\n"
          + "            @Override\n"
          + "            public PagedExpandRequest injectToken(PagedExpandRequest payload, String"
          + " token) {\n"
          + "              return"
          + " PagedExpandRequest.newBuilder(payload).setPageToken(token).build();\n"
          + "            }\n"
          + "\n"
          + "            @Override\n"
          + "            public PagedExpandRequest injectPageSize(PagedExpandRequest payload, int"
          + " pageSize) {\n"
          + "              return"
          + " PagedExpandRequest.newBuilder(payload).setPageSize(pageSize).build();\n"
          + "            }\n"
          + "\n"
          + "            @Override\n"
          + "            public Integer extractPageSize(PagedExpandRequest payload) {\n"
          + "              return payload.getPageSize();\n"
          + "            }\n"
          + "\n"
          + "            @Override\n"
          + "            public String extractNextToken(PagedExpandResponse payload) {\n"
          + "              return payload.getNextPageToken();\n"
          + "            }\n"
          + "\n"
          + "            @Override\n"
          + "            public Iterable<EchoResponse> extractResources(PagedExpandResponse"
          + " payload) {\n"
          + "              return Objects.equals(payload.getResponsesList(), null)\n"
          + "                  ? ImmutableList.<EchoResponse>of()\n"
          + "                  : payload.getResponsesList();\n"
          + "            }\n"
          + "          };\n"
          + "  private static final PagedListResponseFactory<\n"
          + "          PagedExpandRequest, PagedExpandResponse, PagedExpandPagedResponse>\n"
          + "      PAGED_EXPAND_PAGE_STR_FACT =\n"
          + "          new PagedListResponseFactory<\n"
          + "              PagedExpandRequest, PagedExpandResponse, PagedExpandPagedResponse>()"
          + " {\n"
          + "            @Override\n"
          + "            public ApiFuture<PagedExpandPagedResponse> getFuturePagedResponse(\n"
          + "                UnaryCallable<PagedExpandRequest, PagedExpandResponse> callable,\n"
          + "                PagedExpandRequest request,\n"
          + "                ApiCallContext context,\n"
          + "                ApiFuture<PagedExpandResponse> futureResponse) {\n"
          + "              PageContext<PagedExpandRequest, PagedExpandResponse, EchoResponse>"
          + " pageContext =\n"
          + "                  PageContext.create(callable, PAGED_EXPAND_PAGE_STR_DESC, request,"
          + " context);\n"
          + "              return PagedExpandPagedResponse.createAsync(pageContext,"
          + " futureResponse);\n"
          + "            }\n"
          + "          };\n"
          + "\n"
          + "  public UnaryCallSettings<EchoRequest, EchoResponse> echoSettings() {\n"
          + "    return echoSettings;\n"
          + "  }\n"
          + "\n"
          + "  public ServerStreamingCallSettings<ExpandRequest, EchoResponse> expandSettings()"
          + " {\n"
          + "    return expandSettings;\n"
          + "  }\n"
          + "\n"
          + "  public StreamingCallSettings<EchoRequest, EchoResponse> collectSettings() {\n"
          + "    return collectSettings;\n"
          + "  }\n"
          + "\n"
          + "  public StreamingCallSettings<EchoRequest, EchoResponse> chatSettings() {\n"
          + "    return chatSettings;\n"
          + "  }\n"
          + "\n"
          + "  public StreamingCallSettings<EchoRequest, EchoResponse> chatAgainSettings() {\n"
          + "    return chatAgainSettings;\n"
          + "  }\n"
          + "\n"
          + "  public PagedCallSettings<PagedExpandRequest, PagedExpandResponse,"
          + " PagedExpandPagedResponse>\n"
          + "      pagedExpandSettings() {\n"
          + "    return pagedExpandSettings;\n"
          + "  }\n"
          + "\n"
          + "  public UnaryCallSettings<WaitRequest, Operation> waitSettings() {\n"
          + "    return waitSettings;\n"
          + "  }\n"
          + "\n"
          + "  public OperationCallSettings<WaitRequest, WaitResponse, WaitMetadata>"
          + " waitOperationSettings() {\n"
          + "    return waitOperationSettings;\n"
          + "  }\n"
          + "\n"
          + "  public UnaryCallSettings<BlockRequest, BlockResponse> blockSettings() {\n"
          + "    return blockSettings;\n"
          + "  }\n"
          + "\n"
          + "  @BetaApi(\"A restructuring of stub classes is planned, so this may break in the"
          + " future\")\n"
          + "  public EchoStub createStub() throws IOException {\n"
          + "    if (getTransportChannelProvider()\n"
          + "        .getTransportName()\n"
          + "        .equals(GrpcTransportChannel.getGrpcTransportName())) {\n"
          + "      return GrpcEchoStub.create(this);\n"
          + "    }\n"
          + "    throw new UnsupportedOperationException(\n"
          + "        String.format(\n"
          + "            \"Transport not supported: %s\","
          + " getTransportChannelProvider().getTransportName()));\n"
          + "  }\n"
          + "\n"
          + "  public static InstantiatingExecutorProvider.Builder"
          + " defaultExecutorProviderBuilder() {\n"
          + "    return InstantiatingExecutorProvider.newBuilder();\n"
          + "  }\n"
          + "\n"
          + "  public static String getDefaultEndpoint() {\n"
          + "    return \"localhost:7469\";\n"
          + "  }\n"
          + "\n"
          + "  public static List<String> getDefaultServiceScopes() {\n"
          + "    return DEFAULT_SERVICE_SCOPES;\n"
          + "  }\n"
          + "\n"
          + "  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder()"
          + " {\n"
          + "    return"
          + " GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);\n"
          + "  }\n"
          + "\n"
          + "  public static InstantiatingGrpcChannelProvider.Builder"
          + " defaultGrpcTransportProviderBuilder() {\n"
          + "    return InstantiatingGrpcChannelProvider.newBuilder()\n"
          + "        .setMaxInboundMessageSize(Integer.MAX_VALUE);\n"
          + "  }\n"
          + "\n"
          + "  public static TransportChannelProvider defaultTransportChannelProvider() {\n"
          + "    return defaultGrpcTransportProviderBuilder().build();\n"
          + "  }\n"
          + "\n"
          + "  @BetaApi(\"The surface for customizing headers is not stable yet and may change in"
          + " the future.\")\n"
          + "  public static ApiClientHeaderProvider.Builder"
          + " defaultApiClientHeaderProviderBuilder() {\n"
          + "    return ApiClientHeaderProvider.newBuilder()\n"
          + "        .setGeneratedLibToken(\"gapic\","
          + " GaxProperties.getLibraryVersion(EchoStubSettings.class))\n"
          + "        .setTransportToken(\n"
          + "            GaxGrpcProperties.getGrpcTokenName(),"
          + " GaxGrpcProperties.getGrpcVersion());\n"
          + "  }\n"
          + "\n"
          + "  public static Builder newBuilder() {\n"
          + "    return Builder.createDefault();\n"
          + "  }\n"
          + "\n"
          + "  public static Builder newBuilder(ClientContext clientContext) {\n"
          + "    return new Builder(clientContext);\n"
          + "  }\n"
          + "\n"
          + "  public Builder toBuilder() {\n"
          + "    return new Builder(this);\n"
          + "  }\n"
          + "\n"
          + "  protected EchoStubSettings(Builder settingsBuilder) throws IOException {\n"
          + "    super(settingsBuilder);\n"
          + "    echoSettings = settingsBuilder.echoSettings().build();\n"
          + "    expandSettings = settingsBuilder.expandSettings().build();\n"
          + "    collectSettings = settingsBuilder.collectSettings().build();\n"
          + "    chatSettings = settingsBuilder.chatSettings().build();\n"
          + "    chatAgainSettings = settingsBuilder.chatAgainSettings().build();\n"
          + "    pagedExpandSettings = settingsBuilder.pagedExpandSettings().build();\n"
          + "    waitSettings = settingsBuilder.waitSettings().build();\n"
          + "    waitOperationSettings = settingsBuilder.waitOperationSettings().build();\n"
          + "    blockSettings = settingsBuilder.blockSettings().build();\n"
          + "  }\n"
          + "\n"
          + "  public static class Builder extends StubSettings.Builder<EchoStub, Builder> {\n"
          + "    private final ImmutableList<UnaryCallSettings.Builder<?, ?>>"
          + " unaryMethodSettingsBuilders;\n"
          + "    private final UnaryCallSettings.Builder<EchoRequest, EchoResponse>"
          + " echoSettings;\n"
          + "    private final ServerStreamingCallSettings.Builder<ExpandRequest, EchoResponse>"
          + " expandSettings;\n"
          + "    private final StreamingCallSettings.Builder<EchoRequest, EchoResponse>"
          + " collectSettings;\n"
          + "    private final StreamingCallSettings.Builder<EchoRequest, EchoResponse>"
          + " chatSettings;\n"
          + "    private final StreamingCallSettings.Builder<EchoRequest, EchoResponse>"
          + " chatAgainSettings;\n"
          + "    private final PagedCallSettings.Builder<\n"
          + "            PagedExpandRequest, PagedExpandResponse, PagedExpandPagedResponse>\n"
          + "        pagedExpandSettings;\n"
          + "    private final UnaryCallSettings.Builder<WaitRequest, Operation> waitSettings;\n"
          + "    private final OperationCallSettings.Builder<WaitRequest, WaitResponse,"
          + " WaitMetadata>\n"
          + "        waitOperationSettings;\n"
          + "    private final UnaryCallSettings.Builder<BlockRequest, BlockResponse>"
          + " blockSettings;\n"
          + "    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>\n"
          + "        RETRYABLE_CODE_DEFINITIONS;\n"
          + "\n"
          + "    static {\n"
          + "      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =\n"
          + "          ImmutableMap.builder();\n"
          + "      definitions.put(\n"
          + "          \"retry_policy_1_codes\",\n"
          + "          ImmutableSet.copyOf(\n"
          + "              Lists.<StatusCode.Code>newArrayList(\n"
          + "                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.UNKNOWN)));\n"
          + "      definitions.put(\n"
          + "          \"no_retry_0_codes\","
          + " ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));\n"
          + "      RETRYABLE_CODE_DEFINITIONS = definitions.build();\n"
          + "    }\n"
          + "\n"
          + "    private static final ImmutableMap<String, RetrySettings>"
          + " RETRY_PARAM_DEFINITIONS;\n"
          + "\n"
          + "    static {\n"
          + "      ImmutableMap.Builder<String, RetrySettings> definitions ="
          + " ImmutableMap.builder();\n"
          + "      RetrySettings settings = null;\n"
          + "      settings =\n"
          + "          RetrySettings.newBuilder()\n"
          + "              .setInitialRetryDelay(Duration.ofMillis(100L))\n"
          + "              .setRetryDelayMultiplier(2.0)\n"
          + "              .setMaxRetryDelay(Duration.ofMillis(3000L))\n"
          + "              .setInitialRpcTimeout(Duration.ofMillis(10000L))\n"
          + "              .setRpcTimeoutMultiplier(1.0)\n"
          + "              .setMaxRpcTimeout(Duration.ofMillis(10000L))\n"
          + "              .setTotalTimeout(Duration.ofMillis(10000L))\n"
          + "              .build();\n"
          + "      definitions.put(\"retry_policy_1_params\", settings);\n"
          + "      settings =\n"
          + "          RetrySettings.newBuilder()\n"
          + "              .setInitialRpcTimeout(Duration.ofMillis(5000L))\n"
          + "              .setRpcTimeoutMultiplier(1.0)\n"
          + "              .setMaxRpcTimeout(Duration.ofMillis(5000L))\n"
          + "              .setTotalTimeout(Duration.ofMillis(5000L))\n"
          + "              .build();\n"
          + "      definitions.put(\"no_retry_0_params\", settings);\n"
          + "      RETRY_PARAM_DEFINITIONS = definitions.build();\n"
          + "    }\n"
          + "\n"
          + "    protected Builder() {\n"
          + "      this(((ClientContext) null));\n"
          + "    }\n"
          + "\n"
          + "    protected Builder(ClientContext clientContext) {\n"
          + "      super(clientContext);\n"
          + "      echoSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();\n"
          + "      expandSettings = ServerStreamingCallSettings.newBuilder();\n"
          + "      collectSettings = StreamingCallSettings.newBuilder();\n"
          + "      chatSettings = StreamingCallSettings.newBuilder();\n"
          + "      chatAgainSettings = StreamingCallSettings.newBuilder();\n"
          + "      pagedExpandSettings ="
          + " PagedCallSettings.newBuilder(PAGED_EXPAND_PAGE_STR_FACT);\n"
          + "      waitSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();\n"
          + "      waitOperationSettings = OperationCallSettings.newBuilder();\n"
          + "      blockSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();\n"
          + "      unaryMethodSettingsBuilders =\n"
          + "          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(\n"
          + "              echoSettings, pagedExpandSettings, waitSettings, blockSettings);\n"
          + "      initDefaults(this);\n"
          + "    }\n"
          + "\n"
          + "    private static Builder initDefaults(Builder builder) {\n"
          + "      builder\n"
          + "          .echoSettings()\n"
          + "         "
          + " .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get(\"retry_policy_1_codes\"))\n"
          + "         "
          + " .setRetrySettings(RETRY_PARAM_DEFINITIONS.get(\"retry_policy_1_params\"));\n"
          + "      builder\n"
          + "          .expandSettings()\n"
          + "         "
          + " .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get(\"retry_policy_1_codes\"))\n"
          + "         "
          + " .setRetrySettings(RETRY_PARAM_DEFINITIONS.get(\"retry_policy_1_params\"));\n"
          + "      builder\n"
          + "          .pagedExpandSettings()\n"
          + "         "
          + " .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get(\"retry_policy_1_codes\"))\n"
          + "         "
          + " .setRetrySettings(RETRY_PARAM_DEFINITIONS.get(\"retry_policy_1_params\"));\n"
          + "      builder\n"
          + "          .waitSettings()\n"
          + "          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get(\"no_retry_0_codes\"))\n"
          + "          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get(\"no_retry_0_params\"));\n"
          + "      builder\n"
          + "          .blockSettings()\n"
          + "          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get(\"no_retry_0_codes\"))\n"
          + "          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get(\"no_retry_0_params\"));\n"
          + "      builder\n"
          + "          .waitOperationSettings()\n"
          + "          .setInitialCallSettings(\n"
          + "              UnaryCallSettings.<WaitRequest,"
          + " OperationSnapshot>newUnaryCallSettingsBuilder()\n"
          + "                 "
          + " .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get(\"no_retry_0_codes\"))\n"
          + "                 "
          + " .setRetrySettings(RETRY_PARAM_DEFINITIONS.get(\"no_retry_0_params\"))\n"
          + "                  .build())\n"
          + "          .setResponseTransformer(\n"
          + "             "
          + " ProtoOperationTransformers.ResponseTransformer.create(WaitResponse.class))\n"
          + "          .setMetadataTransformer(\n"
          + "             "
          + " ProtoOperationTransformers.MetadataTransformer.create(WaitMetadata.class))\n"
          + "          .setPollingAlgorithm(\n"
          + "              OperationTimedPollAlgorithm.create(\n"
          + "                  RetrySettings.newBuilder()\n"
          + "                      .setInitialRetryDelay(Duration.ofMillis(500L))\n"
          + "                      .setRetryDelayMultiplier(1.5)\n"
          + "                      .setMaxRetryDelay(Duration.ofMillis(5000L))\n"
          + "                      .setInitialRpcTimeout(Duration.ZERO)\n"
          + "                      .setRpcTimeoutMultiplier(1.0)\n"
          + "                      .setMaxRpcTimeout(Duration.ZERO)\n"
          + "                      .setTotalTimeout(Duration.ofMillis(300000L))\n"
          + "                      .build()));\n"
          + "      return builder;\n"
          + "    }\n"
          + "  }\n"
          + "}\n";
}
