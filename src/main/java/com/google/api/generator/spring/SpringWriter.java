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

package com.google.api.generator.spring;

import com.google.api.generator.engine.ast.ClassDefinition;
import com.google.api.generator.engine.ast.PackageInfoDefinition;
import com.google.api.generator.engine.writer.JavaWriterVisitor;
import com.google.api.generator.gapic.model.GapicClass;
import com.google.api.generator.gapic.model.GapicContext;
import com.google.api.generator.gapic.model.GapicPackageInfo;
import com.google.api.generator.spring.composer.Utils;
import com.google.protobuf.ByteString;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse;
import com.google.protobuf.util.JsonFormat;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.StringJoiner;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

public class SpringWriter {
  static class GapicWriterException extends RuntimeException {

    public GapicWriterException(String errorMessage, Throwable cause) {
      super(errorMessage, cause);
    }
  }

  public static CodeGeneratorResponse write(
      GapicContext context,
      List<GapicClass> clazzes,
      GapicPackageInfo gapicPackageInfo,
      String outputFilePath) {
    ByteString.Output output = ByteString.newOutput();
    JavaWriterVisitor codeWriter = new JavaWriterVisitor();
    JarOutputStream jos;
    try {
      jos = new JarOutputStream(output);
    } catch (IOException e) {
      throw new GapicWriterException(e.getMessage(), e);
    }

    for (GapicClass gapicClazz : clazzes) {
      writeClazz(gapicClazz, codeWriter, jos);
    }

    // write spring.factories file
    writeAutoConfigRegistration(context, jos);
    writeSpringAdditionalMetadataJson(context, jos);
    writePom(context, jos);

    // TODO: metadata and package info not custimized for Spring
    writeMetadataFile(context, writePackageInfo(gapicPackageInfo, codeWriter, jos), jos);

    try {
      jos.finish();
      jos.flush();
    } catch (IOException e) {
      throw new GapicWriterException(e.getMessage(), e);
    }

    CodeGeneratorResponse.Builder response = CodeGeneratorResponse.newBuilder();
    response
        .setSupportedFeatures(CodeGeneratorResponse.Feature.FEATURE_PROTO3_OPTIONAL_VALUE)
        .addFileBuilder()
        .setName(outputFilePath)
        .setContentBytes(output.toByteString());
    return response.build();
  }

  private static String writeClazz(
      GapicClass gapicClazz, JavaWriterVisitor codeWriter, JarOutputStream jos) {
    ClassDefinition clazz = gapicClazz.classDefinition();

    clazz.accept(codeWriter);
    String code = codeWriter.write();
    codeWriter.clear();

    String path = getPath(clazz.packageString(), clazz.classIdentifier().name());
    String className = clazz.classIdentifier().name();
    JarEntry jarEntry = new JarEntry(String.format("%s/%s.java", path, className));
    try {
      jos.putNextEntry(jarEntry);
      jos.write(code.getBytes(StandardCharsets.UTF_8));
    } catch (IOException e) {
      throw new GapicWriterException(
          String.format(
              "Could not write code for class %s.%s: %s",
              clazz.packageString(), clazz.classIdentifier().name(), e.getMessage()),
          e);
    }
    return path;
  }

  private static String writePackageInfo(
      GapicPackageInfo gapicPackageInfo, JavaWriterVisitor codeWriter, JarOutputStream jos) {
    PackageInfoDefinition packageInfo = gapicPackageInfo.packageInfo();
    packageInfo.accept(codeWriter);
    String code = codeWriter.write();
    codeWriter.clear();

    String packagePath =
        "src/main/java/" + packageInfo.pakkage().replaceAll("\\.", "/") + "/spring";
    JarEntry jarEntry = new JarEntry(String.format("%s/package-info.java", packagePath));
    try {
      jos.putNextEntry(jarEntry);
      jos.write(code.getBytes(StandardCharsets.UTF_8));
    } catch (IOException e) {
      throw new GapicWriterException("Could not write code for package-info.java", e);
    }
    return packagePath;
  }

  private static void writeMetadataFile(GapicContext context, String path, JarOutputStream jos) {
    if (context.gapicMetadataEnabled()) {
      JarEntry jarEntry = new JarEntry(String.format("%s/gapic_metadata.json", path));
      try {
        jos.putNextEntry(jarEntry);
        jos.write(
            JsonFormat.printer().print(context.gapicMetadata()).getBytes(StandardCharsets.UTF_8));
      } catch (IOException e) {
        throw new GapicWriterException("Could not write gapic_metadata.json", e);
      }
    }
  }

  private static void writeAutoConfigRegistration(GapicContext context, JarOutputStream jos) {
    String path = "src/main/resources/META-INF/spring";
    JarEntry jarEntry =
        new JarEntry(
            String.format(
                "%s/org.springframework.boot.autoconfigure.AutoConfiguration.imports", path));
    try {
      jos.putNextEntry(jarEntry);
      StringJoiner sb = new StringJoiner("\n", "", "");
      context
          .services()
          .forEach(
              service ->
                  sb.add(
                      String.format(
                          "%s.spring.%sSpringAutoConfig", service.pakkage(), service.name())));

      jos.write(sb.toString().getBytes(StandardCharsets.UTF_8));
    } catch (IOException e) {
      throw new GapicWriterException("Could not write spring.factories", e);
    }
  }

  private static void writeSpringAdditionalMetadataJson(GapicContext context, JarOutputStream jos) {
    String path = "src/main/resources/META-INF";
    JarEntry jarEntry =
        new JarEntry(String.format("%s/additional-spring-configuration-metadata.json", path));
    try {
      jos.putNextEntry(jarEntry);
      StringJoiner sb = new StringJoiner(",\n", "\n{\n    \"properties\": [\n", "\n    ]\n" + "}");
      context
          .services()
          .forEach(
              service ->
                  sb.add(
                      String.format(
                          "        {\n"
                              + "            \"name\": \"%s.enabled\",\n"
                              + "            \"type\": \"java.lang.Boolean\",\n"
                              + "            \"description\": \"Auto-configure Google Cloud %s components.\",\n"
                              + "            \"defaultValue\": true\n"
                              + "        }",
                          Utils.getSpringPropertyPrefix(
                              Utils.getPackageName(context), service.name()),
                          Utils.getLibName(context) + "/" + service.name())));

      jos.write(sb.toString().getBytes(StandardCharsets.UTF_8));
    } catch (IOException e) {
      throw new GapicWriterException("Could not write spring.factories", e);
    }
  }

  // write pom file. start with static string
  // next: inject versions; change client library names
  private static void writePom(GapicContext context, JarOutputStream jos) {
    JarEntry jarEntry = new JarEntry("pom.xml");
    try {
      jos.putNextEntry(jarEntry);
      StringJoiner sb = new StringJoiner(",\\\n");

      sb.add(
          "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
              + "<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
              + "  xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">\n"
              + "  <modelVersion>4.0.0</modelVersion>\n"
              + "\n"
              + "  <groupId>com.sample</groupId>\n"
              + "  <artifactId>cloud-language</artifactId>\n"
              + "  <version>0.0.1-SNAPSHOT</version>\n"
              + "  <name>autoconfig</name>\n"
              + "  <description>autoconfig poc project for Spring Boot</description>\n"
              + "\n"
              + "\n"
              + "<!--  Depend on the specific client library directly. Avoids dependency on libraries bom-->\n"
              + "  <dependencies>\n"
              + "    <dependency>\n"
              + "      <groupId>com.google.cloud</groupId>\n"
              + "<!--   //safe to parse from package name? com.google.cloud.language   -->\n"
              + "      <artifactId>google-cloud-language</artifactId>\n"
              + "      <version>2.3.0</version>\n"
              + "    </dependency>\n"
              + "\n"
              + "    <dependency>\n"
              + "      <groupId>org.springframework.boot</groupId>\n"
              + "      <artifactId>spring-boot-starter</artifactId>\n"
              + "      <version>2.6.3</version>\n"
              + "    </dependency>\n"
              + "\n"
              + "<!--this dependency only needed for a few util classes. Can be moved to shared location-->\n"
              + "  <dependency>\n"
              + "    <groupId>com.google.cloud</groupId>\n"
              + "    <artifactId>spring-cloud-gcp-core</artifactId>\n"
              + "    <version>3.2.1</version>\n"
              + "  </dependency>\n"
              + "</dependencies>\n"
              + "  <build>\n"
              + "    <pluginManagement>\n"
              + "      <plugins>\n"
              + "        <plugin>\n"
              + "          <groupId>org.apache.maven.plugins</groupId>\n"
              + "          <artifactId>maven-jar-plugin</artifactId>\n"
              + "          <version>3.2.2</version>\n"
              + "        </plugin>\n"
              + "      </plugins>\n"
              + "    </pluginManagement>\n"
              + "\n"
              + "    <plugins>\n"
              + "      <plugin>\n"
              + "        <groupId>org.apache.maven.plugins</groupId>\n"
              + "        <artifactId>maven-jar-plugin</artifactId>\n"
              + "        <configuration>\n"
              + "          <archive>\n"
              + "            <manifest>\n"
              + "              <addDefaultImplementationEntries>true</addDefaultImplementationEntries>\n"
              + "            </manifest>\n"
              + "          </archive>\n"
              + "        </configuration>\n"
              + "      </plugin>\n"
              + "    </plugins>\n"
              + "  </build>\n"
              + "\n"
              + "</project>");

      jos.write(sb.toString().getBytes(StandardCharsets.UTF_8));
    } catch (IOException e) {
      throw new GapicWriterException("Could not write pom.xml", e);
    }
  }

  private static String getPath(String pakkage, String className) {
    String path = pakkage.replaceAll("\\.", "/");
    if (className.startsWith("Mock") || className.endsWith("Test")) {
      path = "src/test/java/" + path;
    } else {
      path = "src/main/java/" + path;
    }

    // Resource name helpers go into the protobuf package. Denote this with "proto/src/main/*".
    if (className.endsWith("Name")) {
      path = "proto/" + path;
    }
    return path;
  }

  private static String getSamplePackage(GapicClass gapicClazz) {
    return gapicClazz.classDefinition().packageString().concat(".samples");
  }
}
