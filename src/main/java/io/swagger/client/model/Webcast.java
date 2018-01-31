package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Webcast
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class Webcast {
  /**
   * Type of webcast, typically descriptive of the streaming provider.
   */
  public enum TypeEnum {
    @SerializedName("youtube")
    YOUTUBE("youtube"),
    
    @SerializedName("twitch")
    TWITCH("twitch"),
    
    @SerializedName("ustream")
    USTREAM("ustream"),
    
    @SerializedName("iframe")
    IFRAME("iframe"),
    
    @SerializedName("html5")
    HTML5("html5"),
    
    @SerializedName("rtmp")
    RTMP("rtmp"),
    
    @SerializedName("livestream")
    LIVESTREAM("livestream");

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

  @SerializedName("channel")
  private String channel = null;

  @SerializedName("file")
  private String file = null;

  public Webcast type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of webcast, typically descriptive of the streaming provider.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of webcast, typically descriptive of the streaming provider.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Webcast channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe.
   * @return channel
  **/
  @ApiModelProperty(required = true, value = "Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe.")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public Webcast file(String file) {
    this.file = file;
    return this;
  }

   /**
   * File identification as may be required for some types. May be null.
   * @return file
  **/
  @ApiModelProperty(value = "File identification as may be required for some types. May be null.")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webcast webcast = (Webcast) o;
    return Objects.equals(this.type, webcast.type) &&
        Objects.equals(this.channel, webcast.channel) &&
        Objects.equals(this.file, webcast.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, channel, file);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webcast {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

