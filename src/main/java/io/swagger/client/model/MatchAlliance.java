package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * MatchAlliance
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class MatchAlliance {
  @SerializedName("score")
  private Integer score = null;

  @SerializedName("team_keys")
  private List<String> teamKeys = new ArrayList<String>();

  @SerializedName("surrogate_team_keys")
  private List<String> surrogateTeamKeys = new ArrayList<String>();

  public MatchAlliance score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Score for this alliance. Will be null or -1 for an unplayed match.
   * @return score
  **/
  @ApiModelProperty(required = true, value = "Score for this alliance. Will be null or -1 for an unplayed match.")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public MatchAlliance teamKeys(List<String> teamKeys) {
    this.teamKeys = teamKeys;
    return this;
  }

  public MatchAlliance addTeamKeysItem(String teamKeysItem) {
    this.teamKeys.add(teamKeysItem);
    return this;
  }

   /**
   * Get teamKeys
   * @return teamKeys
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getTeamKeys() {
    return teamKeys;
  }

  public void setTeamKeys(List<String> teamKeys) {
    this.teamKeys = teamKeys;
  }

  public MatchAlliance surrogateTeamKeys(List<String> surrogateTeamKeys) {
    this.surrogateTeamKeys = surrogateTeamKeys;
    return this;
  }

  public MatchAlliance addSurrogateTeamKeysItem(String surrogateTeamKeysItem) {
    this.surrogateTeamKeys.add(surrogateTeamKeysItem);
    return this;
  }

   /**
   * TBA team keys (eg `frc254`) of any teams playing as a surrogate.
   * @return surrogateTeamKeys
  **/
  @ApiModelProperty(value = "TBA team keys (eg `frc254`) of any teams playing as a surrogate.")
  public List<String> getSurrogateTeamKeys() {
    return surrogateTeamKeys;
  }

  public void setSurrogateTeamKeys(List<String> surrogateTeamKeys) {
    this.surrogateTeamKeys = surrogateTeamKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchAlliance matchAlliance = (MatchAlliance) o;
    return Objects.equals(this.score, matchAlliance.score) &&
        Objects.equals(this.teamKeys, matchAlliance.teamKeys) &&
        Objects.equals(this.surrogateTeamKeys, matchAlliance.surrogateTeamKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, teamKeys, surrogateTeamKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchAlliance {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    teamKeys: ").append(toIndentedString(teamKeys)).append("\n");
    sb.append("    surrogateTeamKeys: ").append(toIndentedString(surrogateTeamKeys)).append("\n");
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

