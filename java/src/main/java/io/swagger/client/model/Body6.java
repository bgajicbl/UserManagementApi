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
import java.util.ArrayList;
import java.util.List;
/**
 * Body6
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-22T21:50:37.996Z[GMT]")
public class Body6 {
  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("userList")
  private List<Integer> userList = null;

  @SerializedName("adminId")
  private Integer adminId = null;

  public Body6 groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @Schema(description = "")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public Body6 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Body6 userList(List<Integer> userList) {
    this.userList = userList;
    return this;
  }

  public Body6 addUserListItem(Integer userListItem) {
    if (this.userList == null) {
      this.userList = new ArrayList<Integer>();
    }
    this.userList.add(userListItem);
    return this;
  }

   /**
   * Get userList
   * @return userList
  **/
  @Schema(description = "")
  public List<Integer> getUserList() {
    return userList;
  }

  public void setUserList(List<Integer> userList) {
    this.userList = userList;
  }

  public Body6 adminId(Integer adminId) {
    this.adminId = adminId;
    return this;
  }

   /**
   * Get adminId
   * @return adminId
  **/
  @Schema(description = "")
  public Integer getAdminId() {
    return adminId;
  }

  public void setAdminId(Integer adminId) {
    this.adminId = adminId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body6 body6 = (Body6) o;
    return Objects.equals(this.groupName, body6.groupName) &&
        Objects.equals(this.description, body6.description) &&
        Objects.equals(this.userList, body6.userList) &&
        Objects.equals(this.adminId, body6.adminId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, description, userList, adminId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body6 {\n");
    
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
    sb.append("    adminId: ").append(toIndentedString(adminId)).append("\n");
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
