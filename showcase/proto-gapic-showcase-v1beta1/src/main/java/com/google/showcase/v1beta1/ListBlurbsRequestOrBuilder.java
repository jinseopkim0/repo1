// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/messaging.proto

// Protobuf Java Version: 3.25.1
package com.google.showcase.v1beta1;

public interface ListBlurbsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.ListBlurbsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the requested room or profile whos blurbs to list.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The resource name of the requested room or profile whos blurbs to list.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of blurbs to return. Server may return fewer
   * blurbs than requested. If unspecified, server will pick an appropriate
   * default.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The value of google.showcase.v1beta1.ListBlurbsResponse.next_page_token
   * returned from the previous call to
   * `google.showcase.v1beta1.Messaging&#92;ListBlurbs` method.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value of google.showcase.v1beta1.ListBlurbsResponse.next_page_token
   * returned from the previous call to
   * `google.showcase.v1beta1.Messaging&#92;ListBlurbs` method.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
