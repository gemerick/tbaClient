package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * EventInsights2016Detail
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventInsights2016Detail {
  @SerializedName("LowBar")
  private List<Float> lowBar = new ArrayList<Float>();

  @SerializedName("A_ChevalDeFrise")
  private List<Float> aChevalDeFrise = new ArrayList<Float>();

  @SerializedName("A_Portcullis")
  private List<Float> aPortcullis = new ArrayList<Float>();

  @SerializedName("B_Ramparts")
  private List<Float> bRamparts = new ArrayList<Float>();

  @SerializedName("B_Moat")
  private List<Float> bMoat = new ArrayList<Float>();

  @SerializedName("C_SallyPort")
  private List<Float> cSallyPort = new ArrayList<Float>();

  @SerializedName("C_Drawbridge")
  private List<Float> cDrawbridge = new ArrayList<Float>();

  @SerializedName("D_RoughTerrain")
  private List<Float> dRoughTerrain = new ArrayList<Float>();

  @SerializedName("D_RockWall")
  private List<Float> dRockWall = new ArrayList<Float>();

  @SerializedName("average_high_goals")
  private Float averageHighGoals = null;

  @SerializedName("average_low_goals")
  private Float averageLowGoals = null;

  @SerializedName("breaches")
  private List<Float> breaches = new ArrayList<Float>();

  @SerializedName("scales")
  private List<Float> scales = new ArrayList<Float>();

  @SerializedName("challenges")
  private List<Float> challenges = new ArrayList<Float>();

  @SerializedName("captures")
  private List<Float> captures = new ArrayList<Float>();

  @SerializedName("average_win_score")
  private Float averageWinScore = null;

  @SerializedName("average_win_margin")
  private Float averageWinMargin = null;

  @SerializedName("average_score")
  private Float averageScore = null;

  @SerializedName("average_auto_score")
  private Float averageAutoScore = null;

  @SerializedName("average_crossing_score")
  private Float averageCrossingScore = null;

  @SerializedName("average_boulder_score")
  private Float averageBoulderScore = null;

  @SerializedName("average_tower_score")
  private Float averageTowerScore = null;

  @SerializedName("average_foul_score")
  private Float averageFoulScore = null;

  @SerializedName("high_score")
  private List<String> highScore = new ArrayList<String>();

  public EventInsights2016Detail lowBar(List<Float> lowBar) {
    this.lowBar = lowBar;
    return this;
  }

  public EventInsights2016Detail addLowBarItem(Float lowBarItem) {
    this.lowBar.add(lowBarItem);
    return this;
  }

   /**
   * For the Low Bar - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
   * @return lowBar
  **/
  @ApiModelProperty(required = true, value = "For the Low Bar - An array with three values, number of times damaged, number of opportunities to damage, and percentage.")
  public List<Float> getLowBar() {
    return lowBar;
  }

  public void setLowBar(List<Float> lowBar) {
    this.lowBar = lowBar;
  }

  public EventInsights2016Detail aChevalDeFrise(List<Float> aChevalDeFrise) {
    this.aChevalDeFrise = aChevalDeFrise;
    return this;
  }

  public EventInsights2016Detail addAChevalDeFriseItem(Float aChevalDeFriseItem) {
    this.aChevalDeFrise.add(aChevalDeFriseItem);
    return this;
  }

   /**
   * For the Cheval De Frise - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
   * @return aChevalDeFrise
  **/
  @ApiModelProperty(required = true, value = "For the Cheval De Frise - An array with three values, number of times damaged, number of opportunities to damage, and percentage.")
  public List<Float> getAChevalDeFrise() {
    return aChevalDeFrise;
  }

  public void setAChevalDeFrise(List<Float> aChevalDeFrise) {
    this.aChevalDeFrise = aChevalDeFrise;
  }

  public EventInsights2016Detail aPortcullis(List<Float> aPortcullis) {
    this.aPortcullis = aPortcullis;
    return this;
  }

  public EventInsights2016Detail addAPortcullisItem(Float aPortcullisItem) {
    this.aPortcullis.add(aPortcullisItem);
    return this;
  }

   /**
   * For the Portcullis - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
   * @return aPortcullis
  **/
  @ApiModelProperty(required = true, value = "For the Portcullis - An array with three values, number of times damaged, number of opportunities to damage, and percentage.")
  public List<Float> getAPortcullis() {
    return aPortcullis;
  }

  public void setAPortcullis(List<Float> aPortcullis) {
    this.aPortcullis = aPortcullis;
  }

  public EventInsights2016Detail bRamparts(List<Float> bRamparts) {
    this.bRamparts = bRamparts;
    return this;
  }

  public EventInsights2016Detail addBRampartsItem(Float bRampartsItem) {
    this.bRamparts.add(bRampartsItem);
    return this;
  }

   /**
   * For the Ramparts - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
   * @return bRamparts
  **/
  @ApiModelProperty(required = true, value = "For the Ramparts - An array with three values, number of times damaged, number of opportunities to damage, and percentage.")
  public List<Float> getBRamparts() {
    return bRamparts;
  }

  public void setBRamparts(List<Float> bRamparts) {
    this.bRamparts = bRamparts;
  }

  public EventInsights2016Detail bMoat(List<Float> bMoat) {
    this.bMoat = bMoat;
    return this;
  }

  public EventInsights2016Detail addBMoatItem(Float bMoatItem) {
    this.bMoat.add(bMoatItem);
    return this;
  }

   /**
   * For the Moat - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
   * @return bMoat
  **/
  @ApiModelProperty(required = true, value = "For the Moat - An array with three values, number of times damaged, number of opportunities to damage, and percentage.")
  public List<Float> getBMoat() {
    return bMoat;
  }

  public void setBMoat(List<Float> bMoat) {
    this.bMoat = bMoat;
  }

  public EventInsights2016Detail cSallyPort(List<Float> cSallyPort) {
    this.cSallyPort = cSallyPort;
    return this;
  }

  public EventInsights2016Detail addCSallyPortItem(Float cSallyPortItem) {
    this.cSallyPort.add(cSallyPortItem);
    return this;
  }

   /**
   * For the Sally Port - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
   * @return cSallyPort
  **/
  @ApiModelProperty(required = true, value = "For the Sally Port - An array with three values, number of times damaged, number of opportunities to damage, and percentage.")
  public List<Float> getCSallyPort() {
    return cSallyPort;
  }

  public void setCSallyPort(List<Float> cSallyPort) {
    this.cSallyPort = cSallyPort;
  }

  public EventInsights2016Detail cDrawbridge(List<Float> cDrawbridge) {
    this.cDrawbridge = cDrawbridge;
    return this;
  }

  public EventInsights2016Detail addCDrawbridgeItem(Float cDrawbridgeItem) {
    this.cDrawbridge.add(cDrawbridgeItem);
    return this;
  }

   /**
   * For the Drawbridge - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
   * @return cDrawbridge
  **/
  @ApiModelProperty(required = true, value = "For the Drawbridge - An array with three values, number of times damaged, number of opportunities to damage, and percentage.")
  public List<Float> getCDrawbridge() {
    return cDrawbridge;
  }

  public void setCDrawbridge(List<Float> cDrawbridge) {
    this.cDrawbridge = cDrawbridge;
  }

  public EventInsights2016Detail dRoughTerrain(List<Float> dRoughTerrain) {
    this.dRoughTerrain = dRoughTerrain;
    return this;
  }

  public EventInsights2016Detail addDRoughTerrainItem(Float dRoughTerrainItem) {
    this.dRoughTerrain.add(dRoughTerrainItem);
    return this;
  }

   /**
   * For the Rough Terrain - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
   * @return dRoughTerrain
  **/
  @ApiModelProperty(required = true, value = "For the Rough Terrain - An array with three values, number of times damaged, number of opportunities to damage, and percentage.")
  public List<Float> getDRoughTerrain() {
    return dRoughTerrain;
  }

  public void setDRoughTerrain(List<Float> dRoughTerrain) {
    this.dRoughTerrain = dRoughTerrain;
  }

  public EventInsights2016Detail dRockWall(List<Float> dRockWall) {
    this.dRockWall = dRockWall;
    return this;
  }

  public EventInsights2016Detail addDRockWallItem(Float dRockWallItem) {
    this.dRockWall.add(dRockWallItem);
    return this;
  }

   /**
   * For the Rock Wall - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
   * @return dRockWall
  **/
  @ApiModelProperty(required = true, value = "For the Rock Wall - An array with three values, number of times damaged, number of opportunities to damage, and percentage.")
  public List<Float> getDRockWall() {
    return dRockWall;
  }

  public void setDRockWall(List<Float> dRockWall) {
    this.dRockWall = dRockWall;
  }

  public EventInsights2016Detail averageHighGoals(Float averageHighGoals) {
    this.averageHighGoals = averageHighGoals;
    return this;
  }

   /**
   * Average number of high goals scored.
   * @return averageHighGoals
  **/
  @ApiModelProperty(required = true, value = "Average number of high goals scored.")
  public Float getAverageHighGoals() {
    return averageHighGoals;
  }

  public void setAverageHighGoals(Float averageHighGoals) {
    this.averageHighGoals = averageHighGoals;
  }

  public EventInsights2016Detail averageLowGoals(Float averageLowGoals) {
    this.averageLowGoals = averageLowGoals;
    return this;
  }

   /**
   * Average number of low goals scored.
   * @return averageLowGoals
  **/
  @ApiModelProperty(required = true, value = "Average number of low goals scored.")
  public Float getAverageLowGoals() {
    return averageLowGoals;
  }

  public void setAverageLowGoals(Float averageLowGoals) {
    this.averageLowGoals = averageLowGoals;
  }

  public EventInsights2016Detail breaches(List<Float> breaches) {
    this.breaches = breaches;
    return this;
  }

  public EventInsights2016Detail addBreachesItem(Float breachesItem) {
    this.breaches.add(breachesItem);
    return this;
  }

   /**
   * An array with three values, number of times breached, number of opportunities to breech, and percentage.
   * @return breaches
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times breached, number of opportunities to breech, and percentage.")
  public List<Float> getBreaches() {
    return breaches;
  }

  public void setBreaches(List<Float> breaches) {
    this.breaches = breaches;
  }

  public EventInsights2016Detail scales(List<Float> scales) {
    this.scales = scales;
    return this;
  }

  public EventInsights2016Detail addScalesItem(Float scalesItem) {
    this.scales.add(scalesItem);
    return this;
  }

   /**
   * An array with three values, number of times scaled, number of opportunities to scale, and percentage.
   * @return scales
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times scaled, number of opportunities to scale, and percentage.")
  public List<Float> getScales() {
    return scales;
  }

  public void setScales(List<Float> scales) {
    this.scales = scales;
  }

  public EventInsights2016Detail challenges(List<Float> challenges) {
    this.challenges = challenges;
    return this;
  }

  public EventInsights2016Detail addChallengesItem(Float challengesItem) {
    this.challenges.add(challengesItem);
    return this;
  }

   /**
   * An array with three values, number of times challenged, number of opportunities to challenge, and percentage.
   * @return challenges
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times challenged, number of opportunities to challenge, and percentage.")
  public List<Float> getChallenges() {
    return challenges;
  }

  public void setChallenges(List<Float> challenges) {
    this.challenges = challenges;
  }

  public EventInsights2016Detail captures(List<Float> captures) {
    this.captures = captures;
    return this;
  }

  public EventInsights2016Detail addCapturesItem(Float capturesItem) {
    this.captures.add(capturesItem);
    return this;
  }

   /**
   * An array with three values, number of times captured, number of opportunities to capture, and percentage.
   * @return captures
  **/
  @ApiModelProperty(required = true, value = "An array with three values, number of times captured, number of opportunities to capture, and percentage.")
  public List<Float> getCaptures() {
    return captures;
  }

  public void setCaptures(List<Float> captures) {
    this.captures = captures;
  }

  public EventInsights2016Detail averageWinScore(Float averageWinScore) {
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

  public EventInsights2016Detail averageWinMargin(Float averageWinMargin) {
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

  public EventInsights2016Detail averageScore(Float averageScore) {
    this.averageScore = averageScore;
    return this;
  }

   /**
   * Average total score.
   * @return averageScore
  **/
  @ApiModelProperty(required = true, value = "Average total score.")
  public Float getAverageScore() {
    return averageScore;
  }

  public void setAverageScore(Float averageScore) {
    this.averageScore = averageScore;
  }

  public EventInsights2016Detail averageAutoScore(Float averageAutoScore) {
    this.averageAutoScore = averageAutoScore;
    return this;
  }

   /**
   * Average autonomous score.
   * @return averageAutoScore
  **/
  @ApiModelProperty(required = true, value = "Average autonomous score.")
  public Float getAverageAutoScore() {
    return averageAutoScore;
  }

  public void setAverageAutoScore(Float averageAutoScore) {
    this.averageAutoScore = averageAutoScore;
  }

  public EventInsights2016Detail averageCrossingScore(Float averageCrossingScore) {
    this.averageCrossingScore = averageCrossingScore;
    return this;
  }

   /**
   * Average crossing score.
   * @return averageCrossingScore
  **/
  @ApiModelProperty(required = true, value = "Average crossing score.")
  public Float getAverageCrossingScore() {
    return averageCrossingScore;
  }

  public void setAverageCrossingScore(Float averageCrossingScore) {
    this.averageCrossingScore = averageCrossingScore;
  }

  public EventInsights2016Detail averageBoulderScore(Float averageBoulderScore) {
    this.averageBoulderScore = averageBoulderScore;
    return this;
  }

   /**
   * Average boulder score.
   * @return averageBoulderScore
  **/
  @ApiModelProperty(required = true, value = "Average boulder score.")
  public Float getAverageBoulderScore() {
    return averageBoulderScore;
  }

  public void setAverageBoulderScore(Float averageBoulderScore) {
    this.averageBoulderScore = averageBoulderScore;
  }

  public EventInsights2016Detail averageTowerScore(Float averageTowerScore) {
    this.averageTowerScore = averageTowerScore;
    return this;
  }

   /**
   * Average tower score.
   * @return averageTowerScore
  **/
  @ApiModelProperty(required = true, value = "Average tower score.")
  public Float getAverageTowerScore() {
    return averageTowerScore;
  }

  public void setAverageTowerScore(Float averageTowerScore) {
    this.averageTowerScore = averageTowerScore;
  }

  public EventInsights2016Detail averageFoulScore(Float averageFoulScore) {
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

  public EventInsights2016Detail highScore(List<String> highScore) {
    this.highScore = highScore;
    return this;
  }

  public EventInsights2016Detail addHighScoreItem(String highScoreItem) {
    this.highScore.add(highScoreItem);
    return this;
  }

   /**
   * An array with three values, high score, match key from the match with the high score, and the name of the match.
   * @return highScore
  **/
  @ApiModelProperty(required = true, value = "An array with three values, high score, match key from the match with the high score, and the name of the match.")
  public List<String> getHighScore() {
    return highScore;
  }

  public void setHighScore(List<String> highScore) {
    this.highScore = highScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventInsights2016Detail eventInsights2016Detail = (EventInsights2016Detail) o;
    return Objects.equals(this.lowBar, eventInsights2016Detail.lowBar) &&
        Objects.equals(this.aChevalDeFrise, eventInsights2016Detail.aChevalDeFrise) &&
        Objects.equals(this.aPortcullis, eventInsights2016Detail.aPortcullis) &&
        Objects.equals(this.bRamparts, eventInsights2016Detail.bRamparts) &&
        Objects.equals(this.bMoat, eventInsights2016Detail.bMoat) &&
        Objects.equals(this.cSallyPort, eventInsights2016Detail.cSallyPort) &&
        Objects.equals(this.cDrawbridge, eventInsights2016Detail.cDrawbridge) &&
        Objects.equals(this.dRoughTerrain, eventInsights2016Detail.dRoughTerrain) &&
        Objects.equals(this.dRockWall, eventInsights2016Detail.dRockWall) &&
        Objects.equals(this.averageHighGoals, eventInsights2016Detail.averageHighGoals) &&
        Objects.equals(this.averageLowGoals, eventInsights2016Detail.averageLowGoals) &&
        Objects.equals(this.breaches, eventInsights2016Detail.breaches) &&
        Objects.equals(this.scales, eventInsights2016Detail.scales) &&
        Objects.equals(this.challenges, eventInsights2016Detail.challenges) &&
        Objects.equals(this.captures, eventInsights2016Detail.captures) &&
        Objects.equals(this.averageWinScore, eventInsights2016Detail.averageWinScore) &&
        Objects.equals(this.averageWinMargin, eventInsights2016Detail.averageWinMargin) &&
        Objects.equals(this.averageScore, eventInsights2016Detail.averageScore) &&
        Objects.equals(this.averageAutoScore, eventInsights2016Detail.averageAutoScore) &&
        Objects.equals(this.averageCrossingScore, eventInsights2016Detail.averageCrossingScore) &&
        Objects.equals(this.averageBoulderScore, eventInsights2016Detail.averageBoulderScore) &&
        Objects.equals(this.averageTowerScore, eventInsights2016Detail.averageTowerScore) &&
        Objects.equals(this.averageFoulScore, eventInsights2016Detail.averageFoulScore) &&
        Objects.equals(this.highScore, eventInsights2016Detail.highScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowBar, aChevalDeFrise, aPortcullis, bRamparts, bMoat, cSallyPort, cDrawbridge, dRoughTerrain, dRockWall, averageHighGoals, averageLowGoals, breaches, scales, challenges, captures, averageWinScore, averageWinMargin, averageScore, averageAutoScore, averageCrossingScore, averageBoulderScore, averageTowerScore, averageFoulScore, highScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventInsights2016Detail {\n");
    
    sb.append("    lowBar: ").append(toIndentedString(lowBar)).append("\n");
    sb.append("    aChevalDeFrise: ").append(toIndentedString(aChevalDeFrise)).append("\n");
    sb.append("    aPortcullis: ").append(toIndentedString(aPortcullis)).append("\n");
    sb.append("    bRamparts: ").append(toIndentedString(bRamparts)).append("\n");
    sb.append("    bMoat: ").append(toIndentedString(bMoat)).append("\n");
    sb.append("    cSallyPort: ").append(toIndentedString(cSallyPort)).append("\n");
    sb.append("    cDrawbridge: ").append(toIndentedString(cDrawbridge)).append("\n");
    sb.append("    dRoughTerrain: ").append(toIndentedString(dRoughTerrain)).append("\n");
    sb.append("    dRockWall: ").append(toIndentedString(dRockWall)).append("\n");
    sb.append("    averageHighGoals: ").append(toIndentedString(averageHighGoals)).append("\n");
    sb.append("    averageLowGoals: ").append(toIndentedString(averageLowGoals)).append("\n");
    sb.append("    breaches: ").append(toIndentedString(breaches)).append("\n");
    sb.append("    scales: ").append(toIndentedString(scales)).append("\n");
    sb.append("    challenges: ").append(toIndentedString(challenges)).append("\n");
    sb.append("    captures: ").append(toIndentedString(captures)).append("\n");
    sb.append("    averageWinScore: ").append(toIndentedString(averageWinScore)).append("\n");
    sb.append("    averageWinMargin: ").append(toIndentedString(averageWinMargin)).append("\n");
    sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
    sb.append("    averageAutoScore: ").append(toIndentedString(averageAutoScore)).append("\n");
    sb.append("    averageCrossingScore: ").append(toIndentedString(averageCrossingScore)).append("\n");
    sb.append("    averageBoulderScore: ").append(toIndentedString(averageBoulderScore)).append("\n");
    sb.append("    averageTowerScore: ").append(toIndentedString(averageTowerScore)).append("\n");
    sb.append("    averageFoulScore: ").append(toIndentedString(averageFoulScore)).append("\n");
    sb.append("    highScore: ").append(toIndentedString(highScore)).append("\n");
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

