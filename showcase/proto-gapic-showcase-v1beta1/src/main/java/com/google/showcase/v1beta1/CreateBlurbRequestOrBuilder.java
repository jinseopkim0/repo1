// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/messaging.proto

// Protobuf Java Version: 3.25.1
package com.google.showcase.v1beta1;

public interface CreateBlurbRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.CreateBlurbRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the chat room or user profile that this blurb will
   * be tied to.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The resource name of the chat room or user profile that this blurb will
   * be tied to.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The blurb to create.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
   * @return Whether the blurb field is set.
   */
  boolean hasBlurb();
  /**
   * <pre>
   * The blurb to create.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
   * @return The blurb.
   */
  com.google.showcase.v1beta1.Blurb getBlurb();
  /**
   * <pre>
   * The blurb to create.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
   */
  com.google.showcase.v1beta1.BlurbOrBuilder getBlurbOrBuilder();
}
