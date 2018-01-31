package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Backup status, may be null.
 */
@ApiModel(description = "Backup status, may be null.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T02:55:45.757Z")
public class TeamEventStatusAllianceBackup {
  @SerializedName("out")
  private String out = null;

  @SerializedName("in")
  private String in = null;

  public TeamEventStatusAllianceBackup out(String out) {
    this.out = out;
    return this;
  }

   /**
   * TBA key for the team replaced by the backup.
   * @return out
  **/
  @ApiModelProperty(value = "TBA key for the team replaced by the backup.")
  public String getOut() {
    return out;
  }

  public void setOut(String out) {
    this.out = out;
  }

  public TeamEventStatusAllianceBackup in(String in) {
    this.in = in;
    return this;
  }

   /**
   * TBA key for the backup team called in.
   * @return in
  **/
  @ApiModelProperty(value = "TBA key for the backup team called in.")
  public String getIn() {
    return in;
  }

  public void setIn(String in) {
    this.in = in;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatusAllianceBackup teamEventStatusAllianceBackup = (TeamEventStatusAllianceBackup) o;
    return Objects.equals(this.out, teamEventStatusAllianceBackup.out) &&
        Objects.equals(this.in, teamEventStatusAllianceBackup.in);
  }

  @Override
  public int hashCode() {
    return Objects.hash(out, in);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatusAllianceBackup {\n");
    
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
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

