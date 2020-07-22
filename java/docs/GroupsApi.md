# GroupsApi

All URIs are relative to *https://virtserver.swaggerhub.com/MiDS/UserManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupsGet**](GroupsApi.md#groupsGet) | **GET** /groups | Get Existing Groups
[**groupsGroupIdDelete**](GroupsApi.md#groupsGroupIdDelete) | **DELETE** /groups/{groupId} | Delete Existing Group
[**groupsGroupIdUsersPost**](GroupsApi.md#groupsGroupIdUsersPost) | **POST** /groups/{groupId}/users | Add Users to the Group
[**groupsPost**](GroupsApi.md#groupsPost) | **POST** /groups | Add New  Groups

<a name="groupsGet"></a>
# **groupsGet**
> InlineResponse2007 groupsGet()

Get Existing Groups

Get Existing Groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
try {
    InlineResponse2007 result = apiInstance.groupsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="groupsGroupIdDelete"></a>
# **groupsGroupIdDelete**
> InlineResponse2009 groupsGroupIdDelete(groupId)

Delete Existing Group

Delete Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
Long groupId = 789L; // Long | Group Id
try {
    InlineResponse2009 result = apiInstance.groupsGroupIdDelete(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGroupIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group Id |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="groupsGroupIdUsersPost"></a>
# **groupsGroupIdUsersPost**
> InlineResponse2009 groupsGroupIdUsersPost(body, groupId)

Add Users to the Group

Add User to group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
Body7 body = new Body7(); // Body7 | Request body for Deleting user from group
Long groupId = 789L; // Long | Group Id
try {
    InlineResponse2009 result = apiInstance.groupsGroupIdUsersPost(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGroupIdUsersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body7**](Body7.md)| Request body for Deleting user from group |
 **groupId** | **Long**| Group Id |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupsPost"></a>
# **groupsPost**
> InlineResponse2008 groupsPost(body)

Add New  Groups

Add Groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
Body6 body = new Body6(); // Body6 | Request for Add Group
try {
    InlineResponse2008 result = apiInstance.groupsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body6**](Body6.md)| Request for Add Group |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

