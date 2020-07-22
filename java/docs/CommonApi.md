# CommonApi

All URIs are relative to *https://virtserver.swaggerhub.com/MiDS/UserManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**citiesGet**](CommonApi.md#citiesGet) | **GET** /cities | Get Cities
[**countriesGet**](CommonApi.md#countriesGet) | **GET** /countries | Get Countries
[**provincesGet**](CommonApi.md#provincesGet) | **GET** /provinces | Get Provinces

<a name="citiesGet"></a>
# **citiesGet**
> InlineResponse2006 citiesGet(provinceId)

Get Cities

Get Cities

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

CommonApi apiInstance = new CommonApi();
Long provinceId = 789L; // Long | Province ID
try {
    InlineResponse2006 result = apiInstance.citiesGet(provinceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#citiesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provinceId** | **Long**| Province ID | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="countriesGet"></a>
# **countriesGet**
> InlineResponse2004 countriesGet()

Get Countries

Get Countries

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

CommonApi apiInstance = new CommonApi();
try {
    InlineResponse2004 result = apiInstance.countriesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#countriesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="provincesGet"></a>
# **provincesGet**
> InlineResponse2005 provincesGet(countryId)

Get Provinces

Get Provinces

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

CommonApi apiInstance = new CommonApi();
Long countryId = 789L; // Long | Country ID
try {
    InlineResponse2005 result = apiInstance.provincesGet(countryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#provincesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryId** | **Long**| Country ID | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

