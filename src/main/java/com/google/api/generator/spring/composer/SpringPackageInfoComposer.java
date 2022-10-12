// Copyright 2022 Google LLC
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

package com.google.api.generator.spring.composer;

import com.google.api.generator.engine.ast.AnnotationNode;
import com.google.api.generator.engine.ast.CommentStatement;
import com.google.api.generator.engine.ast.ConcreteReference;
import com.google.api.generator.engine.ast.JavaDocComment;
import com.google.api.generator.engine.ast.PackageInfoDefinition;
import com.google.api.generator.engine.ast.TypeNode;
import com.google.api.generator.gapic.model.GapicContext;
import com.google.api.generator.gapic.model.GapicPackageInfo;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import javax.annotation.Generated;

public class SpringPackageInfoComposer {
  private static final String PACKAGE_INFO_TITLE_PATTERN =
      "Auto-configuration for %s integration with Spring.";

  public static GapicPackageInfo generatePackageInfo(GapicContext context) {
    Preconditions.checkState(!context.services().isEmpty(), "No services found to generate");
    // Pick some service's package, as we assume they are all the same.
    // TODO: update when spring autoconfig package name is finalized
    String libraryPakkage = context.services().get(0).pakkage() + ".spring";

    PackageInfoDefinition packageInfo =
        PackageInfoDefinition.builder()
            .setPakkage(libraryPakkage)
            .setHeaderCommentStatements(createPackageInfoJavadoc(context))
            .setAnnotations(
                AnnotationNode.builder()
                    .setType(TypeNode.withReference(ConcreteReference.withClazz(Generated.class)))
                    .setDescription("by gapic-generator-java")
                    .build())
            .build();
    return GapicPackageInfo.with(packageInfo);
  }

  private static CommentStatement createPackageInfoJavadoc(GapicContext context) {
    JavaDocComment.Builder javaDocCommentBuilder = JavaDocComment.builder();
    if (context.hasServiceYamlProto()
        && !Strings.isNullOrEmpty(context.serviceYamlProto().getTitle())) {
      javaDocCommentBuilder =
          javaDocCommentBuilder.addComment(
              String.format(PACKAGE_INFO_TITLE_PATTERN, context.serviceYamlProto().getTitle()));
    } else {
      // When title from service yaml is not available, use parsed libname as fallback
      javaDocCommentBuilder =
          javaDocCommentBuilder.addComment(
              String.format(PACKAGE_INFO_TITLE_PATTERN, Utils.getLibName(context)));
    }
    return CommentStatement.withComment(javaDocCommentBuilder.build());
  }
}
