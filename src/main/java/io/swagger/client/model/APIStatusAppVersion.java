package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * APIStatusAppVersion
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class APIStatusAppVersion {
  @SerializedName("min_app_version")
  private Integer minAppVersion = null;

  @SerializedName("latest_app_version")
  private Integer latestAppVersion = null;

  public APIStatusAppVersion minAppVersion(Integer minAppVersion) {
    this.minAppVersion = minAppVersion;
    return this;
  }

   /**
   * Internal use - Minimum application version required to correctly connect and process data.
   * @return minAppVersion
  **/
  @ApiModelProperty(required = true, value = "Internal use - Minimum application version required to correctly connect and process data.")
  public Integer getMinAppVersion() {
    return minAppVersion;
  }

  public void setMinAppVersion(Integer minAppVersion) {
    this.minAppVersion = minAppVersion;
  }

  public APIStatusAppVersion latestAppVersion(Integer latestAppVersion) {
    this.latestAppVersion = latestAppVersion;
    return this;
  }

   /**
   * Internal use - Latest application version available.
   * @return latestAppVersion
  **/
  @ApiModelProperty(required = true, value = "Internal use - Latest application version available.")
  public Integer getLatestAppVersion() {
    return latestAppVersion;
  }

  public void setLatestAppVersion(Integer latestAppVersion) {
    this.latestAppVersion = latestAppVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIStatusAppVersion apIStatusAppVersion = (APIStatusAppVersion) o;
    return Objects.equals(this.minAppVersion, apIStatusAppVersion.minAppVersion) &&
        Objects.equals(this.latestAppVersion, apIStatusAppVersion.latestAppVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minAppVersion, latestAppVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIStatusAppVersion {\n");
    
    sb.append("    minAppVersion: ").append(toIndentedString(minAppVersion)).append("\n");
    sb.append("    latestAppVersion: ").append(toIndentedString(latestAppVersion)).append("\n");
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

