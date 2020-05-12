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
import com.transferzero.sdk.model.PayinMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PayinMethodRequest
 */

public class PayinMethodRequest {
  public static final String SERIALIZED_NAME_PAYIN_METHOD = "payin_method";
  @SerializedName(SERIALIZED_NAME_PAYIN_METHOD)
  private PayinMethod payinMethod = null;

  public PayinMethodRequest payinMethod(PayinMethod payinMethod) {
    this.payinMethod = payinMethod;
    return this;
  }

   /**
   * Get payinMethod
   * @return payinMethod
  **/
  @ApiModelProperty(value = "")
  public PayinMethod getPayinMethod() {
    return payinMethod;
  }

  public void setPayinMethod(PayinMethod payinMethod) {
    this.payinMethod = payinMethod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayinMethodRequest payinMethodRequest = (PayinMethodRequest) o;
    return Objects.equals(this.payinMethod, payinMethodRequest.payinMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payinMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayinMethodRequest {\n");
    sb.append("    payinMethod: ").append(toIndentedString(payinMethod)).append("\n");
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

