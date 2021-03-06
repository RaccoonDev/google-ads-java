// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/custom_interest_service.proto

package com.google.ads.googleads.v1.services;

public final class CustomInterestServiceProto {
  private CustomInterestServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetCustomInterestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetCustomInterestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCustomInterestsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCustomInterestsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_CustomInterestOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_CustomInterestOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCustomInterestsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCustomInterestsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCustomInterestResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCustomInterestResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v1/services/custo" +
      "m_interest_service.proto\022 google.ads.goo" +
      "gleads.v1.services\0327google/ads/googleads" +
      "/v1/resources/custom_interest.proto\032\034goo" +
      "gle/api/annotations.proto\032 google/protob" +
      "uf/field_mask.proto\032\036google/protobuf/wra" +
      "ppers.proto\032\027google/api/client.proto\"1\n\030" +
      "GetCustomInterestRequest\022\025\n\rresource_nam" +
      "e\030\001 \001(\t\"\231\001\n\034MutateCustomInterestsRequest" +
      "\022\023\n\013customer_id\030\001 \001(\t\022M\n\noperations\030\002 \003(" +
      "\01329.google.ads.googleads.v1.services.Cus" +
      "tomInterestOperation\022\025\n\rvalidate_only\030\004 " +
      "\001(\010\"\341\001\n\027CustomInterestOperation\022/\n\013updat" +
      "e_mask\030\004 \001(\0132\032.google.protobuf.FieldMask" +
      "\022C\n\006create\030\001 \001(\01321.google.ads.googleads." +
      "v1.resources.CustomInterestH\000\022C\n\006update\030" +
      "\002 \001(\01321.google.ads.googleads.v1.resource" +
      "s.CustomInterestH\000B\013\n\toperation\"n\n\035Mutat" +
      "eCustomInterestsResponse\022M\n\007results\030\002 \003(" +
      "\0132<.google.ads.googleads.v1.services.Mut" +
      "ateCustomInterestResult\"3\n\032MutateCustomI" +
      "nterestResult\022\025\n\rresource_name\030\001 \001(\t2\320\003\n" +
      "\025CustomInterestService\022\275\001\n\021GetCustomInte" +
      "rest\022:.google.ads.googleads.v1.services." +
      "GetCustomInterestRequest\0321.google.ads.go" +
      "ogleads.v1.resources.CustomInterest\"9\202\323\344" +
      "\223\0023\0221/v1/{resource_name=customers/*/cust" +
      "omInterests/*}\022\331\001\n\025MutateCustomInterests" +
      "\022>.google.ads.googleads.v1.services.Muta" +
      "teCustomInterestsRequest\032?.google.ads.go" +
      "ogleads.v1.services.MutateCustomInterest" +
      "sResponse\"?\202\323\344\223\0029\"4/v1/customers/{custom" +
      "er_id=*}/customInterests:mutate:\001*\032\033\312A\030g" +
      "oogleads.googleapis.comB\201\002\n$com.google.a" +
      "ds.googleads.v1.servicesB\032CustomInterest" +
      "ServiceProtoP\001ZHgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v1/services;" +
      "services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V1" +
      ".Services\312\002 Google\\Ads\\GoogleAds\\V1\\Serv" +
      "ices\352\002$Google::Ads::GoogleAds::V1::Servi" +
      "cesb\006proto3"
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
          com.google.ads.googleads.v1.resources.CustomInterestProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetCustomInterestRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetCustomInterestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetCustomInterestRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateCustomInterestsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateCustomInterestsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCustomInterestsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_CustomInterestOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_CustomInterestOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_CustomInterestOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateCustomInterestsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateCustomInterestsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCustomInterestsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v1_services_MutateCustomInterestResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateCustomInterestResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCustomInterestResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.CustomInterestProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
