

# Department

Departments, to which users must be attached, are used by the different Lucca solutions for different purposes:  * Define access scopes: for example to restrict the visibility of absences in the Timmi Absences schedule. * Filtering data in a report: our different reports generally allow to filter data according to the legal entity, the SSC, but also the department of the user. * Build the organization chart in Poplee Core HR. The departments are represented as a hierarchical tree with a parent/child relationship.  *NB:* You can have up to 9 levels of departments, and up to 99 departments under a single parent department. However, limiting the number of levels to 7 is recommended.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**code** | **String** |  |  |
|**hierarchy** | **String** | Position of the departement in the hierarchical tree |  [optional] |
|**parentId** | **String** | Position of the parent department in the hierarchical tree |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**position** | **Integer** | Department&#39;s general position in the hierarchy |  [optional] |
|**level** | **Integer** | level of the Department. Deduce from Position. |  [optional] |
|**sortOrder** | **Integer** | Order of the current Department among the children of the Parent Department |  [optional] |
|**headID** | **Integer** | ID of the User who is the head of the department |  [optional] |
|**head** | [**User**](User.md) |  |  [optional] |
|**users** | [**List&lt;User&gt;**](User.md) | Users of the department, including inactive users. |  [optional] |
|**currentUsers** | [**List&lt;User&gt;**](User.md) | Only active users of the department |  [optional] |
|**currentUsersCount** | **Integer** | Number of active users in the department |  [optional] [readonly] |



