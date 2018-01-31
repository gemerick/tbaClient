package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DistrictList;
import io.swagger.client.model.Webcast;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/**
 * Event
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class Event {
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

  @SerializedName("short_name")
  private String shortName = null;

  @SerializedName("event_type_string")
  private String eventTypeString = null;

  @SerializedName("week")
  private Integer week = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("gmaps_place_id")
  private String gmapsPlaceId = null;

  @SerializedName("gmaps_url")
  private String gmapsUrl = null;

  @SerializedName("lat")
  private Double lat = null;

  @SerializedName("lng")
  private Double lng = null;

  @SerializedName("location_name")
  private String locationName = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("first_event_id")
  private Integer firstEventId = null;

  @SerializedName("webcasts")
  private List<Webcast> webcasts = new ArrayList<Webcast>();

  @SerializedName("division_keys")
  private List<String> divisionKeys = new ArrayList<String>();

  @SerializedName("parent_event_key")
  private String parentEventKey = null;

  @SerializedName("playoff_type")
  private Integer playoffType = null;

  @SerializedName("playoff_type_string")
  private String playoffTypeString = null;

  public Event key(String key) {
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

  public Event name(String name) {
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

  public Event eventCode(String eventCode) {
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

  public Event eventType(Integer eventType) {
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

  public Event district(DistrictList district) {
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

  public Event city(String city) {
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

  public Event stateProv(String stateProv) {
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

  public Event country(String country) {
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

  public Event startDate(LocalDate startDate) {
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

  public Event endDate(LocalDate endDate) {
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

  public Event year(Integer year) {
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

  public Event shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Same as `name` but doesn't include event specifiers, such as 'Regional' or 'District'. May be null.
   * @return shortName
  **/
  @ApiModelProperty(value = "Same as `name` but doesn't include event specifiers, such as 'Regional' or 'District'. May be null.")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Event eventTypeString(String eventTypeString) {
    this.eventTypeString = eventTypeString;
    return this;
  }

   /**
   * Event Type, eg Regional, District, or Offseason.
   * @return eventTypeString
  **/
  @ApiModelProperty(required = true, value = "Event Type, eg Regional, District, or Offseason.")
  public String getEventTypeString() {
    return eventTypeString;
  }

  public void setEventTypeString(String eventTypeString) {
    this.eventTypeString = eventTypeString;
  }

  public Event week(Integer week) {
    this.week = week;
    return this;
  }

   /**
   * Week of the competition season this event is in.
   * @return week
  **/
  @ApiModelProperty(value = "Week of the competition season this event is in.")
  public Integer getWeek() {
    return week;
  }

  public void setWeek(Integer week) {
    this.week = week;
  }

  public Event address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address of the event's venue, if available.
   * @return address
  **/
  @ApiModelProperty(value = "Address of the event's venue, if available.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Event postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code from the event address.
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code from the event address.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Event gmapsPlaceId(String gmapsPlaceId) {
    this.gmapsPlaceId = gmapsPlaceId;
    return this;
  }

   /**
   * Google Maps Place ID for the event address.
   * @return gmapsPlaceId
  **/
  @ApiModelProperty(value = "Google Maps Place ID for the event address.")
  public String getGmapsPlaceId() {
    return gmapsPlaceId;
  }

  public void setGmapsPlaceId(String gmapsPlaceId) {
    this.gmapsPlaceId = gmapsPlaceId;
  }

  public Event gmapsUrl(String gmapsUrl) {
    this.gmapsUrl = gmapsUrl;
    return this;
  }

   /**
   * Link to address location on Google Maps.
   * @return gmapsUrl
  **/
  @ApiModelProperty(value = "Link to address location on Google Maps.")
  public String getGmapsUrl() {
    return gmapsUrl;
  }

  public void setGmapsUrl(String gmapsUrl) {
    this.gmapsUrl = gmapsUrl;
  }

  public Event lat(Double lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Latitude for the event address.
   * @return lat
  **/
  @ApiModelProperty(value = "Latitude for the event address.")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public Event lng(Double lng) {
    this.lng = lng;
    return this;
  }

   /**
   * Longitude for the event address.
   * @return lng
  **/
  @ApiModelProperty(value = "Longitude for the event address.")
  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }

  public Event locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Name of the location at the address for the event, eg. Blue Alliance High School.
   * @return locationName
  **/
  @ApiModelProperty(value = "Name of the location at the address for the event, eg. Blue Alliance High School.")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public Event timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone name.
   * @return timezone
  **/
  @ApiModelProperty(value = "Timezone name.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Event website(String website) {
    this.website = website;
    return this;
  }

   /**
   * The event's website, if any.
   * @return website
  **/
  @ApiModelProperty(value = "The event's website, if any.")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Event firstEventId(Integer firstEventId) {
    this.firstEventId = firstEventId;
    return this;
  }

   /**
   * The FIRST internal Event ID, used to link to the event on the FRC webpage.
   * @return firstEventId
  **/
  @ApiModelProperty(value = "The FIRST internal Event ID, used to link to the event on the FRC webpage.")
  public Integer getFirstEventId() {
    return firstEventId;
  }

  public void setFirstEventId(Integer firstEventId) {
    this.firstEventId = firstEventId;
  }

  public Event webcasts(List<Webcast> webcasts) {
    this.webcasts = webcasts;
    return this;
  }

  public Event addWebcastsItem(Webcast webcastsItem) {
    this.webcasts.add(webcastsItem);
    return this;
  }

   /**
   * Get webcasts
   * @return webcasts
  **/
  @ApiModelProperty(value = "")
  public List<Webcast> getWebcasts() {
    return webcasts;
  }

  public void setWebcasts(List<Webcast> webcasts) {
    this.webcasts = webcasts;
  }

  public Event divisionKeys(List<String> divisionKeys) {
    this.divisionKeys = divisionKeys;
    return this;
  }

  public Event addDivisionKeysItem(String divisionKeysItem) {
    this.divisionKeys.add(divisionKeysItem);
    return this;
  }

   /**
   * An array of event keys for the divisions at this event.
   * @return divisionKeys
  **/
  @ApiModelProperty(value = "An array of event keys for the divisions at this event.")
  public List<String> getDivisionKeys() {
    return divisionKeys;
  }

  public void setDivisionKeys(List<String> divisionKeys) {
    this.divisionKeys = divisionKeys;
  }

  public Event parentEventKey(String parentEventKey) {
    this.parentEventKey = parentEventKey;
    return this;
  }

   /**
   * The TBA Event key that represents the event's parent. Used to link back to the event from a division event. It is also the inverse relation of `divison_keys`.
   * @return parentEventKey
  **/
  @ApiModelProperty(value = "The TBA Event key that represents the event's parent. Used to link back to the event from a division event. It is also the inverse relation of `divison_keys`.")
  public String getParentEventKey() {
    return parentEventKey;
  }

  public void setParentEventKey(String parentEventKey) {
    this.parentEventKey = parentEventKey;
  }

  public Event playoffType(Integer playoffType) {
    this.playoffType = playoffType;
    return this;
  }

   /**
   * Playoff Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/playoff_type.py#L4, or null.
   * @return playoffType
  **/
  @ApiModelProperty(value = "Playoff Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/playoff_type.py#L4, or null.")
  public Integer getPlayoffType() {
    return playoffType;
  }

  public void setPlayoffType(Integer playoffType) {
    this.playoffType = playoffType;
  }

  public Event playoffTypeString(String playoffTypeString) {
    this.playoffTypeString = playoffTypeString;
    return this;
  }

   /**
   * String representation of the `playoff_type`, or null.
   * @return playoffTypeString
  **/
  @ApiModelProperty(value = "String representation of the `playoff_type`, or null.")
  public String getPlayoffTypeString() {
    return playoffTypeString;
  }

  public void setPlayoffTypeString(String playoffTypeString) {
    this.playoffTypeString = playoffTypeString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.key, event.key) &&
        Objects.equals(this.name, event.name) &&
        Objects.equals(this.eventCode, event.eventCode) &&
        Objects.equals(this.eventType, event.eventType) &&
        Objects.equals(this.district, event.district) &&
        Objects.equals(this.city, event.city) &&
        Objects.equals(this.stateProv, event.stateProv) &&
        Objects.equals(this.country, event.country) &&
        Objects.equals(this.startDate, event.startDate) &&
        Objects.equals(this.endDate, event.endDate) &&
        Objects.equals(this.year, event.year) &&
        Objects.equals(this.shortName, event.shortName) &&
        Objects.equals(this.eventTypeString, event.eventTypeString) &&
        Objects.equals(this.week, event.week) &&
        Objects.equals(this.address, event.address) &&
        Objects.equals(this.postalCode, event.postalCode) &&
        Objects.equals(this.gmapsPlaceId, event.gmapsPlaceId) &&
        Objects.equals(this.gmapsUrl, event.gmapsUrl) &&
        Objects.equals(this.lat, event.lat) &&
        Objects.equals(this.lng, event.lng) &&
        Objects.equals(this.locationName, event.locationName) &&
        Objects.equals(this.timezone, event.timezone) &&
        Objects.equals(this.website, event.website) &&
        Objects.equals(this.firstEventId, event.firstEventId) &&
        Objects.equals(this.webcasts, event.webcasts) &&
        Objects.equals(this.divisionKeys, event.divisionKeys) &&
        Objects.equals(this.parentEventKey, event.parentEventKey) &&
        Objects.equals(this.playoffType, event.playoffType) &&
        Objects.equals(this.playoffTypeString, event.playoffTypeString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, eventCode, eventType, district, city, stateProv, country, startDate, endDate, year, shortName, eventTypeString, week, address, postalCode, gmapsPlaceId, gmapsUrl, lat, lng, locationName, timezone, website, firstEventId, webcasts, divisionKeys, parentEventKey, playoffType, playoffTypeString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
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
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    eventTypeString: ").append(toIndentedString(eventTypeString)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    gmapsPlaceId: ").append(toIndentedString(gmapsPlaceId)).append("\n");
    sb.append("    gmapsUrl: ").append(toIndentedString(gmapsUrl)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    firstEventId: ").append(toIndentedString(firstEventId)).append("\n");
    sb.append("    webcasts: ").append(toIndentedString(webcasts)).append("\n");
    sb.append("    divisionKeys: ").append(toIndentedString(divisionKeys)).append("\n");
    sb.append("    parentEventKey: ").append(toIndentedString(parentEventKey)).append("\n");
    sb.append("    playoffType: ").append(toIndentedString(playoffType)).append("\n");
    sb.append("    playoffTypeString: ").append(toIndentedString(playoffTypeString)).append("\n");
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

