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

package com.google.api.generator.gapic.composer.samplecode;

import com.google.api.generator.engine.ast.*;
import com.google.api.generator.gapic.utils.JavaStyle;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExecutableSampleComposer {
  public static Optional<String> createExecutableSample(
      Optional<ExecutableSample> executableSample) {
    if (executableSample.isPresent()) {
      return Optional.of(createExecutableSample(executableSample.get()));
    }
    return Optional.empty();
  }

  public static String createExecutableSample(ExecutableSample executableSample) {
    String sampleMethodName = JavaStyle.toLowerCamelCase(executableSample.getSampleName());
    return SampleCodeWriter.write(
        composeExecutableSample(
            sampleMethodName,
            executableSample.getSampleVariableAssignments(),
            executableSample.getSampleBody()));
  }

  static ClassDefinition composeExecutableSample(
      String sampleMethodName,
      List<AssignmentExpr> sampleVariableAssignments,
      List<Statement> sampleBody) {
    String sampleClassName = JavaStyle.toUpperCamelCase(sampleMethodName);
    List<VariableExpr> sampleMethodArgs = composeSampleMethodArgs(sampleVariableAssignments);
    MethodDefinition mainMethod =
        composeMainMethod(
            composeMainBody(
                sampleVariableAssignments,
                composeInvokeMethodStatement(sampleMethodName, sampleMethodArgs)));
    MethodDefinition sampleMethod =
        composeSampleMethod(sampleMethodName, sampleMethodArgs, sampleBody);
    return composeSampleClass(sampleClassName, mainMethod, sampleMethod);
  }

  static List<VariableExpr> composeSampleMethodArgs(
      List<AssignmentExpr> sampleVariableAssignments) {
    return sampleVariableAssignments.stream()
        .map(v -> v.variableExpr().toBuilder().setIsDecl(true).build())
        .collect(Collectors.toList());
  }

  static Statement composeInvokeMethodStatement(
      String sampleMethodName, List<VariableExpr> sampleMethodArgs) {
    List<Expr> invokeArgs =
        sampleMethodArgs.stream()
            .map(arg -> arg.toBuilder().setIsDecl(false).build())
            .collect(Collectors.toList());
    return ExprStatement.withExpr(
        MethodInvocationExpr.builder()
            .setMethodName(sampleMethodName)
            .setArguments(invokeArgs)
            .build());
  }

  static List<Statement> composeMainBody(
      List<AssignmentExpr> sampleVariableAssignments, Statement invokeMethod) {
    List<ExprStatement> setVariables =
        sampleVariableAssignments.stream()
            .map(var -> ExprStatement.withExpr(var))
            .collect(Collectors.toList());
    List<Statement> body = new ArrayList<>(setVariables);
    body.add(invokeMethod);
    return body;
  }

  static ClassDefinition composeSampleClass(
      String sampleClassName, MethodDefinition mainMethod, MethodDefinition sampleMethod) {
    return ClassDefinition.builder()
        .setScope(ScopeNode.PUBLIC)
        .setPackageString("com.google.example")
        .setName(sampleClassName)
        .setMethods(ImmutableList.of(mainMethod, sampleMethod))
        .build();
  }

  static MethodDefinition composeMainMethod(List<Statement> mainBody) {
    return MethodDefinition.builder()
        .setScope(ScopeNode.PUBLIC)
        .setIsStatic(true)
        .setReturnType(TypeNode.VOID)
        .setName("main")
        .setArguments(
            VariableExpr.builder()
                .setVariable(
                    Variable.builder().setType(TypeNode.STRING_ARRAY).setName("args").build())
                .setIsDecl(true)
                .build())
        .setThrowsExceptions(Arrays.asList(TypeNode.withExceptionClazz(Exception.class)))
        .setBody(mainBody)
        .build();
  }

  static MethodDefinition composeSampleMethod(
      String sampleMethodName,
      List<VariableExpr> sampleMethodArgs,
      List<Statement> sampleMethodBody) {
    return MethodDefinition.builder()
        .setScope(ScopeNode.PUBLIC)
        .setIsStatic(true)
        .setReturnType(TypeNode.VOID)
        .setName(sampleMethodName)
        .setArguments(sampleMethodArgs)
        .setThrowsExceptions(Arrays.asList(TypeNode.withExceptionClazz(Exception.class)))
        .setBody(sampleMethodBody)
        .build();
  }
}
