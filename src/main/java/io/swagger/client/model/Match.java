package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MatchSimpleAlliances;
import io.swagger.client.model.Media;
import java.util.ArrayList;
import java.util.List;

/**
 * Match
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class Match {
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

  @SerializedName("winning_alliance")
  private String winningAlliance = null;

  @SerializedName("event_key")
  private String eventKey = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("actual_time")
  private Long actualTime = null;

  @SerializedName("predicted_time")
  private Long predictedTime = null;

  @SerializedName("post_result_time")
  private Long postResultTime = null;

  @SerializedName("score_breakdown")
  private Object scoreBreakdown = null;

  @SerializedName("videos")
  private List<Media> videos = new ArrayList<Media>();

  public Match key(String key) {
    this.key = key;
    return this;
  }

   /**
   * TBA event key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may be appended to the competition level if more than one match in required per set.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "TBA event key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may be appended to the competition level if more than one match in required per set.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Match compLevel(CompLevelEnum compLevel) {
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

  public Match setNumber(Integer setNumber) {
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

  public Match matchNumber(Integer matchNumber) {
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

  public Match alliances(MatchSimpleAlliances alliances) {
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

  public Match winningAlliance(String winningAlliance) {
    this.winningAlliance = winningAlliance;
    return this;
  }

   /**
   * The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.
   * @return winningAlliance
  **/
  @ApiModelProperty(value = "The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.")
  public String getWinningAlliance() {
    return winningAlliance;
  }

  public void setWinningAlliance(String winningAlliance) {
    this.winningAlliance = winningAlliance;
  }

  public Match eventKey(String eventKey) {
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

  public Match time(Long time) {
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

  public Match actualTime(Long actualTime) {
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

  public Match predictedTime(Long predictedTime) {
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

  public Match postResultTime(Long postResultTime) {
    this.postResultTime = postResultTime;
    return this;
  }

   /**
   * UNIX timestamp (seconds since 1-Jan-1970 00:00:00) when the match result was posted.
   * @return postResultTime
  **/
  @ApiModelProperty(value = "UNIX timestamp (seconds since 1-Jan-1970 00:00:00) when the match result was posted.")
  public Long getPostResultTime() {
    return postResultTime;
  }

  public void setPostResultTime(Long postResultTime) {
    this.postResultTime = postResultTime;
  }

  public Match scoreBreakdown(Object scoreBreakdown) {
    this.scoreBreakdown = scoreBreakdown;
    return this;
  }

   /**
   * Score breakdown for auto, teleop, etc. points. Varies from year to year. May be null.
   * @return scoreBreakdown
  **/
  @ApiModelProperty(value = "Score breakdown for auto, teleop, etc. points. Varies from year to year. May be null.")
  public Object getScoreBreakdown() {
    return scoreBreakdown;
  }

  public void setScoreBreakdown(Object scoreBreakdown) {
    this.scoreBreakdown = scoreBreakdown;
  }

  public Match videos(List<Media> videos) {
    this.videos = videos;
    return this;
  }

  public Match addVideosItem(Media videosItem) {
    this.videos.add(videosItem);
    return this;
  }

   /**
   * Array of `Media` objects associated with this match.
   * @return videos
  **/
  @ApiModelProperty(value = "Array of `Media` objects associated with this match.")
  public List<Media> getVideos() {
    return videos;
  }

  public void setVideos(List<Media> videos) {
    this.videos = videos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Match match = (Match) o;
    return Objects.equals(this.key, match.key) &&
        Objects.equals(this.compLevel, match.compLevel) &&
        Objects.equals(this.setNumber, match.setNumber) &&
        Objects.equals(this.matchNumber, match.matchNumber) &&
        Objects.equals(this.alliances, match.alliances) &&
        Objects.equals(this.winningAlliance, match.winningAlliance) &&
        Objects.equals(this.eventKey, match.eventKey) &&
        Objects.equals(this.time, match.time) &&
        Objects.equals(this.actualTime, match.actualTime) &&
        Objects.equals(this.predictedTime, match.predictedTime) &&
        Objects.equals(this.postResultTime, match.postResultTime) &&
        Objects.equals(this.scoreBreakdown, match.scoreBreakdown) &&
        Objects.equals(this.videos, match.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, compLevel, setNumber, matchNumber, alliances, winningAlliance, eventKey, time, actualTime, predictedTime, postResultTime, scoreBreakdown, videos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Match {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    compLevel: ").append(toIndentedString(compLevel)).append("\n");
    sb.append("    setNumber: ").append(toIndentedString(setNumber)).append("\n");
    sb.append("    matchNumber: ").append(toIndentedString(matchNumber)).append("\n");
    sb.append("    alliances: ").append(toIndentedString(alliances)).append("\n");
    sb.append("    winningAlliance: ").append(toIndentedString(winningAlliance)).append("\n");
    sb.append("    eventKey: ").append(toIndentedString(eventKey)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    actualTime: ").append(toIndentedString(actualTime)).append("\n");
    sb.append("    predictedTime: ").append(toIndentedString(predictedTime)).append("\n");
    sb.append("    postResultTime: ").append(toIndentedString(postResultTime)).append("\n");
    sb.append("    scoreBreakdown: ").append(toIndentedString(scoreBreakdown)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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

