// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/identity.proto

// Protobuf Java Version: 3.25.5
package com.google.showcase.v1beta1;

public interface ListUsersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.ListUsersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The maximum number of users to return. Server may return fewer users
   * than requested. If unspecified, server will pick an appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 1;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The value of google.showcase.v1beta1.ListUsersResponse.next_page_token
   * returned from the previous call to
   * `google.showcase.v1beta1.Identity&#92;ListUsers` method.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value of google.showcase.v1beta1.ListUsersResponse.next_page_token
   * returned from the previous call to
   * `google.showcase.v1beta1.Identity&#92;ListUsers` method.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
