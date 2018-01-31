package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EventInsights2017Detail;

/**
 * Insights for FIRST STEAMWORKS qualification and elimination matches.
 */
@ApiModel(description = "Insights for FIRST STEAMWORKS qualification and elimination matches.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventInsights2017 {
  @SerializedName("qual")
  private EventInsights2017Detail qual = null;

  @SerializedName("playoff")
  private EventInsights2017Detail playoff = null;

  public EventInsights2017 qual(EventInsights2017Detail qual) {
    this.qual = qual;
    return this;
  }

   /**
   * Get qual
   * @return qual
  **/
  @ApiModelProperty(value = "")
  public EventInsights2017Detail getQual() {
    return qual;
  }

  public void setQual(EventInsights2017Detail qual) {
    this.qual = qual;
  }

  public EventInsights2017 playoff(EventInsights2017Detail playoff) {
    this.playoff = playoff;
    return this;
  }

   /**
   * Get playoff
   * @return playoff
  **/
  @ApiModelProperty(value = "")
  public EventInsights2017Detail getPlayoff() {
    return playoff;
  }

  public void setPlayoff(EventInsights2017Detail playoff) {
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
    EventInsights2017 eventInsights2017 = (EventInsights2017) o;
    return Objects.equals(this.qual, eventInsights2017.qual) &&
        Objects.equals(this.playoff, eventInsights2017.playoff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qual, playoff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventInsights2017 {\n");
    
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

