package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DistrictRankingEventPoints;
import java.util.ArrayList;
import java.util.List;

/**
 * Rank of a team in a district.
 */
@ApiModel(description = "Rank of a team in a district.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class DistrictRanking {
  @SerializedName("team_key")
  private String teamKey = null;

  @SerializedName("rank")
  private Integer rank = null;

  @SerializedName("rookie_bonus")
  private Integer rookieBonus = null;

  @SerializedName("point_total")
  private Integer pointTotal = null;

  @SerializedName("event_points")
  private List<DistrictRankingEventPoints> eventPoints = new ArrayList<DistrictRankingEventPoints>();

  public DistrictRanking teamKey(String teamKey) {
    this.teamKey = teamKey;
    return this;
  }

   /**
   * TBA team key for the team.
   * @return teamKey
  **/
  @ApiModelProperty(required = true, value = "TBA team key for the team.")
  public String getTeamKey() {
    return teamKey;
  }

  public void setTeamKey(String teamKey) {
    this.teamKey = teamKey;
  }

  public DistrictRanking rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Numerical rank of the team, 1 being top rank.
   * @return rank
  **/
  @ApiModelProperty(required = true, value = "Numerical rank of the team, 1 being top rank.")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public DistrictRanking rookieBonus(Integer rookieBonus) {
    this.rookieBonus = rookieBonus;
    return this;
  }

   /**
   * Any points added to a team as a result of the rookie bonus.
   * @return rookieBonus
  **/
  @ApiModelProperty(value = "Any points added to a team as a result of the rookie bonus.")
  public Integer getRookieBonus() {
    return rookieBonus;
  }

  public void setRookieBonus(Integer rookieBonus) {
    this.rookieBonus = rookieBonus;
  }

  public DistrictRanking pointTotal(Integer pointTotal) {
    this.pointTotal = pointTotal;
    return this;
  }

   /**
   * Total district points for the team.
   * @return pointTotal
  **/
  @ApiModelProperty(required = true, value = "Total district points for the team.")
  public Integer getPointTotal() {
    return pointTotal;
  }

  public void setPointTotal(Integer pointTotal) {
    this.pointTotal = pointTotal;
  }

  public DistrictRanking eventPoints(List<DistrictRankingEventPoints> eventPoints) {
    this.eventPoints = eventPoints;
    return this;
  }

  public DistrictRanking addEventPointsItem(DistrictRankingEventPoints eventPointsItem) {
    this.eventPoints.add(eventPointsItem);
    return this;
  }

   /**
   * List of events that contributed to the point total for the team.
   * @return eventPoints
  **/
  @ApiModelProperty(value = "List of events that contributed to the point total for the team.")
  public List<DistrictRankingEventPoints> getEventPoints() {
    return eventPoints;
  }

  public void setEventPoints(List<DistrictRankingEventPoints> eventPoints) {
    this.eventPoints = eventPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistrictRanking districtRanking = (DistrictRanking) o;
    return Objects.equals(this.teamKey, districtRanking.teamKey) &&
        Objects.equals(this.rank, districtRanking.rank) &&
        Objects.equals(this.rookieBonus, districtRanking.rookieBonus) &&
        Objects.equals(this.pointTotal, districtRanking.pointTotal) &&
        Objects.equals(this.eventPoints, districtRanking.eventPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamKey, rank, rookieBonus, pointTotal, eventPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistrictRanking {\n");
    
    sb.append("    teamKey: ").append(toIndentedString(teamKey)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    rookieBonus: ").append(toIndentedString(rookieBonus)).append("\n");
    sb.append("    pointTotal: ").append(toIndentedString(pointTotal)).append("\n");
    sb.append("    eventPoints: ").append(toIndentedString(eventPoints)).append("\n");
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

