# KycApi

All URIs are relative to *https://virtserver.swaggerhub.com/MiDS/UserManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendMailOTP**](KycApi.md#sendMailOTP) | **PUT** /users/{userId}/mailOTP | Send Mail OTP
[**sendMobileOTP**](KycApi.md#sendMobileOTP) | **PUT** /users/{userId}/mobileOTP | Send Mobile OTP
[**updateKyc**](KycApi.md#updateKyc) | **PUT** /users/{userId}/kyc | Update KYC info
[**uploadKycDocs**](KycApi.md#uploadKycDocs) | **PUT** /users/{userId}/kycdocs | Upload KYC Docs
[**verifyMailOTP**](KycApi.md#verifyMailOTP) | **GET** /users/{userId}/mailOTP | Verify Mail OTP
[**verifyMobileOTP**](KycApi.md#verifyMobileOTP) | **GET** /users/{userId}/mobileOTP | Verify Mobile OTP

<a name="sendMailOTP"></a>
# **sendMailOTP**
> UserResp sendMailOTP(userId)

Send Mail OTP

Sends Mail OTP. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KycApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

KycApi apiInstance = new KycApi();
Long userId = 789L; // Long | User ID
try {
    UserResp result = apiInstance.sendMailOTP(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#sendMailOTP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |

### Return type

[**UserResp**](UserResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendMobileOTP"></a>
# **sendMobileOTP**
> UserResp sendMobileOTP(userId)

Send Mobile OTP

Sends Mobile OTP. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KycApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

KycApi apiInstance = new KycApi();
Long userId = 789L; // Long | User ID
try {
    UserResp result = apiInstance.sendMobileOTP(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#sendMobileOTP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |

### Return type

[**UserResp**](UserResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateKyc"></a>
# **updateKyc**
> CommonResp updateKyc(body, userId)

Update KYC info

Approve KYC. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KycApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

KycApi apiInstance = new KycApi();
KycUpdateInput body = new KycUpdateInput(); // KycUpdateInput | Input parameter which holds KYC update info
Long userId = 789L; // Long | User ID
try {
    CommonResp result = apiInstance.updateKyc(body, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#updateKyc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KycUpdateInput**](KycUpdateInput.md)| Input parameter which holds KYC update info |
 **userId** | **Long**| User ID |

### Return type

[**CommonResp**](CommonResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadKycDocs"></a>
# **uploadKycDocs**
> UserResp uploadKycDocs(body, userId)

Upload KYC Docs

Uploads KYC Docs. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KycApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

KycApi apiInstance = new KycApi();
KycDocsInput body = new KycDocsInput(); // KycDocsInput | Input parameter which holds KYC Docs details
Long userId = 789L; // Long | User ID
try {
    UserResp result = apiInstance.uploadKycDocs(body, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#uploadKycDocs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KycDocsInput**](KycDocsInput.md)| Input parameter which holds KYC Docs details |
 **userId** | **Long**| User ID |

### Return type

[**UserResp**](UserResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyMailOTP"></a>
# **verifyMailOTP**
> UserResp verifyMailOTP(userId)

Verify Mail OTP

Verifies Mail OTP. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KycApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

KycApi apiInstance = new KycApi();
Long userId = 789L; // Long | User ID
try {
    UserResp result = apiInstance.verifyMailOTP(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#verifyMailOTP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |

### Return type

[**UserResp**](UserResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verifyMobileOTP"></a>
# **verifyMobileOTP**
> UserResp verifyMobileOTP(userId)

Verify Mobile OTP

Verifies Mobile OTP. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KycApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

KycApi apiInstance = new KycApi();
Long userId = 789L; // Long | User ID
try {
    UserResp result = apiInstance.verifyMobileOTP(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#verifyMobileOTP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |

### Return type

[**UserResp**](UserResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

