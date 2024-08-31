// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/testing.proto

// Protobuf Java Version: 3.25.4
package com.google.showcase.v1beta1;

public interface TestRunOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.TestRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the test.
   * The tests/&#42; portion of the names are hard-coded, and do not change
   * from session to session.
   * </pre>
   *
   * <code>string test = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The test.
   */
  java.lang.String getTest();
  /**
   * <pre>
   * The name of the test.
   * The tests/&#42; portion of the names are hard-coded, and do not change
   * from session to session.
   * </pre>
   *
   * <code>string test = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for test.
   */
  com.google.protobuf.ByteString
      getTestBytes();

  /**
   * <pre>
   * An issue found with the test run. If empty, this test run was successful.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Issue issue = 2;</code>
   * @return Whether the issue field is set.
   */
  boolean hasIssue();
  /**
   * <pre>
   * An issue found with the test run. If empty, this test run was successful.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Issue issue = 2;</code>
   * @return The issue.
   */
  com.google.showcase.v1beta1.Issue getIssue();
  /**
   * <pre>
   * An issue found with the test run. If empty, this test run was successful.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Issue issue = 2;</code>
   */
  com.google.showcase.v1beta1.IssueOrBuilder getIssueOrBuilder();
}
