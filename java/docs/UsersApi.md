# UsersApi

All URIs are relative to *https://virtserver.swaggerhub.com/MiDS/UserManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserById**](UsersApi.md#deleteUserById) | **DELETE** /users/{userId} | View Profile by ID.
[**getUserById**](UsersApi.md#getUserById) | **GET** /users/{userId} | View Profile by ID.
[**loginUser**](UsersApi.md#loginUser) | **POST** /authenticate | Logs user into the system
[**usersActivateUserIdPost**](UsersApi.md#usersActivateUserIdPost) | **POST** /users/activate/{userId} | The Operation activates users of the naqdina system
[**usersPost**](UsersApi.md#usersPost) | **POST** /users | Add User operation
[**usersUserIdInvitePost**](UsersApi.md#usersUserIdInvitePost) | **POST** /users/{userId}/invite | The  Operation invite users to register into the naqdina system
[**usersUserIdPasswordPut**](UsersApi.md#usersUserIdPasswordPut) | **PUT** /users/{userId}/password | The Operation to change the password
[**usersUserIdPinPost**](UsersApi.md#usersUserIdPinPost) | **POST** /users/{userId}/pin | The operation Creates pin for the user
[**usersUserIdPinPut**](UsersApi.md#usersUserIdPinPut) | **PUT** /users/{userId}/pin | The operation Changes pin for the user
[**usersUserIdPut**](UsersApi.md#usersUserIdPut) | **PUT** /users/{userId} | Update User by Id
[**usersUserIdRolesGet**](UsersApi.md#usersUserIdRolesGet) | **GET** /users/{userId}/roles | The  Operation request the admin to upgrade the role of the user
[**usersUserIdViewAgentsGet**](UsersApi.md#usersUserIdViewAgentsGet) | **GET** /users/{userId}/view-agents | The Operation gets the list of Agents signed-up under an user

<a name="deleteUserById"></a>
# **deleteUserById**
> CommonResp deleteUserById(userId)

View Profile by ID.

Gets a user profile by ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | User ID
try {
    CommonResp result = apiInstance.deleteUserById(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |

### Return type

[**CommonResp**](CommonResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserById"></a>
# **getUserById**
> ExistingUser getUserById(userId)

View Profile by ID.

Gets a user profile by ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | User ID
try {
    ExistingUser result = apiInstance.getUserById(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |

### Return type

[**ExistingUser**](ExistingUser.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loginUser"></a>
# **loginUser**
> AuthenticateResp loginUser(body)

Logs user into the system

Logs user into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: userPassAuth
HttpBasicAuth userPassAuth = (HttpBasicAuth) defaultClient.getAuthentication("userPassAuth");
userPassAuth.setUsername("YOUR USERNAME");
userPassAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
Body body = new Body(); // Body | 
try {
    AuthenticateResp result = apiInstance.loginUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#loginUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)|  | [optional]

### Return type

[**AuthenticateResp**](AuthenticateResp.md)

### Authorization

[userPassAuth](../README.md#userPassAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersActivateUserIdPost"></a>
# **usersActivateUserIdPost**
> ActivateUserResp usersActivateUserIdPost(userId, roleName)

The Operation activates users of the naqdina system

Activate User

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | User ID
String roleName = "roleName_example"; // String | Role name
try {
    ActivateUserResp result = apiInstance.usersActivateUserIdPost(userId, roleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersActivateUserIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |
 **roleName** | **String**| Role name |

### Return type

[**ActivateUserResp**](ActivateUserResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersPost"></a>
# **usersPost**
> InlineResponse200 usersPost(body)

Add User operation

Add User.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
NewUser body = new NewUser(); // NewUser | 
try {
    InlineResponse200 result = apiInstance.usersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewUser**](NewUser.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdInvitePost"></a>
# **usersUserIdInvitePost**
> InviteUserResp usersUserIdInvitePost(userId, body)

The  Operation invite users to register into the naqdina system

Invite User

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | User ID
Body2 body = new Body2(); // Body2 | 
try {
    InviteUserResp result = apiInstance.usersUserIdInvitePost(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdInvitePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |
 **body** | [**Body2**](Body2.md)|  | [optional]

### Return type

[**InviteUserResp**](InviteUserResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPasswordPut"></a>
# **usersUserIdPasswordPut**
> CommonResp usersUserIdPasswordPut(userId, body)

The Operation to change the password

Change Password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | User ID
Body3 body = new Body3(); // Body3 | 
try {
    CommonResp result = apiInstance.usersUserIdPasswordPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdPasswordPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |
 **body** | [**Body3**](Body3.md)|  | [optional]

### Return type

[**CommonResp**](CommonResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPinPost"></a>
# **usersUserIdPinPost**
> UserResp usersUserIdPinPost(userId, body)

The operation Creates pin for the user

Set Pin

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | User ID
PinReq body = new PinReq(); // PinReq | 
try {
    UserResp result = apiInstance.usersUserIdPinPost(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdPinPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |
 **body** | [**PinReq**](PinReq.md)|  | [optional]

### Return type

[**UserResp**](UserResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPinPut"></a>
# **usersUserIdPinPut**
> InlineResponse2001 usersUserIdPinPut(userId, body)

The operation Changes pin for the user

Change Pin

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | User ID
Body1 body = new Body1(); // Body1 | 
try {
    InlineResponse2001 result = apiInstance.usersUserIdPinPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdPinPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |
 **body** | [**Body1**](Body1.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPut"></a>
# **usersUserIdPut**
> UserResp usersUserIdPut(userId, body)

Update User by Id

Update User

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | User ID
UserReq body = new UserReq(); // UserReq | 
try {
    UserResp result = apiInstance.usersUserIdPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |
 **body** | [**UserReq**](UserReq.md)|  | [optional]

### Return type

[**UserResp**](UserResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdRolesGet"></a>
# **usersUserIdRolesGet**
> UpgradeLevelResp usersUserIdRolesGet(userId, upgradeRole)

The  Operation request the admin to upgrade the role of the user

Upgrade Level

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | User ID
String upgradeRole = "upgradeRole_example"; // String | Role to be upgraded to
try {
    UpgradeLevelResp result = apiInstance.usersUserIdRolesGet(userId, upgradeRole);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdRolesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |
 **upgradeRole** | **String**| Role to be upgraded to |

### Return type

[**UpgradeLevelResp**](UpgradeLevelResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersUserIdViewAgentsGet"></a>
# **usersUserIdViewAgentsGet**
> ViewMyAgentsResp usersUserIdViewAgentsGet(userId)

The Operation gets the list of Agents signed-up under an user

Get my agents

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | User ID
try {
    ViewMyAgentsResp result = apiInstance.usersUserIdViewAgentsGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdViewAgentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |

### Return type

[**ViewMyAgentsResp**](ViewMyAgentsResp.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

