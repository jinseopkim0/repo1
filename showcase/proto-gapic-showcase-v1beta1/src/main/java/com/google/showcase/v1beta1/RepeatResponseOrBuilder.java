// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/compliance.proto

package com.google.showcase.v1beta1;

public interface RepeatResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.RepeatResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
   * @return The request.
   */
  com.google.showcase.v1beta1.RepeatRequest getRequest();
  /**
   * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
   */
  com.google.showcase.v1beta1.RepeatRequestOrBuilder getRequestOrBuilder();

  /**
   * <pre>
   * The URI template the request was bound to server-side.
   * </pre>
   *
   * <code>string binding_uri = 2;</code>
   * @return The bindingUri.
   */
  java.lang.String getBindingUri();
  /**
   * <pre>
   * The URI template the request was bound to server-side.
   * </pre>
   *
   * <code>string binding_uri = 2;</code>
   * @return The bytes for bindingUri.
   */
  com.google.protobuf.ByteString
      getBindingUriBytes();
}
