# OtpApi

All URIs are relative to *https://virtserver.swaggerhub.com/MiDS/UserManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**otpPassresetotpPost**](OtpApi.md#otpPassresetotpPost) | **POST** /otp/passresetotp | The operation for password reset otp
[**otpPost**](OtpApi.md#otpPost) | **POST** /otp | The operation creates a otp and sends it to the client
[**otpVerifyPost**](OtpApi.md#otpVerifyPost) | **POST** /otp/verify | The operation veify the otp enterred by the userr

<a name="otpPassresetotpPost"></a>
# **otpPassresetotpPost**
> OtpPassResetResp otpPassresetotpPost(body)

The operation for password reset otp

Password reset OTP.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

OtpApi apiInstance = new OtpApi();
PassResetOtpReq body = new PassResetOtpReq(); // PassResetOtpReq | 
try {
    OtpPassResetResp result = apiInstance.otpPassresetotpPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtpApi#otpPassresetotpPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PassResetOtpReq**](PassResetOtpReq.md)|  | [optional]

### Return type

[**OtpPassResetResp**](OtpPassResetResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="otpPost"></a>
# **otpPost**
> OtpResp otpPost(body)

The operation creates a otp and sends it to the client

Generate OTP.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

OtpApi apiInstance = new OtpApi();
OtpReq body = new OtpReq(); // OtpReq | 
try {
    OtpResp result = apiInstance.otpPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtpApi#otpPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OtpReq**](OtpReq.md)|  | [optional]

### Return type

[**OtpResp**](OtpResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="otpVerifyPost"></a>
# **otpVerifyPost**
> OtpResp otpVerifyPost(body)

The operation veify the otp enterred by the userr

Verify OTP.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

OtpApi apiInstance = new OtpApi();
VerifyOtpReq body = new VerifyOtpReq(); // VerifyOtpReq | 
try {
    OtpResp result = apiInstance.otpVerifyPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtpApi#otpVerifyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyOtpReq**](VerifyOtpReq.md)|  | [optional]

### Return type

[**OtpResp**](OtpResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

