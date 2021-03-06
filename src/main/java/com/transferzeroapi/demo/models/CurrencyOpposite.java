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
import com.transferzero.sdk.model.Currency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * CurrencyOpposite
 */

public class CurrencyOpposite {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_DECIMALS = "decimals";
  @SerializedName(SERIALIZED_NAME_DECIMALS)
  private BigDecimal decimals;

  public static final String SERIALIZED_NAME_SUBUNIT_TO_UNIT = "subunit_to_unit";
  @SerializedName(SERIALIZED_NAME_SUBUNIT_TO_UNIT)
  private String subunitToUnit;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private String min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private String max;

  public static final String SERIALIZED_NAME_MARGIN = "margin";
  @SerializedName(SERIALIZED_NAME_MARGIN)
  private String margin;

  public static final String SERIALIZED_NAME_USD_EQUIVALENT = "usd_equivalent";
  @SerializedName(SERIALIZED_NAME_USD_EQUIVALENT)
  private String usdEquivalent;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private BigDecimal rate;

  public static final String SERIALIZED_NAME_MTM_RATE = "mtm_rate";
  @SerializedName(SERIALIZED_NAME_MTM_RATE)
  private BigDecimal mtmRate;

   /**
   * The currency code in 3-character alpha ISO 4217 currency format
   * @return code
  **/
  @ApiModelProperty(example = "NGN", value = "The currency code in 3-character alpha ISO 4217 currency format")
  public String getCode() {
    return code;
  }

   /**
   * Name of currency
   * @return name
  **/
  @ApiModelProperty(example = "Nigerian Naira", value = "Name of currency")
  public String getName() {
    return name;
  }

   /**
   * Symbol of currency
   * @return symbol
  **/
  @ApiModelProperty(example = "₦", value = "Symbol of currency")
  public String getSymbol() {
    return symbol;
  }

   /**
   * Number of decimal points
   * @return decimals
  **/
  @ApiModelProperty(example = "2", value = "Number of decimal points")
  public BigDecimal getDecimals() {
    return decimals;
  }

   /**
   * Subunits in Unit (eg. there are 100 cents in 1 US Dollar)
   * @return subunitToUnit
  **/
  @ApiModelProperty(example = "100", value = "Subunits in Unit (eg. there are 100 cents in 1 US Dollar)")
  public String getSubunitToUnit() {
    return subunitToUnit;
  }

   /**
   * Is this a primary currency?
   * @return primary
  **/
  @ApiModelProperty(example = "true", value = "Is this a primary currency?")
  public Boolean getPrimary() {
    return primary;
  }

   /**
   * The minimum amount allowed in a transaction
   * @return min
  **/
  @ApiModelProperty(example = "100", value = "The minimum amount allowed in a transaction")
  public String getMin() {
    return min;
  }

   /**
   * The maximum amount allowed in a transaction
   * @return max
  **/
  @ApiModelProperty(example = "50000000", value = "The maximum amount allowed in a transaction")
  public String getMax() {
    return max;
  }

   /**
   * The margin set for transactions in this currency
   * @return margin
  **/
  @ApiModelProperty(value = "The margin set for transactions in this currency")
  public String getMargin() {
    return margin;
  }

   /**
   * The equivalent of the currency to 1 USD
   * @return usdEquivalent
  **/
  @ApiModelProperty(value = "The equivalent of the currency to 1 USD")
  public String getUsdEquivalent() {
    return usdEquivalent;
  }

   /**
   * The rate of this particular currency with the base one
   * @return rate
  **/
  @ApiModelProperty(value = "The rate of this particular currency with the base one")
  public BigDecimal getRate() {
    return rate;
  }

   /**
   * Mark to market rate of this particular currency against the base one with the margin factored in
   * @return mtmRate
  **/
  @ApiModelProperty(value = "Mark to market rate of this particular currency against the base one with the margin factored in")
  public BigDecimal getMtmRate() {
    return mtmRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyOpposite currencyOpposite = (CurrencyOpposite) o;
    return Objects.equals(this.code, currencyOpposite.code) &&
        Objects.equals(this.name, currencyOpposite.name) &&
        Objects.equals(this.symbol, currencyOpposite.symbol) &&
        Objects.equals(this.decimals, currencyOpposite.decimals) &&
        Objects.equals(this.subunitToUnit, currencyOpposite.subunitToUnit) &&
        Objects.equals(this.primary, currencyOpposite.primary) &&
        Objects.equals(this.min, currencyOpposite.min) &&
        Objects.equals(this.max, currencyOpposite.max) &&
        Objects.equals(this.margin, currencyOpposite.margin) &&
        Objects.equals(this.usdEquivalent, currencyOpposite.usdEquivalent) &&
        Objects.equals(this.rate, currencyOpposite.rate) &&
        Objects.equals(this.mtmRate, currencyOpposite.mtmRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, symbol, decimals, subunitToUnit, primary, min, max, margin, usdEquivalent, rate, mtmRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyOpposite {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    subunitToUnit: ").append(toIndentedString(subunitToUnit)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    usdEquivalent: ").append(toIndentedString(usdEquivalent)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    mtmRate: ").append(toIndentedString(mtmRate)).append("\n");
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

