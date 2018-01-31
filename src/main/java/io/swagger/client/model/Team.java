package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Team
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class Team {
  @SerializedName("key")
  private String key = null;

  @SerializedName("team_number")
  private Integer teamNumber = null;

  @SerializedName("nickname")
  private String nickname = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state_prov")
  private String stateProv = null;

  @SerializedName("country")
  private String country = null;

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

  @SerializedName("website")
  private String website = null;

  @SerializedName("rookie_year")
  private Integer rookieYear = null;

  @SerializedName("motto")
  private String motto = null;

  @SerializedName("home_championship")
  private Object homeChampionship = null;

  public Team key(String key) {
    this.key = key;
    return this;
  }

   /**
   * TBA team key with the format `frcXXXX` with `XXXX` representing the team number.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "TBA team key with the format `frcXXXX` with `XXXX` representing the team number.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Team teamNumber(Integer teamNumber) {
    this.teamNumber = teamNumber;
    return this;
  }

   /**
   * Official team number issued by FIRST.
   * @return teamNumber
  **/
  @ApiModelProperty(required = true, value = "Official team number issued by FIRST.")
  public Integer getTeamNumber() {
    return teamNumber;
  }

  public void setTeamNumber(Integer teamNumber) {
    this.teamNumber = teamNumber;
  }

  public Team nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Team nickname provided by FIRST.
   * @return nickname
  **/
  @ApiModelProperty(value = "Team nickname provided by FIRST.")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public Team name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Official long name registered with FIRST.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Official long name registered with FIRST.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Team city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City of team derived from parsing the address registered with FIRST.
   * @return city
  **/
  @ApiModelProperty(value = "City of team derived from parsing the address registered with FIRST.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Team stateProv(String stateProv) {
    this.stateProv = stateProv;
    return this;
  }

   /**
   * State of team derived from parsing the address registered with FIRST.
   * @return stateProv
  **/
  @ApiModelProperty(value = "State of team derived from parsing the address registered with FIRST.")
  public String getStateProv() {
    return stateProv;
  }

  public void setStateProv(String stateProv) {
    this.stateProv = stateProv;
  }

  public Team country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of team derived from parsing the address registered with FIRST.
   * @return country
  **/
  @ApiModelProperty(value = "Country of team derived from parsing the address registered with FIRST.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Team address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Will be NULL, for future development.
   * @return address
  **/
  @ApiModelProperty(value = "Will be NULL, for future development.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Team postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code from the team address.
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code from the team address.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Team gmapsPlaceId(String gmapsPlaceId) {
    this.gmapsPlaceId = gmapsPlaceId;
    return this;
  }

   /**
   * Will be NULL, for future development.
   * @return gmapsPlaceId
  **/
  @ApiModelProperty(value = "Will be NULL, for future development.")
  public String getGmapsPlaceId() {
    return gmapsPlaceId;
  }

  public void setGmapsPlaceId(String gmapsPlaceId) {
    this.gmapsPlaceId = gmapsPlaceId;
  }

  public Team gmapsUrl(String gmapsUrl) {
    this.gmapsUrl = gmapsUrl;
    return this;
  }

   /**
   * Will be NULL, for future development.
   * @return gmapsUrl
  **/
  @ApiModelProperty(value = "Will be NULL, for future development.")
  public String getGmapsUrl() {
    return gmapsUrl;
  }

  public void setGmapsUrl(String gmapsUrl) {
    this.gmapsUrl = gmapsUrl;
  }

  public Team lat(Double lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Will be NULL, for future development.
   * @return lat
  **/
  @ApiModelProperty(value = "Will be NULL, for future development.")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public Team lng(Double lng) {
    this.lng = lng;
    return this;
  }

   /**
   * Will be NULL, for future development.
   * @return lng
  **/
  @ApiModelProperty(value = "Will be NULL, for future development.")
  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }

  public Team locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Will be NULL, for future development.
   * @return locationName
  **/
  @ApiModelProperty(value = "Will be NULL, for future development.")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public Team website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Official website associated with the team.
   * @return website
  **/
  @ApiModelProperty(value = "Official website associated with the team.")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Team rookieYear(Integer rookieYear) {
    this.rookieYear = rookieYear;
    return this;
  }

   /**
   * First year the team officially competed.
   * @return rookieYear
  **/
  @ApiModelProperty(required = true, value = "First year the team officially competed.")
  public Integer getRookieYear() {
    return rookieYear;
  }

  public void setRookieYear(Integer rookieYear) {
    this.rookieYear = rookieYear;
  }

  public Team motto(String motto) {
    this.motto = motto;
    return this;
  }

   /**
   * Team's motto as provided by FIRST.
   * @return motto
  **/
  @ApiModelProperty(value = "Team's motto as provided by FIRST.")
  public String getMotto() {
    return motto;
  }

  public void setMotto(String motto) {
    this.motto = motto;
  }

  public Team homeChampionship(Object homeChampionship) {
    this.homeChampionship = homeChampionship;
    return this;
  }

   /**
   * Location of the team's home championship each year as a key-value pair. The year (as a string) is the key, and the city is the value.
   * @return homeChampionship
  **/
  @ApiModelProperty(value = "Location of the team's home championship each year as a key-value pair. The year (as a string) is the key, and the city is the value.")
  public Object getHomeChampionship() {
    return homeChampionship;
  }

  public void setHomeChampionship(Object homeChampionship) {
    this.homeChampionship = homeChampionship;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Team team = (Team) o;
    return Objects.equals(this.key, team.key) &&
        Objects.equals(this.teamNumber, team.teamNumber) &&
        Objects.equals(this.nickname, team.nickname) &&
        Objects.equals(this.name, team.name) &&
        Objects.equals(this.city, team.city) &&
        Objects.equals(this.stateProv, team.stateProv) &&
        Objects.equals(this.country, team.country) &&
        Objects.equals(this.address, team.address) &&
        Objects.equals(this.postalCode, team.postalCode) &&
        Objects.equals(this.gmapsPlaceId, team.gmapsPlaceId) &&
        Objects.equals(this.gmapsUrl, team.gmapsUrl) &&
        Objects.equals(this.lat, team.lat) &&
        Objects.equals(this.lng, team.lng) &&
        Objects.equals(this.locationName, team.locationName) &&
        Objects.equals(this.website, team.website) &&
        Objects.equals(this.rookieYear, team.rookieYear) &&
        Objects.equals(this.motto, team.motto) &&
        Objects.equals(this.homeChampionship, team.homeChampionship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, teamNumber, nickname, name, city, stateProv, country, address, postalCode, gmapsPlaceId, gmapsUrl, lat, lng, locationName, website, rookieYear, motto, homeChampionship);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Team {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    teamNumber: ").append(toIndentedString(teamNumber)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProv: ").append(toIndentedString(stateProv)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    gmapsPlaceId: ").append(toIndentedString(gmapsPlaceId)).append("\n");
    sb.append("    gmapsUrl: ").append(toIndentedString(gmapsUrl)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    rookieYear: ").append(toIndentedString(rookieYear)).append("\n");
    sb.append("    motto: ").append(toIndentedString(motto)).append("\n");
    sb.append("    homeChampionship: ").append(toIndentedString(homeChampionship)).append("\n");
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

