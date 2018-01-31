package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EventDistrictPointsPoints;
import io.swagger.client.model.EventDistrictPointsTiebreakers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EventDistrictPoints
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventDistrictPoints {
  @SerializedName("points")
  private Map<String, EventDistrictPointsPoints> points = new HashMap<String, EventDistrictPointsPoints>();

  @SerializedName("tiebreakers")
  private Map<String, EventDistrictPointsTiebreakers> tiebreakers = new HashMap<String, EventDistrictPointsTiebreakers>();

  public EventDistrictPoints points(Map<String, EventDistrictPointsPoints> points) {
    this.points = points;
    return this;
  }

  public EventDistrictPoints putPointsItem(String key, EventDistrictPointsPoints pointsItem) {
    this.points.put(key, pointsItem);
    return this;
  }

   /**
   * Points gained for each team at the event. Stored as a key-value pair with the team key as the key, and an object describing the points as it's value.
   * @return points
  **/
  @ApiModelProperty(required = true, value = "Points gained for each team at the event. Stored as a key-value pair with the team key as the key, and an object describing the points as it's value.")
  public Map<String, EventDistrictPointsPoints> getPoints() {
    return points;
  }

  public void setPoints(Map<String, EventDistrictPointsPoints> points) {
    this.points = points;
  }

  public EventDistrictPoints tiebreakers(Map<String, EventDistrictPointsTiebreakers> tiebreakers) {
    this.tiebreakers = tiebreakers;
    return this;
  }

  public EventDistrictPoints putTiebreakersItem(String key, EventDistrictPointsTiebreakers tiebreakersItem) {
    this.tiebreakers.put(key, tiebreakersItem);
    return this;
  }

   /**
   * Tiebreaker values for each team at the event. Stored as a key-value pair with the team key as the key, and an object describing the tiebreaker elements as it's value.
   * @return tiebreakers
  **/
  @ApiModelProperty(value = "Tiebreaker values for each team at the event. Stored as a key-value pair with the team key as the key, and an object describing the tiebreaker elements as it's value.")
  public Map<String, EventDistrictPointsTiebreakers> getTiebreakers() {
    return tiebreakers;
  }

  public void setTiebreakers(Map<String, EventDistrictPointsTiebreakers> tiebreakers) {
    this.tiebreakers = tiebreakers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDistrictPoints eventDistrictPoints = (EventDistrictPoints) o;
    return Objects.equals(this.points, eventDistrictPoints.points) &&
        Objects.equals(this.tiebreakers, eventDistrictPoints.tiebreakers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, tiebreakers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDistrictPoints {\n");
    
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    tiebreakers: ").append(toIndentedString(tiebreakers)).append("\n");
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

