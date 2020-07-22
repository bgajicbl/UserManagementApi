# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/MiDS/UserManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pingGet**](DefaultApi.md#pingGet) | **GET** /ping | Server heartbeat operation

<a name="pingGet"></a>
# **pingGet**
> pingGet()

Server heartbeat operation

This operation shows Server heartbeat.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.pingGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

