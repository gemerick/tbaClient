package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MatchScoreBreakdown2017Alliance
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class MatchScoreBreakdown2017Alliance {
  @SerializedName("autoPoints")
  private Integer autoPoints = null;

  @SerializedName("teleopPoints")
  private Integer teleopPoints = null;

  @SerializedName("breechPoints")
  private Integer breechPoints = null;

  @SerializedName("foulPoints")
  private Integer foulPoints = null;

  @SerializedName("capturePoints")
  private Integer capturePoints = null;

  @SerializedName("adjustPoints")
  private Integer adjustPoints = null;

  @SerializedName("totalPoints")
  private Integer totalPoints = null;

  /**
   * Gets or Sets robot1Auto
   */
  public enum Robot1AutoEnum {
    @SerializedName("Unknown")
    UNKNOWN("Unknown"),
    
    @SerializedName("Mobility")
    MOBILITY("Mobility"),
    
    @SerializedName("None")
    NONE("None");

    private String value;

    Robot1AutoEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("robot1Auto")
  private Robot1AutoEnum robot1Auto = null;

  /**
   * Gets or Sets robot2Auto
   */
  public enum Robot2AutoEnum {
    @SerializedName("Unknown")
    UNKNOWN("Unknown"),
    
    @SerializedName("Mobility")
    MOBILITY("Mobility"),
    
    @SerializedName("None")
    NONE("None");

    private String value;

    Robot2AutoEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("robot2Auto")
  private Robot2AutoEnum robot2Auto = null;

  /**
   * Gets or Sets robot3Auto
   */
  public enum Robot3AutoEnum {
    @SerializedName("Unknown")
    UNKNOWN("Unknown"),
    
    @SerializedName("Mobility")
    MOBILITY("Mobility"),
    
    @SerializedName("None")
    NONE("None");

    private String value;

    Robot3AutoEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("robot3Auto")
  private Robot3AutoEnum robot3Auto = null;

  @SerializedName("rotor1Auto")
  private Boolean rotor1Auto = null;

  @SerializedName("rotor2Auto")
  private Boolean rotor2Auto = null;

  @SerializedName("autoFuelLow")
  private Integer autoFuelLow = null;

  @SerializedName("autoFuelHigh")
  private Integer autoFuelHigh = null;

  @SerializedName("autoMobilityPoints")
  private Integer autoMobilityPoints = null;

  @SerializedName("autoRotorPoints")
  private Integer autoRotorPoints = null;

  @SerializedName("autoFuelPoints")
  private Integer autoFuelPoints = null;

  @SerializedName("teleopFuelPoints")
  private Integer teleopFuelPoints = null;

  @SerializedName("teleopFuelLow")
  private Integer teleopFuelLow = null;

  @SerializedName("teleopFuelHigh")
  private Integer teleopFuelHigh = null;

  @SerializedName("teleopRotorPoints")
  private Integer teleopRotorPoints = null;

  @SerializedName("kPaRankingPointAchieved")
  private Boolean kPaRankingPointAchieved = null;

  @SerializedName("teleopTakeoffPoints")
  private Integer teleopTakeoffPoints = null;

  @SerializedName("kPaBonusPoints")
  private Integer kPaBonusPoints = null;

  @SerializedName("rotorBonusPoints")
  private Integer rotorBonusPoints = null;

  @SerializedName("rotor1Engaged")
  private Boolean rotor1Engaged = null;

  @SerializedName("rotor2Engaged")
  private Boolean rotor2Engaged = null;

  @SerializedName("rotor3Engaged")
  private Boolean rotor3Engaged = null;

  @SerializedName("rotor4Engaged")
  private Boolean rotor4Engaged = null;

  @SerializedName("rotorRankingPointAchieved")
  private Boolean rotorRankingPointAchieved = null;

  @SerializedName("techFoulCount")
  private Integer techFoulCount = null;

  @SerializedName("foulCount")
  private Integer foulCount = null;

  @SerializedName("touchpadNear")
  private String touchpadNear = null;

  @SerializedName("touchpadMiddle")
  private String touchpadMiddle = null;

  @SerializedName("touchpadFar")
  private String touchpadFar = null;

  public MatchScoreBreakdown2017Alliance autoPoints(Integer autoPoints) {
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

  public MatchScoreBreakdown2017Alliance teleopPoints(Integer teleopPoints) {
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

  public MatchScoreBreakdown2017Alliance breechPoints(Integer breechPoints) {
    this.breechPoints = breechPoints;
    return this;
  }

   /**
   * Get breechPoints
   * @return breechPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getBreechPoints() {
    return breechPoints;
  }

  public void setBreechPoints(Integer breechPoints) {
    this.breechPoints = breechPoints;
  }

  public MatchScoreBreakdown2017Alliance foulPoints(Integer foulPoints) {
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

  public MatchScoreBreakdown2017Alliance capturePoints(Integer capturePoints) {
    this.capturePoints = capturePoints;
    return this;
  }

   /**
   * Get capturePoints
   * @return capturePoints
  **/
  @ApiModelProperty(value = "")
  public Integer getCapturePoints() {
    return capturePoints;
  }

  public void setCapturePoints(Integer capturePoints) {
    this.capturePoints = capturePoints;
  }

  public MatchScoreBreakdown2017Alliance adjustPoints(Integer adjustPoints) {
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

  public MatchScoreBreakdown2017Alliance totalPoints(Integer totalPoints) {
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

  public MatchScoreBreakdown2017Alliance robot1Auto(Robot1AutoEnum robot1Auto) {
    this.robot1Auto = robot1Auto;
    return this;
  }

   /**
   * Get robot1Auto
   * @return robot1Auto
  **/
  @ApiModelProperty(value = "")
  public Robot1AutoEnum getRobot1Auto() {
    return robot1Auto;
  }

  public void setRobot1Auto(Robot1AutoEnum robot1Auto) {
    this.robot1Auto = robot1Auto;
  }

  public MatchScoreBreakdown2017Alliance robot2Auto(Robot2AutoEnum robot2Auto) {
    this.robot2Auto = robot2Auto;
    return this;
  }

   /**
   * Get robot2Auto
   * @return robot2Auto
  **/
  @ApiModelProperty(value = "")
  public Robot2AutoEnum getRobot2Auto() {
    return robot2Auto;
  }

  public void setRobot2Auto(Robot2AutoEnum robot2Auto) {
    this.robot2Auto = robot2Auto;
  }

  public MatchScoreBreakdown2017Alliance robot3Auto(Robot3AutoEnum robot3Auto) {
    this.robot3Auto = robot3Auto;
    return this;
  }

   /**
   * Get robot3Auto
   * @return robot3Auto
  **/
  @ApiModelProperty(value = "")
  public Robot3AutoEnum getRobot3Auto() {
    return robot3Auto;
  }

  public void setRobot3Auto(Robot3AutoEnum robot3Auto) {
    this.robot3Auto = robot3Auto;
  }

  public MatchScoreBreakdown2017Alliance rotor1Auto(Boolean rotor1Auto) {
    this.rotor1Auto = rotor1Auto;
    return this;
  }

   /**
   * Get rotor1Auto
   * @return rotor1Auto
  **/
  @ApiModelProperty(value = "")
  public Boolean getRotor1Auto() {
    return rotor1Auto;
  }

  public void setRotor1Auto(Boolean rotor1Auto) {
    this.rotor1Auto = rotor1Auto;
  }

  public MatchScoreBreakdown2017Alliance rotor2Auto(Boolean rotor2Auto) {
    this.rotor2Auto = rotor2Auto;
    return this;
  }

   /**
   * Get rotor2Auto
   * @return rotor2Auto
  **/
  @ApiModelProperty(value = "")
  public Boolean getRotor2Auto() {
    return rotor2Auto;
  }

  public void setRotor2Auto(Boolean rotor2Auto) {
    this.rotor2Auto = rotor2Auto;
  }

  public MatchScoreBreakdown2017Alliance autoFuelLow(Integer autoFuelLow) {
    this.autoFuelLow = autoFuelLow;
    return this;
  }

   /**
   * Get autoFuelLow
   * @return autoFuelLow
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoFuelLow() {
    return autoFuelLow;
  }

  public void setAutoFuelLow(Integer autoFuelLow) {
    this.autoFuelLow = autoFuelLow;
  }

  public MatchScoreBreakdown2017Alliance autoFuelHigh(Integer autoFuelHigh) {
    this.autoFuelHigh = autoFuelHigh;
    return this;
  }

   /**
   * Get autoFuelHigh
   * @return autoFuelHigh
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoFuelHigh() {
    return autoFuelHigh;
  }

  public void setAutoFuelHigh(Integer autoFuelHigh) {
    this.autoFuelHigh = autoFuelHigh;
  }

  public MatchScoreBreakdown2017Alliance autoMobilityPoints(Integer autoMobilityPoints) {
    this.autoMobilityPoints = autoMobilityPoints;
    return this;
  }

   /**
   * Get autoMobilityPoints
   * @return autoMobilityPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoMobilityPoints() {
    return autoMobilityPoints;
  }

  public void setAutoMobilityPoints(Integer autoMobilityPoints) {
    this.autoMobilityPoints = autoMobilityPoints;
  }

  public MatchScoreBreakdown2017Alliance autoRotorPoints(Integer autoRotorPoints) {
    this.autoRotorPoints = autoRotorPoints;
    return this;
  }

   /**
   * Get autoRotorPoints
   * @return autoRotorPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoRotorPoints() {
    return autoRotorPoints;
  }

  public void setAutoRotorPoints(Integer autoRotorPoints) {
    this.autoRotorPoints = autoRotorPoints;
  }

  public MatchScoreBreakdown2017Alliance autoFuelPoints(Integer autoFuelPoints) {
    this.autoFuelPoints = autoFuelPoints;
    return this;
  }

   /**
   * Get autoFuelPoints
   * @return autoFuelPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoFuelPoints() {
    return autoFuelPoints;
  }

  public void setAutoFuelPoints(Integer autoFuelPoints) {
    this.autoFuelPoints = autoFuelPoints;
  }

  public MatchScoreBreakdown2017Alliance teleopFuelPoints(Integer teleopFuelPoints) {
    this.teleopFuelPoints = teleopFuelPoints;
    return this;
  }

   /**
   * Get teleopFuelPoints
   * @return teleopFuelPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopFuelPoints() {
    return teleopFuelPoints;
  }

  public void setTeleopFuelPoints(Integer teleopFuelPoints) {
    this.teleopFuelPoints = teleopFuelPoints;
  }

  public MatchScoreBreakdown2017Alliance teleopFuelLow(Integer teleopFuelLow) {
    this.teleopFuelLow = teleopFuelLow;
    return this;
  }

   /**
   * Get teleopFuelLow
   * @return teleopFuelLow
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopFuelLow() {
    return teleopFuelLow;
  }

  public void setTeleopFuelLow(Integer teleopFuelLow) {
    this.teleopFuelLow = teleopFuelLow;
  }

  public MatchScoreBreakdown2017Alliance teleopFuelHigh(Integer teleopFuelHigh) {
    this.teleopFuelHigh = teleopFuelHigh;
    return this;
  }

   /**
   * Get teleopFuelHigh
   * @return teleopFuelHigh
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopFuelHigh() {
    return teleopFuelHigh;
  }

  public void setTeleopFuelHigh(Integer teleopFuelHigh) {
    this.teleopFuelHigh = teleopFuelHigh;
  }

  public MatchScoreBreakdown2017Alliance teleopRotorPoints(Integer teleopRotorPoints) {
    this.teleopRotorPoints = teleopRotorPoints;
    return this;
  }

   /**
   * Get teleopRotorPoints
   * @return teleopRotorPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopRotorPoints() {
    return teleopRotorPoints;
  }

  public void setTeleopRotorPoints(Integer teleopRotorPoints) {
    this.teleopRotorPoints = teleopRotorPoints;
  }

  public MatchScoreBreakdown2017Alliance kPaRankingPointAchieved(Boolean kPaRankingPointAchieved) {
    this.kPaRankingPointAchieved = kPaRankingPointAchieved;
    return this;
  }

   /**
   * Get kPaRankingPointAchieved
   * @return kPaRankingPointAchieved
  **/
  @ApiModelProperty(value = "")
  public Boolean getKPaRankingPointAchieved() {
    return kPaRankingPointAchieved;
  }

  public void setKPaRankingPointAchieved(Boolean kPaRankingPointAchieved) {
    this.kPaRankingPointAchieved = kPaRankingPointAchieved;
  }

  public MatchScoreBreakdown2017Alliance teleopTakeoffPoints(Integer teleopTakeoffPoints) {
    this.teleopTakeoffPoints = teleopTakeoffPoints;
    return this;
  }

   /**
   * Get teleopTakeoffPoints
   * @return teleopTakeoffPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopTakeoffPoints() {
    return teleopTakeoffPoints;
  }

  public void setTeleopTakeoffPoints(Integer teleopTakeoffPoints) {
    this.teleopTakeoffPoints = teleopTakeoffPoints;
  }

  public MatchScoreBreakdown2017Alliance kPaBonusPoints(Integer kPaBonusPoints) {
    this.kPaBonusPoints = kPaBonusPoints;
    return this;
  }

   /**
   * Get kPaBonusPoints
   * @return kPaBonusPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getKPaBonusPoints() {
    return kPaBonusPoints;
  }

  public void setKPaBonusPoints(Integer kPaBonusPoints) {
    this.kPaBonusPoints = kPaBonusPoints;
  }

  public MatchScoreBreakdown2017Alliance rotorBonusPoints(Integer rotorBonusPoints) {
    this.rotorBonusPoints = rotorBonusPoints;
    return this;
  }

   /**
   * Get rotorBonusPoints
   * @return rotorBonusPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getRotorBonusPoints() {
    return rotorBonusPoints;
  }

  public void setRotorBonusPoints(Integer rotorBonusPoints) {
    this.rotorBonusPoints = rotorBonusPoints;
  }

  public MatchScoreBreakdown2017Alliance rotor1Engaged(Boolean rotor1Engaged) {
    this.rotor1Engaged = rotor1Engaged;
    return this;
  }

   /**
   * Get rotor1Engaged
   * @return rotor1Engaged
  **/
  @ApiModelProperty(value = "")
  public Boolean getRotor1Engaged() {
    return rotor1Engaged;
  }

  public void setRotor1Engaged(Boolean rotor1Engaged) {
    this.rotor1Engaged = rotor1Engaged;
  }

  public MatchScoreBreakdown2017Alliance rotor2Engaged(Boolean rotor2Engaged) {
    this.rotor2Engaged = rotor2Engaged;
    return this;
  }

   /**
   * Get rotor2Engaged
   * @return rotor2Engaged
  **/
  @ApiModelProperty(value = "")
  public Boolean getRotor2Engaged() {
    return rotor2Engaged;
  }

  public void setRotor2Engaged(Boolean rotor2Engaged) {
    this.rotor2Engaged = rotor2Engaged;
  }

  public MatchScoreBreakdown2017Alliance rotor3Engaged(Boolean rotor3Engaged) {
    this.rotor3Engaged = rotor3Engaged;
    return this;
  }

   /**
   * Get rotor3Engaged
   * @return rotor3Engaged
  **/
  @ApiModelProperty(value = "")
  public Boolean getRotor3Engaged() {
    return rotor3Engaged;
  }

  public void setRotor3Engaged(Boolean rotor3Engaged) {
    this.rotor3Engaged = rotor3Engaged;
  }

  public MatchScoreBreakdown2017Alliance rotor4Engaged(Boolean rotor4Engaged) {
    this.rotor4Engaged = rotor4Engaged;
    return this;
  }

   /**
   * Get rotor4Engaged
   * @return rotor4Engaged
  **/
  @ApiModelProperty(value = "")
  public Boolean getRotor4Engaged() {
    return rotor4Engaged;
  }

  public void setRotor4Engaged(Boolean rotor4Engaged) {
    this.rotor4Engaged = rotor4Engaged;
  }

  public MatchScoreBreakdown2017Alliance rotorRankingPointAchieved(Boolean rotorRankingPointAchieved) {
    this.rotorRankingPointAchieved = rotorRankingPointAchieved;
    return this;
  }

   /**
   * Get rotorRankingPointAchieved
   * @return rotorRankingPointAchieved
  **/
  @ApiModelProperty(value = "")
  public Boolean getRotorRankingPointAchieved() {
    return rotorRankingPointAchieved;
  }

  public void setRotorRankingPointAchieved(Boolean rotorRankingPointAchieved) {
    this.rotorRankingPointAchieved = rotorRankingPointAchieved;
  }

  public MatchScoreBreakdown2017Alliance techFoulCount(Integer techFoulCount) {
    this.techFoulCount = techFoulCount;
    return this;
  }

   /**
   * Get techFoulCount
   * @return techFoulCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTechFoulCount() {
    return techFoulCount;
  }

  public void setTechFoulCount(Integer techFoulCount) {
    this.techFoulCount = techFoulCount;
  }

  public MatchScoreBreakdown2017Alliance foulCount(Integer foulCount) {
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

  public MatchScoreBreakdown2017Alliance touchpadNear(String touchpadNear) {
    this.touchpadNear = touchpadNear;
    return this;
  }

   /**
   * Get touchpadNear
   * @return touchpadNear
  **/
  @ApiModelProperty(value = "")
  public String getTouchpadNear() {
    return touchpadNear;
  }

  public void setTouchpadNear(String touchpadNear) {
    this.touchpadNear = touchpadNear;
  }

  public MatchScoreBreakdown2017Alliance touchpadMiddle(String touchpadMiddle) {
    this.touchpadMiddle = touchpadMiddle;
    return this;
  }

   /**
   * Get touchpadMiddle
   * @return touchpadMiddle
  **/
  @ApiModelProperty(value = "")
  public String getTouchpadMiddle() {
    return touchpadMiddle;
  }

  public void setTouchpadMiddle(String touchpadMiddle) {
    this.touchpadMiddle = touchpadMiddle;
  }

  public MatchScoreBreakdown2017Alliance touchpadFar(String touchpadFar) {
    this.touchpadFar = touchpadFar;
    return this;
  }

   /**
   * Get touchpadFar
   * @return touchpadFar
  **/
  @ApiModelProperty(value = "")
  public String getTouchpadFar() {
    return touchpadFar;
  }

  public void setTouchpadFar(String touchpadFar) {
    this.touchpadFar = touchpadFar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchScoreBreakdown2017Alliance matchScoreBreakdown2017Alliance = (MatchScoreBreakdown2017Alliance) o;
    return Objects.equals(this.autoPoints, matchScoreBreakdown2017Alliance.autoPoints) &&
        Objects.equals(this.teleopPoints, matchScoreBreakdown2017Alliance.teleopPoints) &&
        Objects.equals(this.breechPoints, matchScoreBreakdown2017Alliance.breechPoints) &&
        Objects.equals(this.foulPoints, matchScoreBreakdown2017Alliance.foulPoints) &&
        Objects.equals(this.capturePoints, matchScoreBreakdown2017Alliance.capturePoints) &&
        Objects.equals(this.adjustPoints, matchScoreBreakdown2017Alliance.adjustPoints) &&
        Objects.equals(this.totalPoints, matchScoreBreakdown2017Alliance.totalPoints) &&
        Objects.equals(this.robot1Auto, matchScoreBreakdown2017Alliance.robot1Auto) &&
        Objects.equals(this.robot2Auto, matchScoreBreakdown2017Alliance.robot2Auto) &&
        Objects.equals(this.robot3Auto, matchScoreBreakdown2017Alliance.robot3Auto) &&
        Objects.equals(this.rotor1Auto, matchScoreBreakdown2017Alliance.rotor1Auto) &&
        Objects.equals(this.rotor2Auto, matchScoreBreakdown2017Alliance.rotor2Auto) &&
        Objects.equals(this.autoFuelLow, matchScoreBreakdown2017Alliance.autoFuelLow) &&
        Objects.equals(this.autoFuelHigh, matchScoreBreakdown2017Alliance.autoFuelHigh) &&
        Objects.equals(this.autoMobilityPoints, matchScoreBreakdown2017Alliance.autoMobilityPoints) &&
        Objects.equals(this.autoRotorPoints, matchScoreBreakdown2017Alliance.autoRotorPoints) &&
        Objects.equals(this.autoFuelPoints, matchScoreBreakdown2017Alliance.autoFuelPoints) &&
        Objects.equals(this.teleopFuelPoints, matchScoreBreakdown2017Alliance.teleopFuelPoints) &&
        Objects.equals(this.teleopFuelLow, matchScoreBreakdown2017Alliance.teleopFuelLow) &&
        Objects.equals(this.teleopFuelHigh, matchScoreBreakdown2017Alliance.teleopFuelHigh) &&
        Objects.equals(this.teleopRotorPoints, matchScoreBreakdown2017Alliance.teleopRotorPoints) &&
        Objects.equals(this.kPaRankingPointAchieved, matchScoreBreakdown2017Alliance.kPaRankingPointAchieved) &&
        Objects.equals(this.teleopTakeoffPoints, matchScoreBreakdown2017Alliance.teleopTakeoffPoints) &&
        Objects.equals(this.kPaBonusPoints, matchScoreBreakdown2017Alliance.kPaBonusPoints) &&
        Objects.equals(this.rotorBonusPoints, matchScoreBreakdown2017Alliance.rotorBonusPoints) &&
        Objects.equals(this.rotor1Engaged, matchScoreBreakdown2017Alliance.rotor1Engaged) &&
        Objects.equals(this.rotor2Engaged, matchScoreBreakdown2017Alliance.rotor2Engaged) &&
        Objects.equals(this.rotor3Engaged, matchScoreBreakdown2017Alliance.rotor3Engaged) &&
        Objects.equals(this.rotor4Engaged, matchScoreBreakdown2017Alliance.rotor4Engaged) &&
        Objects.equals(this.rotorRankingPointAchieved, matchScoreBreakdown2017Alliance.rotorRankingPointAchieved) &&
        Objects.equals(this.techFoulCount, matchScoreBreakdown2017Alliance.techFoulCount) &&
        Objects.equals(this.foulCount, matchScoreBreakdown2017Alliance.foulCount) &&
        Objects.equals(this.touchpadNear, matchScoreBreakdown2017Alliance.touchpadNear) &&
        Objects.equals(this.touchpadMiddle, matchScoreBreakdown2017Alliance.touchpadMiddle) &&
        Objects.equals(this.touchpadFar, matchScoreBreakdown2017Alliance.touchpadFar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoPoints, teleopPoints, breechPoints, foulPoints, capturePoints, adjustPoints, totalPoints, robot1Auto, robot2Auto, robot3Auto, rotor1Auto, rotor2Auto, autoFuelLow, autoFuelHigh, autoMobilityPoints, autoRotorPoints, autoFuelPoints, teleopFuelPoints, teleopFuelLow, teleopFuelHigh, teleopRotorPoints, kPaRankingPointAchieved, teleopTakeoffPoints, kPaBonusPoints, rotorBonusPoints, rotor1Engaged, rotor2Engaged, rotor3Engaged, rotor4Engaged, rotorRankingPointAchieved, techFoulCount, foulCount, touchpadNear, touchpadMiddle, touchpadFar);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2017Alliance {\n");
    
    sb.append("    autoPoints: ").append(toIndentedString(autoPoints)).append("\n");
    sb.append("    teleopPoints: ").append(toIndentedString(teleopPoints)).append("\n");
    sb.append("    breechPoints: ").append(toIndentedString(breechPoints)).append("\n");
    sb.append("    foulPoints: ").append(toIndentedString(foulPoints)).append("\n");
    sb.append("    capturePoints: ").append(toIndentedString(capturePoints)).append("\n");
    sb.append("    adjustPoints: ").append(toIndentedString(adjustPoints)).append("\n");
    sb.append("    totalPoints: ").append(toIndentedString(totalPoints)).append("\n");
    sb.append("    robot1Auto: ").append(toIndentedString(robot1Auto)).append("\n");
    sb.append("    robot2Auto: ").append(toIndentedString(robot2Auto)).append("\n");
    sb.append("    robot3Auto: ").append(toIndentedString(robot3Auto)).append("\n");
    sb.append("    rotor1Auto: ").append(toIndentedString(rotor1Auto)).append("\n");
    sb.append("    rotor2Auto: ").append(toIndentedString(rotor2Auto)).append("\n");
    sb.append("    autoFuelLow: ").append(toIndentedString(autoFuelLow)).append("\n");
    sb.append("    autoFuelHigh: ").append(toIndentedString(autoFuelHigh)).append("\n");
    sb.append("    autoMobilityPoints: ").append(toIndentedString(autoMobilityPoints)).append("\n");
    sb.append("    autoRotorPoints: ").append(toIndentedString(autoRotorPoints)).append("\n");
    sb.append("    autoFuelPoints: ").append(toIndentedString(autoFuelPoints)).append("\n");
    sb.append("    teleopFuelPoints: ").append(toIndentedString(teleopFuelPoints)).append("\n");
    sb.append("    teleopFuelLow: ").append(toIndentedString(teleopFuelLow)).append("\n");
    sb.append("    teleopFuelHigh: ").append(toIndentedString(teleopFuelHigh)).append("\n");
    sb.append("    teleopRotorPoints: ").append(toIndentedString(teleopRotorPoints)).append("\n");
    sb.append("    kPaRankingPointAchieved: ").append(toIndentedString(kPaRankingPointAchieved)).append("\n");
    sb.append("    teleopTakeoffPoints: ").append(toIndentedString(teleopTakeoffPoints)).append("\n");
    sb.append("    kPaBonusPoints: ").append(toIndentedString(kPaBonusPoints)).append("\n");
    sb.append("    rotorBonusPoints: ").append(toIndentedString(rotorBonusPoints)).append("\n");
    sb.append("    rotor1Engaged: ").append(toIndentedString(rotor1Engaged)).append("\n");
    sb.append("    rotor2Engaged: ").append(toIndentedString(rotor2Engaged)).append("\n");
    sb.append("    rotor3Engaged: ").append(toIndentedString(rotor3Engaged)).append("\n");
    sb.append("    rotor4Engaged: ").append(toIndentedString(rotor4Engaged)).append("\n");
    sb.append("    rotorRankingPointAchieved: ").append(toIndentedString(rotorRankingPointAchieved)).append("\n");
    sb.append("    techFoulCount: ").append(toIndentedString(techFoulCount)).append("\n");
    sb.append("    foulCount: ").append(toIndentedString(foulCount)).append("\n");
    sb.append("    touchpadNear: ").append(toIndentedString(touchpadNear)).append("\n");
    sb.append("    touchpadMiddle: ").append(toIndentedString(touchpadMiddle)).append("\n");
    sb.append("    touchpadFar: ").append(toIndentedString(touchpadFar)).append("\n");
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

