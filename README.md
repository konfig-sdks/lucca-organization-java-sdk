<div align="left">

[![Visit Lucca](./header.png)](https://lucca-hr.com)

# [Lucca](https://lucca-hr.com)

Welcome on the documentation for the Organization Structure API


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Lucca&serviceName=Organization&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>lucca-organization-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:lucca-organization-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lucca-organization-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://example.ilucca.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AxisSectionsApi* | [**createNewAxisSection**](docs/AxisSectionsApi.md#createNewAxisSection) | **POST** /api/v3/axisSections | Create a new AxisSection
*AxisSectionsApi* | [**deleteById**](docs/AxisSectionsApi.md#deleteById) | **DELETE** /api/v3/axisSections/{axisSectionId} | Delete an AxisSection by id
*AxisSectionsApi* | [**getById**](docs/AxisSectionsApi.md#getById) | **GET** /api/v3/axisSections/{axisSectionId} | Get an AxisSection by id
*AxisSectionsApi* | [**list**](docs/AxisSectionsApi.md#list) | **GET** /api/v3/axes | List Axes
*AxisSectionsApi* | [**list_0**](docs/AxisSectionsApi.md#list_0) | **GET** /api/v3/axisSections | List AxisSections
*AxisSectionsApi* | [**updateById**](docs/AxisSectionsApi.md#updateById) | **PUT** /api/v3/axisSections/{axisSectionId} | Update an AxisSection by id
*DepartmentsApi* | [**getAll**](docs/DepartmentsApi.md#getAll) | **GET** /api/v3/departments | List Departments
*DepartmentsApi* | [**getById**](docs/DepartmentsApi.md#getById) | **GET** /api/v3/departments/{departmentId} | Get Departement by id
*DepartmentsApi* | [**listTree**](docs/DepartmentsApi.md#listTree) | **GET** /api/v3/departments/tree | List Departements as a tree


## Documentation for Models

 - [Axis](docs/Axis.md)
 - [AxisAllOf](docs/AxisAllOf.md)
 - [AxisSection](docs/AxisSection.md)
 - [AxisSectionAllOf](docs/AxisSectionAllOf.md)
 - [AxisSectionTreeless](docs/AxisSectionTreeless.md)
 - [AxisTreeless](docs/AxisTreeless.md)
 - [AxissectionsCreateNewAxisSectionResponse](docs/AxissectionsCreateNewAxisSectionResponse.md)
 - [AxissectionsGetByIdResponse](docs/AxissectionsGetByIdResponse.md)
 - [AxissectionsList200Response](docs/AxissectionsList200Response.md)
 - [AxissectionsList200ResponseData](docs/AxissectionsList200ResponseData.md)
 - [AxissectionsListResponse](docs/AxissectionsListResponse.md)
 - [AxissectionsListResponseData](docs/AxissectionsListResponseData.md)
 - [AxissectionsUpdateByIdResponse](docs/AxissectionsUpdateByIdResponse.md)
 - [Department](docs/Department.md)
 - [DepartmentTreeNode](docs/DepartmentTreeNode.md)
 - [DepartmentTreeNodeNode](docs/DepartmentTreeNodeNode.md)
 - [DepartmentsGetAllResponse](docs/DepartmentsGetAllResponse.md)
 - [DepartmentsGetAllResponseData](docs/DepartmentsGetAllResponseData.md)
 - [DepartmentsGetByIdResponse](docs/DepartmentsGetByIdResponse.md)
 - [DepartmentsListTreeResponse](docs/DepartmentsListTreeResponse.md)
 - [DepartmentsListTreeResponseData](docs/DepartmentsListTreeResponseData.md)
 - [User](docs/User.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
