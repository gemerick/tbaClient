package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EventInsights2016Detail;

/**
 * Insights for FIRST Stronghold qualification and elimination matches.
 */
@ApiModel(description = "Insights for FIRST Stronghold qualification and elimination matches.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventInsights2016 {
  @SerializedName("qual")
  private EventInsights2016Detail qual = null;

  @SerializedName("playoff")
  private EventInsights2016Detail playoff = null;

  public EventInsights2016 qual(EventInsights2016Detail qual) {
    this.qual = qual;
    return this;
  }

   /**
   * Get qual
   * @return qual
  **/
  @ApiModelProperty(value = "")
  public EventInsights2016Detail getQual() {
    return qual;
  }

  public void setQual(EventInsights2016Detail qual) {
    this.qual = qual;
  }

  public EventInsights2016 playoff(EventInsights2016Detail playoff) {
    this.playoff = playoff;
    return this;
  }

   /**
   * Get playoff
   * @return playoff
  **/
  @ApiModelProperty(value = "")
  public EventInsights2016Detail getPlayoff() {
    return playoff;
  }

  public void setPlayoff(EventInsights2016Detail playoff) {
    this.playoff = playoff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventInsights2016 eventInsights2016 = (EventInsights2016) o;
    return Objects.equals(this.qual, eventInsights2016.qual) &&
        Objects.equals(this.playoff, eventInsights2016.playoff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qual, playoff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventInsights2016 {\n");
    
    sb.append("    qual: ").append(toIndentedString(qual)).append("\n");
    sb.append("    playoff: ").append(toIndentedString(playoff)).append("\n");
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

