// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/customer_feed_service.proto

package com.google.ads.googleads.v2.services;

public final class CustomerFeedServiceProto {
  private CustomerFeedServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetCustomerFeedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetCustomerFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCustomerFeedsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCustomerFeedsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_CustomerFeedOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_CustomerFeedOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCustomerFeedsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCustomerFeedsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCustomerFeedResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCustomerFeedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v2/services/custo" +
      "mer_feed_service.proto\022 google.ads.googl" +
      "eads.v2.services\0325google/ads/googleads/v" +
      "2/resources/customer_feed.proto\032\034google/" +
      "api/annotations.proto\032 google/protobuf/f" +
      "ield_mask.proto\032\027google/rpc/status.proto" +
      "\032\027google/api/client.proto\"/\n\026GetCustomer" +
      "FeedRequest\022\025\n\rresource_name\030\001 \001(\t\"\256\001\n\032M" +
      "utateCustomerFeedsRequest\022\023\n\013customer_id" +
      "\030\001 \001(\t\022K\n\noperations\030\002 \003(\01327.google.ads." +
      "googleads.v2.services.CustomerFeedOperat" +
      "ion\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate" +
      "_only\030\004 \001(\010\"\355\001\n\025CustomerFeedOperation\022/\n" +
      "\013update_mask\030\004 \001(\0132\032.google.protobuf.Fie" +
      "ldMask\022A\n\006create\030\001 \001(\0132/.google.ads.goog" +
      "leads.v2.resources.CustomerFeedH\000\022A\n\006upd" +
      "ate\030\002 \001(\0132/.google.ads.googleads.v2.reso" +
      "urces.CustomerFeedH\000\022\020\n\006remove\030\003 \001(\tH\000B\013" +
      "\n\toperation\"\235\001\n\033MutateCustomerFeedsRespo" +
      "nse\0221\n\025partial_failure_error\030\003 \001(\0132\022.goo" +
      "gle.rpc.Status\022K\n\007results\030\002 \003(\0132:.google" +
      ".ads.googleads.v2.services.MutateCustome" +
      "rFeedResult\"1\n\030MutateCustomerFeedResult\022" +
      "\025\n\rresource_name\030\001 \001(\t2\276\003\n\023CustomerFeedS" +
      "ervice\022\265\001\n\017GetCustomerFeed\0228.google.ads." +
      "googleads.v2.services.GetCustomerFeedReq" +
      "uest\032/.google.ads.googleads.v2.resources" +
      ".CustomerFeed\"7\202\323\344\223\0021\022//v2/{resource_nam" +
      "e=customers/*/customerFeeds/*}\022\321\001\n\023Mutat" +
      "eCustomerFeeds\022<.google.ads.googleads.v2" +
      ".services.MutateCustomerFeedsRequest\032=.g" +
      "oogle.ads.googleads.v2.services.MutateCu" +
      "stomerFeedsResponse\"=\202\323\344\223\0027\"2/v2/custome" +
      "rs/{customer_id=*}/customerFeeds:mutate:" +
      "\001*\032\033\312A\030googleads.googleapis.comB\377\001\n$com." +
      "google.ads.googleads.v2.servicesB\030Custom" +
      "erFeedServiceProtoP\001ZHgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v2/ser" +
      "vices;services\242\002\003GAA\252\002 Google.Ads.Google" +
      "Ads.V2.Services\312\002 Google\\Ads\\GoogleAds\\V" +
      "2\\Services\352\002$Google::Ads::GoogleAds::V2:" +
      ":Servicesb\006proto3"
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
          com.google.ads.googleads.v2.resources.CustomerFeedProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetCustomerFeedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetCustomerFeedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetCustomerFeedRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateCustomerFeedsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateCustomerFeedsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCustomerFeedsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_CustomerFeedOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_CustomerFeedOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_CustomerFeedOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateCustomerFeedsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateCustomerFeedsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCustomerFeedsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_MutateCustomerFeedResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateCustomerFeedResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCustomerFeedResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.CustomerFeedProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
