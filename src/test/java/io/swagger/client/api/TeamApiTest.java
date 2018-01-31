package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Award;
import java.math.BigDecimal;
import io.swagger.client.model.DistrictRanking;
import io.swagger.client.model.Event;
import io.swagger.client.model.EventSimple;
import io.swagger.client.model.Match;
import io.swagger.client.model.MatchSimple;
import io.swagger.client.model.Media;
import io.swagger.client.model.Team;
import io.swagger.client.model.TeamEventStatus;
import io.swagger.client.model.TeamRobot;
import io.swagger.client.model.TeamSimple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamApi
 */
public class TeamApiTest {

    private final TeamApi api = new TeamApi();

    
    /**
     * 
     *
     * Gets a list of team district rankings for the given district.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictRankingsTest() throws ApiException {
        String districtKey = null;
        String ifModifiedSince = null;
        // List<DistrictRanking> response = api.getDistrictRankings(districtKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictTeamsTest() throws ApiException {
        String districtKey = null;
        String ifModifiedSince = null;
        // List<Team> response = api.getDistrictTeams(districtKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictTeamsKeysTest() throws ApiException {
        String districtKey = null;
        String ifModifiedSince = null;
        // List<String> response = api.getDistrictTeamsKeys(districtKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictTeamsSimpleTest() throws ApiException {
        String districtKey = null;
        String ifModifiedSince = null;
        // List<TeamSimple> response = api.getDistrictTeamsSimple(districtKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of &#x60;Team&#x60; objects that competed in the given event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventTeamsTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // List<Team> response = api.getEventTeams(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of &#x60;Team&#x60; keys that competed in the given event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventTeamsKeysTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // List<String> response = api.getEventTeamsKeys(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a short-form list of &#x60;Team&#x60; objects that competed in the given event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventTeamsSimpleTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // List<TeamSimple> response = api.getEventTeamsSimple(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a &#x60;Team&#x60; object for the team referenced by the given key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamTest() throws ApiException {
        String teamKey = null;
        String ifModifiedSince = null;
        // Team response = api.getTeam(teamKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of awards the given team has won.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamAwardsTest() throws ApiException {
        String teamKey = null;
        String ifModifiedSince = null;
        // List<Award> response = api.getTeamAwards(teamKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of awards the given team has won in a given year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamAwardsByYearTest() throws ApiException {
        String teamKey = null;
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<Award> response = api.getTeamAwardsByYear(teamKey, year, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list or year and district pairs to denote each year the team was in a district. Will return an empty array if the team was never in a district.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamDistrictsTest() throws ApiException {
        String teamKey = null;
        String ifModifiedSince = null;
        // Map<String, String> response = api.getTeamDistricts(teamKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of awards the given team won at the given event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamEventAwardsTest() throws ApiException {
        String teamKey = null;
        String eventKey = null;
        String ifModifiedSince = null;
        // List<Award> response = api.getTeamEventAwards(teamKey, eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of matches for the given team and event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamEventMatchesTest() throws ApiException {
        String teamKey = null;
        String eventKey = null;
        String ifModifiedSince = null;
        // List<Match> response = api.getTeamEventMatches(teamKey, eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of match keys for matches for the given team and event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamEventMatchesKeysTest() throws ApiException {
        String teamKey = null;
        String eventKey = null;
        String ifModifiedSince = null;
        // List<String> response = api.getTeamEventMatchesKeys(teamKey, eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a short-form list of matches for the given team and event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamEventMatchesSimpleTest() throws ApiException {
        String teamKey = null;
        String eventKey = null;
        String ifModifiedSince = null;
        // List<Match> response = api.getTeamEventMatchesSimple(teamKey, eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets the competition rank and status of the team at the given event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamEventStatusTest() throws ApiException {
        String teamKey = null;
        String eventKey = null;
        String ifModifiedSince = null;
        // TeamEventStatus response = api.getTeamEventStatus(teamKey, eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of all events this team has competed at.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamEventsTest() throws ApiException {
        String teamKey = null;
        String ifModifiedSince = null;
        // List<Event> response = api.getTeamEvents(teamKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of events this team has competed at in the given year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamEventsByYearTest() throws ApiException {
        String teamKey = null;
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<Event> response = api.getTeamEventsByYear(teamKey, year, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of the event keys for events this team has competed at in the given year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamEventsByYearKeysTest() throws ApiException {
        String teamKey = null;
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<String> response = api.getTeamEventsByYearKeys(teamKey, year, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a short-form list of events this team has competed at in the given year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamEventsByYearSimpleTest() throws ApiException {
        String teamKey = null;
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<EventSimple> response = api.getTeamEventsByYearSimple(teamKey, year, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of the event keys for all events this team has competed at.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamEventsKeysTest() throws ApiException {
        String teamKey = null;
        String ifModifiedSince = null;
        // List<String> response = api.getTeamEventsKeys(teamKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a short-form list of all events this team has competed at.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamEventsSimpleTest() throws ApiException {
        String teamKey = null;
        String ifModifiedSince = null;
        // List<EventSimple> response = api.getTeamEventsSimple(teamKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of matches for the given team and year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamMatchesByYearTest() throws ApiException {
        String teamKey = null;
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<Match> response = api.getTeamMatchesByYear(teamKey, year, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of match keys for matches for the given team and year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamMatchesByYearKeysTest() throws ApiException {
        String teamKey = null;
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<String> response = api.getTeamMatchesByYearKeys(teamKey, year, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a short-form list of matches for the given team and year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamMatchesByYearSimpleTest() throws ApiException {
        String teamKey = null;
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<MatchSimple> response = api.getTeamMatchesByYearSimple(teamKey, year, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of Media (videos / pictures) for the given team and year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamMediaByYearTest() throws ApiException {
        String teamKey = null;
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<Media> response = api.getTeamMediaByYear(teamKey, year, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of year and robot name pairs for each year that a robot name was provided. Will return an empty array if the team has never named a robot.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamRobotsTest() throws ApiException {
        String teamKey = null;
        String ifModifiedSince = null;
        // Map<String, TeamRobot> response = api.getTeamRobots(teamKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a &#x60;Team_Simple&#x60; object for the team referenced by the given key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamSimpleTest() throws ApiException {
        String teamKey = null;
        String ifModifiedSince = null;
        // TeamSimple response = api.getTeamSimple(teamKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of Media (social media) for the given team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamSocialMediaTest() throws ApiException {
        String teamKey = null;
        String ifModifiedSince = null;
        // List<Media> response = api.getTeamSocialMedia(teamKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of years in which the team participated in at least one competition.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamYearsParticipatedTest() throws ApiException {
        String teamKey = null;
        String ifModifiedSince = null;
        // List<Integer> response = api.getTeamYearsParticipated(teamKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of &#x60;Team&#x60; objects, paginated in groups of 500.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamsTest() throws ApiException {
        BigDecimal pageNum = null;
        String ifModifiedSince = null;
        // List<Team> response = api.getTeams(pageNum, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of &#x60;Team&#x60; objects that competed in the given year, paginated in groups of 500.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamsByYearTest() throws ApiException {
        BigDecimal year = null;
        BigDecimal pageNum = null;
        String ifModifiedSince = null;
        // List<Team> response = api.getTeamsByYear(year, pageNum, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list Team Keys that competed in the given year, paginated in groups of 500.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamsByYearKeysTest() throws ApiException {
        BigDecimal year = null;
        BigDecimal pageNum = null;
        String ifModifiedSince = null;
        // List<String> response = api.getTeamsByYearKeys(year, pageNum, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of short form &#x60;Team_Simple&#x60; objects that competed in the given year, paginated in groups of 500.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamsByYearSimpleTest() throws ApiException {
        BigDecimal year = null;
        BigDecimal pageNum = null;
        String ifModifiedSince = null;
        // List<TeamSimple> response = api.getTeamsByYearSimple(year, pageNum, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamsKeysTest() throws ApiException {
        BigDecimal pageNum = null;
        String ifModifiedSince = null;
        // List<String> response = api.getTeamsKeys(pageNum, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of short form &#x60;Team_Simple&#x60; objects, paginated in groups of 500.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamsSimpleTest() throws ApiException {
        BigDecimal pageNum = null;
        String ifModifiedSince = null;
        // List<TeamSimple> response = api.getTeamsSimple(pageNum, ifModifiedSince);

        // TODO: test validations
    }
    
}
