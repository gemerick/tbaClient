package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AwardRecipient;
import java.util.ArrayList;
import java.util.List;

/**
 * Award
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class Award {
  @SerializedName("name")
  private String name = null;

  @SerializedName("award_type")
  private Integer awardType = null;

  @SerializedName("event_key")
  private String eventKey = null;

  @SerializedName("recipient_list")
  private List<AwardRecipient> recipientList = new ArrayList<AwardRecipient>();

  @SerializedName("year")
  private Integer year = null;

  public Award name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the award as provided by FIRST. May vary for the same award type.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the award as provided by FIRST. May vary for the same award type.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Award awardType(Integer awardType) {
    this.awardType = awardType;
    return this;
  }

   /**
   * Type of award given. See https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6
   * @return awardType
  **/
  @ApiModelProperty(required = true, value = "Type of award given. See https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6")
  public Integer getAwardType() {
    return awardType;
  }

  public void setAwardType(Integer awardType) {
    this.awardType = awardType;
  }

  public Award eventKey(String eventKey) {
    this.eventKey = eventKey;
    return this;
  }

   /**
   * The event_key of the event the award was won at.
   * @return eventKey
  **/
  @ApiModelProperty(required = true, value = "The event_key of the event the award was won at.")
  public String getEventKey() {
    return eventKey;
  }

  public void setEventKey(String eventKey) {
    this.eventKey = eventKey;
  }

  public Award recipientList(List<AwardRecipient> recipientList) {
    this.recipientList = recipientList;
    return this;
  }

  public Award addRecipientListItem(AwardRecipient recipientListItem) {
    this.recipientList.add(recipientListItem);
    return this;
  }

   /**
   * A list of recipients of the award at the event. Either team_key and/or awardee for individual awards.
   * @return recipientList
  **/
  @ApiModelProperty(required = true, value = "A list of recipients of the award at the event. Either team_key and/or awardee for individual awards.")
  public List<AwardRecipient> getRecipientList() {
    return recipientList;
  }

  public void setRecipientList(List<AwardRecipient> recipientList) {
    this.recipientList = recipientList;
  }

  public Award year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * The year this award was won.
   * @return year
  **/
  @ApiModelProperty(required = true, value = "The year this award was won.")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Award award = (Award) o;
    return Objects.equals(this.name, award.name) &&
        Objects.equals(this.awardType, award.awardType) &&
        Objects.equals(this.eventKey, award.eventKey) &&
        Objects.equals(this.recipientList, award.recipientList) &&
        Objects.equals(this.year, award.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, awardType, eventKey, recipientList, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Award {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    awardType: ").append(toIndentedString(awardType)).append("\n");
    sb.append("    eventKey: ").append(toIndentedString(eventKey)).append("\n");
    sb.append("    recipientList: ").append(toIndentedString(recipientList)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

