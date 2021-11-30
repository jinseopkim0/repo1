package com.google.api.generator.gapic.composer.samplecode;

import com.google.api.generator.engine.ast.*;
import com.google.api.generator.gapic.utils.JavaStyle;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExecutableSampleComposer {
    // TODO: exceptions
    public static String createExecutableSample(ExecutableSample executableSample){
        return SampleCodeWriter.write(
                composeExecutableSample(executableSample.samplePackageName, executableSample.sampleMethodName,
                        executableSample.sampleVariableAssignments, executableSample.sampleBody));
    }

    public static Optional<String> createExecutableSample(Optional<ExecutableSample> executableSample){
        if (executableSample.isPresent()) {
            ExecutableSample sample = executableSample.get();
          return Optional.of(SampleCodeWriter.write(
              composeExecutableSample(
                      sample.samplePackageName,
                      sample.sampleMethodName,
                      sample.sampleVariableAssignments,
                      sample.sampleBody)));
        }
        return Optional.empty();
    }

    static ClassDefinition composeExecutableSample(String samplePackageName, String sampleMethodName,
                                                   List<AssignmentExpr> sampleVariableAssignments,
                                                   List<Statement> sampleBody){

        String sampleClassName = JavaStyle.toUpperCamelCase(sampleMethodName);
        List<VariableExpr> sampleMethodArgs = composeSampleMethodArgs(sampleVariableAssignments);
        MethodDefinition mainMethod = composeMainMethod(composeMainBody(
                sampleVariableAssignments, composeInvokeMethodStatement(sampleMethodName, sampleMethodArgs)));
        MethodDefinition sampleMethod = composeSampleMethod(sampleMethodName, sampleMethodArgs, sampleBody);
        return composeSampleClass(
                samplePackageName,
                sampleClassName,
                mainMethod,
                sampleMethod);
    }

    static List<VariableExpr> composeSampleMethodArgs(List<AssignmentExpr> sampleVariableAssignments){
        return sampleVariableAssignments.stream()
                .map(v -> v.variableExpr().toBuilder().setIsDecl(true).build())
                .collect(Collectors.toList());
    }

    static Statement composeInvokeMethodStatement(String sampleMethodName, List<VariableExpr> sampleMethodArgs){
        List<Expr> invokeArgs = sampleMethodArgs.stream()
                .map(arg -> arg.toBuilder().setIsDecl(false).build())
                .collect(Collectors.toList());
        return ExprStatement.withExpr(
                MethodInvocationExpr.builder().setMethodName(sampleMethodName).setArguments(invokeArgs).build());
    }

    static List<Statement> composeMainBody(List<AssignmentExpr> sampleVariableAssignments, Statement invokeMethod){
        List<ExprStatement> setVariables = sampleVariableAssignments.stream()
                .map(var -> ExprStatement.withExpr(var)).collect(Collectors.toList());
        List<Statement> body = new ArrayList<>(setVariables);
        body.add(invokeMethod);
        return body;
    }

    static ClassDefinition composeSampleClass(String samplePackageName, String sampleClassName,
                                              MethodDefinition mainMethod, MethodDefinition sampleMethod){
        return ClassDefinition.builder()
                .setScope(ScopeNode.PUBLIC)
                .setPackageString(samplePackageName)
                .setName(sampleClassName)
                .setMethods(ImmutableList.of(mainMethod, sampleMethod))
                .build();
    }

    static MethodDefinition composeMainMethod(List<Statement> mainBody){
        return MethodDefinition.builder()
                .setScope(ScopeNode.PUBLIC)
                .setIsStatic(true)
                .setReturnType(TypeNode.VOID)
                .setName("main")
                .setArguments(VariableExpr.builder()
                        .setVariable(Variable.builder().setType(TypeNode.STRING_ARRAY).setName("args").build())
                        .setIsDecl(true)
                        .build())
                .setBody(mainBody)
                .build();
    }

    static MethodDefinition composeSampleMethod(String sampleMethodName, List<VariableExpr> sampleMethodArgs,
                                         List<Statement> sampleMethodBody) {
        return MethodDefinition.builder()
                .setScope(ScopeNode.PUBLIC)
                .setIsStatic(true)
                .setReturnType(TypeNode.VOID)
                .setName(sampleMethodName)
                .setArguments(sampleMethodArgs)
                .setBody(sampleMethodBody)
                .build();
    }
}
