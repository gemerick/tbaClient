
# Webcast

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of webcast, typically descriptive of the streaming provider. | 
**channel** | **String** | Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe. | 
**file** | **String** | File identification as may be required for some types. May be null. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
YOUTUBE | &quot;youtube&quot;
TWITCH | &quot;twitch&quot;
USTREAM | &quot;ustream&quot;
IFRAME | &quot;iframe&quot;
HTML5 | &quot;html5&quot;
RTMP | &quot;rtmp&quot;
LIVESTREAM | &quot;livestream&quot;



