package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TeamEventStatusAlliance;
import io.swagger.client.model.TeamEventStatusPlayoff;
import io.swagger.client.model.TeamEventStatusRank;

/**
 * TeamEventStatus
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class TeamEventStatus {
  @SerializedName("qual")
  private TeamEventStatusRank qual = null;

  @SerializedName("alliance")
  private TeamEventStatusAlliance alliance = null;

  @SerializedName("playoff")
  private TeamEventStatusPlayoff playoff = null;

  @SerializedName("alliance_status_str")
  private String allianceStatusStr = null;

  @SerializedName("playoff_status_str")
  private String playoffStatusStr = null;

  @SerializedName("overall_status_str")
  private String overallStatusStr = null;

  public TeamEventStatus qual(TeamEventStatusRank qual) {
    this.qual = qual;
    return this;
  }

   /**
   * Get qual
   * @return qual
  **/
  @ApiModelProperty(value = "")
  public TeamEventStatusRank getQual() {
    return qual;
  }

  public void setQual(TeamEventStatusRank qual) {
    this.qual = qual;
  }

  public TeamEventStatus alliance(TeamEventStatusAlliance alliance) {
    this.alliance = alliance;
    return this;
  }

   /**
   * Get alliance
   * @return alliance
  **/
  @ApiModelProperty(value = "")
  public TeamEventStatusAlliance getAlliance() {
    return alliance;
  }

  public void setAlliance(TeamEventStatusAlliance alliance) {
    this.alliance = alliance;
  }

  public TeamEventStatus playoff(TeamEventStatusPlayoff playoff) {
    this.playoff = playoff;
    return this;
  }

   /**
   * Get playoff
   * @return playoff
  **/
  @ApiModelProperty(value = "")
  public TeamEventStatusPlayoff getPlayoff() {
    return playoff;
  }

  public void setPlayoff(TeamEventStatusPlayoff playoff) {
    this.playoff = playoff;
  }

  public TeamEventStatus allianceStatusStr(String allianceStatusStr) {
    this.allianceStatusStr = allianceStatusStr;
    return this;
  }

   /**
   * An HTML formatted string suitable for display to the user containing the team's alliance pick status.
   * @return allianceStatusStr
  **/
  @ApiModelProperty(value = "An HTML formatted string suitable for display to the user containing the team's alliance pick status.")
  public String getAllianceStatusStr() {
    return allianceStatusStr;
  }

  public void setAllianceStatusStr(String allianceStatusStr) {
    this.allianceStatusStr = allianceStatusStr;
  }

  public TeamEventStatus playoffStatusStr(String playoffStatusStr) {
    this.playoffStatusStr = playoffStatusStr;
    return this;
  }

   /**
   * An HTML formatter string suitable for display to the user containing the team's playoff status.
   * @return playoffStatusStr
  **/
  @ApiModelProperty(value = "An HTML formatter string suitable for display to the user containing the team's playoff status.")
  public String getPlayoffStatusStr() {
    return playoffStatusStr;
  }

  public void setPlayoffStatusStr(String playoffStatusStr) {
    this.playoffStatusStr = playoffStatusStr;
  }

  public TeamEventStatus overallStatusStr(String overallStatusStr) {
    this.overallStatusStr = overallStatusStr;
    return this;
  }

   /**
   * An HTML formatted string suitable for display to the user containing the team's overall status summary of the event.
   * @return overallStatusStr
  **/
  @ApiModelProperty(value = "An HTML formatted string suitable for display to the user containing the team's overall status summary of the event.")
  public String getOverallStatusStr() {
    return overallStatusStr;
  }

  public void setOverallStatusStr(String overallStatusStr) {
    this.overallStatusStr = overallStatusStr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatus teamEventStatus = (TeamEventStatus) o;
    return Objects.equals(this.qual, teamEventStatus.qual) &&
        Objects.equals(this.alliance, teamEventStatus.alliance) &&
        Objects.equals(this.playoff, teamEventStatus.playoff) &&
        Objects.equals(this.allianceStatusStr, teamEventStatus.allianceStatusStr) &&
        Objects.equals(this.playoffStatusStr, teamEventStatus.playoffStatusStr) &&
        Objects.equals(this.overallStatusStr, teamEventStatus.overallStatusStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qual, alliance, playoff, allianceStatusStr, playoffStatusStr, overallStatusStr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatus {\n");
    
    sb.append("    qual: ").append(toIndentedString(qual)).append("\n");
    sb.append("    alliance: ").append(toIndentedString(alliance)).append("\n");
    sb.append("    playoff: ").append(toIndentedString(playoff)).append("\n");
    sb.append("    allianceStatusStr: ").append(toIndentedString(allianceStatusStr)).append("\n");
    sb.append("    playoffStatusStr: ").append(toIndentedString(playoffStatusStr)).append("\n");
    sb.append("    overallStatusStr: ").append(toIndentedString(overallStatusStr)).append("\n");
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

