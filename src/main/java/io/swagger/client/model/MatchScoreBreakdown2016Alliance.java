package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MatchScoreBreakdown2016Alliance
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class MatchScoreBreakdown2016Alliance {
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
    @SerializedName("Crossed")
    CROSSED("Crossed"),
    
    @SerializedName("Reached")
    REACHED("Reached"),
    
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
    @SerializedName("Crossed")
    CROSSED("Crossed"),
    
    @SerializedName("Reached")
    REACHED("Reached"),
    
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
    @SerializedName("Crossed")
    CROSSED("Crossed"),
    
    @SerializedName("Reached")
    REACHED("Reached"),
    
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

  @SerializedName("autoReachPoints")
  private Integer autoReachPoints = null;

  @SerializedName("autoCrossingPoints")
  private Integer autoCrossingPoints = null;

  @SerializedName("autoBouldersLow")
  private Integer autoBouldersLow = null;

  @SerializedName("autoBouldersHigh")
  private Integer autoBouldersHigh = null;

  @SerializedName("autoBoulderPoints")
  private Integer autoBoulderPoints = null;

  @SerializedName("teleopCrossingPoints")
  private Integer teleopCrossingPoints = null;

  @SerializedName("teleopBouldersLow")
  private Integer teleopBouldersLow = null;

  @SerializedName("teleopBouldersHigh")
  private Integer teleopBouldersHigh = null;

  @SerializedName("teleopBoulderPoints")
  private Integer teleopBoulderPoints = null;

  @SerializedName("teleopDefensesBreached")
  private Boolean teleopDefensesBreached = null;

  @SerializedName("teleopChallengePoints")
  private Integer teleopChallengePoints = null;

  @SerializedName("teleopScalePoints")
  private Integer teleopScalePoints = null;

  @SerializedName("teleopTowerCaptured")
  private Integer teleopTowerCaptured = null;

  @SerializedName("towerFaceA")
  private String towerFaceA = null;

  @SerializedName("towerFaceB")
  private String towerFaceB = null;

  @SerializedName("towerFaceC")
  private String towerFaceC = null;

  @SerializedName("towerEndStrength")
  private Integer towerEndStrength = null;

  @SerializedName("techFoulCount")
  private Integer techFoulCount = null;

  @SerializedName("foulCount")
  private Integer foulCount = null;

  @SerializedName("position2")
  private String position2 = null;

  @SerializedName("position3")
  private String position3 = null;

  @SerializedName("position4")
  private String position4 = null;

  @SerializedName("position5")
  private String position5 = null;

  @SerializedName("position1crossings")
  private Integer position1crossings = null;

  @SerializedName("position2crossings")
  private Integer position2crossings = null;

  @SerializedName("position3crossings")
  private Integer position3crossings = null;

  @SerializedName("position4crossings")
  private Integer position4crossings = null;

  @SerializedName("position5crossings")
  private Integer position5crossings = null;

  public MatchScoreBreakdown2016Alliance autoPoints(Integer autoPoints) {
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

  public MatchScoreBreakdown2016Alliance teleopPoints(Integer teleopPoints) {
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

  public MatchScoreBreakdown2016Alliance breechPoints(Integer breechPoints) {
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

  public MatchScoreBreakdown2016Alliance foulPoints(Integer foulPoints) {
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

  public MatchScoreBreakdown2016Alliance capturePoints(Integer capturePoints) {
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

  public MatchScoreBreakdown2016Alliance adjustPoints(Integer adjustPoints) {
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

  public MatchScoreBreakdown2016Alliance totalPoints(Integer totalPoints) {
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

  public MatchScoreBreakdown2016Alliance robot1Auto(Robot1AutoEnum robot1Auto) {
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

  public MatchScoreBreakdown2016Alliance robot2Auto(Robot2AutoEnum robot2Auto) {
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

  public MatchScoreBreakdown2016Alliance robot3Auto(Robot3AutoEnum robot3Auto) {
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

  public MatchScoreBreakdown2016Alliance autoReachPoints(Integer autoReachPoints) {
    this.autoReachPoints = autoReachPoints;
    return this;
  }

   /**
   * Get autoReachPoints
   * @return autoReachPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoReachPoints() {
    return autoReachPoints;
  }

  public void setAutoReachPoints(Integer autoReachPoints) {
    this.autoReachPoints = autoReachPoints;
  }

  public MatchScoreBreakdown2016Alliance autoCrossingPoints(Integer autoCrossingPoints) {
    this.autoCrossingPoints = autoCrossingPoints;
    return this;
  }

   /**
   * Get autoCrossingPoints
   * @return autoCrossingPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoCrossingPoints() {
    return autoCrossingPoints;
  }

  public void setAutoCrossingPoints(Integer autoCrossingPoints) {
    this.autoCrossingPoints = autoCrossingPoints;
  }

  public MatchScoreBreakdown2016Alliance autoBouldersLow(Integer autoBouldersLow) {
    this.autoBouldersLow = autoBouldersLow;
    return this;
  }

   /**
   * Get autoBouldersLow
   * @return autoBouldersLow
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoBouldersLow() {
    return autoBouldersLow;
  }

  public void setAutoBouldersLow(Integer autoBouldersLow) {
    this.autoBouldersLow = autoBouldersLow;
  }

  public MatchScoreBreakdown2016Alliance autoBouldersHigh(Integer autoBouldersHigh) {
    this.autoBouldersHigh = autoBouldersHigh;
    return this;
  }

   /**
   * Get autoBouldersHigh
   * @return autoBouldersHigh
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoBouldersHigh() {
    return autoBouldersHigh;
  }

  public void setAutoBouldersHigh(Integer autoBouldersHigh) {
    this.autoBouldersHigh = autoBouldersHigh;
  }

  public MatchScoreBreakdown2016Alliance autoBoulderPoints(Integer autoBoulderPoints) {
    this.autoBoulderPoints = autoBoulderPoints;
    return this;
  }

   /**
   * Get autoBoulderPoints
   * @return autoBoulderPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoBoulderPoints() {
    return autoBoulderPoints;
  }

  public void setAutoBoulderPoints(Integer autoBoulderPoints) {
    this.autoBoulderPoints = autoBoulderPoints;
  }

  public MatchScoreBreakdown2016Alliance teleopCrossingPoints(Integer teleopCrossingPoints) {
    this.teleopCrossingPoints = teleopCrossingPoints;
    return this;
  }

   /**
   * Get teleopCrossingPoints
   * @return teleopCrossingPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopCrossingPoints() {
    return teleopCrossingPoints;
  }

  public void setTeleopCrossingPoints(Integer teleopCrossingPoints) {
    this.teleopCrossingPoints = teleopCrossingPoints;
  }

  public MatchScoreBreakdown2016Alliance teleopBouldersLow(Integer teleopBouldersLow) {
    this.teleopBouldersLow = teleopBouldersLow;
    return this;
  }

   /**
   * Get teleopBouldersLow
   * @return teleopBouldersLow
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopBouldersLow() {
    return teleopBouldersLow;
  }

  public void setTeleopBouldersLow(Integer teleopBouldersLow) {
    this.teleopBouldersLow = teleopBouldersLow;
  }

  public MatchScoreBreakdown2016Alliance teleopBouldersHigh(Integer teleopBouldersHigh) {
    this.teleopBouldersHigh = teleopBouldersHigh;
    return this;
  }

   /**
   * Get teleopBouldersHigh
   * @return teleopBouldersHigh
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopBouldersHigh() {
    return teleopBouldersHigh;
  }

  public void setTeleopBouldersHigh(Integer teleopBouldersHigh) {
    this.teleopBouldersHigh = teleopBouldersHigh;
  }

  public MatchScoreBreakdown2016Alliance teleopBoulderPoints(Integer teleopBoulderPoints) {
    this.teleopBoulderPoints = teleopBoulderPoints;
    return this;
  }

   /**
   * Get teleopBoulderPoints
   * @return teleopBoulderPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopBoulderPoints() {
    return teleopBoulderPoints;
  }

  public void setTeleopBoulderPoints(Integer teleopBoulderPoints) {
    this.teleopBoulderPoints = teleopBoulderPoints;
  }

  public MatchScoreBreakdown2016Alliance teleopDefensesBreached(Boolean teleopDefensesBreached) {
    this.teleopDefensesBreached = teleopDefensesBreached;
    return this;
  }

   /**
   * Get teleopDefensesBreached
   * @return teleopDefensesBreached
  **/
  @ApiModelProperty(value = "")
  public Boolean getTeleopDefensesBreached() {
    return teleopDefensesBreached;
  }

  public void setTeleopDefensesBreached(Boolean teleopDefensesBreached) {
    this.teleopDefensesBreached = teleopDefensesBreached;
  }

  public MatchScoreBreakdown2016Alliance teleopChallengePoints(Integer teleopChallengePoints) {
    this.teleopChallengePoints = teleopChallengePoints;
    return this;
  }

   /**
   * Get teleopChallengePoints
   * @return teleopChallengePoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopChallengePoints() {
    return teleopChallengePoints;
  }

  public void setTeleopChallengePoints(Integer teleopChallengePoints) {
    this.teleopChallengePoints = teleopChallengePoints;
  }

  public MatchScoreBreakdown2016Alliance teleopScalePoints(Integer teleopScalePoints) {
    this.teleopScalePoints = teleopScalePoints;
    return this;
  }

   /**
   * Get teleopScalePoints
   * @return teleopScalePoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopScalePoints() {
    return teleopScalePoints;
  }

  public void setTeleopScalePoints(Integer teleopScalePoints) {
    this.teleopScalePoints = teleopScalePoints;
  }

  public MatchScoreBreakdown2016Alliance teleopTowerCaptured(Integer teleopTowerCaptured) {
    this.teleopTowerCaptured = teleopTowerCaptured;
    return this;
  }

   /**
   * Get teleopTowerCaptured
   * @return teleopTowerCaptured
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopTowerCaptured() {
    return teleopTowerCaptured;
  }

  public void setTeleopTowerCaptured(Integer teleopTowerCaptured) {
    this.teleopTowerCaptured = teleopTowerCaptured;
  }

  public MatchScoreBreakdown2016Alliance towerFaceA(String towerFaceA) {
    this.towerFaceA = towerFaceA;
    return this;
  }

   /**
   * Get towerFaceA
   * @return towerFaceA
  **/
  @ApiModelProperty(value = "")
  public String getTowerFaceA() {
    return towerFaceA;
  }

  public void setTowerFaceA(String towerFaceA) {
    this.towerFaceA = towerFaceA;
  }

  public MatchScoreBreakdown2016Alliance towerFaceB(String towerFaceB) {
    this.towerFaceB = towerFaceB;
    return this;
  }

   /**
   * Get towerFaceB
   * @return towerFaceB
  **/
  @ApiModelProperty(value = "")
  public String getTowerFaceB() {
    return towerFaceB;
  }

  public void setTowerFaceB(String towerFaceB) {
    this.towerFaceB = towerFaceB;
  }

  public MatchScoreBreakdown2016Alliance towerFaceC(String towerFaceC) {
    this.towerFaceC = towerFaceC;
    return this;
  }

   /**
   * Get towerFaceC
   * @return towerFaceC
  **/
  @ApiModelProperty(value = "")
  public String getTowerFaceC() {
    return towerFaceC;
  }

  public void setTowerFaceC(String towerFaceC) {
    this.towerFaceC = towerFaceC;
  }

  public MatchScoreBreakdown2016Alliance towerEndStrength(Integer towerEndStrength) {
    this.towerEndStrength = towerEndStrength;
    return this;
  }

   /**
   * Get towerEndStrength
   * @return towerEndStrength
  **/
  @ApiModelProperty(value = "")
  public Integer getTowerEndStrength() {
    return towerEndStrength;
  }

  public void setTowerEndStrength(Integer towerEndStrength) {
    this.towerEndStrength = towerEndStrength;
  }

  public MatchScoreBreakdown2016Alliance techFoulCount(Integer techFoulCount) {
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

  public MatchScoreBreakdown2016Alliance foulCount(Integer foulCount) {
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

  public MatchScoreBreakdown2016Alliance position2(String position2) {
    this.position2 = position2;
    return this;
  }

   /**
   * Get position2
   * @return position2
  **/
  @ApiModelProperty(value = "")
  public String getPosition2() {
    return position2;
  }

  public void setPosition2(String position2) {
    this.position2 = position2;
  }

  public MatchScoreBreakdown2016Alliance position3(String position3) {
    this.position3 = position3;
    return this;
  }

   /**
   * Get position3
   * @return position3
  **/
  @ApiModelProperty(value = "")
  public String getPosition3() {
    return position3;
  }

  public void setPosition3(String position3) {
    this.position3 = position3;
  }

  public MatchScoreBreakdown2016Alliance position4(String position4) {
    this.position4 = position4;
    return this;
  }

   /**
   * Get position4
   * @return position4
  **/
  @ApiModelProperty(value = "")
  public String getPosition4() {
    return position4;
  }

  public void setPosition4(String position4) {
    this.position4 = position4;
  }

  public MatchScoreBreakdown2016Alliance position5(String position5) {
    this.position5 = position5;
    return this;
  }

   /**
   * Get position5
   * @return position5
  **/
  @ApiModelProperty(value = "")
  public String getPosition5() {
    return position5;
  }

  public void setPosition5(String position5) {
    this.position5 = position5;
  }

  public MatchScoreBreakdown2016Alliance position1crossings(Integer position1crossings) {
    this.position1crossings = position1crossings;
    return this;
  }

   /**
   * Get position1crossings
   * @return position1crossings
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition1crossings() {
    return position1crossings;
  }

  public void setPosition1crossings(Integer position1crossings) {
    this.position1crossings = position1crossings;
  }

  public MatchScoreBreakdown2016Alliance position2crossings(Integer position2crossings) {
    this.position2crossings = position2crossings;
    return this;
  }

   /**
   * Get position2crossings
   * @return position2crossings
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition2crossings() {
    return position2crossings;
  }

  public void setPosition2crossings(Integer position2crossings) {
    this.position2crossings = position2crossings;
  }

  public MatchScoreBreakdown2016Alliance position3crossings(Integer position3crossings) {
    this.position3crossings = position3crossings;
    return this;
  }

   /**
   * Get position3crossings
   * @return position3crossings
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition3crossings() {
    return position3crossings;
  }

  public void setPosition3crossings(Integer position3crossings) {
    this.position3crossings = position3crossings;
  }

  public MatchScoreBreakdown2016Alliance position4crossings(Integer position4crossings) {
    this.position4crossings = position4crossings;
    return this;
  }

   /**
   * Get position4crossings
   * @return position4crossings
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition4crossings() {
    return position4crossings;
  }

  public void setPosition4crossings(Integer position4crossings) {
    this.position4crossings = position4crossings;
  }

  public MatchScoreBreakdown2016Alliance position5crossings(Integer position5crossings) {
    this.position5crossings = position5crossings;
    return this;
  }

   /**
   * Get position5crossings
   * @return position5crossings
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition5crossings() {
    return position5crossings;
  }

  public void setPosition5crossings(Integer position5crossings) {
    this.position5crossings = position5crossings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchScoreBreakdown2016Alliance matchScoreBreakdown2016Alliance = (MatchScoreBreakdown2016Alliance) o;
    return Objects.equals(this.autoPoints, matchScoreBreakdown2016Alliance.autoPoints) &&
        Objects.equals(this.teleopPoints, matchScoreBreakdown2016Alliance.teleopPoints) &&
        Objects.equals(this.breechPoints, matchScoreBreakdown2016Alliance.breechPoints) &&
        Objects.equals(this.foulPoints, matchScoreBreakdown2016Alliance.foulPoints) &&
        Objects.equals(this.capturePoints, matchScoreBreakdown2016Alliance.capturePoints) &&
        Objects.equals(this.adjustPoints, matchScoreBreakdown2016Alliance.adjustPoints) &&
        Objects.equals(this.totalPoints, matchScoreBreakdown2016Alliance.totalPoints) &&
        Objects.equals(this.robot1Auto, matchScoreBreakdown2016Alliance.robot1Auto) &&
        Objects.equals(this.robot2Auto, matchScoreBreakdown2016Alliance.robot2Auto) &&
        Objects.equals(this.robot3Auto, matchScoreBreakdown2016Alliance.robot3Auto) &&
        Objects.equals(this.autoReachPoints, matchScoreBreakdown2016Alliance.autoReachPoints) &&
        Objects.equals(this.autoCrossingPoints, matchScoreBreakdown2016Alliance.autoCrossingPoints) &&
        Objects.equals(this.autoBouldersLow, matchScoreBreakdown2016Alliance.autoBouldersLow) &&
        Objects.equals(this.autoBouldersHigh, matchScoreBreakdown2016Alliance.autoBouldersHigh) &&
        Objects.equals(this.autoBoulderPoints, matchScoreBreakdown2016Alliance.autoBoulderPoints) &&
        Objects.equals(this.teleopCrossingPoints, matchScoreBreakdown2016Alliance.teleopCrossingPoints) &&
        Objects.equals(this.teleopBouldersLow, matchScoreBreakdown2016Alliance.teleopBouldersLow) &&
        Objects.equals(this.teleopBouldersHigh, matchScoreBreakdown2016Alliance.teleopBouldersHigh) &&
        Objects.equals(this.teleopBoulderPoints, matchScoreBreakdown2016Alliance.teleopBoulderPoints) &&
        Objects.equals(this.teleopDefensesBreached, matchScoreBreakdown2016Alliance.teleopDefensesBreached) &&
        Objects.equals(this.teleopChallengePoints, matchScoreBreakdown2016Alliance.teleopChallengePoints) &&
        Objects.equals(this.teleopScalePoints, matchScoreBreakdown2016Alliance.teleopScalePoints) &&
        Objects.equals(this.teleopTowerCaptured, matchScoreBreakdown2016Alliance.teleopTowerCaptured) &&
        Objects.equals(this.towerFaceA, matchScoreBreakdown2016Alliance.towerFaceA) &&
        Objects.equals(this.towerFaceB, matchScoreBreakdown2016Alliance.towerFaceB) &&
        Objects.equals(this.towerFaceC, matchScoreBreakdown2016Alliance.towerFaceC) &&
        Objects.equals(this.towerEndStrength, matchScoreBreakdown2016Alliance.towerEndStrength) &&
        Objects.equals(this.techFoulCount, matchScoreBreakdown2016Alliance.techFoulCount) &&
        Objects.equals(this.foulCount, matchScoreBreakdown2016Alliance.foulCount) &&
        Objects.equals(this.position2, matchScoreBreakdown2016Alliance.position2) &&
        Objects.equals(this.position3, matchScoreBreakdown2016Alliance.position3) &&
        Objects.equals(this.position4, matchScoreBreakdown2016Alliance.position4) &&
        Objects.equals(this.position5, matchScoreBreakdown2016Alliance.position5) &&
        Objects.equals(this.position1crossings, matchScoreBreakdown2016Alliance.position1crossings) &&
        Objects.equals(this.position2crossings, matchScoreBreakdown2016Alliance.position2crossings) &&
        Objects.equals(this.position3crossings, matchScoreBreakdown2016Alliance.position3crossings) &&
        Objects.equals(this.position4crossings, matchScoreBreakdown2016Alliance.position4crossings) &&
        Objects.equals(this.position5crossings, matchScoreBreakdown2016Alliance.position5crossings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoPoints, teleopPoints, breechPoints, foulPoints, capturePoints, adjustPoints, totalPoints, robot1Auto, robot2Auto, robot3Auto, autoReachPoints, autoCrossingPoints, autoBouldersLow, autoBouldersHigh, autoBoulderPoints, teleopCrossingPoints, teleopBouldersLow, teleopBouldersHigh, teleopBoulderPoints, teleopDefensesBreached, teleopChallengePoints, teleopScalePoints, teleopTowerCaptured, towerFaceA, towerFaceB, towerFaceC, towerEndStrength, techFoulCount, foulCount, position2, position3, position4, position5, position1crossings, position2crossings, position3crossings, position4crossings, position5crossings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2016Alliance {\n");
    
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
    sb.append("    autoReachPoints: ").append(toIndentedString(autoReachPoints)).append("\n");
    sb.append("    autoCrossingPoints: ").append(toIndentedString(autoCrossingPoints)).append("\n");
    sb.append("    autoBouldersLow: ").append(toIndentedString(autoBouldersLow)).append("\n");
    sb.append("    autoBouldersHigh: ").append(toIndentedString(autoBouldersHigh)).append("\n");
    sb.append("    autoBoulderPoints: ").append(toIndentedString(autoBoulderPoints)).append("\n");
    sb.append("    teleopCrossingPoints: ").append(toIndentedString(teleopCrossingPoints)).append("\n");
    sb.append("    teleopBouldersLow: ").append(toIndentedString(teleopBouldersLow)).append("\n");
    sb.append("    teleopBouldersHigh: ").append(toIndentedString(teleopBouldersHigh)).append("\n");
    sb.append("    teleopBoulderPoints: ").append(toIndentedString(teleopBoulderPoints)).append("\n");
    sb.append("    teleopDefensesBreached: ").append(toIndentedString(teleopDefensesBreached)).append("\n");
    sb.append("    teleopChallengePoints: ").append(toIndentedString(teleopChallengePoints)).append("\n");
    sb.append("    teleopScalePoints: ").append(toIndentedString(teleopScalePoints)).append("\n");
    sb.append("    teleopTowerCaptured: ").append(toIndentedString(teleopTowerCaptured)).append("\n");
    sb.append("    towerFaceA: ").append(toIndentedString(towerFaceA)).append("\n");
    sb.append("    towerFaceB: ").append(toIndentedString(towerFaceB)).append("\n");
    sb.append("    towerFaceC: ").append(toIndentedString(towerFaceC)).append("\n");
    sb.append("    towerEndStrength: ").append(toIndentedString(towerEndStrength)).append("\n");
    sb.append("    techFoulCount: ").append(toIndentedString(techFoulCount)).append("\n");
    sb.append("    foulCount: ").append(toIndentedString(foulCount)).append("\n");
    sb.append("    position2: ").append(toIndentedString(position2)).append("\n");
    sb.append("    position3: ").append(toIndentedString(position3)).append("\n");
    sb.append("    position4: ").append(toIndentedString(position4)).append("\n");
    sb.append("    position5: ").append(toIndentedString(position5)).append("\n");
    sb.append("    position1crossings: ").append(toIndentedString(position1crossings)).append("\n");
    sb.append("    position2crossings: ").append(toIndentedString(position2crossings)).append("\n");
    sb.append("    position3crossings: ").append(toIndentedString(position3crossings)).append("\n");
    sb.append("    position4crossings: ").append(toIndentedString(position4crossings)).append("\n");
    sb.append("    position5crossings: ").append(toIndentedString(position5crossings)).append("\n");
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

