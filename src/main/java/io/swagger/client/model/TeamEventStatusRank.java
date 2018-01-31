package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TeamEventStatusRankRanking;
import io.swagger.client.model.TeamEventStatusRankSortOrderInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * TeamEventStatusRank
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class TeamEventStatusRank {
  @SerializedName("num_teams")
  private Integer numTeams = null;

  @SerializedName("ranking")
  private TeamEventStatusRankRanking ranking = null;

  @SerializedName("sort_order_info")
  private List<TeamEventStatusRankSortOrderInfo> sortOrderInfo = new ArrayList<TeamEventStatusRankSortOrderInfo>();

  @SerializedName("status")
  private String status = null;

  public TeamEventStatusRank numTeams(Integer numTeams) {
    this.numTeams = numTeams;
    return this;
  }

   /**
   * Number of teams ranked.
   * @return numTeams
  **/
  @ApiModelProperty(value = "Number of teams ranked.")
  public Integer getNumTeams() {
    return numTeams;
  }

  public void setNumTeams(Integer numTeams) {
    this.numTeams = numTeams;
  }

  public TeamEventStatusRank ranking(TeamEventStatusRankRanking ranking) {
    this.ranking = ranking;
    return this;
  }

   /**
   * Get ranking
   * @return ranking
  **/
  @ApiModelProperty(value = "")
  public TeamEventStatusRankRanking getRanking() {
    return ranking;
  }

  public void setRanking(TeamEventStatusRankRanking ranking) {
    this.ranking = ranking;
  }

  public TeamEventStatusRank sortOrderInfo(List<TeamEventStatusRankSortOrderInfo> sortOrderInfo) {
    this.sortOrderInfo = sortOrderInfo;
    return this;
  }

  public TeamEventStatusRank addSortOrderInfoItem(TeamEventStatusRankSortOrderInfo sortOrderInfoItem) {
    this.sortOrderInfo.add(sortOrderInfoItem);
    return this;
  }

   /**
   * Ordered list of names corresponding to the elements of the `sort_orders` array.
   * @return sortOrderInfo
  **/
  @ApiModelProperty(value = "Ordered list of names corresponding to the elements of the `sort_orders` array.")
  public List<TeamEventStatusRankSortOrderInfo> getSortOrderInfo() {
    return sortOrderInfo;
  }

  public void setSortOrderInfo(List<TeamEventStatusRankSortOrderInfo> sortOrderInfo) {
    this.sortOrderInfo = sortOrderInfo;
  }

  public TeamEventStatusRank status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatusRank teamEventStatusRank = (TeamEventStatusRank) o;
    return Objects.equals(this.numTeams, teamEventStatusRank.numTeams) &&
        Objects.equals(this.ranking, teamEventStatusRank.ranking) &&
        Objects.equals(this.sortOrderInfo, teamEventStatusRank.sortOrderInfo) &&
        Objects.equals(this.status, teamEventStatusRank.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numTeams, ranking, sortOrderInfo, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatusRank {\n");
    
    sb.append("    numTeams: ").append(toIndentedString(numTeams)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    sortOrderInfo: ").append(toIndentedString(sortOrderInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

