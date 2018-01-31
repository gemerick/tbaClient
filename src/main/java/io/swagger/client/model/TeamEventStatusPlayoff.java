package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DefinitionsWLTRecord;

/**
 * Playoff status for this team, may be null if the team did not make playoffs, or playoffs have not begun.
 */
@ApiModel(description = "Playoff status for this team, may be null if the team did not make playoffs, or playoffs have not begun.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class TeamEventStatusPlayoff {
  /**
   * The highest playoff level the team reached.
   */
  public enum LevelEnum {
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

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("level")
  private LevelEnum level = null;

  @SerializedName("current_level_record")
  private DefinitionsWLTRecord currentLevelRecord = null;

  @SerializedName("record")
  private DefinitionsWLTRecord record = null;

  /**
   * Current competition status for the playoffs.
   */
  public enum StatusEnum {
    @SerializedName("won")
    WON("won"),
    
    @SerializedName("eliminated")
    ELIMINATED("eliminated"),
    
    @SerializedName("playing")
    PLAYING("playing");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("playoff_average")
  private Integer playoffAverage = null;

  public TeamEventStatusPlayoff level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * The highest playoff level the team reached.
   * @return level
  **/
  @ApiModelProperty(value = "The highest playoff level the team reached.")
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public TeamEventStatusPlayoff currentLevelRecord(DefinitionsWLTRecord currentLevelRecord) {
    this.currentLevelRecord = currentLevelRecord;
    return this;
  }

   /**
   * Get currentLevelRecord
   * @return currentLevelRecord
  **/
  @ApiModelProperty(value = "")
  public DefinitionsWLTRecord getCurrentLevelRecord() {
    return currentLevelRecord;
  }

  public void setCurrentLevelRecord(DefinitionsWLTRecord currentLevelRecord) {
    this.currentLevelRecord = currentLevelRecord;
  }

  public TeamEventStatusPlayoff record(DefinitionsWLTRecord record) {
    this.record = record;
    return this;
  }

   /**
   * Get record
   * @return record
  **/
  @ApiModelProperty(value = "")
  public DefinitionsWLTRecord getRecord() {
    return record;
  }

  public void setRecord(DefinitionsWLTRecord record) {
    this.record = record;
  }

  public TeamEventStatusPlayoff status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Current competition status for the playoffs.
   * @return status
  **/
  @ApiModelProperty(value = "Current competition status for the playoffs.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TeamEventStatusPlayoff playoffAverage(Integer playoffAverage) {
    this.playoffAverage = playoffAverage;
    return this;
  }

   /**
   * The average match score during playoffs. Year specific. May be null if not relevant for a given year.
   * @return playoffAverage
  **/
  @ApiModelProperty(value = "The average match score during playoffs. Year specific. May be null if not relevant for a given year.")
  public Integer getPlayoffAverage() {
    return playoffAverage;
  }

  public void setPlayoffAverage(Integer playoffAverage) {
    this.playoffAverage = playoffAverage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatusPlayoff teamEventStatusPlayoff = (TeamEventStatusPlayoff) o;
    return Objects.equals(this.level, teamEventStatusPlayoff.level) &&
        Objects.equals(this.currentLevelRecord, teamEventStatusPlayoff.currentLevelRecord) &&
        Objects.equals(this.record, teamEventStatusPlayoff.record) &&
        Objects.equals(this.status, teamEventStatusPlayoff.status) &&
        Objects.equals(this.playoffAverage, teamEventStatusPlayoff.playoffAverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, currentLevelRecord, record, status, playoffAverage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatusPlayoff {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    currentLevelRecord: ").append(toIndentedString(currentLevelRecord)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    playoffAverage: ").append(toIndentedString(playoffAverage)).append("\n");
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

