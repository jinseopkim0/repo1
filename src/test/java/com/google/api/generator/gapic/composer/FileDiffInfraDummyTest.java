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

import com.google.api.generator.engine.ast.ClassDefinition;
import com.google.api.generator.engine.ast.CommentStatement;
import com.google.api.generator.engine.ast.LineComment;
import com.google.api.generator.engine.ast.ScopeNode;
import com.google.api.generator.engine.writer.JavaWriterVisitor;
import com.google.api.generator.gapic.model.GapicClass;
import com.google.api.generator.gapic.model.GapicClass.Kind;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class FileDiffInfraDummyTest {
  // Add two simple tests for testing the file-diff infra.
  // 1. The two unit tests create simple gapic classes since here is gapic/composer folder.
  // 2. Two unit tests are created because we have the case of two expceted strings comparison
  // in one test class e.g. ResourceNameHelperClassComposer. In that case, two golden files will be
  // created.
  //
  // TODO(xiaozhenliu): remove this test class once the file-diff infra is in place and tested well.
  @Test
  public void simpleGapicClass() {
    ClassDefinition classDef =
        ClassDefinition.builder()
            .setHeaderCommentStatements(
                Arrays.asList(
                    CommentStatement.withComment(
                        LineComment.withComment("This is a test class for file-diff infra"))))
            .setPackageString("com.google.showcase.v1beta1.stub")
            .setName("EchoStubSettings")
            .setScope(ScopeNode.PUBLIC)
            .build();
    GapicClass gapicClass = GapicClass.create(Kind.TEST, classDef);
    JavaWriterVisitor visitor = new JavaWriterVisitor();
    gapicClass.classDefinition().accept(visitor);
    assertEquals(visitor.write(), EXPECTED_CLASS_STRING_SIMPLE);
  }

  @Test
  public void gapicClassWithHeader() {
    ClassDefinition classDef =
        ClassDefinition.builder()
            .setPackageString("com.google.showcase.v1beta1.stub")
            .setName("EchoStubSettings")
            .setScope(ScopeNode.PUBLIC)
            .build();
    List<GapicClass> gapicClassWithHeaderList =
        Composer.addApacheLicense(Arrays.asList(GapicClass.create(Kind.TEST, classDef)));
    JavaWriterVisitor visitor = new JavaWriterVisitor();
    gapicClassWithHeaderList.get(0).classDefinition().accept(visitor);
    assertEquals(visitor.write(), EXPECTED_CLASS_STRING_WITH_HEADER);
  }

  private static final String EXPECTED_CLASS_STRING_SIMPLE =
      "package com.google.showcase.v1beta1.stub;\n\n"
          + "// This is a test class for file-diff infra\n"
          + "public class EchoStubSettings {}\n";

  private static final String EXPECTED_CLASS_STRING_WITH_HEADER =
      "/*\n"
          + " * Copyright 2020 Google LLC\n"
          + " *\n"
          + " * Licensed under the Apache License, Version 2.0 (the \"License\");\n"
          + " * you may not use this file except in compliance with the License.\n"
          + " * You may obtain a copy of the License at\n"
          + " *\n"
          + " *      https://www.apache.org/licenses/LICENSE-2.0\n"
          + " *\n"
          + " * Unless required by applicable law or agreed to in writing, software\n"
          + " * distributed under the License is distributed on an \"AS IS\" BASIS,\n"
          + " * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n"
          + " * See the License for the specific language governing permissions and\n"
          + " * limitations under the License.\n"
          + " */\n\n"
          + "package com.google.showcase.v1beta1.stub;\n\n"
          + "public class EchoStubSettings {}\n";
}
