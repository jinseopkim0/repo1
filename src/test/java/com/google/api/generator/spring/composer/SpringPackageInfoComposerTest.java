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

import com.google.api.generator.engine.writer.JavaWriterVisitor;
import com.google.api.generator.gapic.composer.common.TestProtoLoader;
import com.google.api.generator.gapic.model.GapicContext;
import com.google.api.generator.gapic.model.GapicPackageInfo;
import com.google.api.generator.test.framework.Assert;
import com.google.api.generator.test.framework.Utils;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Before;
import org.junit.Test;

public class SpringPackageInfoComposerTest {
  private GapicContext context;

  @Before
  public void setUp() {
    this.context = TestProtoLoader.instance().parseShowcaseEcho();
  }

  @Test
  public void generateAutoConfigClazzTest() {
    GapicPackageInfo packageInfo = SpringPackageInfoComposer.generatePackageInfo(this.context);
    JavaWriterVisitor visitor = new JavaWriterVisitor();
    packageInfo.packageInfo().accept(visitor);
    String fileName = "SpringPackageInfo.golden";

    Utils.saveCodegenToFile(this.getClass(), fileName, visitor.write());
    Path goldenFilePath = Paths.get(Utils.getGoldenDir(this.getClass()), fileName);
    Assert.assertCodeEquals(goldenFilePath, visitor.write());
  }
}
