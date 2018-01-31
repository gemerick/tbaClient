
# TeamEventStatusPlayoff

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**level** | [**LevelEnum**](#LevelEnum) | The highest playoff level the team reached. |  [optional]
**currentLevelRecord** | [**DefinitionsWLTRecord**](DefinitionsWLTRecord.md) |  |  [optional]
**record** | [**DefinitionsWLTRecord**](DefinitionsWLTRecord.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current competition status for the playoffs. |  [optional]
**playoffAverage** | **Integer** | The average match score during playoffs. Year specific. May be null if not relevant for a given year. |  [optional]


<a name="LevelEnum"></a>
## Enum: LevelEnum
Name | Value
---- | -----
QM | &quot;qm&quot;
EF | &quot;ef&quot;
QF | &quot;qf&quot;
SF | &quot;sf&quot;
F | &quot;f&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
WON | &quot;won&quot;
ELIMINATED | &quot;eliminated&quot;
PLAYING | &quot;playing&quot;



