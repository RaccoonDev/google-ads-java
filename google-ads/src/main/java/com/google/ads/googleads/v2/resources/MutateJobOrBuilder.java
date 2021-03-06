// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/mutate_job.proto

package com.google.ads.googleads.v2.resources;

public interface MutateJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.MutateJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the mutate job.
   * Mutate job resource names have the form:
   * `customers/{customer_id}/mutateJobs/{mutate_job_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the mutate job.
   * Mutate job resource names have the form:
   * `customers/{customer_id}/mutateJobs/{mutate_job_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * ID of this mutate job.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * ID of this mutate job.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * ID of this mutate job.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The next sequence token to use when adding operations. Only set when the
   * mutate job status is PENDING.
   * </pre>
   *
   * <code>.google.protobuf.StringValue next_add_sequence_token = 3;</code>
   */
  boolean hasNextAddSequenceToken();
  /**
   * <pre>
   * The next sequence token to use when adding operations. Only set when the
   * mutate job status is PENDING.
   * </pre>
   *
   * <code>.google.protobuf.StringValue next_add_sequence_token = 3;</code>
   */
  com.google.protobuf.StringValue getNextAddSequenceToken();
  /**
   * <pre>
   * The next sequence token to use when adding operations. Only set when the
   * mutate job status is PENDING.
   * </pre>
   *
   * <code>.google.protobuf.StringValue next_add_sequence_token = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNextAddSequenceTokenOrBuilder();

  /**
   * <pre>
   * Contains additional information about this mutate job.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.MutateJob.MutateJobMetadata metadata = 4;</code>
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Contains additional information about this mutate job.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.MutateJob.MutateJobMetadata metadata = 4;</code>
   */
  com.google.ads.googleads.v2.resources.MutateJob.MutateJobMetadata getMetadata();
  /**
   * <pre>
   * Contains additional information about this mutate job.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.MutateJob.MutateJobMetadata metadata = 4;</code>
   */
  com.google.ads.googleads.v2.resources.MutateJob.MutateJobMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Status of this mutate job.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.MutateJobStatusEnum.MutateJobStatus status = 5;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of this mutate job.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.MutateJobStatusEnum.MutateJobStatus status = 5;</code>
   */
  com.google.ads.googleads.v2.enums.MutateJobStatusEnum.MutateJobStatus getStatus();

  /**
   * <pre>
   * The resource name of the long-running operation that can be used to poll
   * for completion. Only set when the mutate job status is RUNNING or DONE.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 6;</code>
   */
  boolean hasLongRunningOperation();
  /**
   * <pre>
   * The resource name of the long-running operation that can be used to poll
   * for completion. Only set when the mutate job status is RUNNING or DONE.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 6;</code>
   */
  com.google.protobuf.StringValue getLongRunningOperation();
  /**
   * <pre>
   * The resource name of the long-running operation that can be used to poll
   * for completion. Only set when the mutate job status is RUNNING or DONE.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLongRunningOperationOrBuilder();
}
