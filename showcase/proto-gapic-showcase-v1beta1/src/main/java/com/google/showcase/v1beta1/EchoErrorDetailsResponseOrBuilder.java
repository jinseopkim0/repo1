// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/echo.proto

// Protobuf Java Version: 3.25.2
package com.google.showcase.v1beta1;

public interface EchoErrorDetailsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.EchoErrorDetailsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.showcase.v1beta1.EchoErrorDetailsResponse.SingleDetail single_detail = 1;</code>
   * @return Whether the singleDetail field is set.
   */
  boolean hasSingleDetail();
  /**
   * <code>.google.showcase.v1beta1.EchoErrorDetailsResponse.SingleDetail single_detail = 1;</code>
   * @return The singleDetail.
   */
  com.google.showcase.v1beta1.EchoErrorDetailsResponse.SingleDetail getSingleDetail();
  /**
   * <code>.google.showcase.v1beta1.EchoErrorDetailsResponse.SingleDetail single_detail = 1;</code>
   */
  com.google.showcase.v1beta1.EchoErrorDetailsResponse.SingleDetailOrBuilder getSingleDetailOrBuilder();

  /**
   * <code>.google.showcase.v1beta1.EchoErrorDetailsResponse.MultipleDetails multiple_details = 2;</code>
   * @return Whether the multipleDetails field is set.
   */
  boolean hasMultipleDetails();
  /**
   * <code>.google.showcase.v1beta1.EchoErrorDetailsResponse.MultipleDetails multiple_details = 2;</code>
   * @return The multipleDetails.
   */
  com.google.showcase.v1beta1.EchoErrorDetailsResponse.MultipleDetails getMultipleDetails();
  /**
   * <code>.google.showcase.v1beta1.EchoErrorDetailsResponse.MultipleDetails multiple_details = 2;</code>
   */
  com.google.showcase.v1beta1.EchoErrorDetailsResponse.MultipleDetailsOrBuilder getMultipleDetailsOrBuilder();
}
