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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * Whenever objects in the TransferZero API change state, we can optionally send the changed details to a pre-registered webhook address. Webhooks can be created either using the [developer portal](https://developers.transferzero.com), or using the [TransferZero API](#operations-tag-Webhooks).  Whenever possible we prefer using webhooks to listen on events (for example when a transaction has been paid out) instead of polling the status, and we expect implementations fully utilising webhooks.  Webhooks will always generate a &#x60;POST&#x60; request to the specified endpoint, and will also include the same authentication headers as described in the [authentication documentation](https://docs.transferzero.com/docs/authentication), so their validity can be verified on the receiver end.
 */
@ApiModel(description = "Whenever objects in the TransferZero API change state, we can optionally send the changed details to a pre-registered webhook address. Webhooks can be created either using the [developer portal](https://developers.transferzero.com), or using the [TransferZero API](#operations-tag-Webhooks).  Whenever possible we prefer using webhooks to listen on events (for example when a transaction has been paid out) instead of polling the status, and we expect implementations fully utilising webhooks.  Webhooks will always generate a `POST` request to the specified endpoint, and will also include the same authentication headers as described in the [authentication documentation](https://docs.transferzero.com/docs/authentication), so their validity can be verified on the receiver end.")

public class Webhook {
  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private UUID webhook;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private Object _object = null;

   /**
   * The ID of the webhook that was used to send out this callback
   * @return webhook
  **/
  @ApiModelProperty(example = "b2f574ff-7efe-4579-9f16-fcb9097e5ab6", required = true, value = "The ID of the webhook that was used to send out this callback")
  public UUID getWebhook() {
    return webhook;
  }

   /**
   * The event that triggered this webhook
   * @return event
  **/
  @ApiModelProperty(example = "transaction.paid", required = true, value = "The event that triggered this webhook")
  public String getEvent() {
    return event;
  }

  public Webhook _object(Object _object) {
    this._object = _object;
    return this;
  }

   /**
   * The returned object
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "The returned object")
  public Object getObject() {
    return _object;
  }

  public void setObject(Object _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.webhook, webhook.webhook) &&
        Objects.equals(this.event, webhook.event) &&
        Objects.equals(this._object, webhook._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook, event, _object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

