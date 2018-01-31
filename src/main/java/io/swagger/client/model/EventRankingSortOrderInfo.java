package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EventRankingSortOrderInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class EventRankingSortOrderInfo {
  @SerializedName("name")
  private String name = null;

  @SerializedName("precision")
  private Integer precision = null;

  public EventRankingSortOrderInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the field used in the `sort_order` array.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the field used in the `sort_order` array.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EventRankingSortOrderInfo precision(Integer precision) {
    this.precision = precision;
    return this;
  }

   /**
   * Integer expressing the number of digits of precision in the number provided in `sort_orders`.
   * @return precision
  **/
  @ApiModelProperty(required = true, value = "Integer expressing the number of digits of precision in the number provided in `sort_orders`.")
  public Integer getPrecision() {
    return precision;
  }

  public void setPrecision(Integer precision) {
    this.precision = precision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRankingSortOrderInfo eventRankingSortOrderInfo = (EventRankingSortOrderInfo) o;
    return Objects.equals(this.name, eventRankingSortOrderInfo.name) &&
        Objects.equals(this.precision, eventRankingSortOrderInfo.precision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, precision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRankingSortOrderInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
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

