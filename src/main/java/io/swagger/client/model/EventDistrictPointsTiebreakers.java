package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * EventDistrictPointsTiebreakers
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventDistrictPointsTiebreakers {
  @SerializedName("highest_qual_scores")
  private List<Integer> highestQualScores = new ArrayList<Integer>();

  @SerializedName("qual_wins")
  private Integer qualWins = null;

  public EventDistrictPointsTiebreakers highestQualScores(List<Integer> highestQualScores) {
    this.highestQualScores = highestQualScores;
    return this;
  }

  public EventDistrictPointsTiebreakers addHighestQualScoresItem(Integer highestQualScoresItem) {
    this.highestQualScores.add(highestQualScoresItem);
    return this;
  }

   /**
   * Get highestQualScores
   * @return highestQualScores
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getHighestQualScores() {
    return highestQualScores;
  }

  public void setHighestQualScores(List<Integer> highestQualScores) {
    this.highestQualScores = highestQualScores;
  }

  public EventDistrictPointsTiebreakers qualWins(Integer qualWins) {
    this.qualWins = qualWins;
    return this;
  }

   /**
   * Get qualWins
   * @return qualWins
  **/
  @ApiModelProperty(value = "")
  public Integer getQualWins() {
    return qualWins;
  }

  public void setQualWins(Integer qualWins) {
    this.qualWins = qualWins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDistrictPointsTiebreakers eventDistrictPointsTiebreakers = (EventDistrictPointsTiebreakers) o;
    return Objects.equals(this.highestQualScores, eventDistrictPointsTiebreakers.highestQualScores) &&
        Objects.equals(this.qualWins, eventDistrictPointsTiebreakers.qualWins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highestQualScores, qualWins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDistrictPointsTiebreakers {\n");
    
    sb.append("    highestQualScores: ").append(toIndentedString(highestQualScores)).append("\n");
    sb.append("    qualWins: ").append(toIndentedString(qualWins)).append("\n");
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

