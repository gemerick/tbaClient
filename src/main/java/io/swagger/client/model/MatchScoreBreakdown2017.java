package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MatchScoreBreakdown2017Alliance;

/**
 * See the 2017 FMS API documentation for a description of each value.
 */
@ApiModel(description = "See the 2017 FMS API documentation for a description of each value.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class MatchScoreBreakdown2017 {
  @SerializedName("blue")
  private MatchScoreBreakdown2017Alliance blue = null;

  @SerializedName("red")
  private MatchScoreBreakdown2017Alliance red = null;

  public MatchScoreBreakdown2017 blue(MatchScoreBreakdown2017Alliance blue) {
    this.blue = blue;
    return this;
  }

   /**
   * Get blue
   * @return blue
  **/
  @ApiModelProperty(value = "")
  public MatchScoreBreakdown2017Alliance getBlue() {
    return blue;
  }

  public void setBlue(MatchScoreBreakdown2017Alliance blue) {
    this.blue = blue;
  }

  public MatchScoreBreakdown2017 red(MatchScoreBreakdown2017Alliance red) {
    this.red = red;
    return this;
  }

   /**
   * Get red
   * @return red
  **/
  @ApiModelProperty(value = "")
  public MatchScoreBreakdown2017Alliance getRed() {
    return red;
  }

  public void setRed(MatchScoreBreakdown2017Alliance red) {
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
    MatchScoreBreakdown2017 matchScoreBreakdown2017 = (MatchScoreBreakdown2017) o;
    return Objects.equals(this.blue, matchScoreBreakdown2017.blue) &&
        Objects.equals(this.red, matchScoreBreakdown2017.red);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blue, red);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2017 {\n");
    
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

