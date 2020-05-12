/*
 * TransferZero API
 * Reference documentation for the TransferZero API V1
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.transferzeroapi.demo.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.transferzero.sdk.model.WebhookLogMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebhookLog
 */

public class WebhookLog {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private WebhookLogMetadata metadata = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_PARENT_TYPE = "parent_type";
  @SerializedName(SERIALIZED_NAME_PARENT_TYPE)
  private String parentType;

   /**
   * ID of the webhook log
   * @return id
  **/
  @ApiModelProperty(example = "a0696374-de2f-4b4e-a2d7-cb4e0a1240c0", value = "ID of the webhook log")
  public String getId() {
    return id;
  }

   /**
   * Message detailing webhook event
   * @return message
  **/
  @ApiModelProperty(example = "Transaction(a0696374-de2f-4b4e-a2d7-cb4e0a1240c0) transaction.mispaid pending!", value = "Message detailing webhook event")
  public String getMessage() {
    return message;
  }

  public WebhookLog metadata(WebhookLogMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public WebhookLogMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(WebhookLogMetadata metadata) {
    this.metadata = metadata;
  }

   /**
   * Date and time of response
   * @return createdAt
  **/
  @ApiModelProperty(example = "2018-12-31T23:59:50.059+0000", value = "Date and time of response")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "a0696374-de2f-4b4e-a2d7-cb4e0a1240c0", value = "")
  public String getParentId() {
    return parentId;
  }

   /**
   * Get parentType
   * @return parentType
  **/
  @ApiModelProperty(example = "Webhook", value = "")
  public String getParentType() {
    return parentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookLog webhookLog = (WebhookLog) o;
    return Objects.equals(this.id, webhookLog.id) &&
        Objects.equals(this.message, webhookLog.message) &&
        Objects.equals(this.metadata, webhookLog.metadata) &&
        Objects.equals(this.createdAt, webhookLog.createdAt) &&
        Objects.equals(this.parentId, webhookLog.parentId) &&
        Objects.equals(this.parentType, webhookLog.parentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, metadata, createdAt, parentId, parentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookLog {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

