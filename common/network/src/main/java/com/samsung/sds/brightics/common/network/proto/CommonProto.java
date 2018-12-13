// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.samsung.sds.brightics.common.network.proto;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_samsung_sds_brightics_common_network_proto_SuccessResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_samsung_sds_brightics_common_network_proto_SuccessResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_samsung_sds_brightics_common_network_proto_FailResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_samsung_sds_brightics_common_network_proto_FailResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_samsung_sds_brightics_common_network_proto_ClientReadyMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_samsung_sds_brightics_common_network_proto_ClientReadyMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_samsung_sds_brightics_common_network_proto_HeartbeatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_samsung_sds_brightics_common_network_proto_HeartbeatMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\022.com.samsung.sds.brightic" +
      "s.common.network.proto\"4\n\rSuccessResult\022" +
      "\016\n\006result\030\001 \001(\t\022\023\n\013elapsedTime\030\002 \001(\t\"D\n\n" +
      "FailResult\022\017\n\007message\030\001 \001(\t\022\025\n\rdetailMes" +
      "sage\030\002 \001(\t\022\016\n\006errors\030\003 \001(\t\"\364\001\n\022ClientRea" +
      "dyMessage\022\020\n\010clientId\030\001 \001(\t\022\022\n\nclientHos" +
      "t\030\002 \001(\t\022\022\n\nclientPort\030\003 \001(\005\022\014\n\004core\030\004 \001(" +
      "\t\022\016\n\006memory\030\005 \001(\t\022a\n\nclientType\030\006 \001(\0162M." +
      "com.samsung.sds.brightics.common.network" +
      ".proto.ClientReadyMessage.ClientType\"#\n\n" +
      "ClientType\022\t\n\005SPARK\020\000\022\n\n\006PYTHON\020\001\"$\n\020Hea" +
      "rtbeatMessage\022\020\n\010clientId\030\001 \001(\t*U\n\013Conte" +
      "xtType\022\t\n\005SCALA\020\000\022\n\n\006PYTHON\020\001\022\016\n\nFILESYS" +
      "TEM\020\002\022\r\n\005REDIS\020\003\032\002\010\001\022\014\n\010KV_STORE\020\003\032\002\020\001*&" +
      "\n\rMessageStatus\022\013\n\007SUCCESS\020\000\022\010\n\004FAIL\020\0012\313" +
      "\002\n\rCommonService\022\236\001\n\022receiveClientReady\022" +
      "B.com.samsung.sds.brightics.common.netwo" +
      "rk.proto.ClientReadyMessage\032B.com.samsun" +
      "g.sds.brightics.common.network.proto.Cli" +
      "entReadyMessage\"\000\022\230\001\n\020receiveHeartbeat\022@" +
      ".com.samsung.sds.brightics.common.networ" +
      "k.proto.HeartbeatMessage\032@.com.samsung.s" +
      "ds.brightics.common.network.proto.Heartb" +
      "eatMessage\"\000B\017B\013CommonProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_samsung_sds_brightics_common_network_proto_SuccessResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_samsung_sds_brightics_common_network_proto_SuccessResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_samsung_sds_brightics_common_network_proto_SuccessResult_descriptor,
        new java.lang.String[] { "Result", "ElapsedTime", });
    internal_static_com_samsung_sds_brightics_common_network_proto_FailResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_samsung_sds_brightics_common_network_proto_FailResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_samsung_sds_brightics_common_network_proto_FailResult_descriptor,
        new java.lang.String[] { "Message", "DetailMessage", "Errors", });
    internal_static_com_samsung_sds_brightics_common_network_proto_ClientReadyMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_samsung_sds_brightics_common_network_proto_ClientReadyMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_samsung_sds_brightics_common_network_proto_ClientReadyMessage_descriptor,
        new java.lang.String[] { "ClientId", "ClientHost", "ClientPort", "Core", "Memory", "ClientType", });
    internal_static_com_samsung_sds_brightics_common_network_proto_HeartbeatMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_samsung_sds_brightics_common_network_proto_HeartbeatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_samsung_sds_brightics_common_network_proto_HeartbeatMessage_descriptor,
        new java.lang.String[] { "ClientId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
