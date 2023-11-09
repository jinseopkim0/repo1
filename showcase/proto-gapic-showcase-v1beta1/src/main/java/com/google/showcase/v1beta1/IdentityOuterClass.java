// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/identity.proto

// Protobuf Java Version: 3.25.0
package com.google.showcase.v1beta1;

public final class IdentityOuterClass {
  private IdentityOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_CreateUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_CreateUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_GetUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_GetUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_UpdateUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_UpdateUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_DeleteUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_DeleteUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_ListUsersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_ListUsersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_ListUsersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_ListUsersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-schema/google/showcase/v1beta1/identit" +
      "y.proto\022\027google.showcase.v1beta1\032\034google" +
      "/api/annotations.proto\032\027google/api/clien" +
      "t.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\032\033google/prot" +
      "obuf/empty.proto\032 google/protobuf/field_" +
      "mask.proto\032\037google/protobuf/timestamp.pr" +
      "oto\"\210\003\n\004User\022\014\n\004name\030\001 \001(\t\022\032\n\014display_na" +
      "me\030\002 \001(\tB\004\342A\001\002\022\023\n\005email\030\003 \001(\tB\004\342A\001\002\0225\n\013c" +
      "reate_time\030\004 \001(\0132\032.google.protobuf.Times" +
      "tampB\004\342A\001\003\0225\n\013update_time\030\005 \001(\0132\032.google" +
      ".protobuf.TimestampB\004\342A\001\003\022\020\n\003age\030\006 \001(\005H\000" +
      "\210\001\001\022\030\n\013height_feet\030\007 \001(\001H\001\210\001\001\022\025\n\010nicknam" +
      "e\030\010 \001(\tH\002\210\001\001\022!\n\024enable_notifications\030\t \001" +
      "(\010H\003\210\001\001:/\352A,\n\034showcase.googleapis.com/Us" +
      "er\022\014users/{user}B\006\n\004_ageB\016\n\014_height_feet" +
      "B\013\n\t_nicknameB\027\n\025_enable_notifications\"@" +
      "\n\021CreateUserRequest\022+\n\004user\030\001 \001(\0132\035.goog" +
      "le.showcase.v1beta1.User\"E\n\016GetUserReque" +
      "st\0223\n\004name\030\001 \001(\tB%\342A\001\002\372A\036\n\034showcase.goog" +
      "leapis.com/User\"q\n\021UpdateUserRequest\022+\n\004" +
      "user\030\001 \001(\0132\035.google.showcase.v1beta1.Use" +
      "r\022/\n\013update_mask\030\002 \001(\0132\032.google.protobuf" +
      ".FieldMask\"H\n\021DeleteUserRequest\0223\n\004name\030" +
      "\001 \001(\tB%\342A\001\002\372A\036\n\034showcase.googleapis.com/" +
      "User\"9\n\020ListUsersRequest\022\021\n\tpage_size\030\001 " +
      "\001(\005\022\022\n\npage_token\030\002 \001(\t\"Z\n\021ListUsersResp" +
      "onse\022,\n\005users\030\001 \003(\0132\035.google.showcase.v1" +
      "beta1.User\022\027\n\017next_page_token\030\002 \001(\t2\212\006\n\010" +
      "Identity\022\363\001\n\nCreateUser\022*.google.showcas" +
      "e.v1beta1.CreateUserRequest\032\035.google.sho" +
      "wcase.v1beta1.User\"\231\001\332A\034user.display_nam" +
      "e,user.email\332A^user.display_name,user.em" +
      "ail,user.age,user.nickname,user.enable_n" +
      "otifications,user.height_feet\202\323\344\223\002\023\"\016/v1" +
      "beta1/users:\001*\022y\n\007GetUser\022\'.google.showc" +
      "ase.v1beta1.GetUserRequest\032\035.google.show" +
      "case.v1beta1.User\"&\332A\004name\202\323\344\223\002\031\022\027/v1bet" +
      "a1/{name=users/*}\022\203\001\n\nUpdateUser\022*.googl" +
      "e.showcase.v1beta1.UpdateUserRequest\032\035.g" +
      "oogle.showcase.v1beta1.User\"*\202\323\344\223\002$2\034/v1" +
      "beta1/{user.name=users/*}:\004user\022x\n\nDelet" +
      "eUser\022*.google.showcase.v1beta1.DeleteUs" +
      "erRequest\032\026.google.protobuf.Empty\"&\332A\004na" +
      "me\202\323\344\223\002\031*\027/v1beta1/{name=users/*}\022z\n\tLis" +
      "tUsers\022).google.showcase.v1beta1.ListUse" +
      "rsRequest\032*.google.showcase.v1beta1.List" +
      "UsersResponse\"\026\202\323\344\223\002\020\022\016/v1beta1/users\032\021\312" +
      "A\016localhost:7469Bq\n\033com.google.showcase." +
      "v1beta1P\001Z4github.com/googleapis/gapic-s" +
      "howcase/server/genproto\352\002\031Google::Showca" +
      "se::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_showcase_v1beta1_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_showcase_v1beta1_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_User_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Email", "CreateTime", "UpdateTime", "Age", "HeightFeet", "Nickname", "EnableNotifications", });
    internal_static_google_showcase_v1beta1_CreateUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_showcase_v1beta1_CreateUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_CreateUserRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_google_showcase_v1beta1_GetUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_showcase_v1beta1_GetUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_GetUserRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_showcase_v1beta1_UpdateUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_showcase_v1beta1_UpdateUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_UpdateUserRequest_descriptor,
        new java.lang.String[] { "User", "UpdateMask", });
    internal_static_google_showcase_v1beta1_DeleteUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_showcase_v1beta1_DeleteUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_DeleteUserRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_showcase_v1beta1_ListUsersRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_showcase_v1beta1_ListUsersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_ListUsersRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", });
    internal_static_google_showcase_v1beta1_ListUsersResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_showcase_v1beta1_ListUsersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_ListUsersResponse_descriptor,
        new java.lang.String[] { "Users", "NextPageToken", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
