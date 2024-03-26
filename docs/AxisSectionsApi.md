# AxisSectionsApi

All URIs are relative to *https://example.ilucca.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewAxisSection**](AxisSectionsApi.md#createNewAxisSection) | **POST** /api/v3/axisSections | Create a new AxisSection |
| [**deleteById**](AxisSectionsApi.md#deleteById) | **DELETE** /api/v3/axisSections/{axisSectionId} | Delete an AxisSection by id |
| [**getById**](AxisSectionsApi.md#getById) | **GET** /api/v3/axisSections/{axisSectionId} | Get an AxisSection by id |
| [**list**](AxisSectionsApi.md#list) | **GET** /api/v3/axes | List Axes |
| [**list_0**](AxisSectionsApi.md#list_0) | **GET** /api/v3/axisSections | List AxisSections |
| [**updateById**](AxisSectionsApi.md#updateById) | **PUT** /api/v3/axisSections/{axisSectionId} | Update an AxisSection by id |


<a name="createNewAxisSection"></a>
# **createNewAxisSection**
> AxissectionsCreateNewAxisSectionResponse createNewAxisSection().axisSection(axisSection).execute();

Create a new AxisSection

Create a new AxisSection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaOrganization;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AxisSectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaOrganization client = new LuccaOrganization(configuration);
    Object description = null;
    Integer id = 56;
    String name = "name_example";
    URI url = new URI();
    String code = "code_example";
    String multilingualName = "multilingualName_example";
    Object ownerId = null;
    Object startOn = null;
    Object endOn = null;
    Boolean active = true;
    Integer axisId = 56;
    List<AxisSectionTreeless> parentAxisSections = Arrays.asList();
    List<AxisSectionTreeless> childrenAxisSections = Arrays.asList();
    try {
      AxissectionsCreateNewAxisSectionResponse result = client
              .axisSections
              .createNewAxisSection()
              .description(description)
              .id(id)
              .name(name)
              .url(url)
              .code(code)
              .multilingualName(multilingualName)
              .ownerId(ownerId)
              .startOn(startOn)
              .endOn(endOn)
              .active(active)
              .axisId(axisId)
              .parentAxisSections(parentAxisSections)
              .childrenAxisSections(childrenAxisSections)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#createNewAxisSection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AxissectionsCreateNewAxisSectionResponse> response = client
              .axisSections
              .createNewAxisSection()
              .description(description)
              .id(id)
              .name(name)
              .url(url)
              .code(code)
              .multilingualName(multilingualName)
              .ownerId(ownerId)
              .startOn(startOn)
              .endOn(endOn)
              .active(active)
              .axisId(axisId)
              .parentAxisSections(parentAxisSections)
              .childrenAxisSections(childrenAxisSections)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#createNewAxisSection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **axisSection** | [**AxisSection**](AxisSection.md)|  | [optional] |

### Return type

[**AxissectionsCreateNewAxisSectionResponse**](AxissectionsCreateNewAxisSectionResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a name="deleteById"></a>
# **deleteById**
> deleteById(axisSectionId).execute();

Delete an AxisSection by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaOrganization;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AxisSectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaOrganization client = new LuccaOrganization(configuration);
    Integer axisSectionId = 56;
    try {
      client
              .axisSections
              .deleteById(axisSectionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .axisSections
              .deleteById(axisSectionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **axisSectionId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a name="getById"></a>
# **getById**
> AxissectionsGetByIdResponse getById(axisSectionId).execute();

Get an AxisSection by id

Retrieve a single AxisSection by its unique identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaOrganization;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AxisSectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaOrganization client = new LuccaOrganization(configuration);
    Integer axisSectionId = 56;
    try {
      AxissectionsGetByIdResponse result = client
              .axisSections
              .getById(axisSectionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AxissectionsGetByIdResponse> response = client
              .axisSections
              .getById(axisSectionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **axisSectionId** | **Integer**|  | |

### Return type

[**AxissectionsGetByIdResponse**](AxissectionsGetByIdResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a name="list"></a>
# **list**
> AxissectionsListResponse list(paging).id(id).isActive(isActive).execute();

List Axes

List all Axes satisfying query filters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaOrganization;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AxisSectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaOrganization client = new LuccaOrganization(configuration);
    String paging = "100,0"; // {offset},{limit}. Defaults to 0,1000.
    List<Integer> id = Arrays.asList(); // Filter on axes unique identifiers.
    Boolean isActive = true; // Filter on axes active status.
    try {
      AxissectionsListResponse result = client
              .axisSections
              .list(paging)
              .id(id)
              .isActive(isActive)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AxissectionsListResponse> response = client
              .axisSections
              .list(paging)
              .id(id)
              .isActive(isActive)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paging** | **String**| {offset},{limit}. Defaults to 0,1000. | |
| **id** | [**List&lt;Integer&gt;**](Integer.md)| Filter on axes unique identifiers. | [optional] |
| **isActive** | **Boolean**| Filter on axes active status. | [optional] [default to true] |

### Return type

[**AxissectionsListResponse**](AxissectionsListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="list_0"></a>
# **list_0**
> AxissectionsList200Response list_0(paging).axisId(axisId).ownerId(ownerId).active(active).execute();

List AxisSections

List all AxisSections satisfying query filters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaOrganization;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AxisSectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaOrganization client = new LuccaOrganization(configuration);
    String paging = "100,0"; // {offset},{limit}. Defaults to 0,1000.
    List<Integer> axisId = Arrays.asList(); // Filter on the axis it belongs to.
    List<Integer> ownerId = Arrays.asList(); // Filter on the owner managing it.
    Boolean active = true; // Filter on active status.
    try {
      AxissectionsList200Response result = client
              .axisSections
              .list_0(paging)
              .axisId(axisId)
              .ownerId(ownerId)
              .active(active)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#list_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AxissectionsList200Response> response = client
              .axisSections
              .list_0(paging)
              .axisId(axisId)
              .ownerId(ownerId)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#list_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paging** | **String**| {offset},{limit}. Defaults to 0,1000. | |
| **axisId** | [**List&lt;Integer&gt;**](Integer.md)| Filter on the axis it belongs to. | [optional] |
| **ownerId** | [**List&lt;Integer&gt;**](Integer.md)| Filter on the owner managing it. | [optional] |
| **active** | **Boolean**| Filter on active status. | [optional] [default to true] |

### Return type

[**AxissectionsList200Response**](AxissectionsList200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a name="updateById"></a>
# **updateById**
> AxissectionsUpdateByIdResponse updateById(axisSectionId).axisSection(axisSection).execute();

Update an AxisSection by id

Partial or complete update to an existing AxisSection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaOrganization;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AxisSectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaOrganization client = new LuccaOrganization(configuration);
    Integer axisSectionId = 56;
    Object description = null;
    Integer id = 56;
    String name = "name_example";
    URI url = new URI();
    String code = "code_example";
    String multilingualName = "multilingualName_example";
    Object ownerId = null;
    Object startOn = null;
    Object endOn = null;
    Boolean active = true;
    Integer axisId = 56;
    List<AxisSectionTreeless> parentAxisSections = Arrays.asList();
    List<AxisSectionTreeless> childrenAxisSections = Arrays.asList();
    try {
      AxissectionsUpdateByIdResponse result = client
              .axisSections
              .updateById(axisSectionId)
              .description(description)
              .id(id)
              .name(name)
              .url(url)
              .code(code)
              .multilingualName(multilingualName)
              .ownerId(ownerId)
              .startOn(startOn)
              .endOn(endOn)
              .active(active)
              .axisId(axisId)
              .parentAxisSections(parentAxisSections)
              .childrenAxisSections(childrenAxisSections)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AxissectionsUpdateByIdResponse> response = client
              .axisSections
              .updateById(axisSectionId)
              .description(description)
              .id(id)
              .name(name)
              .url(url)
              .code(code)
              .multilingualName(multilingualName)
              .ownerId(ownerId)
              .startOn(startOn)
              .endOn(endOn)
              .active(active)
              .axisId(axisId)
              .parentAxisSections(parentAxisSections)
              .childrenAxisSections(childrenAxisSections)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AxisSectionsApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **axisSectionId** | **Integer**|  | |
| **axisSection** | [**AxisSection**](AxisSection.md)|  | [optional] |

### Return type

[**AxissectionsUpdateByIdResponse**](AxissectionsUpdateByIdResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

