package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MatchSimpleAlliances;

/**
 * MatchSimple
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class MatchSimple {
  @SerializedName("key")
  private String key = null;

  /**
   * The competition level the match was played at.
   */
  public enum CompLevelEnum {
    @SerializedName("qm")
    QM("qm"),
    
    @SerializedName("ef")
    EF("ef"),
    
    @SerializedName("qf")
    QF("qf"),
    
    @SerializedName("sf")
    SF("sf"),
    
    @SerializedName("f")
    F("f");

    private String value;

    CompLevelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("comp_level")
  private CompLevelEnum compLevel = null;

  @SerializedName("set_number")
  private Integer setNumber = null;

  @SerializedName("match_number")
  private Integer matchNumber = null;

  @SerializedName("alliances")
  private MatchSimpleAlliances alliances = null;

  /**
   * The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.
   */
  public enum WinningAllianceEnum {
    @SerializedName("red")
    RED("red"),
    
    @SerializedName("blue")
    BLUE("blue");

    private String value;

    WinningAllianceEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("winning_alliance")
  private WinningAllianceEnum winningAlliance = null;

  @SerializedName("event_key")
  private String eventKey = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("predicted_time")
  private Long predictedTime = null;

  @SerializedName("actual_time")
  private Long actualTime = null;

  public MatchSimple key(String key) {
    this.key = key;
    return this;
  }

   /**
   * TBA event key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may append the competition level if more than one match in required per set.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "TBA event key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may append the competition level if more than one match in required per set.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public MatchSimple compLevel(CompLevelEnum compLevel) {
    this.compLevel = compLevel;
    return this;
  }

   /**
   * The competition level the match was played at.
   * @return compLevel
  **/
  @ApiModelProperty(required = true, value = "The competition level the match was played at.")
  public CompLevelEnum getCompLevel() {
    return compLevel;
  }

  public void setCompLevel(CompLevelEnum compLevel) {
    this.compLevel = compLevel;
  }

  public MatchSimple setNumber(Integer setNumber) {
    this.setNumber = setNumber;
    return this;
  }

   /**
   * The set number in a series of matches where more than one match is required in the match series.
   * @return setNumber
  **/
  @ApiModelProperty(required = true, value = "The set number in a series of matches where more than one match is required in the match series.")
  public Integer getSetNumber() {
    return setNumber;
  }

  public void setSetNumber(Integer setNumber) {
    this.setNumber = setNumber;
  }

  public MatchSimple matchNumber(Integer matchNumber) {
    this.matchNumber = matchNumber;
    return this;
  }

   /**
   * The match number of the match in the competition level.
   * @return matchNumber
  **/
  @ApiModelProperty(required = true, value = "The match number of the match in the competition level.")
  public Integer getMatchNumber() {
    return matchNumber;
  }

  public void setMatchNumber(Integer matchNumber) {
    this.matchNumber = matchNumber;
  }

  public MatchSimple alliances(MatchSimpleAlliances alliances) {
    this.alliances = alliances;
    return this;
  }

   /**
   * Get alliances
   * @return alliances
  **/
  @ApiModelProperty(value = "")
  public MatchSimpleAlliances getAlliances() {
    return alliances;
  }

  public void setAlliances(MatchSimpleAlliances alliances) {
    this.alliances = alliances;
  }

  public MatchSimple winningAlliance(WinningAllianceEnum winningAlliance) {
    this.winningAlliance = winningAlliance;
    return this;
  }

   /**
   * The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.
   * @return winningAlliance
  **/
  @ApiModelProperty(value = "The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.")
  public WinningAllianceEnum getWinningAlliance() {
    return winningAlliance;
  }

  public void setWinningAlliance(WinningAllianceEnum winningAlliance) {
    this.winningAlliance = winningAlliance;
  }

  public MatchSimple eventKey(String eventKey) {
    this.eventKey = eventKey;
    return this;
  }

   /**
   * Event key of the event the match was played at.
   * @return eventKey
  **/
  @ApiModelProperty(required = true, value = "Event key of the event the match was played at.")
  public String getEventKey() {
    return eventKey;
  }

  public void setEventKey(String eventKey) {
    this.eventKey = eventKey;
  }

  public MatchSimple time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.
   * @return time
  **/
  @ApiModelProperty(value = "UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public MatchSimple predictedTime(Long predictedTime) {
    this.predictedTime = predictedTime;
    return this;
  }

   /**
   * UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.
   * @return predictedTime
  **/
  @ApiModelProperty(value = "UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.")
  public Long getPredictedTime() {
    return predictedTime;
  }

  public void setPredictedTime(Long predictedTime) {
    this.predictedTime = predictedTime;
  }

  public MatchSimple actualTime(Long actualTime) {
    this.actualTime = actualTime;
    return this;
  }

   /**
   * UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.
   * @return actualTime
  **/
  @ApiModelProperty(value = "UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.")
  public Long getActualTime() {
    return actualTime;
  }

  public void setActualTime(Long actualTime) {
    this.actualTime = actualTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchSimple matchSimple = (MatchSimple) o;
    return Objects.equals(this.key, matchSimple.key) &&
        Objects.equals(this.compLevel, matchSimple.compLevel) &&
        Objects.equals(this.setNumber, matchSimple.setNumber) &&
        Objects.equals(this.matchNumber, matchSimple.matchNumber) &&
        Objects.equals(this.alliances, matchSimple.alliances) &&
        Objects.equals(this.winningAlliance, matchSimple.winningAlliance) &&
        Objects.equals(this.eventKey, matchSimple.eventKey) &&
        Objects.equals(this.time, matchSimple.time) &&
        Objects.equals(this.predictedTime, matchSimple.predictedTime) &&
        Objects.equals(this.actualTime, matchSimple.actualTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, compLevel, setNumber, matchNumber, alliances, winningAlliance, eventKey, time, predictedTime, actualTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchSimple {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    compLevel: ").append(toIndentedString(compLevel)).append("\n");
    sb.append("    setNumber: ").append(toIndentedString(setNumber)).append("\n");
    sb.append("    matchNumber: ").append(toIndentedString(matchNumber)).append("\n");
    sb.append("    alliances: ").append(toIndentedString(alliances)).append("\n");
    sb.append("    winningAlliance: ").append(toIndentedString(winningAlliance)).append("\n");
    sb.append("    eventKey: ").append(toIndentedString(eventKey)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    predictedTime: ").append(toIndentedString(predictedTime)).append("\n");
    sb.append("    actualTime: ").append(toIndentedString(actualTime)).append("\n");
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

