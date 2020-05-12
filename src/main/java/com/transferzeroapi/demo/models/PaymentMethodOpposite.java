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
import com.transferzero.sdk.model.FieldDescription;
import com.transferzero.sdk.model.PaymentMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PaymentMethodOpposite
 */

public class PaymentMethodOpposite {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_OTC_PERMITTED = "otc_permitted";
  @SerializedName(SERIALIZED_NAME_OTC_PERMITTED)
  private Boolean otcPermitted;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<String> details = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Map<String, FieldDescription> fields = new HashMap<>();

  public static final String SERIALIZED_NAME_OPPOSITES = "opposites";
  @SerializedName(SERIALIZED_NAME_OPPOSITES)
  private List<PaymentMethod> opposites = new ArrayList<>();

   /**
   * Details currency and type of payment.
   * @return type
  **/
  @ApiModelProperty(example = "NGN::Bank", value = "Details currency and type of payment.")
  public String getType() {
    return type;
  }

   /**
   * Identifies the payment provider.
   * @return provider
  **/
  @ApiModelProperty(example = "Interswitch", value = "Identifies the payment provider.")
  public String getProvider() {
    return provider;
  }

   /**
   * Are over the counter transactions permitted?
   * @return otcPermitted
  **/
  @ApiModelProperty(example = "false", value = "Are over the counter transactions permitted?")
  public Boolean getOtcPermitted() {
    return otcPermitted;
  }

   /**
   * Fields required to make the payment depending on type.
   * @return details
  **/
  @ApiModelProperty(example = "[\"email\",\"first_name\",\"last_name\",\"address\"]", value = "Fields required to make the payment depending on type.")
  public List<String> getDetails() {
    return details;
  }

   /**
   * Boolean revealing whether this is the default payout method. Only present on payout methods
   * @return _default
  **/
  @ApiModelProperty(example = "false", value = "Boolean revealing whether this is the default payout method. Only present on payout methods")
  public Boolean getDefault() {
    return _default;
  }

   /**
   * The fields needed for payments with this payment method with details on validation requirements
   * @return fields
  **/
  @ApiModelProperty(example = "{\"email\":{\"type\":\"input\",\"validations\":{\"inclusion\":{\"in\":{\"NI\":\"National Id\",\"PP\":\"Passport\"},\"allow_blank\":true}}}}", value = "The fields needed for payments with this payment method with details on validation requirements")
  public Map<String, FieldDescription> getFields() {
    return fields;
  }

   /**
   * List of all providers that can be used in conjunction with the main provider
   * @return opposites
  **/
  @ApiModelProperty(value = "List of all providers that can be used in conjunction with the main provider")
  public List<PaymentMethod> getOpposites() {
    return opposites;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodOpposite paymentMethodOpposite = (PaymentMethodOpposite) o;
    return Objects.equals(this.type, paymentMethodOpposite.type) &&
        Objects.equals(this.provider, paymentMethodOpposite.provider) &&
        Objects.equals(this.otcPermitted, paymentMethodOpposite.otcPermitted) &&
        Objects.equals(this.details, paymentMethodOpposite.details) &&
        Objects.equals(this._default, paymentMethodOpposite._default) &&
        Objects.equals(this.fields, paymentMethodOpposite.fields) &&
        Objects.equals(this.opposites, paymentMethodOpposite.opposites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, provider, otcPermitted, details, _default, fields, opposites);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodOpposite {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    otcPermitted: ").append(toIndentedString(otcPermitted)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    opposites: ").append(toIndentedString(opposites)).append("\n");
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
