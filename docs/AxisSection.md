

# AxisSection

## Introduction  In some application contexts, resources can be attached to analytical items. In most cases, the goal is to answer the needs of cost accounting. Axes are primarily used by Timmi Timesheet & Cleemy Expenses.  Both in Timmi Timesheet and Cleemy Expense, users can enter their working hours or expenses spent on projects, tasks, work sites, cost centers, etc... These are the `AxisSection[]`, categorized in `Axis[]`. These axes can have parent-children relationships, and their axis-sections as well.  ![axis-section-diagram.png](https://stoplight.io/api/v1/projects/cHJqOjEwNjgxNg/images/y74HUrks5dQ)  ## Example  Let's take an example. Say you expect your users to enter spent working hours on each project. Each project belongs to a single client, and is divided into tasks.  In other words:  - Clients   - (1..n) Projects: each project belongs to one, and one only, client.     - (n..n) Tasks: each task belongs to one or more project(s).   Then: - Each client is an `AxisSection` in the \"Clients\" `Axis`. - One client has zero or more projects, which are `AxisSection[]` in the \"Projects\" `Axis`. A project is child to one and only one client. - One project has zero or more tasks, which are `AxisSection[]` in the \"Tasks\" `Axis`. Each task axis-section is child to one or more project(s) axis-sections.  The JSON representation of these axes in the API would be:  ```json // GET /api/v3/axes HTTP/1.1 {   \"data\": {     \"items\": [       {         \"id\": 1,         \"name\": \"Clients\",         \"parentAxisId\": null,         \"isNNRelation\": false       },       {         \"id\": 2,         \"name\": \"Projects\",         \"parentAxisId\": 1,         \"isNNRelation\": false       },       {         \"id\": 3,         \"name\": \"Tasks\",         \"parentAxisId\": 2,         \"isNNRelation\": true       }     ]   } } ```  Regarding axis-sections:  ```json // GET /api/v3/axisSections HTTP/1.1 {   \"data\": {     \"items\": [       {         \"id\": 1,         \"name\": \"Acme Corporation\",         \"axis\": {           \"id\": 1,           \"name\": \"Clients\",           \"parentAxisId\": null,           \"isNNRelation\": false         },         \"parentAxisSections\": []       },       {         \"id\": 2,         \"name\": \"My awesome project\",         \"axis\": {           \"id\": 2,           \"name\": \"Projects\",           \"parentAxisId\": 1,           \"isNNRelation\": false         },         \"parentAxisSections\": [           {             \"id\": 1,             \"axisId\": 1           }         ]       },       {         \"id\": 3,         \"name\": \"My #2 project\",         \"axis\": {           \"id\": 2,           \"name\": \"Projects\",           \"parentAxisId\": 1,           \"isNNRelation\": false         },         \"parentAxisSections\": [           {             \"id\": 1,             \"axisId\": 1           }         ]       },       {         \"id\": 4,         \"name\": \"User tests\",         \"axis\": {           \"id\": 3,           \"name\": \"Tasks\",           \"parentAxisId\": 2,           \"isNNRelation\": true         },         \"parentAxisSections\": [           {             \"id\": 2,             \"axisId\": 2           },           {             \"id\": 3,             \"axisId\": 2           }         ]       }     ]   } } ``` ## Fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **Object** |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**name** | **String** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**code** | **String** |  |  |
|**multilingualName** | **String** |  |  |
|**ownerId** | **Object** |  |  [optional] |
|**startOn** | **Object** |  |  [optional] [readonly] |
|**endOn** | **Object** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**axisId** | **Integer** |  |  |
|**parentAxisSections** | [**List&lt;AxisSectionTreeless&gt;**](AxisSectionTreeless.md) |  |  [optional] |
|**childrenAxisSections** | [**List&lt;AxisSectionTreeless&gt;**](AxisSectionTreeless.md) |  |  [optional] |



