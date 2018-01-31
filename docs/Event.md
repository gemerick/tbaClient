
# Event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event. | 
**name** | **String** | Official name of event on record either provided by FIRST or organizers of offseason event. | 
**eventCode** | **String** | Event short code, as provided by FIRST. | 
**eventType** | **Integer** | Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2 | 
**district** | [**DistrictList**](DistrictList.md) | The district this event is in, may be null. |  [optional]
**city** | **String** | City, town, village, etc. the event is located in. |  [optional]
**stateProv** | **String** | State or Province the event is located in. |  [optional]
**country** | **String** | Country the event is located in. |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) | Event start date in &#x60;yyyy-mm-dd&#x60; format. | 
**endDate** | [**LocalDate**](LocalDate.md) | Event end date in &#x60;yyyy-mm-dd&#x60; format. | 
**year** | **Integer** | Year the event data is for. | 
**shortName** | **String** | Same as &#x60;name&#x60; but doesn&#39;t include event specifiers, such as &#39;Regional&#39; or &#39;District&#39;. May be null. |  [optional]
**eventTypeString** | **String** | Event Type, eg Regional, District, or Offseason. | 
**week** | **Integer** | Week of the competition season this event is in. |  [optional]
**address** | **String** | Address of the event&#39;s venue, if available. |  [optional]
**postalCode** | **String** | Postal code from the event address. |  [optional]
**gmapsPlaceId** | **String** | Google Maps Place ID for the event address. |  [optional]
**gmapsUrl** | **String** | Link to address location on Google Maps. |  [optional]
**lat** | **Double** | Latitude for the event address. |  [optional]
**lng** | **Double** | Longitude for the event address. |  [optional]
**locationName** | **String** | Name of the location at the address for the event, eg. Blue Alliance High School. |  [optional]
**timezone** | **String** | Timezone name. |  [optional]
**website** | **String** | The event&#39;s website, if any. |  [optional]
**firstEventId** | **Integer** | The FIRST internal Event ID, used to link to the event on the FRC webpage. |  [optional]
**webcasts** | [**List&lt;Webcast&gt;**](Webcast.md) |  |  [optional]
**divisionKeys** | **List&lt;String&gt;** | An array of event keys for the divisions at this event. |  [optional]
**parentEventKey** | **String** | The TBA Event key that represents the event&#39;s parent. Used to link back to the event from a division event. It is also the inverse relation of &#x60;divison_keys&#x60;. |  [optional]
**playoffType** | **Integer** | Playoff Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/playoff_type.py#L4, or null. |  [optional]
**playoffTypeString** | **String** | String representation of the &#x60;playoff_type&#x60;, or null. |  [optional]



