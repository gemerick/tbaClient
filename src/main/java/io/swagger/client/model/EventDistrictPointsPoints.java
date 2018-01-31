package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EventDistrictPointsPoints
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventDistrictPointsPoints {
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

  public EventDistrictPointsPoints alliancePoints(Integer alliancePoints) {
    this.alliancePoints = alliancePoints;
    return this;
  }

   /**
   * Get alliancePoints
   * @return alliancePoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAlliancePoints() {
    return alliancePoints;
  }

  public void setAlliancePoints(Integer alliancePoints) {
    this.alliancePoints = alliancePoints;
  }

  public EventDistrictPointsPoints awardPoints(Integer awardPoints) {
    this.awardPoints = awardPoints;
    return this;
  }

   /**
   * Get awardPoints
   * @return awardPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAwardPoints() {
    return awardPoints;
  }

  public void setAwardPoints(Integer awardPoints) {
    this.awardPoints = awardPoints;
  }

  public EventDistrictPointsPoints qualPoints(Integer qualPoints) {
    this.qualPoints = qualPoints;
    return this;
  }

   /**
   * Get qualPoints
   * @return qualPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getQualPoints() {
    return qualPoints;
  }

  public void setQualPoints(Integer qualPoints) {
    this.qualPoints = qualPoints;
  }

  public EventDistrictPointsPoints elimPoints(Integer elimPoints) {
    this.elimPoints = elimPoints;
    return this;
  }

   /**
   * Get elimPoints
   * @return elimPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getElimPoints() {
    return elimPoints;
  }

  public void setElimPoints(Integer elimPoints) {
    this.elimPoints = elimPoints;
  }

  public EventDistrictPointsPoints total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
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
    EventDistrictPointsPoints eventDistrictPointsPoints = (EventDistrictPointsPoints) o;
    return Objects.equals(this.alliancePoints, eventDistrictPointsPoints.alliancePoints) &&
        Objects.equals(this.awardPoints, eventDistrictPointsPoints.awardPoints) &&
        Objects.equals(this.qualPoints, eventDistrictPointsPoints.qualPoints) &&
        Objects.equals(this.elimPoints, eventDistrictPointsPoints.elimPoints) &&
        Objects.equals(this.total, eventDistrictPointsPoints.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alliancePoints, awardPoints, qualPoints, elimPoints, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDistrictPointsPoints {\n");
    
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

