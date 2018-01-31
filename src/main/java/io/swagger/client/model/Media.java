package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The &#x60;Media&#x60; object contains a reference for most any media associated with a team or event on TBA.
 */
@ApiModel(description = "The `Media` object contains a reference for most any media associated with a team or event on TBA.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class Media {
  @SerializedName("key")
  private String key = null;

  /**
   * String type of the media element.
   */
  public enum TypeEnum {
    @SerializedName("youtube")
    YOUTUBE("youtube"),
    
    @SerializedName("cdphotothread")
    CDPHOTOTHREAD("cdphotothread"),
    
    @SerializedName("imgur")
    IMGUR("imgur"),
    
    @SerializedName("facebook-profile")
    FACEBOOK_PROFILE("facebook-profile"),
    
    @SerializedName("youtube-channel")
    YOUTUBE_CHANNEL("youtube-channel"),
    
    @SerializedName("twitter-profile")
    TWITTER_PROFILE("twitter-profile"),
    
    @SerializedName("github-profile")
    GITHUB_PROFILE("github-profile"),
    
    @SerializedName("instagram-profile")
    INSTAGRAM_PROFILE("instagram-profile"),
    
    @SerializedName("periscope-profile")
    PERISCOPE_PROFILE("periscope-profile"),
    
    @SerializedName("grabcad")
    GRABCAD("grabcad"),
    
    @SerializedName("pinterest-profile")
    PINTEREST_PROFILE("pinterest-profile"),
    
    @SerializedName("snapchat-profile")
    SNAPCHAT_PROFILE("snapchat-profile"),
    
    @SerializedName("twitch-channel")
    TWITCH_CHANNEL("twitch-channel");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("foreign_key")
  private String foreignKey = null;

  @SerializedName("details")
  private Object details = null;

  @SerializedName("preferred")
  private Boolean preferred = null;

  public Media key(String key) {
    this.key = key;
    return this;
  }

   /**
   * TBA identifier for this media.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "TBA identifier for this media.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Media type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * String type of the media element.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "String type of the media element.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Media foreignKey(String foreignKey) {
    this.foreignKey = foreignKey;
    return this;
  }

   /**
   * The key used to identify this media on the media site.
   * @return foreignKey
  **/
  @ApiModelProperty(value = "The key used to identify this media on the media site.")
  public String getForeignKey() {
    return foreignKey;
  }

  public void setForeignKey(String foreignKey) {
    this.foreignKey = foreignKey;
  }

  public Media details(Object details) {
    this.details = details;
    return this;
  }

   /**
   * If required, a JSON dict of additional media information.
   * @return details
  **/
  @ApiModelProperty(value = "If required, a JSON dict of additional media information.")
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  public Media preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

   /**
   * True if the media is of high quality.
   * @return preferred
  **/
  @ApiModelProperty(value = "True if the media is of high quality.")
  public Boolean getPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Media media = (Media) o;
    return Objects.equals(this.key, media.key) &&
        Objects.equals(this.type, media.type) &&
        Objects.equals(this.foreignKey, media.foreignKey) &&
        Objects.equals(this.details, media.details) &&
        Objects.equals(this.preferred, media.preferred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, foreignKey, details, preferred);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Media {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    foreignKey: ").append(toIndentedString(foreignKey)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
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

