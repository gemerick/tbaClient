
# APIStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentSeason** | **Integer** | Year of the current FRC season. | 
**maxSeason** | **Integer** | Maximum FRC season year for valid queries. | 
**isDatafeedDown** | **Boolean** | True if the entire FMS API provided by FIRST is down. | 
**downEvents** | **List&lt;String&gt;** | An array of strings containing event keys of any active events that are no longer updating. | 
**ios** | [**APIStatusAppVersion**](APIStatusAppVersion.md) |  | 
**android** | [**APIStatusAppVersion**](APIStatusAppVersion.md) |  | 



