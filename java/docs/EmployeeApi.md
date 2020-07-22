# EmployeeApi

All URIs are relative to *https://virtserver.swaggerhub.com/MiDS/UserManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeesPost**](EmployeeApi.md#employeesPost) | **POST** /employees | Add Employee operation

<a name="employeesPost"></a>
# **employeesPost**
> InlineResponse200 employeesPost(body)

Add Employee operation

Add Employee.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmployeeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

EmployeeApi apiInstance = new EmployeeApi();
Body5 body = new Body5(); // Body5 | 
try {
    InlineResponse200 result = apiInstance.employeesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body5**](Body5.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

