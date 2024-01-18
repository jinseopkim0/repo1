// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/sequence.proto

// Protobuf Java Version: 3.25.2
package com.google.showcase.v1beta1;

public final class SequenceOuterClass {
  private SequenceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_Sequence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_Sequence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_Sequence_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_Sequence_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_StreamingSequence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_StreamingSequence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_StreamingSequence_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_StreamingSequence_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_StreamingSequenceReport_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_StreamingSequenceReport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_StreamingSequenceReport_Attempt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_StreamingSequenceReport_Attempt_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_SequenceReport_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_SequenceReport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_SequenceReport_Attempt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_SequenceReport_Attempt_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_CreateSequenceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_CreateSequenceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_CreateStreamingSequenceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_CreateStreamingSequenceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_AttemptSequenceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_AttemptSequenceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_AttemptStreamingSequenceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_AttemptStreamingSequenceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_AttemptStreamingSequenceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_AttemptStreamingSequenceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_GetSequenceReportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_GetSequenceReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_GetStreamingSequenceReportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_GetStreamingSequenceReportRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-schema/google/showcase/v1beta1/sequenc" +
      "e.proto\022\027google.showcase.v1beta1\032\034google" +
      "/api/annotations.proto\032\027google/api/clien" +
      "t.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\032\036google/prot" +
      "obuf/duration.proto\032\033google/protobuf/emp" +
      "ty.proto\032\037google/protobuf/timestamp.prot" +
      "o\032\027google/rpc/status.proto\"\364\001\n\010Sequence\022" +
      "\022\n\004name\030\001 \001(\tB\004\342A\001\003\022=\n\tresponses\030\002 \003(\0132*" +
      ".google.showcase.v1beta1.Sequence.Respon" +
      "se\032X\n\010Response\022\"\n\006status\030\001 \001(\0132\022.google." +
      "rpc.Status\022(\n\005delay\030\002 \001(\0132\031.google.proto" +
      "buf.Duration:;\352A8\n showcase.googleapis.c" +
      "om/Sequence\022\024sequences/{sequence}\"\313\002\n\021St" +
      "reamingSequence\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\017\n\007c" +
      "ontent\030\002 \001(\t\022F\n\tresponses\030\003 \003(\01323.google" +
      ".showcase.v1beta1.StreamingSequence.Resp" +
      "onse\032p\n\010Response\022\"\n\006status\030\001 \001(\0132\022.googl" +
      "e.rpc.Status\022(\n\005delay\030\002 \001(\0132\031.google.pro" +
      "tobuf.Duration\022\026\n\016response_index\030\003 \001(\005:W" +
      "\352AT\n)showcase.googleapis.com/StreamingSe" +
      "quence\022\'streamingSequences/{streaming_se" +
      "quence}\"\323\003\n\027StreamingSequenceReport\022\022\n\004n" +
      "ame\030\001 \001(\tB\004\342A\001\003\022J\n\010attempts\030\002 \003(\01328.goog" +
      "le.showcase.v1beta1.StreamingSequenceRep" +
      "ort.Attempt\032\340\001\n\007Attempt\022\026\n\016attempt_numbe" +
      "r\030\001 \001(\005\0224\n\020attempt_deadline\030\002 \001(\0132\032.goog" +
      "le.protobuf.Timestamp\0221\n\rresponse_time\030\003" +
      " \001(\0132\032.google.protobuf.Timestamp\0220\n\ratte" +
      "mpt_delay\030\004 \001(\0132\031.google.protobuf.Durati" +
      "on\022\"\n\006status\030\005 \001(\0132\022.google.rpc.Status:u" +
      "\352Ar\n/showcase.googleapis.com/StreamingSe" +
      "quenceReport\022?streamingSequences/{stream" +
      "ing_sequence}/streamingSequenceReport\"\234\003" +
      "\n\016SequenceReport\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022A\n\010" +
      "attempts\030\002 \003(\0132/.google.showcase.v1beta1" +
      ".SequenceReport.Attempt\032\340\001\n\007Attempt\022\026\n\016a" +
      "ttempt_number\030\001 \001(\005\0224\n\020attempt_deadline\030" +
      "\002 \001(\0132\032.google.protobuf.Timestamp\0221\n\rres" +
      "ponse_time\030\003 \001(\0132\032.google.protobuf.Times" +
      "tamp\0220\n\rattempt_delay\030\004 \001(\0132\031.google.pro" +
      "tobuf.Duration\022\"\n\006status\030\005 \001(\0132\022.google." +
      "rpc.Status:P\352AM\n&showcase.googleapis.com" +
      "/SequenceReport\022#sequences/{sequence}/se" +
      "quenceReport\"L\n\025CreateSequenceRequest\0223\n" +
      "\010sequence\030\001 \001(\0132!.google.showcase.v1beta" +
      "1.Sequence\"h\n\036CreateStreamingSequenceReq" +
      "uest\022F\n\022streaming_sequence\030\001 \001(\0132*.googl" +
      "e.showcase.v1beta1.StreamingSequence\"Q\n\026" +
      "AttemptSequenceRequest\0227\n\004name\030\001 \001(\tB)\342A" +
      "\001\002\372A\"\n showcase.googleapis.com/Sequence\"" +
      "\202\001\n\037AttemptStreamingSequenceRequest\022@\n\004n" +
      "ame\030\001 \001(\tB2\342A\001\002\372A+\n)showcase.googleapis." +
      "com/StreamingSequence\022\035\n\017last_fail_index" +
      "\030\002 \001(\005B\004\342A\001\001\"3\n AttemptStreamingSequence" +
      "Response\022\017\n\007content\030\001 \001(\t\"Y\n\030GetSequence" +
      "ReportRequest\022=\n\004name\030\001 \001(\tB/\342A\001\002\372A(\n&sh" +
      "owcase.googleapis.com/SequenceReport\"k\n!" +
      "GetStreamingSequenceReportRequest\022F\n\004nam" +
      "e\030\001 \001(\tB8\342A\001\002\372A1\n/showcase.googleapis.co" +
      "m/StreamingSequenceReport2\360\010\n\017SequenceSe" +
      "rvice\022\224\001\n\016CreateSequence\022..google.showca" +
      "se.v1beta1.CreateSequenceRequest\032!.googl" +
      "e.showcase.v1beta1.Sequence\"/\332A\010sequence" +
      "\202\323\344\223\002\036\"\022/v1beta1/sequences:\010sequence\022\314\001\n" +
      "\027CreateStreamingSequence\0227.google.showca" +
      "se.v1beta1.CreateStreamingSequenceReques" +
      "t\032*.google.showcase.v1beta1.StreamingSeq" +
      "uence\"L\332A\022streaming_sequence\202\323\344\223\0021\"\033/v1b" +
      "eta1/streamingSequences:\022streaming_seque" +
      "nce\022\252\001\n\021GetSequenceReport\0221.google.showc" +
      "ase.v1beta1.GetSequenceReportRequest\032\'.g" +
      "oogle.showcase.v1beta1.SequenceReport\"9\332" +
      "A\004name\202\323\344\223\002,\022*/v1beta1/{name=sequences/*" +
      "/sequenceReport}\022\327\001\n\032GetStreamingSequenc" +
      "eReport\022:.google.showcase.v1beta1.GetStr" +
      "eamingSequenceReportRequest\0320.google.sho" +
      "wcase.v1beta1.StreamingSequenceReport\"K\332" +
      "A\004name\202\323\344\223\002>\022</v1beta1/{name=streamingSe" +
      "quences/*/streamingSequenceReport}\022\211\001\n\017A" +
      "ttemptSequence\022/.google.showcase.v1beta1" +
      ".AttemptSequenceRequest\032\026.google.protobu" +
      "f.Empty\"-\332A\004name\202\323\344\223\002 \"\033/v1beta1/{name=s" +
      "equences/*}:\001*\022\320\001\n\030AttemptStreamingSeque" +
      "nce\0228.google.showcase.v1beta1.AttemptStr" +
      "eamingSequenceRequest\0329.google.showcase." +
      "v1beta1.AttemptStreamingSequenceResponse" +
      "\"=\332A\004name\202\323\344\223\0020\"+/v1beta1/{name=streamin" +
      "gSequences/*}:stream:\001*0\001\032\021\312A\016localhost:" +
      "7469Bq\n\033com.google.showcase.v1beta1P\001Z4g" +
      "ithub.com/googleapis/gapic-showcase/serv" +
      "er/genproto\352\002\031Google::Showcase::V1beta1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_showcase_v1beta1_Sequence_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_showcase_v1beta1_Sequence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_Sequence_descriptor,
        new java.lang.String[] { "Name", "Responses", });
    internal_static_google_showcase_v1beta1_Sequence_Response_descriptor =
      internal_static_google_showcase_v1beta1_Sequence_descriptor.getNestedTypes().get(0);
    internal_static_google_showcase_v1beta1_Sequence_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_Sequence_Response_descriptor,
        new java.lang.String[] { "Status", "Delay", });
    internal_static_google_showcase_v1beta1_StreamingSequence_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_showcase_v1beta1_StreamingSequence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_StreamingSequence_descriptor,
        new java.lang.String[] { "Name", "Content", "Responses", });
    internal_static_google_showcase_v1beta1_StreamingSequence_Response_descriptor =
      internal_static_google_showcase_v1beta1_StreamingSequence_descriptor.getNestedTypes().get(0);
    internal_static_google_showcase_v1beta1_StreamingSequence_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_StreamingSequence_Response_descriptor,
        new java.lang.String[] { "Status", "Delay", "ResponseIndex", });
    internal_static_google_showcase_v1beta1_StreamingSequenceReport_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_showcase_v1beta1_StreamingSequenceReport_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_StreamingSequenceReport_descriptor,
        new java.lang.String[] { "Name", "Attempts", });
    internal_static_google_showcase_v1beta1_StreamingSequenceReport_Attempt_descriptor =
      internal_static_google_showcase_v1beta1_StreamingSequenceReport_descriptor.getNestedTypes().get(0);
    internal_static_google_showcase_v1beta1_StreamingSequenceReport_Attempt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_StreamingSequenceReport_Attempt_descriptor,
        new java.lang.String[] { "AttemptNumber", "AttemptDeadline", "ResponseTime", "AttemptDelay", "Status", });
    internal_static_google_showcase_v1beta1_SequenceReport_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_showcase_v1beta1_SequenceReport_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_SequenceReport_descriptor,
        new java.lang.String[] { "Name", "Attempts", });
    internal_static_google_showcase_v1beta1_SequenceReport_Attempt_descriptor =
      internal_static_google_showcase_v1beta1_SequenceReport_descriptor.getNestedTypes().get(0);
    internal_static_google_showcase_v1beta1_SequenceReport_Attempt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_SequenceReport_Attempt_descriptor,
        new java.lang.String[] { "AttemptNumber", "AttemptDeadline", "ResponseTime", "AttemptDelay", "Status", });
    internal_static_google_showcase_v1beta1_CreateSequenceRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_showcase_v1beta1_CreateSequenceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_CreateSequenceRequest_descriptor,
        new java.lang.String[] { "Sequence", });
    internal_static_google_showcase_v1beta1_CreateStreamingSequenceRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_showcase_v1beta1_CreateStreamingSequenceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_CreateStreamingSequenceRequest_descriptor,
        new java.lang.String[] { "StreamingSequence", });
    internal_static_google_showcase_v1beta1_AttemptSequenceRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_showcase_v1beta1_AttemptSequenceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_AttemptSequenceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_showcase_v1beta1_AttemptStreamingSequenceRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_showcase_v1beta1_AttemptStreamingSequenceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_AttemptStreamingSequenceRequest_descriptor,
        new java.lang.String[] { "Name", "LastFailIndex", });
    internal_static_google_showcase_v1beta1_AttemptStreamingSequenceResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_showcase_v1beta1_AttemptStreamingSequenceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_AttemptStreamingSequenceResponse_descriptor,
        new java.lang.String[] { "Content", });
    internal_static_google_showcase_v1beta1_GetSequenceReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_showcase_v1beta1_GetSequenceReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_GetSequenceReportRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_showcase_v1beta1_GetStreamingSequenceReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_showcase_v1beta1_GetStreamingSequenceReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_GetStreamingSequenceReportRequest_descriptor,
        new java.lang.String[] { "Name", });
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
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
