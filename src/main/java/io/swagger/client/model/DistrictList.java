package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DistrictList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class DistrictList {
  @SerializedName("abbreviation")
  private String abbreviation = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("year")
  private Integer year = null;

  public DistrictList abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * The short identifier for the district.
   * @return abbreviation
  **/
  @ApiModelProperty(required = true, value = "The short identifier for the district.")
  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public DistrictList displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The long name for the district.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The long name for the district.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public DistrictList key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Key for this district, e.g. `2016ne`.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key for this district, e.g. `2016ne`.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public DistrictList year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Year this district participated.
   * @return year
  **/
  @ApiModelProperty(required = true, value = "Year this district participated.")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistrictList districtList = (DistrictList) o;
    return Objects.equals(this.abbreviation, districtList.abbreviation) &&
        Objects.equals(this.displayName, districtList.displayName) &&
        Objects.equals(this.key, districtList.key) &&
        Objects.equals(this.year, districtList.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, displayName, key, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistrictList {\n");
    
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

