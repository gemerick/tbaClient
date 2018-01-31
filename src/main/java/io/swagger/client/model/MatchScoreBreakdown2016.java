package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MatchScoreBreakdown2016Alliance;

/**
 * See the 2016 FMS API documentation for a description of each value.
 */
@ApiModel(description = "See the 2016 FMS API documentation for a description of each value.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class MatchScoreBreakdown2016 {
  @SerializedName("blue")
  private MatchScoreBreakdown2016Alliance blue = null;

  @SerializedName("red")
  private MatchScoreBreakdown2016Alliance red = null;

  public MatchScoreBreakdown2016 blue(MatchScoreBreakdown2016Alliance blue) {
    this.blue = blue;
    return this;
  }

   /**
   * Get blue
   * @return blue
  **/
  @ApiModelProperty(value = "")
  public MatchScoreBreakdown2016Alliance getBlue() {
    return blue;
  }

  public void setBlue(MatchScoreBreakdown2016Alliance blue) {
    this.blue = blue;
  }

  public MatchScoreBreakdown2016 red(MatchScoreBreakdown2016Alliance red) {
    this.red = red;
    return this;
  }

   /**
   * Get red
   * @return red
  **/
  @ApiModelProperty(value = "")
  public MatchScoreBreakdown2016Alliance getRed() {
    return red;
  }

  public void setRed(MatchScoreBreakdown2016Alliance red) {
    this.red = red;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchScoreBreakdown2016 matchScoreBreakdown2016 = (MatchScoreBreakdown2016) o;
    return Objects.equals(this.blue, matchScoreBreakdown2016.blue) &&
        Objects.equals(this.red, matchScoreBreakdown2016.red);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blue, red);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2016 {\n");
    
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
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

