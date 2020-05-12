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
import com.transferzero.sdk.model.Debit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DebitRequest
 */

public class DebitRequest {
  public static final String SERIALIZED_NAME_DEBIT = "debit";
  @SerializedName(SERIALIZED_NAME_DEBIT)
  private Debit debit = null;

  public DebitRequest debit(Debit debit) {
    this.debit = debit;
    return this;
  }

   /**
   * Get debit
   * @return debit
  **/
  @ApiModelProperty(value = "")
  public Debit getDebit() {
    return debit;
  }

  public void setDebit(Debit debit) {
    this.debit = debit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebitRequest debitRequest = (DebitRequest) o;
    return Objects.equals(this.debit, debitRequest.debit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebitRequest {\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
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
