// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/customer_manager_link_service.proto

package com.google.ads.googleads.v3.services;

public interface MoveManagerLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.MoveManagerLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the client customer that is being moved.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the client customer that is being moved.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The resource name of the previous CustomerManagerLink.
   * The resource name has the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string previous_customer_manager_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getPreviousCustomerManagerLink();
  /**
   * <pre>
   * Required. The resource name of the previous CustomerManagerLink.
   * The resource name has the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string previous_customer_manager_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getPreviousCustomerManagerLinkBytes();

  /**
   * <pre>
   * Required. The resource name of the new manager customer that the client wants to move
   * to. Customer resource names have the format: "customers/{customer_id}"
   * </pre>
   *
   * <code>string new_manager = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getNewManager();
  /**
   * <pre>
   * Required. The resource name of the new manager customer that the client wants to move
   * to. Customer resource names have the format: "customers/{customer_id}"
   * </pre>
   *
   * <code>string new_manager = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getNewManagerBytes();
}
