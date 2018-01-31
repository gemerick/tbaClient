package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TeamRobot
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class TeamRobot {
  @SerializedName("year")
  private Integer year = null;

  @SerializedName("robot_name")
  private String robotName = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("team_key")
  private String teamKey = null;

  public TeamRobot year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Year this robot competed in.
   * @return year
  **/
  @ApiModelProperty(required = true, value = "Year this robot competed in.")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public TeamRobot robotName(String robotName) {
    this.robotName = robotName;
    return this;
  }

   /**
   * Name of the robot as provided by the team.
   * @return robotName
  **/
  @ApiModelProperty(required = true, value = "Name of the robot as provided by the team.")
  public String getRobotName() {
    return robotName;
  }

  public void setRobotName(String robotName) {
    this.robotName = robotName;
  }

  public TeamRobot key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Internal TBA identifier for this robot.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Internal TBA identifier for this robot.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public TeamRobot teamKey(String teamKey) {
    this.teamKey = teamKey;
    return this;
  }

   /**
   * TBA team key for this robot.
   * @return teamKey
  **/
  @ApiModelProperty(required = true, value = "TBA team key for this robot.")
  public String getTeamKey() {
    return teamKey;
  }

  public void setTeamKey(String teamKey) {
    this.teamKey = teamKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamRobot teamRobot = (TeamRobot) o;
    return Objects.equals(this.year, teamRobot.year) &&
        Objects.equals(this.robotName, teamRobot.robotName) &&
        Objects.equals(this.key, teamRobot.key) &&
        Objects.equals(this.teamKey, teamRobot.teamKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, robotName, key, teamKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRobot {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    robotName: ").append(toIndentedString(robotName)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    teamKey: ").append(toIndentedString(teamKey)).append("\n");
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

