/*
 * UserManagementAPI
 * API for user management
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@naqdina.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse400Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-22T21:50:37.996Z[GMT]")
public class InlineResponse400Data {
  @SerializedName("incorrectPin")
  private String incorrectPin = null;

  @SerializedName("details")
  private String details = null;

  public InlineResponse400Data incorrectPin(String incorrectPin) {
    this.incorrectPin = incorrectPin;
    return this;
  }

   /**
   * Get incorrectPin
   * @return incorrectPin
  **/
  @Schema(description = "")
  public String getIncorrectPin() {
    return incorrectPin;
  }

  public void setIncorrectPin(String incorrectPin) {
    this.incorrectPin = incorrectPin;
  }

  public InlineResponse400Data details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Schema(description = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400Data inlineResponse400Data = (InlineResponse400Data) o;
    return Objects.equals(this.incorrectPin, inlineResponse400Data.incorrectPin) &&
        Objects.equals(this.details, inlineResponse400Data.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incorrectPin, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400Data {\n");
    
    sb.append("    incorrectPin: ").append(toIndentedString(incorrectPin)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
