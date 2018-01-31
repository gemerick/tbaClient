package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MatchScoreBreakdown2015Alliance;

/**
 * See the 2015 FMS API documentation for a description of each value
 */
@ApiModel(description = "See the 2015 FMS API documentation for a description of each value")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class MatchScoreBreakdown2015 {
  @SerializedName("blue")
  private MatchScoreBreakdown2015Alliance blue = null;

  @SerializedName("red")
  private MatchScoreBreakdown2015Alliance red = null;

  /**
   * Gets or Sets coopertition
   */
  public enum CoopertitionEnum {
    @SerializedName("None")
    NONE("None"),
    
    @SerializedName("Unknown")
    UNKNOWN("Unknown"),
    
    @SerializedName("Stack")
    STACK("Stack");

    private String value;

    CoopertitionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("coopertition")
  private CoopertitionEnum coopertition = null;

  @SerializedName("coopertition_points")
  private Integer coopertitionPoints = null;

  public MatchScoreBreakdown2015 blue(MatchScoreBreakdown2015Alliance blue) {
    this.blue = blue;
    return this;
  }

   /**
   * Get blue
   * @return blue
  **/
  @ApiModelProperty(value = "")
  public MatchScoreBreakdown2015Alliance getBlue() {
    return blue;
  }

  public void setBlue(MatchScoreBreakdown2015Alliance blue) {
    this.blue = blue;
  }

  public MatchScoreBreakdown2015 red(MatchScoreBreakdown2015Alliance red) {
    this.red = red;
    return this;
  }

   /**
   * Get red
   * @return red
  **/
  @ApiModelProperty(value = "")
  public MatchScoreBreakdown2015Alliance getRed() {
    return red;
  }

  public void setRed(MatchScoreBreakdown2015Alliance red) {
    this.red = red;
  }

  public MatchScoreBreakdown2015 coopertition(CoopertitionEnum coopertition) {
    this.coopertition = coopertition;
    return this;
  }

   /**
   * Get coopertition
   * @return coopertition
  **/
  @ApiModelProperty(value = "")
  public CoopertitionEnum getCoopertition() {
    return coopertition;
  }

  public void setCoopertition(CoopertitionEnum coopertition) {
    this.coopertition = coopertition;
  }

  public MatchScoreBreakdown2015 coopertitionPoints(Integer coopertitionPoints) {
    this.coopertitionPoints = coopertitionPoints;
    return this;
  }

   /**
   * Get coopertitionPoints
   * @return coopertitionPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getCoopertitionPoints() {
    return coopertitionPoints;
  }

  public void setCoopertitionPoints(Integer coopertitionPoints) {
    this.coopertitionPoints = coopertitionPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchScoreBreakdown2015 matchScoreBreakdown2015 = (MatchScoreBreakdown2015) o;
    return Objects.equals(this.blue, matchScoreBreakdown2015.blue) &&
        Objects.equals(this.red, matchScoreBreakdown2015.red) &&
        Objects.equals(this.coopertition, matchScoreBreakdown2015.coopertition) &&
        Objects.equals(this.coopertitionPoints, matchScoreBreakdown2015.coopertitionPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blue, red, coopertition, coopertitionPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2015 {\n");
    
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
    sb.append("    coopertition: ").append(toIndentedString(coopertition)).append("\n");
    sb.append("    coopertitionPoints: ").append(toIndentedString(coopertitionPoints)).append("\n");
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

