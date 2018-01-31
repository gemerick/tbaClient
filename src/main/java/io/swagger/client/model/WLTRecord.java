package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A Win-Loss-Tie record for a team, or an alliance.
 */
@ApiModel(description = "A Win-Loss-Tie record for a team, or an alliance.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class WLTRecord {
  @SerializedName("losses")
  private Integer losses = null;

  @SerializedName("wins")
  private Integer wins = null;

  @SerializedName("ties")
  private Integer ties = null;

  public WLTRecord losses(Integer losses) {
    this.losses = losses;
    return this;
  }

   /**
   * Number of losses.
   * @return losses
  **/
  @ApiModelProperty(required = true, value = "Number of losses.")
  public Integer getLosses() {
    return losses;
  }

  public void setLosses(Integer losses) {
    this.losses = losses;
  }

  public WLTRecord wins(Integer wins) {
    this.wins = wins;
    return this;
  }

   /**
   * Number of wins.
   * @return wins
  **/
  @ApiModelProperty(required = true, value = "Number of wins.")
  public Integer getWins() {
    return wins;
  }

  public void setWins(Integer wins) {
    this.wins = wins;
  }

  public WLTRecord ties(Integer ties) {
    this.ties = ties;
    return this;
  }

   /**
   * Number of ties.
   * @return ties
  **/
  @ApiModelProperty(required = true, value = "Number of ties.")
  public Integer getTies() {
    return ties;
  }

  public void setTies(Integer ties) {
    this.ties = ties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WLTRecord wlTRecord = (WLTRecord) o;
    return Objects.equals(this.losses, wlTRecord.losses) &&
        Objects.equals(this.wins, wlTRecord.wins) &&
        Objects.equals(this.ties, wlTRecord.ties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(losses, wins, ties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WLTRecord {\n");
    
    sb.append("    losses: ").append(toIndentedString(losses)).append("\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    ties: ").append(toIndentedString(ties)).append("\n");
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

