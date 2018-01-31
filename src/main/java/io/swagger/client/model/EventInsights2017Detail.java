package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * EventInsights2017Detail
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventInsights2017Detail {
  @SerializedName("average_foul_score")
  private Float averageFoulScore = null;

  @SerializedName("average_fuel_points")
  private Float averageFuelPoints = null;

  @SerializedName("average_fuel_points_auto")
  private Float averageFuelPointsAuto = null;

  @SerializedName("average_fuel_points_teleop")
  private Float averageFuelPointsTeleop = null;

  @SerializedName("average_high_goals")
  private Float averageHighGoals = null;

  @SerializedName("average_high_goals_auto")
  private Float averageHighGoalsAuto = null;

  @SerializedName("average_high_goals_teleop")
  private Float averageHighGoalsTeleop = null;

  @SerializedName("average_low_goals")
  private Float averageLowGoals = null;

  @SerializedName("average_low_goals_auto")
  private Float averageLowGoalsAuto = null;

  @SerializedName("average_low_goals_teleop")
  private Float averageLowGoalsTeleop = null;

  @SerializedName("average_mobility_points_auto")
  private Float averageMobilityPointsAuto = null;

  @SerializedName("average_points_auto")
  private Float averagePointsAuto = null;

  @SerializedName("average_points_teleop")
  private Float averagePointsTeleop = null;

  @SerializedName("average_rotor_points")
  private Float averageRotorPoints = null;

  @SerializedName("average_rotor_points_auto")
  private Float averageRotorPointsAuto = null;

  @SerializedName("average_rotor_points_teleop")
  private Float averageRotorPointsTeleop = null;

  @SerializedName("average_score")
  private Float averageScore = null;

  @SerializedName("average_takeoff_points_teleop")
  private Float averageTakeoffPointsTeleop = null;

  @SerializedName("average_win_margin")
  private Float averageWinMargin = null;

  @SerializedName("average_win_score")
  private Float averageWinScore = null;

  @SerializedName("high_kpa")
  private List<String> highKpa = new ArrayList<String>();

  @SerializedName("high_score")
  private List<String> highScore = new ArrayList<String>();

  @SerializedName("kpa_achieved")
  private List<Float> kpaAchieved = new ArrayList<Float>();

  @SerializedName("mobility_counts")
  private List<Float> mobilityCounts = new ArrayList<Float>();

  @SerializedName("rotor_1_engaged")
  private List<Float> rotor1Engaged = new ArrayList<Float>();

  @SerializedName("rotor_1_engaged_auto")
  private List<Float> rotor1EngagedAuto = new ArrayList<Float>();

  @SerializedName("rotor_2_engaged")
  private List<Float> rotor2Engaged = new ArrayList<Float>();

  @SerializedName("rotor_2_engaged_auto")
  private List<Float> rotor2EngagedAuto = new ArrayList<Float>();

  @SerializedName("rotor_3_engaged")
  private List<Float> rotor3Engaged = new ArrayList<Float>();

  @SerializedName("rotor_4_engaged")
  private List<Float> rotor4Engaged = new ArrayList<Float>();

  @SerializedName("takeoff_counts")
  private List<Float> takeoffCounts = new ArrayList<Float>();

  public EventInsights2017Detail averageFoulScore(Float averageFoulScore) {
    this.averageFoulScore = averageFoulScore;
    return this;
  }

   /**
   * Average foul score.
   * @return averageFoulScore
  **/
  @ApiModelProperty(required = true, value = "Average foul score.")
  public Float getAverageFoulScore() {
    return averageFoulScore;
  }

  public void setAverageFoulScore(Float averageFoulScore) {
    this.averageFoulScore = averageFoulScore;
  }

  public EventInsights2017Detail averageFuelPoints(Float averageFuelPoints) {
    this.averageFuelPoints = averageFuelPoints;
    return this;
  }

   /**
   * Average fuel points scored.
   * @return averageFuelPoints
  **/
  @ApiModelProperty(required = true, value = "Average fuel points scored.")
  public Float getAverageFuelPoints() {
    return averageFuelPoints;
  }

  public void setAverageFuelPoints(Float averageFuelPoints) {
    this.averageFuelPoints = averageFuelPoints;
  }

  public EventInsights2017Detail averageFuelPointsAuto(Float averageFuelPointsAuto) {
    this.averageFuelPointsAuto = averageFuelPointsAuto;
    return this;
  }

   /**
   * Average fuel points scored during auto.
   * @return averageFuelPointsAuto
  **/
  @ApiModelProperty(required = true, value = "Average fuel points scored during auto.")
  public Float getAverageFuelPointsAuto() {
    return averageFuelPointsAuto;
  }

  public void setAverageFuelPointsAuto(Float averageFuelPointsAuto) {
    this.averageFuelPointsAuto = averageFuelPointsAuto;
  }

  public EventInsights2017Detail averageFuelPointsTeleop(Float averageFuelPointsTeleop) {
    this.averageFuelPointsTeleop = averageFuelPointsTeleop;
    return this;
  }

   /**
   * Average fuel points scored during teleop.
   * @return averageFuelPointsTeleop
  **/
  @ApiModelProperty(required = true, value = "Average fuel points scored during teleop.")
  public Float getAverageFuelPointsTeleop() {
    return averageFuelPointsTeleop;
  }

  public void setAverageFuelPointsTeleop(Float averageFuelPointsTeleop) {
    this.averageFuelPointsTeleop = averageFuelPointsTeleop;
  }

  public EventInsights2017Detail averageHighGoals(Float averageHighGoals) {
    this.averageHighGoals = averageHighGoals;
    return this;
  }

   /**
   * Average points scored in the high goal.
   * @return averageHighGoals
  **/
  @ApiModelProperty(required = true, value = "Average points scored in the high goal.")
  public Float getAverageHighGoals() {
    return averageHighGoals;
  }

  public void setAverageHighGoals(Float averageHighGoals) {
    this.averageHighGoals = averageHighGoals;
  }

  public EventInsights2017Detail averageHighGoalsAuto(Float averageHighGoalsAuto) {
    this.averageHighGoalsAuto = averageHighGoalsAuto;
    return this;
  }

   /**
   * Average points scored in the high goal during auto.
   * @return averageHighGoalsAuto
  **/
  @ApiModelProperty(required = true, value = "Average points scored in the high goal during auto.")
  public Float getAverageHighGoalsAuto() {
    return averageHighGoalsAuto;
  }

  public void setAverageHighGoalsAuto(Float averageHighGoalsAuto) {
    this.averageHighGoalsAuto = averageHighGoalsAuto;
  }

  public EventInsights2017Detail averageHighGoalsTeleop(Float averageHighGoalsTeleop) {
    this.averageHighGoalsTeleop = averageHighGoalsTeleop;
    return this;
  }

   /**
   * Average points scored in the high goal during teleop.
   * @return averageHighGoalsTeleop
  **/
  @ApiModelProperty(required = true, value = "Average points scored in the high goal during teleop.")
  public Float getAverageHighGoalsTeleop() {
    return averageHighGoalsTeleop;
  }

  public void setAverageHighGoalsTeleop(Float averageHighGoalsTeleop) {
    this.averageHighGoalsTeleop = averageHighGoalsTeleop;
  }

  public EventInsights2017Detail averageLowGoals(Float averageLowGoals) {
    this.averageLowGoals = averageLowGoals;
    return this;
  }

   /**
   * Average points scored in the low goal.
   * @return averageLowGoals
  **/
  @ApiModelProperty(required = true, value = "Average points scored in the low goal.")
  public Float getAverageLowGoals() {
    return averageLowGoals;
  }

  public void setAverageLowGoals(Float averageLowGoals) {
    this.averageLowGoals = averageLowGoals;
  }

  public EventInsights2017Detail averageLowGoalsAuto(Float averageLowGoalsAuto) {
    this.averageLowGoalsAuto = averageLowGoalsAuto;
    return this;
  }

   /**
   * Average points scored in the low goal during auto.
   * @return averageLowGoalsAuto
  **/
  @ApiModelProperty(required = true, value = "Average points scored in the low goal during auto.")
  public Float getAverageLowGoalsAuto() {
    return averageLowGoalsAuto;
  }

  public void setAverageLowGoalsAuto(Float averageLowGoalsAuto) {
    this.averageLowGoalsAuto = averageLowGoalsAuto;
  }

  public EventInsights2017Detail averageLowGoalsTeleop(Float averageLowGoalsTeleop) {
    this.averageLowGoalsTeleop = averageLowGoalsTeleop;
    return this;
  }

   /**
   * Average points scored in the low goal during teleop.
   * @return averageLowGoalsTeleop
  **/
  @ApiModelProperty(required = true, value = "Average points scored in the low goal during teleop.")
  public Float getAverageLowGoalsTeleop() {
    return averageLowGoalsTeleop;
  }

  public void setAverageLowGoalsTeleop(Float averageLowGoalsTeleop) {
    this.averageLowGoalsTeleop = averageLowGoalsTeleop;
  }

  public EventInsights2017Detail averageMobilityPointsAuto(Float averageMobilityPointsAuto) {
    this.averageMobilityPointsAuto = averageMobilityPointsAuto;
    return this;
  }

   /**
   * Average mobility points scored during auto.
   * @return averageMobilityPointsAuto
  **/
  @ApiModelProperty(required = true, value = "Average mobility points scored during auto.")
  public Float getAverageMobilityPointsAuto() {
    return averageMobilityPointsAuto;
  }

  public void setAverageMobilityPointsAuto(Float averageMobilityPointsAuto) {
    this.averageMobilityPointsAuto = averageMobilityPointsAuto;
  }

  public EventInsights2017Detail averagePointsAuto(Float averagePointsAuto) {
    this.averagePointsAuto = averagePointsAuto;
    return this;
  }

   /**
   * Average points scored during auto.
   * @return averagePointsAuto
  **/
  @ApiModelProperty(required = true, value = "Average points scored during auto.")
  public Float getAveragePointsAuto() {
    return averagePointsAuto;
  }

  public void setAveragePointsAuto(Float averagePointsAuto) {
    this.averagePointsAuto = averagePointsAuto;
  }

  public EventInsights2017Detail averagePointsTeleop(Float averagePointsTeleop) {
    this.averagePointsTeleop = averagePointsTeleop;
    return this;
  }

   /**
   * Average points scored during teleop.
   * @return averagePointsTeleop
  **/
  @ApiModelProperty(required = true, value = "Average points scored during teleop.")
  public Float getAveragePointsTeleop() {
    return averagePointsTeleop;
  }

  public void setAveragePointsTeleop(Float averagePointsTeleop) {
    this.averagePointsTeleop = averagePointsTeleop;
  }

  public EventInsights2017Detail averageRotorPoints(Float averageRotorPoints) {
    this.averageRotorPoints = averageRotorPoints;
    return this;
  }

   /**
   * Average rotor points scored.
   * @return averageRotorPoints
  **/
  @ApiModelProperty(required = true, value = "Average rotor points scored.")
  public Float getAverageRotorPoints() {
    return averageRotorPoints;
  }

  public void setAverageRotorPoints(Float averageRotorPoints) {
    this.averageRotorPoints = averageRotorPoints;
  }

  public EventInsights2017Detail averageRotorPointsAuto(Float averageRotorPointsAuto) {
    this.averageRotorPointsAuto = averageRotorPointsAuto;
    return this;
  }

   /**
   * Average rotor points scored during auto.
   * @return averageRotorPointsAuto
  **/
  @ApiModelProperty(required = true, value = "Average rotor points scored during auto.")
  public Float getAverageRotorPointsAuto() {
    return averageRotorPointsAuto;
  }

  public void setAverageRotorPointsAuto(Float averageRotorPointsAuto) {
    this.averageRotorPointsAuto = averageRotorPointsAuto;
  }

  public EventInsights2017Detail averageRotorPointsTeleop(Float averageRotorPointsTeleop) {
    this.averageRotorPointsTeleop = averageRotorPointsTeleop;
    return this;
  }

   /**
   * Average rotor points scored during teleop.
   * @return averageRotorPointsTeleop
  **/
  @ApiModelProperty(required = true, value = "Average rotor points scored during teleop.")
  public Float getAverageRotorPointsTeleop() {
    return averageRotorPointsTeleop;
  }

  public void setAverageRotorPointsTeleop(Float averageRotorPointsTeleop) {
    this.averageRotorPointsTeleop = averageRotorPointsTeleop;
  }

  public EventInsights2017Detail averageScore(Float averageScore) {
    this.averageScore = averageScore;
    return this;
  }

   /**
   * Average score.
   * @return averageScore
  **/
  @ApiModelProperty(required = true, value = "Average score.")
  public Float getAverageScore() {
    return averageScore;
  }

  public void setAverageScore(Float averageScore) {
    this.averageScore = averageScore;
  }

  public EventInsights2017Detail averageTakeoffPointsTeleop(Float averageTakeoffPointsTeleop) {
    this.averageTakeoffPointsTeleop = averageTakeoffPointsTeleop;
    return this;
  }

   /**
   * Average takeoff points scored during teleop.
   * @return averageTakeoffPointsTeleop
  **/
  @ApiModelProperty(required = true, value = "Average takeoff points scored during teleop.")
  public Float getAverageTakeoffPointsTeleop() {
    return averageTakeoffPointsTeleop;
  }

  public void setAverageTakeoffPointsTeleop(Float averageTakeoffPointsTeleop) {
    this.averageTakeoffPointsTeleop = averageTakeoffPointsTeleop;
  }

  public EventInsights2017Detail averageWinMargin(Float averageWinMargin) {
    this.averageWinMargin = averageWinMargin;
    return this;
  }

   /**
   * Average margin of victory.
   * @return averageWinMargin
  **/
  @ApiModelProperty(required = true, value = "Average margin of victory.")
  public Float getAverageWinMargin() {
    return averageWinMargin;
  }

  public void setAverageWinMargin(Float averageWinMargin) {
    this.averageWinMargin = averageWinMargin;
  }

  public EventInsights2017Detail averageWinScore(Float averageWinScore) {
    this.averageWinScore = averageWinScore;
    return this;
  }

   /**
   * Average winning score.
   * @return averageWinScore
  **/
  @ApiModelProperty(required = true, value = "Average winning score.")
  public Float getAverageWinScore() {
    return averageWinScore;
  }

  public void setAverageWinScore(Float averageWinScore) {
    this.averageWinScore = averageWinScore;
  }

  public EventInsights2017Detail highKpa(List<String> highKpa) {
    this.highKpa = highKpa;
    return this;
  }

  public EventInsights2017Detail addHighKpaItem(String highKpaItem) {
    this.highKpa.add(highKpaItem);
    return this;
  }

   /**
   * An array with three values, kPa scored, match key from the match with the high kPa, and the name of the match
   * @return highKpa
  **/
  @ApiModelProperty(required = true, value = "An array with three values, kPa scored, match key from the match with the high kPa, and the name of the match")
  public List<String> getHighKpa() {
    return highKpa;
  }

  public void setHighKpa(List<String> highKpa) {
    this.highKpa = highKpa;
  }

  public EventInsights2017Detail highScore(List<String> highScore) {
    this.highScore = highScore;
    return this;
  }

  public EventInsights2017Detail addHighScoreItem(String highScoreItem) {
    this.highScore.add(highScoreItem);
    return this;
  }

   /**
   * An array with three values, high score, match key from the match with the high score, and the name of the match
   * @return highScore
  **/
  @ApiModelProperty(required = true, value = "An array with three values, high score, match key from the match with the high score, and the name of the match")
  public List<String> getHighScore() {
    return highScore;
  }

  public void setHighScore(List<String> highScore) {
    this.highScore = highScore;
  }

  public EventInsights2017Detail kpaAchieved(List<Float> kpaAchieved) {
    this.kpaAchieved = kpaAchieved;
    return this;
  }

  public EventInsights2017Detail addKpaAchievedItem(Float kpaAchievedItem) {
    this.kpaAchieved.add(kpaAchievedItem);
    return this;
  }

   /**
   * An array with three values, number of times kPa bonus achieved, number of opportunities to bonus, and percentage.
   * @return kpaAchieved
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times kPa bonus achieved, number of opportunities to bonus, and percentage.")
  public List<Float> getKpaAchieved() {
    return kpaAchieved;
  }

  public void setKpaAchieved(List<Float> kpaAchieved) {
    this.kpaAchieved = kpaAchieved;
  }

  public EventInsights2017Detail mobilityCounts(List<Float> mobilityCounts) {
    this.mobilityCounts = mobilityCounts;
    return this;
  }

  public EventInsights2017Detail addMobilityCountsItem(Float mobilityCountsItem) {
    this.mobilityCounts.add(mobilityCountsItem);
    return this;
  }

   /**
   * An array with three values, number of times mobility bonus achieved, number of opportunities to bonus, and percentage.
   * @return mobilityCounts
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times mobility bonus achieved, number of opportunities to bonus, and percentage.")
  public List<Float> getMobilityCounts() {
    return mobilityCounts;
  }

  public void setMobilityCounts(List<Float> mobilityCounts) {
    this.mobilityCounts = mobilityCounts;
  }

  public EventInsights2017Detail rotor1Engaged(List<Float> rotor1Engaged) {
    this.rotor1Engaged = rotor1Engaged;
    return this;
  }

  public EventInsights2017Detail addRotor1EngagedItem(Float rotor1EngagedItem) {
    this.rotor1Engaged.add(rotor1EngagedItem);
    return this;
  }

   /**
   * An array with three values, number of times rotor 1 engaged, number of opportunities to engage, and percentage.
   * @return rotor1Engaged
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times rotor 1 engaged, number of opportunities to engage, and percentage.")
  public List<Float> getRotor1Engaged() {
    return rotor1Engaged;
  }

  public void setRotor1Engaged(List<Float> rotor1Engaged) {
    this.rotor1Engaged = rotor1Engaged;
  }

  public EventInsights2017Detail rotor1EngagedAuto(List<Float> rotor1EngagedAuto) {
    this.rotor1EngagedAuto = rotor1EngagedAuto;
    return this;
  }

  public EventInsights2017Detail addRotor1EngagedAutoItem(Float rotor1EngagedAutoItem) {
    this.rotor1EngagedAuto.add(rotor1EngagedAutoItem);
    return this;
  }

   /**
   * An array with three values, number of times rotor 1 engaged in auto, number of opportunities to engage in auto, and percentage.
   * @return rotor1EngagedAuto
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times rotor 1 engaged in auto, number of opportunities to engage in auto, and percentage.")
  public List<Float> getRotor1EngagedAuto() {
    return rotor1EngagedAuto;
  }

  public void setRotor1EngagedAuto(List<Float> rotor1EngagedAuto) {
    this.rotor1EngagedAuto = rotor1EngagedAuto;
  }

  public EventInsights2017Detail rotor2Engaged(List<Float> rotor2Engaged) {
    this.rotor2Engaged = rotor2Engaged;
    return this;
  }

  public EventInsights2017Detail addRotor2EngagedItem(Float rotor2EngagedItem) {
    this.rotor2Engaged.add(rotor2EngagedItem);
    return this;
  }

   /**
   * An array with three values, number of times rotor 2 engaged, number of opportunities to engage, and percentage.
   * @return rotor2Engaged
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times rotor 2 engaged, number of opportunities to engage, and percentage.")
  public List<Float> getRotor2Engaged() {
    return rotor2Engaged;
  }

  public void setRotor2Engaged(List<Float> rotor2Engaged) {
    this.rotor2Engaged = rotor2Engaged;
  }

  public EventInsights2017Detail rotor2EngagedAuto(List<Float> rotor2EngagedAuto) {
    this.rotor2EngagedAuto = rotor2EngagedAuto;
    return this;
  }

  public EventInsights2017Detail addRotor2EngagedAutoItem(Float rotor2EngagedAutoItem) {
    this.rotor2EngagedAuto.add(rotor2EngagedAutoItem);
    return this;
  }

   /**
   * An array with three values, number of times rotor 2 engaged in auto, number of opportunities to engage in auto, and percentage.
   * @return rotor2EngagedAuto
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times rotor 2 engaged in auto, number of opportunities to engage in auto, and percentage.")
  public List<Float> getRotor2EngagedAuto() {
    return rotor2EngagedAuto;
  }

  public void setRotor2EngagedAuto(List<Float> rotor2EngagedAuto) {
    this.rotor2EngagedAuto = rotor2EngagedAuto;
  }

  public EventInsights2017Detail rotor3Engaged(List<Float> rotor3Engaged) {
    this.rotor3Engaged = rotor3Engaged;
    return this;
  }

  public EventInsights2017Detail addRotor3EngagedItem(Float rotor3EngagedItem) {
    this.rotor3Engaged.add(rotor3EngagedItem);
    return this;
  }

   /**
   * An array with three values, number of times rotor 3 engaged, number of opportunities to engage, and percentage.
   * @return rotor3Engaged
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times rotor 3 engaged, number of opportunities to engage, and percentage.")
  public List<Float> getRotor3Engaged() {
    return rotor3Engaged;
  }

  public void setRotor3Engaged(List<Float> rotor3Engaged) {
    this.rotor3Engaged = rotor3Engaged;
  }

  public EventInsights2017Detail rotor4Engaged(List<Float> rotor4Engaged) {
    this.rotor4Engaged = rotor4Engaged;
    return this;
  }

  public EventInsights2017Detail addRotor4EngagedItem(Float rotor4EngagedItem) {
    this.rotor4Engaged.add(rotor4EngagedItem);
    return this;
  }

   /**
   * An array with three values, number of times rotor 4 engaged, number of opportunities to engage, and percentage.
   * @return rotor4Engaged
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times rotor 4 engaged, number of opportunities to engage, and percentage.")
  public List<Float> getRotor4Engaged() {
    return rotor4Engaged;
  }

  public void setRotor4Engaged(List<Float> rotor4Engaged) {
    this.rotor4Engaged = rotor4Engaged;
  }

  public EventInsights2017Detail takeoffCounts(List<Float> takeoffCounts) {
    this.takeoffCounts = takeoffCounts;
    return this;
  }

  public EventInsights2017Detail addTakeoffCountsItem(Float takeoffCountsItem) {
    this.takeoffCounts.add(takeoffCountsItem);
    return this;
  }

   /**
   * An array with three values, number of times takeoff was counted, number of opportunities to takeoff, and percentage.
   * @return takeoffCounts
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times takeoff was counted, number of opportunities to takeoff, and percentage.")
  public List<Float> getTakeoffCounts() {
    return takeoffCounts;
  }

  public void setTakeoffCounts(List<Float> takeoffCounts) {
    this.takeoffCounts = takeoffCounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventInsights2017Detail eventInsights2017Detail = (EventInsights2017Detail) o;
    return Objects.equals(this.averageFoulScore, eventInsights2017Detail.averageFoulScore) &&
        Objects.equals(this.averageFuelPoints, eventInsights2017Detail.averageFuelPoints) &&
        Objects.equals(this.averageFuelPointsAuto, eventInsights2017Detail.averageFuelPointsAuto) &&
        Objects.equals(this.averageFuelPointsTeleop, eventInsights2017Detail.averageFuelPointsTeleop) &&
        Objects.equals(this.averageHighGoals, eventInsights2017Detail.averageHighGoals) &&
        Objects.equals(this.averageHighGoalsAuto, eventInsights2017Detail.averageHighGoalsAuto) &&
        Objects.equals(this.averageHighGoalsTeleop, eventInsights2017Detail.averageHighGoalsTeleop) &&
        Objects.equals(this.averageLowGoals, eventInsights2017Detail.averageLowGoals) &&
        Objects.equals(this.averageLowGoalsAuto, eventInsights2017Detail.averageLowGoalsAuto) &&
        Objects.equals(this.averageLowGoalsTeleop, eventInsights2017Detail.averageLowGoalsTeleop) &&
        Objects.equals(this.averageMobilityPointsAuto, eventInsights2017Detail.averageMobilityPointsAuto) &&
        Objects.equals(this.averagePointsAuto, eventInsights2017Detail.averagePointsAuto) &&
        Objects.equals(this.averagePointsTeleop, eventInsights2017Detail.averagePointsTeleop) &&
        Objects.equals(this.averageRotorPoints, eventInsights2017Detail.averageRotorPoints) &&
        Objects.equals(this.averageRotorPointsAuto, eventInsights2017Detail.averageRotorPointsAuto) &&
        Objects.equals(this.averageRotorPointsTeleop, eventInsights2017Detail.averageRotorPointsTeleop) &&
        Objects.equals(this.averageScore, eventInsights2017Detail.averageScore) &&
        Objects.equals(this.averageTakeoffPointsTeleop, eventInsights2017Detail.averageTakeoffPointsTeleop) &&
        Objects.equals(this.averageWinMargin, eventInsights2017Detail.averageWinMargin) &&
        Objects.equals(this.averageWinScore, eventInsights2017Detail.averageWinScore) &&
        Objects.equals(this.highKpa, eventInsights2017Detail.highKpa) &&
        Objects.equals(this.highScore, eventInsights2017Detail.highScore) &&
        Objects.equals(this.kpaAchieved, eventInsights2017Detail.kpaAchieved) &&
        Objects.equals(this.mobilityCounts, eventInsights2017Detail.mobilityCounts) &&
        Objects.equals(this.rotor1Engaged, eventInsights2017Detail.rotor1Engaged) &&
        Objects.equals(this.rotor1EngagedAuto, eventInsights2017Detail.rotor1EngagedAuto) &&
        Objects.equals(this.rotor2Engaged, eventInsights2017Detail.rotor2Engaged) &&
        Objects.equals(this.rotor2EngagedAuto, eventInsights2017Detail.rotor2EngagedAuto) &&
        Objects.equals(this.rotor3Engaged, eventInsights2017Detail.rotor3Engaged) &&
        Objects.equals(this.rotor4Engaged, eventInsights2017Detail.rotor4Engaged) &&
        Objects.equals(this.takeoffCounts, eventInsights2017Detail.takeoffCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageFoulScore, averageFuelPoints, averageFuelPointsAuto, averageFuelPointsTeleop, averageHighGoals, averageHighGoalsAuto, averageHighGoalsTeleop, averageLowGoals, averageLowGoalsAuto, averageLowGoalsTeleop, averageMobilityPointsAuto, averagePointsAuto, averagePointsTeleop, averageRotorPoints, averageRotorPointsAuto, averageRotorPointsTeleop, averageScore, averageTakeoffPointsTeleop, averageWinMargin, averageWinScore, highKpa, highScore, kpaAchieved, mobilityCounts, rotor1Engaged, rotor1EngagedAuto, rotor2Engaged, rotor2EngagedAuto, rotor3Engaged, rotor4Engaged, takeoffCounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventInsights2017Detail {\n");
    
    sb.append("    averageFoulScore: ").append(toIndentedString(averageFoulScore)).append("\n");
    sb.append("    averageFuelPoints: ").append(toIndentedString(averageFuelPoints)).append("\n");
    sb.append("    averageFuelPointsAuto: ").append(toIndentedString(averageFuelPointsAuto)).append("\n");
    sb.append("    averageFuelPointsTeleop: ").append(toIndentedString(averageFuelPointsTeleop)).append("\n");
    sb.append("    averageHighGoals: ").append(toIndentedString(averageHighGoals)).append("\n");
    sb.append("    averageHighGoalsAuto: ").append(toIndentedString(averageHighGoalsAuto)).append("\n");
    sb.append("    averageHighGoalsTeleop: ").append(toIndentedString(averageHighGoalsTeleop)).append("\n");
    sb.append("    averageLowGoals: ").append(toIndentedString(averageLowGoals)).append("\n");
    sb.append("    averageLowGoalsAuto: ").append(toIndentedString(averageLowGoalsAuto)).append("\n");
    sb.append("    averageLowGoalsTeleop: ").append(toIndentedString(averageLowGoalsTeleop)).append("\n");
    sb.append("    averageMobilityPointsAuto: ").append(toIndentedString(averageMobilityPointsAuto)).append("\n");
    sb.append("    averagePointsAuto: ").append(toIndentedString(averagePointsAuto)).append("\n");
    sb.append("    averagePointsTeleop: ").append(toIndentedString(averagePointsTeleop)).append("\n");
    sb.append("    averageRotorPoints: ").append(toIndentedString(averageRotorPoints)).append("\n");
    sb.append("    averageRotorPointsAuto: ").append(toIndentedString(averageRotorPointsAuto)).append("\n");
    sb.append("    averageRotorPointsTeleop: ").append(toIndentedString(averageRotorPointsTeleop)).append("\n");
    sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
    sb.append("    averageTakeoffPointsTeleop: ").append(toIndentedString(averageTakeoffPointsTeleop)).append("\n");
    sb.append("    averageWinMargin: ").append(toIndentedString(averageWinMargin)).append("\n");
    sb.append("    averageWinScore: ").append(toIndentedString(averageWinScore)).append("\n");
    sb.append("    highKpa: ").append(toIndentedString(highKpa)).append("\n");
    sb.append("    highScore: ").append(toIndentedString(highScore)).append("\n");
    sb.append("    kpaAchieved: ").append(toIndentedString(kpaAchieved)).append("\n");
    sb.append("    mobilityCounts: ").append(toIndentedString(mobilityCounts)).append("\n");
    sb.append("    rotor1Engaged: ").append(toIndentedString(rotor1Engaged)).append("\n");
    sb.append("    rotor1EngagedAuto: ").append(toIndentedString(rotor1EngagedAuto)).append("\n");
    sb.append("    rotor2Engaged: ").append(toIndentedString(rotor2Engaged)).append("\n");
    sb.append("    rotor2EngagedAuto: ").append(toIndentedString(rotor2EngagedAuto)).append("\n");
    sb.append("    rotor3Engaged: ").append(toIndentedString(rotor3Engaged)).append("\n");
    sb.append("    rotor4Engaged: ").append(toIndentedString(rotor4Engaged)).append("\n");
    sb.append("    takeoffCounts: ").append(toIndentedString(takeoffCounts)).append("\n");
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

