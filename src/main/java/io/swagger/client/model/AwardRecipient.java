package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An &#x60;Award_Recipient&#x60; object represents the team and/or person who received an award at an event.
 */
@ApiModel(description = "An `Award_Recipient` object represents the team and/or person who received an award at an event.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class AwardRecipient {
  @SerializedName("team_key")
  private String teamKey = null;

  @SerializedName("awardee")
  private String awardee = null;

  public AwardRecipient teamKey(String teamKey) {
    this.teamKey = teamKey;
    return this;
  }

   /**
   * The TBA team key for the team that was given the award. May be null.
   * @return teamKey
  **/
  @ApiModelProperty(value = "The TBA team key for the team that was given the award. May be null.")
  public String getTeamKey() {
    return teamKey;
  }

  public void setTeamKey(String teamKey) {
    this.teamKey = teamKey;
  }

  public AwardRecipient awardee(String awardee) {
    this.awardee = awardee;
    return this;
  }

   /**
   * The name of the individual given the award. May be null.
   * @return awardee
  **/
  @ApiModelProperty(value = "The name of the individual given the award. May be null.")
  public String getAwardee() {
    return awardee;
  }

  public void setAwardee(String awardee) {
    this.awardee = awardee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwardRecipient awardRecipient = (AwardRecipient) o;
    return Objects.equals(this.teamKey, awardRecipient.teamKey) &&
        Objects.equals(this.awardee, awardRecipient.awardee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamKey, awardee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwardRecipient {\n");
    
    sb.append("    teamKey: ").append(toIndentedString(teamKey)).append("\n");
    sb.append("    awardee: ").append(toIndentedString(awardee)).append("\n");
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

