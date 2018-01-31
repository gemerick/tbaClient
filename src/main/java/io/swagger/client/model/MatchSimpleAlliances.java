package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MatchAlliance;

/**
 * A list of alliances, the teams on the alliances, and their score.
 */
@ApiModel(description = "A list of alliances, the teams on the alliances, and their score.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class MatchSimpleAlliances {
  @SerializedName("blue")
  private MatchAlliance blue = null;

  @SerializedName("red")
  private MatchAlliance red = null;

  public MatchSimpleAlliances blue(MatchAlliance blue) {
    this.blue = blue;
    return this;
  }

   /**
   * Get blue
   * @return blue
  **/
  @ApiModelProperty(value = "")
  public MatchAlliance getBlue() {
    return blue;
  }

  public void setBlue(MatchAlliance blue) {
    this.blue = blue;
  }

  public MatchSimpleAlliances red(MatchAlliance red) {
    this.red = red;
    return this;
  }

   /**
   * Get red
   * @return red
  **/
  @ApiModelProperty(value = "")
  public MatchAlliance getRed() {
    return red;
  }

  public void setRed(MatchAlliance red) {
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
    MatchSimpleAlliances matchSimpleAlliances = (MatchSimpleAlliances) o;
    return Objects.equals(this.blue, matchSimpleAlliances.blue) &&
        Objects.equals(this.red, matchSimpleAlliances.red);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blue, red);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchSimpleAlliances {\n");
    
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

