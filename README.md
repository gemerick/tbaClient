# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DistrictApi;

import java.io.File;
import java.util.*;

public class DistrictApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        DistrictApi apiInstance = new DistrictApi();
        String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
        String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
        try {
            List<Event> result = apiInstance.getDistrictEvents(districtKey, ifModifiedSince);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DistrictApi#getDistrictEvents");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DistrictApi* | [**getDistrictEvents**](docs/DistrictApi.md#getDistrictEvents) | **GET** /district/{district_key}/events | 
*DistrictApi* | [**getDistrictEventsKeys**](docs/DistrictApi.md#getDistrictEventsKeys) | **GET** /district/{district_key}/events/keys | 
*DistrictApi* | [**getDistrictEventsSimple**](docs/DistrictApi.md#getDistrictEventsSimple) | **GET** /district/{district_key}/events/simple | 
*DistrictApi* | [**getDistrictRankings**](docs/DistrictApi.md#getDistrictRankings) | **GET** /district/{district_key}/rankings | 
*DistrictApi* | [**getDistrictTeams**](docs/DistrictApi.md#getDistrictTeams) | **GET** /district/{district_key}/teams | 
*DistrictApi* | [**getDistrictTeamsKeys**](docs/DistrictApi.md#getDistrictTeamsKeys) | **GET** /district/{district_key}/teams/keys | 
*DistrictApi* | [**getDistrictTeamsSimple**](docs/DistrictApi.md#getDistrictTeamsSimple) | **GET** /district/{district_key}/teams/simple | 
*DistrictApi* | [**getDistrictsByYear**](docs/DistrictApi.md#getDistrictsByYear) | **GET** /districts/{year} | 
*DistrictApi* | [**getEventDistrictPoints**](docs/DistrictApi.md#getEventDistrictPoints) | **GET** /event/{event_key}/district_points | 
*DistrictApi* | [**getTeamDistricts**](docs/DistrictApi.md#getTeamDistricts) | **GET** /team/{team_key}/districts | 
*EventApi* | [**getDistrictEvents**](docs/EventApi.md#getDistrictEvents) | **GET** /district/{district_key}/events | 
*EventApi* | [**getDistrictEventsKeys**](docs/EventApi.md#getDistrictEventsKeys) | **GET** /district/{district_key}/events/keys | 
*EventApi* | [**getDistrictEventsSimple**](docs/EventApi.md#getDistrictEventsSimple) | **GET** /district/{district_key}/events/simple | 
*EventApi* | [**getEvent**](docs/EventApi.md#getEvent) | **GET** /event/{event_key} | 
*EventApi* | [**getEventAlliances**](docs/EventApi.md#getEventAlliances) | **GET** /event/{event_key}/alliances | 
*EventApi* | [**getEventAwards**](docs/EventApi.md#getEventAwards) | **GET** /event/{event_key}/awards | 
*EventApi* | [**getEventDistrictPoints**](docs/EventApi.md#getEventDistrictPoints) | **GET** /event/{event_key}/district_points | 
*EventApi* | [**getEventInsights**](docs/EventApi.md#getEventInsights) | **GET** /event/{event_key}/insights | 
*EventApi* | [**getEventMatches**](docs/EventApi.md#getEventMatches) | **GET** /event/{event_key}/matches | 
*EventApi* | [**getEventMatchesKeys**](docs/EventApi.md#getEventMatchesKeys) | **GET** /event/{event_key}/matches/keys | 
*EventApi* | [**getEventMatchesSimple**](docs/EventApi.md#getEventMatchesSimple) | **GET** /event/{event_key}/matches/simple | 
*EventApi* | [**getEventOPRs**](docs/EventApi.md#getEventOPRs) | **GET** /event/{event_key}/oprs | 
*EventApi* | [**getEventPredictions**](docs/EventApi.md#getEventPredictions) | **GET** /event/{event_key}/predictions | 
*EventApi* | [**getEventRankings**](docs/EventApi.md#getEventRankings) | **GET** /event/{event_key}/rankings | 
*EventApi* | [**getEventSimple**](docs/EventApi.md#getEventSimple) | **GET** /event/{event_key}/simple | 
*EventApi* | [**getEventTeams**](docs/EventApi.md#getEventTeams) | **GET** /event/{event_key}/teams | 
*EventApi* | [**getEventTeamsKeys**](docs/EventApi.md#getEventTeamsKeys) | **GET** /event/{event_key}/teams/keys | 
*EventApi* | [**getEventTeamsSimple**](docs/EventApi.md#getEventTeamsSimple) | **GET** /event/{event_key}/teams/simple | 
*EventApi* | [**getEventsByYear**](docs/EventApi.md#getEventsByYear) | **GET** /events/{year} | 
*EventApi* | [**getEventsByYearKeys**](docs/EventApi.md#getEventsByYearKeys) | **GET** /events/{year}/keys | 
*EventApi* | [**getEventsByYearSimple**](docs/EventApi.md#getEventsByYearSimple) | **GET** /events/{year}/simple | 
*EventApi* | [**getTeamEventAwards**](docs/EventApi.md#getTeamEventAwards) | **GET** /team/{team_key}/event/{event_key}/awards | 
*EventApi* | [**getTeamEventMatches**](docs/EventApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
*EventApi* | [**getTeamEventMatchesKeys**](docs/EventApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
*EventApi* | [**getTeamEventMatchesSimple**](docs/EventApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
*EventApi* | [**getTeamEventStatus**](docs/EventApi.md#getTeamEventStatus) | **GET** /team/{team_key}/event/{event_key}/status | 
*EventApi* | [**getTeamEvents**](docs/EventApi.md#getTeamEvents) | **GET** /team/{team_key}/events | 
*EventApi* | [**getTeamEventsByYear**](docs/EventApi.md#getTeamEventsByYear) | **GET** /team/{team_key}/events/{year} | 
*EventApi* | [**getTeamEventsByYearKeys**](docs/EventApi.md#getTeamEventsByYearKeys) | **GET** /team/{team_key}/events/{year}/keys | 
*EventApi* | [**getTeamEventsByYearSimple**](docs/EventApi.md#getTeamEventsByYearSimple) | **GET** /team/{team_key}/events/{year}/simple | 
*EventApi* | [**getTeamEventsKeys**](docs/EventApi.md#getTeamEventsKeys) | **GET** /team/{team_key}/events/keys | 
*EventApi* | [**getTeamEventsSimple**](docs/EventApi.md#getTeamEventsSimple) | **GET** /team/{team_key}/events/simple | 
*ListApi* | [**getDistrictEvents**](docs/ListApi.md#getDistrictEvents) | **GET** /district/{district_key}/events | 
*ListApi* | [**getDistrictEventsKeys**](docs/ListApi.md#getDistrictEventsKeys) | **GET** /district/{district_key}/events/keys | 
*ListApi* | [**getDistrictEventsSimple**](docs/ListApi.md#getDistrictEventsSimple) | **GET** /district/{district_key}/events/simple | 
*ListApi* | [**getDistrictRankings**](docs/ListApi.md#getDistrictRankings) | **GET** /district/{district_key}/rankings | 
*ListApi* | [**getDistrictTeams**](docs/ListApi.md#getDistrictTeams) | **GET** /district/{district_key}/teams | 
*ListApi* | [**getDistrictTeamsKeys**](docs/ListApi.md#getDistrictTeamsKeys) | **GET** /district/{district_key}/teams/keys | 
*ListApi* | [**getDistrictTeamsSimple**](docs/ListApi.md#getDistrictTeamsSimple) | **GET** /district/{district_key}/teams/simple | 
*ListApi* | [**getEventTeams**](docs/ListApi.md#getEventTeams) | **GET** /event/{event_key}/teams | 
*ListApi* | [**getEventTeamsKeys**](docs/ListApi.md#getEventTeamsKeys) | **GET** /event/{event_key}/teams/keys | 
*ListApi* | [**getEventTeamsSimple**](docs/ListApi.md#getEventTeamsSimple) | **GET** /event/{event_key}/teams/simple | 
*ListApi* | [**getEventsByYear**](docs/ListApi.md#getEventsByYear) | **GET** /events/{year} | 
*ListApi* | [**getEventsByYearKeys**](docs/ListApi.md#getEventsByYearKeys) | **GET** /events/{year}/keys | 
*ListApi* | [**getEventsByYearSimple**](docs/ListApi.md#getEventsByYearSimple) | **GET** /events/{year}/simple | 
*ListApi* | [**getTeams**](docs/ListApi.md#getTeams) | **GET** /teams/{page_num} | 
*ListApi* | [**getTeamsByYear**](docs/ListApi.md#getTeamsByYear) | **GET** /teams/{year}/{page_num} | 
*ListApi* | [**getTeamsByYearKeys**](docs/ListApi.md#getTeamsByYearKeys) | **GET** /teams/{year}/{page_num}/keys | 
*ListApi* | [**getTeamsByYearSimple**](docs/ListApi.md#getTeamsByYearSimple) | **GET** /teams/{year}/{page_num}/simple | 
*ListApi* | [**getTeamsKeys**](docs/ListApi.md#getTeamsKeys) | **GET** /teams/{page_num}/keys | 
*ListApi* | [**getTeamsSimple**](docs/ListApi.md#getTeamsSimple) | **GET** /teams/{page_num}/simple | 
*MatchApi* | [**getEventMatches**](docs/MatchApi.md#getEventMatches) | **GET** /event/{event_key}/matches | 
*MatchApi* | [**getEventMatchesKeys**](docs/MatchApi.md#getEventMatchesKeys) | **GET** /event/{event_key}/matches/keys | 
*MatchApi* | [**getEventMatchesSimple**](docs/MatchApi.md#getEventMatchesSimple) | **GET** /event/{event_key}/matches/simple | 
*MatchApi* | [**getMatch**](docs/MatchApi.md#getMatch) | **GET** /match/{match_key} | 
*MatchApi* | [**getMatchSimple**](docs/MatchApi.md#getMatchSimple) | **GET** /match/{match_key}/simple | 
*MatchApi* | [**getTeamEventMatches**](docs/MatchApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
*MatchApi* | [**getTeamEventMatchesKeys**](docs/MatchApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
*MatchApi* | [**getTeamEventMatchesSimple**](docs/MatchApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
*MatchApi* | [**getTeamMatchesByYear**](docs/MatchApi.md#getTeamMatchesByYear) | **GET** /team/{team_key}/matches/{year} | 
*MatchApi* | [**getTeamMatchesByYearKeys**](docs/MatchApi.md#getTeamMatchesByYearKeys) | **GET** /team/{team_key}/matches/{year}/keys | 
*MatchApi* | [**getTeamMatchesByYearSimple**](docs/MatchApi.md#getTeamMatchesByYearSimple) | **GET** /team/{team_key}/matches/{year}/simple | 
*TBAApi* | [**getStatus**](docs/TBAApi.md#getStatus) | **GET** /status | 
*TeamApi* | [**getDistrictRankings**](docs/TeamApi.md#getDistrictRankings) | **GET** /district/{district_key}/rankings | 
*TeamApi* | [**getDistrictTeams**](docs/TeamApi.md#getDistrictTeams) | **GET** /district/{district_key}/teams | 
*TeamApi* | [**getDistrictTeamsKeys**](docs/TeamApi.md#getDistrictTeamsKeys) | **GET** /district/{district_key}/teams/keys | 
*TeamApi* | [**getDistrictTeamsSimple**](docs/TeamApi.md#getDistrictTeamsSimple) | **GET** /district/{district_key}/teams/simple | 
*TeamApi* | [**getEventTeams**](docs/TeamApi.md#getEventTeams) | **GET** /event/{event_key}/teams | 
*TeamApi* | [**getEventTeamsKeys**](docs/TeamApi.md#getEventTeamsKeys) | **GET** /event/{event_key}/teams/keys | 
*TeamApi* | [**getEventTeamsSimple**](docs/TeamApi.md#getEventTeamsSimple) | **GET** /event/{event_key}/teams/simple | 
*TeamApi* | [**getTeam**](docs/TeamApi.md#getTeam) | **GET** /team/{team_key} | 
*TeamApi* | [**getTeamAwards**](docs/TeamApi.md#getTeamAwards) | **GET** /team/{team_key}/awards | 
*TeamApi* | [**getTeamAwardsByYear**](docs/TeamApi.md#getTeamAwardsByYear) | **GET** /team/{team_key}/awards/{year} | 
*TeamApi* | [**getTeamDistricts**](docs/TeamApi.md#getTeamDistricts) | **GET** /team/{team_key}/districts | 
*TeamApi* | [**getTeamEventAwards**](docs/TeamApi.md#getTeamEventAwards) | **GET** /team/{team_key}/event/{event_key}/awards | 
*TeamApi* | [**getTeamEventMatches**](docs/TeamApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
*TeamApi* | [**getTeamEventMatchesKeys**](docs/TeamApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
*TeamApi* | [**getTeamEventMatchesSimple**](docs/TeamApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
*TeamApi* | [**getTeamEventStatus**](docs/TeamApi.md#getTeamEventStatus) | **GET** /team/{team_key}/event/{event_key}/status | 
*TeamApi* | [**getTeamEvents**](docs/TeamApi.md#getTeamEvents) | **GET** /team/{team_key}/events | 
*TeamApi* | [**getTeamEventsByYear**](docs/TeamApi.md#getTeamEventsByYear) | **GET** /team/{team_key}/events/{year} | 
*TeamApi* | [**getTeamEventsByYearKeys**](docs/TeamApi.md#getTeamEventsByYearKeys) | **GET** /team/{team_key}/events/{year}/keys | 
*TeamApi* | [**getTeamEventsByYearSimple**](docs/TeamApi.md#getTeamEventsByYearSimple) | **GET** /team/{team_key}/events/{year}/simple | 
*TeamApi* | [**getTeamEventsKeys**](docs/TeamApi.md#getTeamEventsKeys) | **GET** /team/{team_key}/events/keys | 
*TeamApi* | [**getTeamEventsSimple**](docs/TeamApi.md#getTeamEventsSimple) | **GET** /team/{team_key}/events/simple | 
*TeamApi* | [**getTeamMatchesByYear**](docs/TeamApi.md#getTeamMatchesByYear) | **GET** /team/{team_key}/matches/{year} | 
*TeamApi* | [**getTeamMatchesByYearKeys**](docs/TeamApi.md#getTeamMatchesByYearKeys) | **GET** /team/{team_key}/matches/{year}/keys | 
*TeamApi* | [**getTeamMatchesByYearSimple**](docs/TeamApi.md#getTeamMatchesByYearSimple) | **GET** /team/{team_key}/matches/{year}/simple | 
*TeamApi* | [**getTeamMediaByYear**](docs/TeamApi.md#getTeamMediaByYear) | **GET** /team/{team_key}/media/{year} | 
*TeamApi* | [**getTeamRobots**](docs/TeamApi.md#getTeamRobots) | **GET** /team/{team_key}/robots | 
*TeamApi* | [**getTeamSimple**](docs/TeamApi.md#getTeamSimple) | **GET** /team/{team_key}/simple | 
*TeamApi* | [**getTeamSocialMedia**](docs/TeamApi.md#getTeamSocialMedia) | **GET** /team/{team_key}/social_media | 
*TeamApi* | [**getTeamYearsParticipated**](docs/TeamApi.md#getTeamYearsParticipated) | **GET** /team/{team_key}/years_participated | 
*TeamApi* | [**getTeams**](docs/TeamApi.md#getTeams) | **GET** /teams/{page_num} | 
*TeamApi* | [**getTeamsByYear**](docs/TeamApi.md#getTeamsByYear) | **GET** /teams/{year}/{page_num} | 
*TeamApi* | [**getTeamsByYearKeys**](docs/TeamApi.md#getTeamsByYearKeys) | **GET** /teams/{year}/{page_num}/keys | 
*TeamApi* | [**getTeamsByYearSimple**](docs/TeamApi.md#getTeamsByYearSimple) | **GET** /teams/{year}/{page_num}/simple | 
*TeamApi* | [**getTeamsKeys**](docs/TeamApi.md#getTeamsKeys) | **GET** /teams/{page_num}/keys | 
*TeamApi* | [**getTeamsSimple**](docs/TeamApi.md#getTeamsSimple) | **GET** /teams/{page_num}/simple | 


## Documentation for Models

 - [APIStatus](docs/APIStatus.md)
 - [APIStatusAppVersion](docs/APIStatusAppVersion.md)
 - [Award](docs/Award.md)
 - [AwardRecipient](docs/AwardRecipient.md)
 - [DistrictList](docs/DistrictList.md)
 - [DistrictRanking](docs/DistrictRanking.md)
 - [DistrictRankingEventPoints](docs/DistrictRankingEventPoints.md)
 - [EliminationAlliance](docs/EliminationAlliance.md)
 - [EliminationAllianceBackup](docs/EliminationAllianceBackup.md)
 - [EliminationAllianceStatus](docs/EliminationAllianceStatus.md)
 - [Event](docs/Event.md)
 - [EventDistrictPoints](docs/EventDistrictPoints.md)
 - [EventDistrictPointsPoints](docs/EventDistrictPointsPoints.md)
 - [EventDistrictPointsTiebreakers](docs/EventDistrictPointsTiebreakers.md)
 - [EventInsights2016](docs/EventInsights2016.md)
 - [EventInsights2016Detail](docs/EventInsights2016Detail.md)
 - [EventInsights2017](docs/EventInsights2017.md)
 - [EventInsights2017Detail](docs/EventInsights2017Detail.md)
 - [EventOPRs](docs/EventOPRs.md)
 - [EventPredictions](docs/EventPredictions.md)
 - [EventRanking](docs/EventRanking.md)
 - [EventRankingRankings](docs/EventRankingRankings.md)
 - [EventRankingSortOrderInfo](docs/EventRankingSortOrderInfo.md)
 - [EventSimple](docs/EventSimple.md)
 - [Match](docs/Match.md)
 - [MatchAlliance](docs/MatchAlliance.md)
 - [MatchScoreBreakdown2015](docs/MatchScoreBreakdown2015.md)
 - [MatchScoreBreakdown2015Alliance](docs/MatchScoreBreakdown2015Alliance.md)
 - [MatchScoreBreakdown2016](docs/MatchScoreBreakdown2016.md)
 - [MatchScoreBreakdown2016Alliance](docs/MatchScoreBreakdown2016Alliance.md)
 - [MatchScoreBreakdown2017](docs/MatchScoreBreakdown2017.md)
 - [MatchScoreBreakdown2017Alliance](docs/MatchScoreBreakdown2017Alliance.md)
 - [MatchSimple](docs/MatchSimple.md)
 - [MatchSimpleAlliances](docs/MatchSimpleAlliances.md)
 - [Media](docs/Media.md)
 - [Team](docs/Team.md)
 - [TeamEventStatus](docs/TeamEventStatus.md)
 - [TeamEventStatusAlliance](docs/TeamEventStatusAlliance.md)
 - [TeamEventStatusAllianceBackup](docs/TeamEventStatusAllianceBackup.md)
 - [TeamEventStatusPlayoff](docs/TeamEventStatusPlayoff.md)
 - [TeamEventStatusRank](docs/TeamEventStatusRank.md)
 - [TeamEventStatusRankRanking](docs/TeamEventStatusRankRanking.md)
 - [TeamEventStatusRankSortOrderInfo](docs/TeamEventStatusRankSortOrderInfo.md)
 - [TeamRobot](docs/TeamRobot.md)
 - [TeamSimple](docs/TeamSimple.md)
 - [WLTRecord](docs/WLTRecord.md)
 - [Webcast](docs/Webcast.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKey

- **Type**: API key
- **API key parameter name**: X-TBA-Auth-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



