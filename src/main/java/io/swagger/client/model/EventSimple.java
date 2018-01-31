package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DistrictList;
import org.joda.time.LocalDate;

/**
 * EventSimple
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventSimple {
  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("event_code")
  private String eventCode = null;

  @SerializedName("event_type")
  private Integer eventType = null;

  @SerializedName("district")
  private DistrictList district = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state_prov")
  private String stateProv = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("year")
  private Integer year = null;

  public EventSimple key(String key) {
    this.key = key;
    return this;
  }

   /**
   * TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public EventSimple name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Official name of event on record either provided by FIRST or organizers of offseason event.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Official name of event on record either provided by FIRST or organizers of offseason event.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EventSimple eventCode(String eventCode) {
    this.eventCode = eventCode;
    return this;
  }

   /**
   * Event short code, as provided by FIRST.
   * @return eventCode
  **/
  @ApiModelProperty(required = true, value = "Event short code, as provided by FIRST.")
  public String getEventCode() {
    return eventCode;
  }

  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }

  public EventSimple eventType(Integer eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2")
  public Integer getEventType() {
    return eventType;
  }

  public void setEventType(Integer eventType) {
    this.eventType = eventType;
  }

  public EventSimple district(DistrictList district) {
    this.district = district;
    return this;
  }

   /**
   * The district this event is in, may be null.
   * @return district
  **/
  @ApiModelProperty(value = "The district this event is in, may be null.")
  public DistrictList getDistrict() {
    return district;
  }

  public void setDistrict(DistrictList district) {
    this.district = district;
  }

  public EventSimple city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City, town, village, etc. the event is located in.
   * @return city
  **/
  @ApiModelProperty(value = "City, town, village, etc. the event is located in.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public EventSimple stateProv(String stateProv) {
    this.stateProv = stateProv;
    return this;
  }

   /**
   * State or Province the event is located in.
   * @return stateProv
  **/
  @ApiModelProperty(value = "State or Province the event is located in.")
  public String getStateProv() {
    return stateProv;
  }

  public void setStateProv(String stateProv) {
    this.stateProv = stateProv;
  }

  public EventSimple country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country the event is located in.
   * @return country
  **/
  @ApiModelProperty(value = "Country the event is located in.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public EventSimple startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Event start date in `yyyy-mm-dd` format.
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Event start date in `yyyy-mm-dd` format.")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public EventSimple endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Event end date in `yyyy-mm-dd` format.
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "Event end date in `yyyy-mm-dd` format.")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public EventSimple year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Year the event data is for.
   * @return year
  **/
  @ApiModelProperty(required = true, value = "Year the event data is for.")
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
    EventSimple eventSimple = (EventSimple) o;
    return Objects.equals(this.key, eventSimple.key) &&
        Objects.equals(this.name, eventSimple.name) &&
        Objects.equals(this.eventCode, eventSimple.eventCode) &&
        Objects.equals(this.eventType, eventSimple.eventType) &&
        Objects.equals(this.district, eventSimple.district) &&
        Objects.equals(this.city, eventSimple.city) &&
        Objects.equals(this.stateProv, eventSimple.stateProv) &&
        Objects.equals(this.country, eventSimple.country) &&
        Objects.equals(this.startDate, eventSimple.startDate) &&
        Objects.equals(this.endDate, eventSimple.endDate) &&
        Objects.equals(this.year, eventSimple.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, eventCode, eventType, district, city, stateProv, country, startDate, endDate, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSimple {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProv: ").append(toIndentedString(stateProv)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

