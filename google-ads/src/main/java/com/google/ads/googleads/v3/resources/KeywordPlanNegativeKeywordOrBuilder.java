// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/keyword_plan_negative_keyword.proto

package com.google.ads.googleads.v3.resources;

public interface KeywordPlanNegativeKeywordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Keyword Plan negative keyword.
   * KeywordPlanNegativeKeyword resource names have the form:
   * `customers/{customer_id}/keywordPlanNegativeKeywords/{kp_negative_keyword_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the Keyword Plan negative keyword.
   * KeywordPlanNegativeKeyword resource names have the form:
   * `customers/{customer_id}/keywordPlanNegativeKeywords/{kp_negative_keyword_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The Keyword Plan campaign to which this negative keyword belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 2 [(.google.api.resource_reference) = { ... }</code>
   */
  boolean hasKeywordPlanCampaign();
  /**
   * <pre>
   * The Keyword Plan campaign to which this negative keyword belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 2 [(.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValue getKeywordPlanCampaign();
  /**
   * <pre>
   * The Keyword Plan campaign to which this negative keyword belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 2 [(.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getKeywordPlanCampaignOrBuilder();

  /**
   * <pre>
   * Output only. The ID of the Keyword Plan negative keyword.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the Keyword Plan negative keyword.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the Keyword Plan negative keyword.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The keyword text.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 4;</code>
   */
  boolean hasText();
  /**
   * <pre>
   * The keyword text.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 4;</code>
   */
  com.google.protobuf.StringValue getText();
  /**
   * <pre>
   * The keyword text.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * The keyword match type.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 5;</code>
   */
  int getMatchTypeValue();
  /**
   * <pre>
   * The keyword match type.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 5;</code>
   */
  com.google.ads.googleads.v3.enums.KeywordMatchTypeEnum.KeywordMatchType getMatchType();
}
