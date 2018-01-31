package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EventRankingRankings;
import io.swagger.client.model.EventRankingSortOrderInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * EventRanking
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventRanking {
  @SerializedName("rankings")
  private List<EventRankingRankings> rankings = new ArrayList<EventRankingRankings>();

  @SerializedName("sort_order_info")
  private List<EventRankingSortOrderInfo> sortOrderInfo = new ArrayList<EventRankingSortOrderInfo>();

  public EventRanking rankings(List<EventRankingRankings> rankings) {
    this.rankings = rankings;
    return this;
  }

  public EventRanking addRankingsItem(EventRankingRankings rankingsItem) {
    this.rankings.add(rankingsItem);
    return this;
  }

   /**
   * List of rankings at the event.
   * @return rankings
  **/
  @ApiModelProperty(required = true, value = "List of rankings at the event.")
  public List<EventRankingRankings> getRankings() {
    return rankings;
  }

  public void setRankings(List<EventRankingRankings> rankings) {
    this.rankings = rankings;
  }

  public EventRanking sortOrderInfo(List<EventRankingSortOrderInfo> sortOrderInfo) {
    this.sortOrderInfo = sortOrderInfo;
    return this;
  }

  public EventRanking addSortOrderInfoItem(EventRankingSortOrderInfo sortOrderInfoItem) {
    this.sortOrderInfo.add(sortOrderInfoItem);
    return this;
  }

   /**
   * List of year-specific values provided in the `sort_orders` array for each team.
   * @return sortOrderInfo
  **/
  @ApiModelProperty(required = true, value = "List of year-specific values provided in the `sort_orders` array for each team.")
  public List<EventRankingSortOrderInfo> getSortOrderInfo() {
    return sortOrderInfo;
  }

  public void setSortOrderInfo(List<EventRankingSortOrderInfo> sortOrderInfo) {
    this.sortOrderInfo = sortOrderInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRanking eventRanking = (EventRanking) o;
    return Objects.equals(this.rankings, eventRanking.rankings) &&
        Objects.equals(this.sortOrderInfo, eventRanking.sortOrderInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankings, sortOrderInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRanking {\n");
    
    sb.append("    rankings: ").append(toIndentedString(rankings)).append("\n");
    sb.append("    sortOrderInfo: ").append(toIndentedString(sortOrderInfo)).append("\n");
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

