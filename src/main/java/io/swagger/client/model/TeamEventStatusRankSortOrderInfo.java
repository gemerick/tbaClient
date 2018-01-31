package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TeamEventStatusRankSortOrderInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class TeamEventStatusRankSortOrderInfo {
  @SerializedName("name")
  private String name = null;

  @SerializedName("precision")
  private Integer precision = null;

  public TeamEventStatusRankSortOrderInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The descriptive name of the value used to sort the ranking.
   * @return name
  **/
  @ApiModelProperty(value = "The descriptive name of the value used to sort the ranking.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TeamEventStatusRankSortOrderInfo precision(Integer precision) {
    this.precision = precision;
    return this;
  }

   /**
   * The number of digits of precision used for this value, eg `2` would correspond to a value of `101.11` while `0` would correspond to `101`.
   * @return precision
  **/
  @ApiModelProperty(value = "The number of digits of precision used for this value, eg `2` would correspond to a value of `101.11` while `0` would correspond to `101`.")
  public Integer getPrecision() {
    return precision;
  }

  public void setPrecision(Integer precision) {
    this.precision = precision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatusRankSortOrderInfo teamEventStatusRankSortOrderInfo = (TeamEventStatusRankSortOrderInfo) o;
    return Objects.equals(this.name, teamEventStatusRankSortOrderInfo.name) &&
        Objects.equals(this.precision, teamEventStatusRankSortOrderInfo.precision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, precision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatusRankSortOrderInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

