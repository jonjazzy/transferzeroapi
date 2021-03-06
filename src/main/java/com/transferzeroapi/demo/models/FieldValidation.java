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
import com.transferzero.sdk.model.FieldSelectValidation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FieldValidation
 */

public class FieldValidation {
  public static final String SERIALIZED_NAME_PRESENCE = "presence";
  @SerializedName(SERIALIZED_NAME_PRESENCE)
  private Boolean presence;

  public static final String SERIALIZED_NAME_INCLUSION = "inclusion";
  @SerializedName(SERIALIZED_NAME_INCLUSION)
  private FieldSelectValidation inclusion = null;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private Object format = null;

   /**
   * Describes whether the field is mandatory or not
   * @return presence
  **/
  @ApiModelProperty(example = "true", value = "Describes whether the field is mandatory or not")
  public Boolean getPresence() {
    return presence;
  }

  public FieldValidation inclusion(FieldSelectValidation inclusion) {
    this.inclusion = inclusion;
    return this;
  }

   /**
   * Get inclusion
   * @return inclusion
  **/
  @ApiModelProperty(value = "")
  public FieldSelectValidation getInclusion() {
    return inclusion;
  }

  public void setInclusion(FieldSelectValidation inclusion) {
    this.inclusion = inclusion;
  }

   /**
   * Contains the regex to use to validate the input field
   * @return format
  **/
  @ApiModelProperty(example = "{\"with\":\"(?-mix:\\\\A\\\\d+\\\\z)\"}", value = "Contains the regex to use to validate the input field")
  public Object getFormat() {
    return format;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldValidation fieldValidation = (FieldValidation) o;
    return Objects.equals(this.presence, fieldValidation.presence) &&
        Objects.equals(this.inclusion, fieldValidation.inclusion) &&
        Objects.equals(this.format, fieldValidation.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presence, inclusion, format);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldValidation {\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    inclusion: ").append(toIndentedString(inclusion)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

