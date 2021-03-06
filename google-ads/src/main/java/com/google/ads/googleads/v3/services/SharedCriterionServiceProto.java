// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/shared_criterion_service.proto

package com.google.ads.googleads.v3.services;

public final class SharedCriterionServiceProto {
  private SharedCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetSharedCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetSharedCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateSharedCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateSharedCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_SharedCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_SharedCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateSharedCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateSharedCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateSharedCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateSharedCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v3/services/share" +
      "d_criterion_service.proto\022 google.ads.go" +
      "ogleads.v3.services\0328google/ads/googlead" +
      "s/v3/resources/shared_criterion.proto\032\034g" +
      "oogle/api/annotations.proto\032\027google/api/" +
      "client.proto\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\032\027google" +
      "/rpc/status.proto\"d\n\031GetSharedCriterionR" +
      "equest\022G\n\rresource_name\030\001 \001(\tB0\340A\002\372A*\n(g" +
      "oogleads.googleapis.com/SharedCriterion\"" +
      "\274\001\n\033MutateSharedCriteriaRequest\022\030\n\013custo" +
      "mer_id\030\001 \001(\tB\003\340A\002\022S\n\noperations\030\002 \003(\0132:." +
      "google.ads.googleads.v3.services.SharedC" +
      "riterionOperationB\003\340A\002\022\027\n\017partial_failur" +
      "e\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\177\n\030Shared" +
      "CriterionOperation\022D\n\006create\030\001 \001(\01322.goo" +
      "gle.ads.googleads.v3.resources.SharedCri" +
      "terionH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"" +
      "\241\001\n\034MutateSharedCriteriaResponse\0221\n\025part" +
      "ial_failure_error\030\003 \001(\0132\022.google.rpc.Sta" +
      "tus\022N\n\007results\030\002 \003(\0132=.google.ads.google" +
      "ads.v3.services.MutateSharedCriterionRes" +
      "ult\"4\n\033MutateSharedCriterionResult\022\025\n\rre" +
      "source_name\030\001 \001(\t2\370\003\n\026SharedCriterionSer" +
      "vice\022\317\001\n\022GetSharedCriterion\022;.google.ads" +
      ".googleads.v3.services.GetSharedCriterio" +
      "nRequest\0322.google.ads.googleads.v3.resou" +
      "rces.SharedCriterion\"H\202\323\344\223\0022\0220/v3/{resou" +
      "rce_name=customers/*/sharedCriteria/*}\332A" +
      "\rresource_name\022\356\001\n\024MutateSharedCriteria\022" +
      "=.google.ads.googleads.v3.services.Mutat" +
      "eSharedCriteriaRequest\032>.google.ads.goog" +
      "leads.v3.services.MutateSharedCriteriaRe" +
      "sponse\"W\202\323\344\223\0028\"3/v3/customers/{customer_" +
      "id=*}/sharedCriteria:mutate:\001*\332A\026custome" +
      "r_id,operations\032\033\312A\030googleads.googleapis" +
      ".comB\202\002\n$com.google.ads.googleads.v3.ser" +
      "vicesB\033SharedCriterionServiceProtoP\001ZHgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v3/services;services\242\002\003GAA\252\002 G" +
      "oogle.Ads.GoogleAds.V3.Services\312\002 Google" +
      "\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads" +
      "::GoogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.SharedCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetSharedCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetSharedCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetSharedCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateSharedCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateSharedCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateSharedCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_SharedCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_SharedCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_SharedCriterionOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateSharedCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateSharedCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateSharedCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateSharedCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateSharedCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateSharedCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.SharedCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
