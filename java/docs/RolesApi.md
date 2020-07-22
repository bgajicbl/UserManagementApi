# RolesApi

All URIs are relative to *https://virtserver.swaggerhub.com/MiDS/UserManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rolesGet**](RolesApi.md#rolesGet) | **GET** /roles | Get All Roles
[**rolesPost**](RolesApi.md#rolesPost) | **POST** /roles | Add new Role
[**rolesRoleIdDelete**](RolesApi.md#rolesRoleIdDelete) | **DELETE** /roles/{roleId} | Delete existing Role
[**rolesRoleIdPost**](RolesApi.md#rolesRoleIdPost) | **POST** /roles/{roleId} | Update existing Role

<a name="rolesGet"></a>
# **rolesGet**
> InlineResponse2003 rolesGet(deleted)

Get All Roles

Get Roles

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

RolesApi apiInstance = new RolesApi();
Boolean deleted = true; // Boolean | Deleted
try {
    InlineResponse2003 result = apiInstance.rolesGet(deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#rolesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleted** | **Boolean**| Deleted | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rolesPost"></a>
# **rolesPost**
> RoleResp rolesPost(body)

Add new Role

Add Role

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

RolesApi apiInstance = new RolesApi();
RoleReq body = new RoleReq(); // RoleReq | Input role data to be add
try {
    RoleResp result = apiInstance.rolesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#rolesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleReq**](RoleReq.md)| Input role data to be add |

### Return type

[**RoleResp**](RoleResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rolesRoleIdDelete"></a>
# **rolesRoleIdDelete**
> RoleResp rolesRoleIdDelete(roleId, adminId)

Delete existing Role

Delete Role

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

RolesApi apiInstance = new RolesApi();
Long roleId = 789L; // Long | Role ID
Long adminId = 789L; // Long | Admin Id
try {
    RoleResp result = apiInstance.rolesRoleIdDelete(roleId, adminId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#rolesRoleIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| Role ID |
 **adminId** | **Long**| Admin Id |

### Return type

[**RoleResp**](RoleResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rolesRoleIdPost"></a>
# **rolesRoleIdPost**
> RoleResp rolesRoleIdPost(body, roleId)

Update existing Role

Update Role

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

RolesApi apiInstance = new RolesApi();
RoleReq body = new RoleReq(); // RoleReq | Input role data to be update
Long roleId = 789L; // Long | Role ID
try {
    RoleResp result = apiInstance.rolesRoleIdPost(body, roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#rolesRoleIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleReq**](RoleReq.md)| Input role data to be update |
 **roleId** | **Long**| Role ID |

### Return type

[**RoleResp**](RoleResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

