// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/messaging.proto

package com.google.showcase.v1beta1;

public interface ConnectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.ConnectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Provides information that specifies how to process subsequent requests.
   * The first `ConnectRequest` message must contain a `config`  message.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.ConnectRequest.ConnectConfig config = 1;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * Provides information that specifies how to process subsequent requests.
   * The first `ConnectRequest` message must contain a `config`  message.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.ConnectRequest.ConnectConfig config = 1;</code>
   * @return The config.
   */
  com.google.showcase.v1beta1.ConnectRequest.ConnectConfig getConfig();
  /**
   * <pre>
   * Provides information that specifies how to process subsequent requests.
   * The first `ConnectRequest` message must contain a `config`  message.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.ConnectRequest.ConnectConfig config = 1;</code>
   */
  com.google.showcase.v1beta1.ConnectRequest.ConnectConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * The blurb to be created.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
   * @return Whether the blurb field is set.
   */
  boolean hasBlurb();
  /**
   * <pre>
   * The blurb to be created.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
   * @return The blurb.
   */
  com.google.showcase.v1beta1.Blurb getBlurb();
  /**
   * <pre>
   * The blurb to be created.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
   */
  com.google.showcase.v1beta1.BlurbOrBuilder getBlurbOrBuilder();

  public com.google.showcase.v1beta1.ConnectRequest.RequestCase getRequestCase();
}
