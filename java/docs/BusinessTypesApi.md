# BusinessTypesApi

All URIs are relative to *https://virtserver.swaggerhub.com/MiDS/UserManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessTypesBusinessTypeIdDelete**](BusinessTypesApi.md#businessTypesBusinessTypeIdDelete) | **DELETE** /business-types/{businessTypeId} | To Delte Existing Business Types
[**businessTypesBusinessTypeIdPut**](BusinessTypesApi.md#businessTypesBusinessTypeIdPut) | **PUT** /business-types/{businessTypeId} | To Update the Business Types
[**businessTypesGet**](BusinessTypesApi.md#businessTypesGet) | **GET** /business-types | Get All Business Types
[**businessTypesPost**](BusinessTypesApi.md#businessTypesPost) | **POST** /business-types | Add new Business Type

<a name="businessTypesBusinessTypeIdDelete"></a>
# **businessTypesBusinessTypeIdDelete**
> BusinessTypeResp businessTypesBusinessTypeIdDelete(businessTypeId, adminId)

To Delte Existing Business Types

Delete Business Type

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BusinessTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

BusinessTypesApi apiInstance = new BusinessTypesApi();
Long businessTypeId = 789L; // Long | Business Type ID
Integer adminId = 56; // Integer | Admin user ID who delete the business type
try {
    BusinessTypeResp result = apiInstance.businessTypesBusinessTypeIdDelete(businessTypeId, adminId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTypesApi#businessTypesBusinessTypeIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessTypeId** | **Long**| Business Type ID |
 **adminId** | **Integer**| Admin user ID who delete the business type |

### Return type

[**BusinessTypeResp**](BusinessTypeResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="businessTypesBusinessTypeIdPut"></a>
# **businessTypesBusinessTypeIdPut**
> BusinessTypeResp businessTypesBusinessTypeIdPut(body, businessTypeId)

To Update the Business Types

Update Business Type

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BusinessTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

BusinessTypesApi apiInstance = new BusinessTypesApi();
BusinessTypeReq body = new BusinessTypeReq(); // BusinessTypeReq | Input Business type data to be update
Long businessTypeId = 789L; // Long | Business Type ID
try {
    BusinessTypeResp result = apiInstance.businessTypesBusinessTypeIdPut(body, businessTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTypesApi#businessTypesBusinessTypeIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BusinessTypeReq**](BusinessTypeReq.md)| Input Business type data to be update |
 **businessTypeId** | **Long**| Business Type ID |

### Return type

[**BusinessTypeResp**](BusinessTypeResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="businessTypesGet"></a>
# **businessTypesGet**
> InlineResponse2002 businessTypesGet()

Get All Business Types

Get Business Types

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BusinessTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

BusinessTypesApi apiInstance = new BusinessTypesApi();
try {
    InlineResponse2002 result = apiInstance.businessTypesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTypesApi#businessTypesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="businessTypesPost"></a>
# **businessTypesPost**
> BusinessTypeResp businessTypesPost(body)

Add new Business Type

Add Business Type

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BusinessTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

BusinessTypesApi apiInstance = new BusinessTypesApi();
BusinessTypeReq body = new BusinessTypeReq(); // BusinessTypeReq | Input Business type data to be add
try {
    BusinessTypeResp result = apiInstance.businessTypesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTypesApi#businessTypesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BusinessTypeReq**](BusinessTypeReq.md)| Input Business type data to be add |

### Return type

[**BusinessTypeResp**](BusinessTypeResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

