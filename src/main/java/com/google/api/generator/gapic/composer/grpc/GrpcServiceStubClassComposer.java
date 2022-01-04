// Copyright 2021 Google LLC
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

package com.google.api.generator.gapic.composer.grpc;

import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.generator.engine.ast.AssignmentExpr;
import com.google.api.generator.engine.ast.ConcreteReference;
import com.google.api.generator.engine.ast.EnumRefExpr;
import com.google.api.generator.engine.ast.Expr;
import com.google.api.generator.engine.ast.ExprStatement;
import com.google.api.generator.engine.ast.IfStatement;
import com.google.api.generator.engine.ast.LambdaExpr;
import com.google.api.generator.engine.ast.MethodDefinition;
import com.google.api.generator.engine.ast.MethodInvocationExpr;
import com.google.api.generator.engine.ast.RelationalOperationExpr;
import com.google.api.generator.engine.ast.ScopeNode;
import com.google.api.generator.engine.ast.Statement;
import com.google.api.generator.engine.ast.StringObjectValue;
import com.google.api.generator.engine.ast.TypeNode;
import com.google.api.generator.engine.ast.ValueExpr;
import com.google.api.generator.engine.ast.Variable;
import com.google.api.generator.engine.ast.VariableExpr;
import com.google.api.generator.gapic.composer.common.AbstractTransportServiceStubClassComposer;
import com.google.api.generator.gapic.composer.store.TypeStore;
import com.google.api.generator.gapic.model.GapicContext;
import com.google.api.generator.gapic.model.HttpBindings.HttpBinding;
import com.google.api.generator.gapic.model.Message;
import com.google.api.generator.gapic.model.Method;
import com.google.api.generator.gapic.model.RoutingHeaders.RoutingHeader;
import com.google.api.generator.gapic.model.Service;
import com.google.api.generator.gapic.utils.JavaStyle;
import com.google.api.pathtemplate.PathTemplate;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GrpcServiceStubClassComposer extends AbstractTransportServiceStubClassComposer {

  private static final GrpcServiceStubClassComposer INSTANCE = new GrpcServiceStubClassComposer();

  // Legacy support for the original reroute_to_grpc_interface option in gapic.yaml. These two APIs
  // predate the modern way, which is to add the RPCs directly into the proto.
  private static final Set<String> REROUTE_TO_GRPC_INTERFACE_SERVICE_ALLOWLIST =
      new HashSet<>(Arrays.asList("google.pubsub.v1"));
  private static final Set<String> REROUTE_TO_GRPC_INTERFACE_IAM_METHOD_ALLOWLIST =
      new HashSet<>(Arrays.asList("SetIamPolicy", "GetIamPolicy", "TestIamPermissions"));

  private static final TypeStore FIXED_GRPC_TYPE_STORE = createStaticTypes();

  protected GrpcServiceStubClassComposer() {
    super(GrpcContext.instance());
  }

  public static GrpcServiceStubClassComposer instance() {
    return INSTANCE;
  }

  private static TypeStore createStaticTypes() {
    List<Class<?>> concreteClazzes =
        Arrays.asList(
            GrpcCallSettings.class,
            GrpcOperationsStub.class,
            GrpcStubCallableFactory.class,
            MethodDescriptor.class,
            ProtoUtils.class);
    return new TypeStore(concreteClazzes);
  }

  @Override
  protected Statement createMethodDescriptorVariableDecl(
      Service service,
      Method protoMethod,
      VariableExpr methodDescriptorVarExpr,
      Map<String, Message> messageTypes) {
    MethodInvocationExpr methodDescriptorMaker =
        MethodInvocationExpr.builder()
            .setMethodName("newBuilder")
            .setStaticReferenceType(FIXED_GRPC_TYPE_STORE.get("MethodDescriptor"))
            .setGenerics(methodDescriptorVarExpr.variable().type().reference().generics())
            .build();

    BiFunction<String, Expr, Function<MethodInvocationExpr, MethodInvocationExpr>> methodMakerFn =
        (mName, argExpr) ->
            m ->
                MethodInvocationExpr.builder()
                    .setMethodName(mName)
                    .setArguments(Arrays.asList(argExpr))
                    .setExprReferenceExpr(m)
                    .build();

    methodDescriptorMaker =
        methodMakerFn
            .apply("setType", getMethodDescriptorMethodTypeExpr(protoMethod))
            .apply(methodDescriptorMaker);

    String codeMethodNameArg = getProtoRpcFullMethodName(service, protoMethod);
    methodDescriptorMaker =
        methodMakerFn
            .apply(
                "setFullMethodName",
                ValueExpr.withValue(StringObjectValue.withValue(codeMethodNameArg)))
            .apply(methodDescriptorMaker);

    Function<MethodInvocationExpr, MethodInvocationExpr> protoUtilsMarshallerFn =
        m ->
            MethodInvocationExpr.builder()
                .setStaticReferenceType(FIXED_GRPC_TYPE_STORE.get("ProtoUtils"))
                .setMethodName("marshaller")
                .setArguments(Arrays.asList(m))
                .build();
    MethodInvocationExpr methodInvocationArg =
        MethodInvocationExpr.builder()
            .setMethodName("getDefaultInstance")
            .setStaticReferenceType(protoMethod.inputType())
            .build();

    methodDescriptorMaker =
        methodMakerFn
            .apply("setRequestMarshaller", protoUtilsMarshallerFn.apply(methodInvocationArg))
            .apply(methodDescriptorMaker);

    methodInvocationArg =
        MethodInvocationExpr.builder()
            .setMethodName("getDefaultInstance")
            .setStaticReferenceType(protoMethod.outputType())
            .build();
    methodDescriptorMaker =
        methodMakerFn
            .apply("setResponseMarshaller", protoUtilsMarshallerFn.apply(methodInvocationArg))
            .apply(methodDescriptorMaker);

    methodDescriptorMaker =
        MethodInvocationExpr.builder()
            .setMethodName("build")
            .setExprReferenceExpr(methodDescriptorMaker)
            .setReturnType(methodDescriptorVarExpr.type())
            .build();

    return ExprStatement.withExpr(
        AssignmentExpr.builder()
            .setVariableExpr(
                methodDescriptorVarExpr
                    .toBuilder()
                    .setIsDecl(true)
                    .setScope(ScopeNode.PRIVATE)
                    .setIsStatic(true)
                    .setIsFinal(true)
                    .build())
            .setValueExpr(methodDescriptorMaker)
            .build());
  }

  protected EnumRefExpr getMethodDescriptorMethodTypeExpr(Method protoMethod) {
    String enumName = "";
    switch (protoMethod.stream()) {
      case CLIENT:
        enumName = "CLIENT_STREAMING";
        break;
      case SERVER:
        enumName = "SERVER_STREAMING";
        break;
      case BIDI:
        enumName = "BIDI_STREAMING";
        break;
      case NONE:
        // Fall through.
      default:
        enumName = "UNARY";
    }
    return EnumRefExpr.builder()
        .setName(enumName)
        .setType(
            TypeNode.withReference(
                ConcreteReference.builder().setClazz(MethodDescriptor.MethodType.class).build()))
        .build();
  }

  @Override
  protected Expr createTransportSettingsInitExpr(
      Method method, VariableExpr transportSettingsVarExpr, VariableExpr methodDescriptorVarExpr) {
    MethodInvocationExpr callSettingsBuilderExpr =
        MethodInvocationExpr.builder()
            .setStaticReferenceType(getTransportContext().transportCallSettingsType())
            .setGenerics(transportSettingsVarExpr.type().reference().generics())
            .setMethodName("newBuilder")
            .build();
    callSettingsBuilderExpr =
        MethodInvocationExpr.builder()
            .setExprReferenceExpr(callSettingsBuilderExpr)
            .setMethodName("setMethodDescriptor")
            .setArguments(Arrays.asList(methodDescriptorVarExpr))
            .build();

    if (method.hasHttpBindings()) {
      callSettingsBuilderExpr =
          MethodInvocationExpr.builder()
              .setExprReferenceExpr(callSettingsBuilderExpr)
              .setMethodName("setParamsExtractor")
              .setArguments(createRequestParamsExtractorClassInstance(method))
              .build();
    }

    callSettingsBuilderExpr =
        MethodInvocationExpr.builder()
            .setExprReferenceExpr(callSettingsBuilderExpr)
            .setMethodName("build")
            .setReturnType(transportSettingsVarExpr.type())
            .build();
    return AssignmentExpr.builder()
        .setVariableExpr(transportSettingsVarExpr.toBuilder().setIsDecl(true).build())
        .setValueExpr(callSettingsBuilderExpr)
        .build();
  }

  @Override
  protected List<MethodDefinition> createClassMethods(
      GapicContext context,
      Service service,
      TypeStore typeStore,
      Map<String, VariableExpr> classMemberVarExprs,
      Map<String, VariableExpr> callableClassMemberVarExprs,
      Map<String, VariableExpr> protoMethodNameToDescriptorVarExprs) {
    List<MethodDefinition> classMethods =
        super.createClassMethods(
            context,
            service,
            typeStore,
            classMemberVarExprs,
            callableClassMemberVarExprs,
            protoMethodNameToDescriptorVarExprs);
    // TODO: need a way to check do we need to create this method or not, or make it an inner method
    classMethods.add(createAddParamsMethod());
    return classMethods;
  }

  private MethodDefinition createAddParamsMethod() {
    TypeNode paramsVarType =
        TypeNode.withReference(
            ConcreteReference.builder()
                .setClazz(ImmutableMap.Builder.class)
                .setGenerics(TypeNode.STRING.reference(), TypeNode.STRING.reference())
                .build());
    VariableExpr paramsVarExpr =
        VariableExpr.builder()
            .setVariable(Variable.builder().setName("params").setType(paramsVarType).build())
            .setIsDecl(true)
            .build();
    VariableExpr fieldValueExpr =
        VariableExpr.builder()
            .setVariable(Variable.builder().setName("fieldValue").setType(TypeNode.STRING).build())
            .setIsDecl(true)
            .build();
    VariableExpr keyExpr =
        VariableExpr.builder()
            .setVariable(Variable.builder().setName("headerKey").setType(TypeNode.STRING).build())
            .setIsDecl(true)
            .build();
    VariableExpr patternExpr =
        VariableExpr.builder()
            .setVariable(Variable.builder().setName("pattern").setType(TypeNode.STRING).build())
            .setIsDecl(true)
            .build();
    List<Statement> methodBody = new ArrayList<>();
    TypeNode pathTemplateType =
        TypeNode.withReference(ConcreteReference.builder().setClazz(PathTemplate.class).build());
    VariableExpr pathTemplateVar =
        VariableExpr.builder()
            .setVariable(
                Variable.builder().setName("pathTemplate").setType(pathTemplateType).build())
            .setIsDecl(true)
            .build();
    VariableExpr patternExprNonDecl =
        VariableExpr.builder()
            .setVariable(Variable.builder().setName("pattern").setType(TypeNode.STRING).build())
            .build();
    Expr pathTemplateExpr =
        AssignmentExpr.builder()
            .setVariableExpr(pathTemplateVar)
            .setValueExpr(
                MethodInvocationExpr.builder()
                    .setStaticReferenceType(pathTemplateType)
                    .setMethodName("create")
                    .setArguments(patternExprNonDecl)
                    .setReturnType(pathTemplateType)
                    .build())
            .build();
    ExprStatement exprStatement1 = ExprStatement.withExpr(pathTemplateExpr);
    methodBody.add(exprStatement1);

    VariableExpr pathTemplateVarNonDecl =
        VariableExpr.builder()
            .setVariable(
                Variable.builder().setName("pathTemplate").setType(pathTemplateType).build())
            .build();
    TypeNode matchedValuesType =
        TypeNode.withReference(
            ConcreteReference.builder()
                .setClazz(Map.class)
                .setGenerics(TypeNode.STRING.reference(), TypeNode.STRING.reference())
                .build());
    VariableExpr matchedValuesVar =
        VariableExpr.builder()
            .setVariable(
                Variable.builder().setName("matchedValues").setType(matchedValuesType).build())
            .setIsDecl(true)
            .build();
    VariableExpr fieldValueExprNonDecl =
        VariableExpr.builder()
            .setVariable(Variable.builder().setName("fieldValue").setType(pathTemplateType).build())
            .build();
    Expr matchedValuesExpr =
        AssignmentExpr.builder()
            .setVariableExpr(matchedValuesVar)
            .setValueExpr(
                MethodInvocationExpr.builder()
                    .setExprReferenceExpr(pathTemplateVarNonDecl)
                    .setMethodName("match")
                    .setArguments(fieldValueExprNonDecl)
                    .setReturnType(matchedValuesType)
                    .build())
            .build();
    ExprStatement exprStatement2 = ExprStatement.withExpr(matchedValuesExpr);
    methodBody.add(exprStatement2);

    VariableExpr matchedValuesVarNonDecl =
        VariableExpr.builder()
            .setVariable(
                Variable.builder().setName("matchedValues").setType(matchedValuesType).build())
            .build();
    Expr checkMatchedValuesNull =
        RelationalOperationExpr.notEqualToWithExprs(
            matchedValuesVarNonDecl, ValueExpr.createNullExpr());
    VariableExpr paramsVarExprNonDecl =
        VariableExpr.builder()
            .setVariable(Variable.builder().setName("params").setType(paramsVarType).build())
            .build();
    VariableExpr keyExprNonDecl =
        VariableExpr.builder()
            .setVariable(Variable.builder().setName("headerKey").setType(TypeNode.STRING).build())
            .build();
    Expr getMatchedValueExpr =
        MethodInvocationExpr.builder()
            .setExprReferenceExpr(matchedValuesVarNonDecl)
            .setMethodName("get")
            .setArguments(keyExprNonDecl)
            .build();
    Expr putParamsExpr =
        MethodInvocationExpr.builder()
            .setExprReferenceExpr(paramsVarExprNonDecl)
            .setMethodName("put")
            .setArguments(keyExprNonDecl, getMatchedValueExpr)
            .build();
    ExprStatement putParamsStatement = ExprStatement.withExpr(putParamsExpr);
    IfStatement ifStatement =
        IfStatement.builder()
            .setConditionExpr(checkMatchedValuesNull)
            .setBody(ImmutableList.of(putParamsStatement))
            .build();
    methodBody.add(ifStatement);

    return MethodDefinition.builder()
        .setScope(ScopeNode.PROTECTED)
        .setReturnType(TypeNode.VOID)
        .setName("addParams")
        .setBody(methodBody)
        .setArguments(paramsVarExpr, fieldValueExpr, keyExpr, patternExpr)
        .build();
  }

  @Override
  protected String getProtoRpcFullMethodName(Service protoService, Method protoMethod) {
    if (protoMethod.isMixin()) {
      return String.format("%s/%s", protoMethod.mixedInApiName(), protoMethod.name());
    }

    if (!REROUTE_TO_GRPC_INTERFACE_SERVICE_ALLOWLIST.contains(protoService.protoPakkage())
        || !REROUTE_TO_GRPC_INTERFACE_IAM_METHOD_ALLOWLIST.contains(protoMethod.name())) {
      return String.format(
          "%s.%s/%s", protoService.protoPakkage(), protoService.name(), protoMethod.name());
    }
    // This is meant to be a temporary workaround until the allow-listed services come up with a
    // long-term solution.
    return String.format("google.iam.v1.IAMPolicy/%s", protoMethod.name());
  }

  private LambdaExpr createRequestParamsExtractorClassInstance(Method method) {
    Preconditions.checkState(
        method.hasHttpBindings(), String.format("Method %s has no HTTP binding", method.name()));

    TypeNode paramsVarType =
        TypeNode.withReference(
            ConcreteReference.builder()
                .setClazz(ImmutableMap.Builder.class)
                .setGenerics(TypeNode.STRING.reference(), TypeNode.STRING.reference())
                .build());
    VariableExpr paramsVarExpr =
        VariableExpr.withVariable(
            Variable.builder().setName("params").setType(paramsVarType).build());

    Expr paramsAssignExpr =
        AssignmentExpr.builder()
            .setVariableExpr(paramsVarExpr.toBuilder().setIsDecl(true).build())
            .setValueExpr(
                MethodInvocationExpr.builder()
                    .setStaticReferenceType(FIXED_TYPESTORE.get("ImmutableMap"))
                    .setMethodName("builder")
                    .setReturnType(paramsVarType)
                    .build())
            .build();
    List<Expr> bodyExprs = new ArrayList<>();
    bodyExprs.add(paramsAssignExpr);

    VariableExpr requestVarExpr =
        VariableExpr.withVariable(
            Variable.builder().setType(method.inputType()).setName("request").build());

    for (HttpBinding httpBindingFieldBinding : method.httpBindings().pathParameters()) {
      // Handle foo.bar cases by descending into the subfields.
      MethodInvocationExpr requestBuilderExpr =
          createRequestFieldGetterExpr(requestVarExpr, httpBindingFieldBinding.name());

      Expr valueOfExpr =
          MethodInvocationExpr.builder()
              .setStaticReferenceType(TypeNode.STRING)
              .setMethodName("valueOf")
              .setArguments(requestBuilderExpr)
              .build();

      // Comment out for now. TODO: completely remove this part if routing headers is not null?
      // Are these params used for anything else other than implicit dynamic routing?
      // Expr paramsPutExpr =
      //     MethodInvocationExpr.builder()
      //         .setExprReferenceExpr(paramsVarExpr)
      //         .setMethodName("put")
      //         .setArguments(
      //
      // ValueExpr.withValue(StringObjectValue.withValue(httpBindingFieldBinding.name())),
      //             valueOfExpr)
      //         .build();
      // bodyExprs.add(paramsPutExpr);
    }

    for (RoutingHeader routingHeader : method.routingHeaders().routingHeadersList()) {
      MethodInvocationExpr requestFieldGetterExpr =
          createRequestFieldGetterExpr(requestVarExpr, routingHeader.field());

      Expr routingHeaderKeyExpr =
          ValueExpr.withValue(StringObjectValue.withValue(routingHeader.name()));
      Expr routingHeaderPatternExpr =
          ValueExpr.withValue(StringObjectValue.withValue(routingHeader.pattern()));
      MethodInvocationExpr addParamsMethodExpr =
          MethodInvocationExpr.builder()
              .setMethodName("addParams")
              .setArguments(
                  paramsVarExpr,
                  requestFieldGetterExpr,
                  routingHeaderKeyExpr,
                  routingHeaderPatternExpr)
              .build();

      bodyExprs.add(addParamsMethodExpr);
    }

    TypeNode returnType =
        TypeNode.withReference(
            ConcreteReference.builder()
                .setClazz(Map.class)
                .setGenerics(TypeNode.STRING.reference(), TypeNode.STRING.reference())
                .build());
    Expr returnExpr =
        MethodInvocationExpr.builder()
            .setExprReferenceExpr(paramsVarExpr)
            .setMethodName("build")
            .setReturnType(returnType)
            .build();

    // Overrides extract().
    // https://github.com/googleapis/gax-java/blob/8d45d186e36ae97b789a6f89d80ae5213a773b65/gax/src/main/java/com/google/api/gax/rpc/RequestParamsExtractor.java#L55
    return LambdaExpr.builder()
        .setArguments(requestVarExpr.toBuilder().setIsDecl(true).build())
        .setBody(
            bodyExprs.stream().map(e -> ExprStatement.withExpr(e)).collect(Collectors.toList()))
        .setReturnExpr(returnExpr)
        .build();
  }

  private MethodInvocationExpr createRequestFieldGetterExpr(
      VariableExpr requestVarExpr, String fieldName) {
    MethodInvocationExpr.Builder requestFieldGetterExprBuilder =
        MethodInvocationExpr.builder().setExprReferenceExpr(requestVarExpr);
    String[] descendantFields = fieldName.split("\\.");
    for (int i = 0; i < descendantFields.length; i++) {
      String currFieldName = descendantFields[i];
      String bindingFieldMethodName =
          String.format("get%s", JavaStyle.toUpperCamelCase(currFieldName));
      requestFieldGetterExprBuilder =
          requestFieldGetterExprBuilder.setMethodName(bindingFieldMethodName);
      if (i < descendantFields.length - 1) {
        requestFieldGetterExprBuilder =
            MethodInvocationExpr.builder()
                .setExprReferenceExpr(requestFieldGetterExprBuilder.build());
      }
    }
    return requestFieldGetterExprBuilder.build();
  }
}
