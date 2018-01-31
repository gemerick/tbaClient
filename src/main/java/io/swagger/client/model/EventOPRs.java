package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OPR, DPR, and CCWM for teams at the event.
 */
@ApiModel(description = "OPR, DPR, and CCWM for teams at the event.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventOPRs {
  @SerializedName("oprs")
  private Map<String, Float> oprs = new HashMap<String, Float>();

  @SerializedName("dprs")
  private Map<String, Float> dprs = new HashMap<String, Float>();

  @SerializedName("ccwms")
  private Map<String, Float> ccwms = new HashMap<String, Float>();

  public EventOPRs oprs(Map<String, Float> oprs) {
    this.oprs = oprs;
    return this;
  }

  public EventOPRs putOprsItem(String key, Float oprsItem) {
    this.oprs.put(key, oprsItem);
    return this;
  }

   /**
   * A key-value pair with team key (eg `frc254`) as key and OPR as value.
   * @return oprs
  **/
  @ApiModelProperty(value = "A key-value pair with team key (eg `frc254`) as key and OPR as value.")
  public Map<String, Float> getOprs() {
    return oprs;
  }

  public void setOprs(Map<String, Float> oprs) {
    this.oprs = oprs;
  }

  public EventOPRs dprs(Map<String, Float> dprs) {
    this.dprs = dprs;
    return this;
  }

  public EventOPRs putDprsItem(String key, Float dprsItem) {
    this.dprs.put(key, dprsItem);
    return this;
  }

   /**
   * A key-value pair with team key (eg `frc254`) as key and DPR as value.
   * @return dprs
  **/
  @ApiModelProperty(value = "A key-value pair with team key (eg `frc254`) as key and DPR as value.")
  public Map<String, Float> getDprs() {
    return dprs;
  }

  public void setDprs(Map<String, Float> dprs) {
    this.dprs = dprs;
  }

  public EventOPRs ccwms(Map<String, Float> ccwms) {
    this.ccwms = ccwms;
    return this;
  }

  public EventOPRs putCcwmsItem(String key, Float ccwmsItem) {
    this.ccwms.put(key, ccwmsItem);
    return this;
  }

   /**
   * A key-value pair with team key (eg `frc254`) as key and CCWM as value.
   * @return ccwms
  **/
  @ApiModelProperty(value = "A key-value pair with team key (eg `frc254`) as key and CCWM as value.")
  public Map<String, Float> getCcwms() {
    return ccwms;
  }

  public void setCcwms(Map<String, Float> ccwms) {
    this.ccwms = ccwms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventOPRs eventOPRs = (EventOPRs) o;
    return Objects.equals(this.oprs, eventOPRs.oprs) &&
        Objects.equals(this.dprs, eventOPRs.dprs) &&
        Objects.equals(this.ccwms, eventOPRs.ccwms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oprs, dprs, ccwms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventOPRs {\n");
    
    sb.append("    oprs: ").append(toIndentedString(oprs)).append("\n");
    sb.append("    dprs: ").append(toIndentedString(dprs)).append("\n");
    sb.append("    ccwms: ").append(toIndentedString(ccwms)).append("\n");
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

