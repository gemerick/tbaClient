package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MatchScoreBreakdown2015Alliance
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class MatchScoreBreakdown2015Alliance {
  @SerializedName("auto_points")
  private Integer autoPoints = null;

  @SerializedName("teleop_points")
  private Integer teleopPoints = null;

  @SerializedName("container_points")
  private Integer containerPoints = null;

  @SerializedName("tote_points")
  private Integer totePoints = null;

  @SerializedName("litter_points")
  private Integer litterPoints = null;

  @SerializedName("foul_points")
  private Integer foulPoints = null;

  @SerializedName("adjust_points")
  private Integer adjustPoints = null;

  @SerializedName("total_points")
  private Integer totalPoints = null;

  @SerializedName("foul_count")
  private Integer foulCount = null;

  @SerializedName("tote_count_far")
  private Integer toteCountFar = null;

  @SerializedName("tote_count_near")
  private Integer toteCountNear = null;

  @SerializedName("tote_set")
  private Boolean toteSet = null;

  @SerializedName("tote_stack")
  private Boolean toteStack = null;

  @SerializedName("container_count_level1")
  private Integer containerCountLevel1 = null;

  @SerializedName("container_count_level2")
  private Integer containerCountLevel2 = null;

  @SerializedName("container_count_level3")
  private Integer containerCountLevel3 = null;

  @SerializedName("container_count_level4")
  private Integer containerCountLevel4 = null;

  @SerializedName("container_count_level5")
  private Integer containerCountLevel5 = null;

  @SerializedName("container_count_level6")
  private Integer containerCountLevel6 = null;

  @SerializedName("container_set")
  private Boolean containerSet = null;

  @SerializedName("litter_count_container")
  private Integer litterCountContainer = null;

  @SerializedName("litter_count_landfill")
  private Integer litterCountLandfill = null;

  @SerializedName("litter_count_unprocessed")
  private Integer litterCountUnprocessed = null;

  @SerializedName("robot_set")
  private Boolean robotSet = null;

  public MatchScoreBreakdown2015Alliance autoPoints(Integer autoPoints) {
    this.autoPoints = autoPoints;
    return this;
  }

   /**
   * Get autoPoints
   * @return autoPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoPoints() {
    return autoPoints;
  }

  public void setAutoPoints(Integer autoPoints) {
    this.autoPoints = autoPoints;
  }

  public MatchScoreBreakdown2015Alliance teleopPoints(Integer teleopPoints) {
    this.teleopPoints = teleopPoints;
    return this;
  }

   /**
   * Get teleopPoints
   * @return teleopPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopPoints() {
    return teleopPoints;
  }

  public void setTeleopPoints(Integer teleopPoints) {
    this.teleopPoints = teleopPoints;
  }

  public MatchScoreBreakdown2015Alliance containerPoints(Integer containerPoints) {
    this.containerPoints = containerPoints;
    return this;
  }

   /**
   * Get containerPoints
   * @return containerPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getContainerPoints() {
    return containerPoints;
  }

  public void setContainerPoints(Integer containerPoints) {
    this.containerPoints = containerPoints;
  }

  public MatchScoreBreakdown2015Alliance totePoints(Integer totePoints) {
    this.totePoints = totePoints;
    return this;
  }

   /**
   * Get totePoints
   * @return totePoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTotePoints() {
    return totePoints;
  }

  public void setTotePoints(Integer totePoints) {
    this.totePoints = totePoints;
  }

  public MatchScoreBreakdown2015Alliance litterPoints(Integer litterPoints) {
    this.litterPoints = litterPoints;
    return this;
  }

   /**
   * Get litterPoints
   * @return litterPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getLitterPoints() {
    return litterPoints;
  }

  public void setLitterPoints(Integer litterPoints) {
    this.litterPoints = litterPoints;
  }

  public MatchScoreBreakdown2015Alliance foulPoints(Integer foulPoints) {
    this.foulPoints = foulPoints;
    return this;
  }

   /**
   * Get foulPoints
   * @return foulPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getFoulPoints() {
    return foulPoints;
  }

  public void setFoulPoints(Integer foulPoints) {
    this.foulPoints = foulPoints;
  }

  public MatchScoreBreakdown2015Alliance adjustPoints(Integer adjustPoints) {
    this.adjustPoints = adjustPoints;
    return this;
  }

   /**
   * Get adjustPoints
   * @return adjustPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAdjustPoints() {
    return adjustPoints;
  }

  public void setAdjustPoints(Integer adjustPoints) {
    this.adjustPoints = adjustPoints;
  }

  public MatchScoreBreakdown2015Alliance totalPoints(Integer totalPoints) {
    this.totalPoints = totalPoints;
    return this;
  }

   /**
   * Get totalPoints
   * @return totalPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalPoints() {
    return totalPoints;
  }

  public void setTotalPoints(Integer totalPoints) {
    this.totalPoints = totalPoints;
  }

  public MatchScoreBreakdown2015Alliance foulCount(Integer foulCount) {
    this.foulCount = foulCount;
    return this;
  }

   /**
   * Get foulCount
   * @return foulCount
  **/
  @ApiModelProperty(value = "")
  public Integer getFoulCount() {
    return foulCount;
  }

  public void setFoulCount(Integer foulCount) {
    this.foulCount = foulCount;
  }

  public MatchScoreBreakdown2015Alliance toteCountFar(Integer toteCountFar) {
    this.toteCountFar = toteCountFar;
    return this;
  }

   /**
   * Get toteCountFar
   * @return toteCountFar
  **/
  @ApiModelProperty(value = "")
  public Integer getToteCountFar() {
    return toteCountFar;
  }

  public void setToteCountFar(Integer toteCountFar) {
    this.toteCountFar = toteCountFar;
  }

  public MatchScoreBreakdown2015Alliance toteCountNear(Integer toteCountNear) {
    this.toteCountNear = toteCountNear;
    return this;
  }

   /**
   * Get toteCountNear
   * @return toteCountNear
  **/
  @ApiModelProperty(value = "")
  public Integer getToteCountNear() {
    return toteCountNear;
  }

  public void setToteCountNear(Integer toteCountNear) {
    this.toteCountNear = toteCountNear;
  }

  public MatchScoreBreakdown2015Alliance toteSet(Boolean toteSet) {
    this.toteSet = toteSet;
    return this;
  }

   /**
   * Get toteSet
   * @return toteSet
  **/
  @ApiModelProperty(value = "")
  public Boolean getToteSet() {
    return toteSet;
  }

  public void setToteSet(Boolean toteSet) {
    this.toteSet = toteSet;
  }

  public MatchScoreBreakdown2015Alliance toteStack(Boolean toteStack) {
    this.toteStack = toteStack;
    return this;
  }

   /**
   * Get toteStack
   * @return toteStack
  **/
  @ApiModelProperty(value = "")
  public Boolean getToteStack() {
    return toteStack;
  }

  public void setToteStack(Boolean toteStack) {
    this.toteStack = toteStack;
  }

  public MatchScoreBreakdown2015Alliance containerCountLevel1(Integer containerCountLevel1) {
    this.containerCountLevel1 = containerCountLevel1;
    return this;
  }

   /**
   * Get containerCountLevel1
   * @return containerCountLevel1
  **/
  @ApiModelProperty(value = "")
  public Integer getContainerCountLevel1() {
    return containerCountLevel1;
  }

  public void setContainerCountLevel1(Integer containerCountLevel1) {
    this.containerCountLevel1 = containerCountLevel1;
  }

  public MatchScoreBreakdown2015Alliance containerCountLevel2(Integer containerCountLevel2) {
    this.containerCountLevel2 = containerCountLevel2;
    return this;
  }

   /**
   * Get containerCountLevel2
   * @return containerCountLevel2
  **/
  @ApiModelProperty(value = "")
  public Integer getContainerCountLevel2() {
    return containerCountLevel2;
  }

  public void setContainerCountLevel2(Integer containerCountLevel2) {
    this.containerCountLevel2 = containerCountLevel2;
  }

  public MatchScoreBreakdown2015Alliance containerCountLevel3(Integer containerCountLevel3) {
    this.containerCountLevel3 = containerCountLevel3;
    return this;
  }

   /**
   * Get containerCountLevel3
   * @return containerCountLevel3
  **/
  @ApiModelProperty(value = "")
  public Integer getContainerCountLevel3() {
    return containerCountLevel3;
  }

  public void setContainerCountLevel3(Integer containerCountLevel3) {
    this.containerCountLevel3 = containerCountLevel3;
  }

  public MatchScoreBreakdown2015Alliance containerCountLevel4(Integer containerCountLevel4) {
    this.containerCountLevel4 = containerCountLevel4;
    return this;
  }

   /**
   * Get containerCountLevel4
   * @return containerCountLevel4
  **/
  @ApiModelProperty(value = "")
  public Integer getContainerCountLevel4() {
    return containerCountLevel4;
  }

  public void setContainerCountLevel4(Integer containerCountLevel4) {
    this.containerCountLevel4 = containerCountLevel4;
  }

  public MatchScoreBreakdown2015Alliance containerCountLevel5(Integer containerCountLevel5) {
    this.containerCountLevel5 = containerCountLevel5;
    return this;
  }

   /**
   * Get containerCountLevel5
   * @return containerCountLevel5
  **/
  @ApiModelProperty(value = "")
  public Integer getContainerCountLevel5() {
    return containerCountLevel5;
  }

  public void setContainerCountLevel5(Integer containerCountLevel5) {
    this.containerCountLevel5 = containerCountLevel5;
  }

  public MatchScoreBreakdown2015Alliance containerCountLevel6(Integer containerCountLevel6) {
    this.containerCountLevel6 = containerCountLevel6;
    return this;
  }

   /**
   * Get containerCountLevel6
   * @return containerCountLevel6
  **/
  @ApiModelProperty(value = "")
  public Integer getContainerCountLevel6() {
    return containerCountLevel6;
  }

  public void setContainerCountLevel6(Integer containerCountLevel6) {
    this.containerCountLevel6 = containerCountLevel6;
  }

  public MatchScoreBreakdown2015Alliance containerSet(Boolean containerSet) {
    this.containerSet = containerSet;
    return this;
  }

   /**
   * Get containerSet
   * @return containerSet
  **/
  @ApiModelProperty(value = "")
  public Boolean getContainerSet() {
    return containerSet;
  }

  public void setContainerSet(Boolean containerSet) {
    this.containerSet = containerSet;
  }

  public MatchScoreBreakdown2015Alliance litterCountContainer(Integer litterCountContainer) {
    this.litterCountContainer = litterCountContainer;
    return this;
  }

   /**
   * Get litterCountContainer
   * @return litterCountContainer
  **/
  @ApiModelProperty(value = "")
  public Integer getLitterCountContainer() {
    return litterCountContainer;
  }

  public void setLitterCountContainer(Integer litterCountContainer) {
    this.litterCountContainer = litterCountContainer;
  }

  public MatchScoreBreakdown2015Alliance litterCountLandfill(Integer litterCountLandfill) {
    this.litterCountLandfill = litterCountLandfill;
    return this;
  }

   /**
   * Get litterCountLandfill
   * @return litterCountLandfill
  **/
  @ApiModelProperty(value = "")
  public Integer getLitterCountLandfill() {
    return litterCountLandfill;
  }

  public void setLitterCountLandfill(Integer litterCountLandfill) {
    this.litterCountLandfill = litterCountLandfill;
  }

  public MatchScoreBreakdown2015Alliance litterCountUnprocessed(Integer litterCountUnprocessed) {
    this.litterCountUnprocessed = litterCountUnprocessed;
    return this;
  }

   /**
   * Get litterCountUnprocessed
   * @return litterCountUnprocessed
  **/
  @ApiModelProperty(value = "")
  public Integer getLitterCountUnprocessed() {
    return litterCountUnprocessed;
  }

  public void setLitterCountUnprocessed(Integer litterCountUnprocessed) {
    this.litterCountUnprocessed = litterCountUnprocessed;
  }

  public MatchScoreBreakdown2015Alliance robotSet(Boolean robotSet) {
    this.robotSet = robotSet;
    return this;
  }

   /**
   * Get robotSet
   * @return robotSet
  **/
  @ApiModelProperty(value = "")
  public Boolean getRobotSet() {
    return robotSet;
  }

  public void setRobotSet(Boolean robotSet) {
    this.robotSet = robotSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchScoreBreakdown2015Alliance matchScoreBreakdown2015Alliance = (MatchScoreBreakdown2015Alliance) o;
    return Objects.equals(this.autoPoints, matchScoreBreakdown2015Alliance.autoPoints) &&
        Objects.equals(this.teleopPoints, matchScoreBreakdown2015Alliance.teleopPoints) &&
        Objects.equals(this.containerPoints, matchScoreBreakdown2015Alliance.containerPoints) &&
        Objects.equals(this.totePoints, matchScoreBreakdown2015Alliance.totePoints) &&
        Objects.equals(this.litterPoints, matchScoreBreakdown2015Alliance.litterPoints) &&
        Objects.equals(this.foulPoints, matchScoreBreakdown2015Alliance.foulPoints) &&
        Objects.equals(this.adjustPoints, matchScoreBreakdown2015Alliance.adjustPoints) &&
        Objects.equals(this.totalPoints, matchScoreBreakdown2015Alliance.totalPoints) &&
        Objects.equals(this.foulCount, matchScoreBreakdown2015Alliance.foulCount) &&
        Objects.equals(this.toteCountFar, matchScoreBreakdown2015Alliance.toteCountFar) &&
        Objects.equals(this.toteCountNear, matchScoreBreakdown2015Alliance.toteCountNear) &&
        Objects.equals(this.toteSet, matchScoreBreakdown2015Alliance.toteSet) &&
        Objects.equals(this.toteStack, matchScoreBreakdown2015Alliance.toteStack) &&
        Objects.equals(this.containerCountLevel1, matchScoreBreakdown2015Alliance.containerCountLevel1) &&
        Objects.equals(this.containerCountLevel2, matchScoreBreakdown2015Alliance.containerCountLevel2) &&
        Objects.equals(this.containerCountLevel3, matchScoreBreakdown2015Alliance.containerCountLevel3) &&
        Objects.equals(this.containerCountLevel4, matchScoreBreakdown2015Alliance.containerCountLevel4) &&
        Objects.equals(this.containerCountLevel5, matchScoreBreakdown2015Alliance.containerCountLevel5) &&
        Objects.equals(this.containerCountLevel6, matchScoreBreakdown2015Alliance.containerCountLevel6) &&
        Objects.equals(this.containerSet, matchScoreBreakdown2015Alliance.containerSet) &&
        Objects.equals(this.litterCountContainer, matchScoreBreakdown2015Alliance.litterCountContainer) &&
        Objects.equals(this.litterCountLandfill, matchScoreBreakdown2015Alliance.litterCountLandfill) &&
        Objects.equals(this.litterCountUnprocessed, matchScoreBreakdown2015Alliance.litterCountUnprocessed) &&
        Objects.equals(this.robotSet, matchScoreBreakdown2015Alliance.robotSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoPoints, teleopPoints, containerPoints, totePoints, litterPoints, foulPoints, adjustPoints, totalPoints, foulCount, toteCountFar, toteCountNear, toteSet, toteStack, containerCountLevel1, containerCountLevel2, containerCountLevel3, containerCountLevel4, containerCountLevel5, containerCountLevel6, containerSet, litterCountContainer, litterCountLandfill, litterCountUnprocessed, robotSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2015Alliance {\n");
    
    sb.append("    autoPoints: ").append(toIndentedString(autoPoints)).append("\n");
    sb.append("    teleopPoints: ").append(toIndentedString(teleopPoints)).append("\n");
    sb.append("    containerPoints: ").append(toIndentedString(containerPoints)).append("\n");
    sb.append("    totePoints: ").append(toIndentedString(totePoints)).append("\n");
    sb.append("    litterPoints: ").append(toIndentedString(litterPoints)).append("\n");
    sb.append("    foulPoints: ").append(toIndentedString(foulPoints)).append("\n");
    sb.append("    adjustPoints: ").append(toIndentedString(adjustPoints)).append("\n");
    sb.append("    totalPoints: ").append(toIndentedString(totalPoints)).append("\n");
    sb.append("    foulCount: ").append(toIndentedString(foulCount)).append("\n");
    sb.append("    toteCountFar: ").append(toIndentedString(toteCountFar)).append("\n");
    sb.append("    toteCountNear: ").append(toIndentedString(toteCountNear)).append("\n");
    sb.append("    toteSet: ").append(toIndentedString(toteSet)).append("\n");
    sb.append("    toteStack: ").append(toIndentedString(toteStack)).append("\n");
    sb.append("    containerCountLevel1: ").append(toIndentedString(containerCountLevel1)).append("\n");
    sb.append("    containerCountLevel2: ").append(toIndentedString(containerCountLevel2)).append("\n");
    sb.append("    containerCountLevel3: ").append(toIndentedString(containerCountLevel3)).append("\n");
    sb.append("    containerCountLevel4: ").append(toIndentedString(containerCountLevel4)).append("\n");
    sb.append("    containerCountLevel5: ").append(toIndentedString(containerCountLevel5)).append("\n");
    sb.append("    containerCountLevel6: ").append(toIndentedString(containerCountLevel6)).append("\n");
    sb.append("    containerSet: ").append(toIndentedString(containerSet)).append("\n");
    sb.append("    litterCountContainer: ").append(toIndentedString(litterCountContainer)).append("\n");
    sb.append("    litterCountLandfill: ").append(toIndentedString(litterCountLandfill)).append("\n");
    sb.append("    litterCountUnprocessed: ").append(toIndentedString(litterCountUnprocessed)).append("\n");
    sb.append("    robotSet: ").append(toIndentedString(robotSet)).append("\n");
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

