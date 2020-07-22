# AdminApi

All URIs are relative to *https://virtserver.swaggerhub.com/MiDS/UserManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminsGet**](AdminApi.md#adminsGet) | **GET** /admins | Get Admin list
[**adminsPassResetPost**](AdminApi.md#adminsPassResetPost) | **POST** /admins/pass-reset | Check if Password can be reset for Admin
[**adminsPost**](AdminApi.md#adminsPost) | **POST** /admins | Add Admin operation

<a name="adminsGet"></a>
# **adminsGet**
> List&lt;AdminCommon&gt; adminsGet(filter)

Get Admin list

Get Admin List.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

AdminApi apiInstance = new AdminApi();
Integer filter = 56; // Integer | Role filter
try {
    List<AdminCommon> result = apiInstance.adminsGet(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **Integer**| Role filter |

### Return type

[**List&lt;AdminCommon&gt;**](AdminCommon.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminsPassResetPost"></a>
# **adminsPassResetPost**
> UserResp adminsPassResetPost(body)

Check if Password can be reset for Admin

Check for Password Reset

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

AdminApi apiInstance = new AdminApi();
AdminEmailPassResetInfo body = new AdminEmailPassResetInfo(); // AdminEmailPassResetInfo | 
try {
    UserResp result = apiInstance.adminsPassResetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminsPassResetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminEmailPassResetInfo**](AdminEmailPassResetInfo.md)|  | [optional]

### Return type

[**UserResp**](UserResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminsPost"></a>
# **adminsPost**
> InlineResponse200 adminsPost(body)

Add Admin operation

Add Admin.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

AdminApi apiInstance = new AdminApi();
Body4 body = new Body4(); // Body4 | 
try {
    InlineResponse200 result = apiInstance.adminsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body4**](Body4.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

