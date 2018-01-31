package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DistrictRankingEventPoints
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class DistrictRankingEventPoints {
  @SerializedName("event_key")
  private String eventKey = null;

  @SerializedName("district_cmp")
  private Boolean districtCmp = null;

  @SerializedName("alliance_points")
  private Integer alliancePoints = null;

  @SerializedName("award_points")
  private Integer awardPoints = null;

  @SerializedName("qual_points")
  private Integer qualPoints = null;

  @SerializedName("elim_points")
  private Integer elimPoints = null;

  @SerializedName("total")
  private Integer total = null;

  public DistrictRankingEventPoints eventKey(String eventKey) {
    this.eventKey = eventKey;
    return this;
  }

   /**
   * TBA Event key for this event.
   * @return eventKey
  **/
  @ApiModelProperty(required = true, value = "TBA Event key for this event.")
  public String getEventKey() {
    return eventKey;
  }

  public void setEventKey(String eventKey) {
    this.eventKey = eventKey;
  }

  public DistrictRankingEventPoints districtCmp(Boolean districtCmp) {
    this.districtCmp = districtCmp;
    return this;
  }

   /**
   * `true` if this event is a District Championship event.
   * @return districtCmp
  **/
  @ApiModelProperty(required = true, value = "`true` if this event is a District Championship event.")
  public Boolean getDistrictCmp() {
    return districtCmp;
  }

  public void setDistrictCmp(Boolean districtCmp) {
    this.districtCmp = districtCmp;
  }

  public DistrictRankingEventPoints alliancePoints(Integer alliancePoints) {
    this.alliancePoints = alliancePoints;
    return this;
  }

   /**
   * Points awarded for alliance selection.
   * @return alliancePoints
  **/
  @ApiModelProperty(required = true, value = "Points awarded for alliance selection.")
  public Integer getAlliancePoints() {
    return alliancePoints;
  }

  public void setAlliancePoints(Integer alliancePoints) {
    this.alliancePoints = alliancePoints;
  }

  public DistrictRankingEventPoints awardPoints(Integer awardPoints) {
    this.awardPoints = awardPoints;
    return this;
  }

   /**
   * Points awarded for event awards.
   * @return awardPoints
  **/
  @ApiModelProperty(required = true, value = "Points awarded for event awards.")
  public Integer getAwardPoints() {
    return awardPoints;
  }

  public void setAwardPoints(Integer awardPoints) {
    this.awardPoints = awardPoints;
  }

  public DistrictRankingEventPoints qualPoints(Integer qualPoints) {
    this.qualPoints = qualPoints;
    return this;
  }

   /**
   * Points awarded for qualification match performance.
   * @return qualPoints
  **/
  @ApiModelProperty(required = true, value = "Points awarded for qualification match performance.")
  public Integer getQualPoints() {
    return qualPoints;
  }

  public void setQualPoints(Integer qualPoints) {
    this.qualPoints = qualPoints;
  }

  public DistrictRankingEventPoints elimPoints(Integer elimPoints) {
    this.elimPoints = elimPoints;
    return this;
  }

   /**
   * Points awarded for elimination match performance.
   * @return elimPoints
  **/
  @ApiModelProperty(required = true, value = "Points awarded for elimination match performance.")
  public Integer getElimPoints() {
    return elimPoints;
  }

  public void setElimPoints(Integer elimPoints) {
    this.elimPoints = elimPoints;
  }

  public DistrictRankingEventPoints total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total points awarded at this event.
   * @return total
  **/
  @ApiModelProperty(required = true, value = "Total points awarded at this event.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistrictRankingEventPoints districtRankingEventPoints = (DistrictRankingEventPoints) o;
    return Objects.equals(this.eventKey, districtRankingEventPoints.eventKey) &&
        Objects.equals(this.districtCmp, districtRankingEventPoints.districtCmp) &&
        Objects.equals(this.alliancePoints, districtRankingEventPoints.alliancePoints) &&
        Objects.equals(this.awardPoints, districtRankingEventPoints.awardPoints) &&
        Objects.equals(this.qualPoints, districtRankingEventPoints.qualPoints) &&
        Objects.equals(this.elimPoints, districtRankingEventPoints.elimPoints) &&
        Objects.equals(this.total, districtRankingEventPoints.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventKey, districtCmp, alliancePoints, awardPoints, qualPoints, elimPoints, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistrictRankingEventPoints {\n");
    
    sb.append("    eventKey: ").append(toIndentedString(eventKey)).append("\n");
    sb.append("    districtCmp: ").append(toIndentedString(districtCmp)).append("\n");
    sb.append("    alliancePoints: ").append(toIndentedString(alliancePoints)).append("\n");
    sb.append("    awardPoints: ").append(toIndentedString(awardPoints)).append("\n");
    sb.append("    qualPoints: ").append(toIndentedString(qualPoints)).append("\n");
    sb.append("    elimPoints: ").append(toIndentedString(elimPoints)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

