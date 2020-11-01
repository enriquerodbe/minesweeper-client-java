# GamesApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBoard**](GamesApi.md#createBoard) | **POST** /games | Create a new board for the logged in user
[**move**](GamesApi.md#move) | **POST** /games/{boardUid}/moves | Make a move
[**retrieveAllBoards**](GamesApi.md#retrieveAllBoards) | **GET** /games | Get all boards for the logged in user
[**retrieveBoard**](GamesApi.md#retrieveBoard) | **GET** /games/{boardUid} | Get details of a board
[**setBoardIsActive**](GamesApi.md#setBoardIsActive) | **POST** /games/{boardUid}/statuses | Change preserved/active board status

<a name="createBoard"></a>
# **createBoard**
> BoardSummary createBoard(body)

Create a new board for the logged in user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GamesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: XAuthTokenHeader
ApiKeyAuth XAuthTokenHeader = (ApiKeyAuth) defaultClient.getAuthentication("XAuthTokenHeader");
XAuthTokenHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//XAuthTokenHeader.setApiKeyPrefix("Token");

GamesApi apiInstance = new GamesApi();
BoardConfiguration body = new BoardConfiguration(); // BoardConfiguration | The new board data
try {
    BoardSummary result = apiInstance.createBoard(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#createBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardConfiguration**](BoardConfiguration.md)| The new board data |

### Return type

[**BoardSummary**](BoardSummary.md)

### Authorization

[XAuthTokenHeader](../README.md#XAuthTokenHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="move"></a>
# **move**
> BoardDetails move(body, boardUid)

Make a move

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GamesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: XAuthTokenHeader
ApiKeyAuth XAuthTokenHeader = (ApiKeyAuth) defaultClient.getAuthentication("XAuthTokenHeader");
XAuthTokenHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//XAuthTokenHeader.setApiKeyPrefix("Token");

GamesApi apiInstance = new GamesApi();
PlayerMove body = new PlayerMove(); // PlayerMove | Player move
String boardUid = "boardUid_example"; // String | 
try {
    BoardDetails result = apiInstance.move(body, boardUid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#move");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlayerMove**](PlayerMove.md)| Player move |
 **boardUid** | **String**|  |

### Return type

[**BoardDetails**](BoardDetails.md)

### Authorization

[XAuthTokenHeader](../README.md#XAuthTokenHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllBoards"></a>
# **retrieveAllBoards**
> List&lt;BoardSummary&gt; retrieveAllBoards()

Get all boards for the logged in user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GamesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: XAuthTokenHeader
ApiKeyAuth XAuthTokenHeader = (ApiKeyAuth) defaultClient.getAuthentication("XAuthTokenHeader");
XAuthTokenHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//XAuthTokenHeader.setApiKeyPrefix("Token");

GamesApi apiInstance = new GamesApi();
try {
    List<BoardSummary> result = apiInstance.retrieveAllBoards();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#retrieveAllBoards");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BoardSummary&gt;**](BoardSummary.md)

### Authorization

[XAuthTokenHeader](../README.md#XAuthTokenHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveBoard"></a>
# **retrieveBoard**
> BoardDetails retrieveBoard(boardUid)

Get details of a board

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GamesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: XAuthTokenHeader
ApiKeyAuth XAuthTokenHeader = (ApiKeyAuth) defaultClient.getAuthentication("XAuthTokenHeader");
XAuthTokenHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//XAuthTokenHeader.setApiKeyPrefix("Token");

GamesApi apiInstance = new GamesApi();
String boardUid = "boardUid_example"; // String | 
try {
    BoardDetails result = apiInstance.retrieveBoard(boardUid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#retrieveBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardUid** | **String**|  |

### Return type

[**BoardDetails**](BoardDetails.md)

### Authorization

[XAuthTokenHeader](../README.md#XAuthTokenHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setBoardIsActive"></a>
# **setBoardIsActive**
> BoardSummary setBoardIsActive(body, boardUid)

Change preserved/active board status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GamesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: XAuthTokenHeader
ApiKeyAuth XAuthTokenHeader = (ApiKeyAuth) defaultClient.getAuthentication("XAuthTokenHeader");
XAuthTokenHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//XAuthTokenHeader.setApiKeyPrefix("Token");

GamesApi apiInstance = new GamesApi();
Boolean body = true; // Boolean | Is active
String boardUid = "boardUid_example"; // String | 
try {
    BoardSummary result = apiInstance.setBoardIsActive(body, boardUid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#setBoardIsActive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Boolean**](Boolean.md)| Is active |
 **boardUid** | **String**|  |

### Return type

[**BoardSummary**](BoardSummary.md)

### Authorization

[XAuthTokenHeader](../README.md#XAuthTokenHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

