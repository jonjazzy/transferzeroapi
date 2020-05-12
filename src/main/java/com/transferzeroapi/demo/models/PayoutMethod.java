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
import com.transferzero.sdk.model.PayoutMethodDetails;
import com.transferzero.sdk.model.ValidationErrorDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * This describes the specific details on how the payment has to be routed to the recipient.
 */
@ApiModel(description = "This describes the specific details on how the payment has to be routed to the recipient.")

public class PayoutMethod {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private PayoutMethodDetails details = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Map<String, List<ValidationErrorDescription>> errors = new HashMap<>();

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Map<String, FieldDescription> fields = new HashMap<>();

  public PayoutMethod type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Contains the currency to send the money to, and the type of the money movement  Commonly used payout types are:  - &#x60;NGN::Bank&#x60; - for Nigerian bank account payments. - &#x60;NGN::Mobile&#x60; - for Nigerian mobile money payments. - &#x60;GHS::Bank&#x60; - for Ghanaian bank account payments. - &#x60;GHS::Mobile&#x60; - for Ghanaian mobile money payments. - &#x60;UGX::Mobile&#x60; - for Ugandan mobile money payments. - &#x60;TZS::Mobile&#x60; - for Tanzanian mobile money payments. - &#x60;XOF::Mobile&#x60; - for Senegalese mobile money payments. - &#x60;XOF::Bank&#x60; - for Senegalese bank account payments. *** Currently in Beta phase *** - &#x60;XOF::Cash&#x60; - for Senegalese cash remittance payments. - &#x60;MAD::Cash&#x60; - for Moroccan cash remittance payments. - &#x60;EUR::Bank&#x60; - for IBAN bank transfers in EUR. - &#x60;GBP::Bank&#x60; - for IBAN bank transfers in GBP.  You can also send funds to the internal balance using &#x60;CCY::Balance&#x60;, where &#x60;CCY&#x60; is the appropriate currency. See [Collection from senders](https://docs.transferzero.com/docs/additional-features/#collections-from-senders) for more info on how to collect money into internal balance 
   * @return type
  **/
  @ApiModelProperty(example = "NGN::Bank", value = "Contains the currency to send the money to, and the type of the money movement  Commonly used payout types are:  - `NGN::Bank` - for Nigerian bank account payments. - `NGN::Mobile` - for Nigerian mobile money payments. - `GHS::Bank` - for Ghanaian bank account payments. - `GHS::Mobile` - for Ghanaian mobile money payments. - `UGX::Mobile` - for Ugandan mobile money payments. - `TZS::Mobile` - for Tanzanian mobile money payments. - `XOF::Mobile` - for Senegalese mobile money payments. - `XOF::Bank` - for Senegalese bank account payments. *** Currently in Beta phase *** - `XOF::Cash` - for Senegalese cash remittance payments. - `MAD::Cash` - for Moroccan cash remittance payments. - `EUR::Bank` - for IBAN bank transfers in EUR. - `GBP::Bank` - for IBAN bank transfers in GBP.  You can also send funds to the internal balance using `CCY::Balance`, where `CCY` is the appropriate currency. See [Collection from senders](https://docs.transferzero.com/docs/additional-features/#collections-from-senders) for more info on how to collect money into internal balance ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PayoutMethod details(PayoutMethodDetails details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodDetails getDetails() {
    return details;
  }

  public void setDetails(PayoutMethodDetails details) {
    this.details = details;
  }

  public PayoutMethod metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata of payout method. You can store any kind of information in this field.
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "Metadata of payout method. You can store any kind of information in this field.")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public PayoutMethod id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

   /**
   * The fields that have some problems and don&#39;t pass validation
   * @return errors
  **/
  @ApiModelProperty(example = "{\"phone_number\":[{\"error\":\"invalid\"}],\"documents\":[{\"error\":\"blank\"}]}", value = "The fields that have some problems and don't pass validation")
  public Map<String, List<ValidationErrorDescription>> getErrors() {
    return errors;
  }

   /**
   * The fields needed for payments with this payment method with details on validation requirements
   * @return fields
  **/
  @ApiModelProperty(example = "{\"email\":{\"type\":\"input\",\"validations\":{\"inclusion\":{\"in\":{\"NI\":\"National Id\",\"PP\":\"Passport\"},\"allow_blank\":true}}}}", value = "The fields needed for payments with this payment method with details on validation requirements")
  public Map<String, FieldDescription> getFields() {
    return fields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethod payoutMethod = (PayoutMethod) o;
    return Objects.equals(this.type, payoutMethod.type) &&
        Objects.equals(this.details, payoutMethod.details) &&
        Objects.equals(this.metadata, payoutMethod.metadata) &&
        Objects.equals(this.id, payoutMethod.id) &&
        Objects.equals(this.errors, payoutMethod.errors) &&
        Objects.equals(this.fields, payoutMethod.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, details, metadata, id, errors, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethod {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
