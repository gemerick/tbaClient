package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.WLTRecord;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * EventRankingRankings
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventRankingRankings {
  @SerializedName("dq")
  private Integer dq = null;

  @SerializedName("matches_played")
  private Integer matchesPlayed = null;

  @SerializedName("qual_average")
  private Integer qualAverage = null;

  @SerializedName("rank")
  private Integer rank = null;

  @SerializedName("record")
  private WLTRecord record = null;

  @SerializedName("sort_orders")
  private List<BigDecimal> sortOrders = new ArrayList<BigDecimal>();

  @SerializedName("team_key")
  private String teamKey = null;

  public EventRankingRankings dq(Integer dq) {
    this.dq = dq;
    return this;
  }

   /**
   * Number of times disqualified.
   * @return dq
  **/
  @ApiModelProperty(required = true, value = "Number of times disqualified.")
  public Integer getDq() {
    return dq;
  }

  public void setDq(Integer dq) {
    this.dq = dq;
  }

  public EventRankingRankings matchesPlayed(Integer matchesPlayed) {
    this.matchesPlayed = matchesPlayed;
    return this;
  }

   /**
   * Number of matches played by this team.
   * @return matchesPlayed
  **/
  @ApiModelProperty(required = true, value = "Number of matches played by this team.")
  public Integer getMatchesPlayed() {
    return matchesPlayed;
  }

  public void setMatchesPlayed(Integer matchesPlayed) {
    this.matchesPlayed = matchesPlayed;
  }

  public EventRankingRankings qualAverage(Integer qualAverage) {
    this.qualAverage = qualAverage;
    return this;
  }

   /**
   * The average match score during qualifications. Year specific. May be null if not relevant for a given year.
   * @return qualAverage
  **/
  @ApiModelProperty(value = "The average match score during qualifications. Year specific. May be null if not relevant for a given year.")
  public Integer getQualAverage() {
    return qualAverage;
  }

  public void setQualAverage(Integer qualAverage) {
    this.qualAverage = qualAverage;
  }

  public EventRankingRankings rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * The team's rank at the event as provided by FIRST.
   * @return rank
  **/
  @ApiModelProperty(required = true, value = "The team's rank at the event as provided by FIRST.")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public EventRankingRankings record(WLTRecord record) {
    this.record = record;
    return this;
  }

   /**
   * Get record
   * @return record
  **/
  @ApiModelProperty(required = true, value = "")
  public WLTRecord getRecord() {
    return record;
  }

  public void setRecord(WLTRecord record) {
    this.record = record;
  }

  public EventRankingRankings sortOrders(List<BigDecimal> sortOrders) {
    this.sortOrders = sortOrders;
    return this;
  }

  public EventRankingRankings addSortOrdersItem(BigDecimal sortOrdersItem) {
    this.sortOrders.add(sortOrdersItem);
    return this;
  }

   /**
   * Additional year-specific information, may be null. See parent `sort_order_info` for details.
   * @return sortOrders
  **/
  @ApiModelProperty(value = "Additional year-specific information, may be null. See parent `sort_order_info` for details.")
  public List<BigDecimal> getSortOrders() {
    return sortOrders;
  }

  public void setSortOrders(List<BigDecimal> sortOrders) {
    this.sortOrders = sortOrders;
  }

  public EventRankingRankings teamKey(String teamKey) {
    this.teamKey = teamKey;
    return this;
  }

   /**
   * The team with this rank.
   * @return teamKey
  **/
  @ApiModelProperty(required = true, value = "The team with this rank.")
  public String getTeamKey() {
    return teamKey;
  }

  public void setTeamKey(String teamKey) {
    this.teamKey = teamKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRankingRankings eventRankingRankings = (EventRankingRankings) o;
    return Objects.equals(this.dq, eventRankingRankings.dq) &&
        Objects.equals(this.matchesPlayed, eventRankingRankings.matchesPlayed) &&
        Objects.equals(this.qualAverage, eventRankingRankings.qualAverage) &&
        Objects.equals(this.rank, eventRankingRankings.rank) &&
        Objects.equals(this.record, eventRankingRankings.record) &&
        Objects.equals(this.sortOrders, eventRankingRankings.sortOrders) &&
        Objects.equals(this.teamKey, eventRankingRankings.teamKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dq, matchesPlayed, qualAverage, rank, record, sortOrders, teamKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRankingRankings {\n");
    
    sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
    sb.append("    matchesPlayed: ").append(toIndentedString(matchesPlayed)).append("\n");
    sb.append("    qualAverage: ").append(toIndentedString(qualAverage)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    sortOrders: ").append(toIndentedString(sortOrders)).append("\n");
    sb.append("    teamKey: ").append(toIndentedString(teamKey)).append("\n");
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

