package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Award;
import java.math.BigDecimal;
import io.swagger.client.model.EliminationAlliance;
import io.swagger.client.model.Event;
import io.swagger.client.model.EventDistrictPoints;
import io.swagger.client.model.EventOPRs;
import io.swagger.client.model.EventPredictions;
import io.swagger.client.model.EventRanking;
import io.swagger.client.model.EventSimple;
import io.swagger.client.model.Match;
import io.swagger.client.model.MatchSimple;
import io.swagger.client.model.Team;
import io.swagger.client.model.TeamEventStatus;
import io.swagger.client.model.TeamSimple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventApi
 */
public class EventApiTest {

    private final EventApi api = new EventApi();

    
    /**
     * 
     *
     * Gets a list of events in the given district.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictEventsTest() throws ApiException {
        String districtKey = null;
        String ifModifiedSince = null;
        // List<Event> response = api.getDistrictEvents(districtKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of event keys for events in the given district.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictEventsKeysTest() throws ApiException {
        String districtKey = null;
        String ifModifiedSince = null;
        // List<String> response = api.getDistrictEventsKeys(districtKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a short-form list of events in the given district.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictEventsSimpleTest() throws ApiException {
        String districtKey = null;
        String ifModifiedSince = null;
        // List<EventSimple> response = api.getDistrictEventsSimple(districtKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets an Event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // Event response = api.getEvent(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of Elimination Alliances for the given Event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventAlliancesTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // List<EliminationAlliance> response = api.getEventAlliances(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of awards from the given event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventAwardsTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // List<Award> response = api.getEventAwards(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of team rankings for the Event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventDistrictPointsTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // EventDistrictPoints response = api.getEventDistrictPoints(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a set of Event-specific insights for the given Event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventInsightsTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // Object response = api.getEventInsights(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of matches for the given event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventMatchesTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // List<Match> response = api.getEventMatches(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of match keys for the given event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventMatchesKeysTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // List<String> response = api.getEventMatchesKeys(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a short-form list of matches for the given event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventMatchesSimpleTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // List<MatchSimple> response = api.getEventMatchesSimple(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a set of Event OPRs (including OPR, DPR, and CCWM) for the given Event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventOPRsTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // EventOPRs response = api.getEventOPRs(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets information on TBA-generated predictions for the given Event. Contains year-specific information. *WARNING* This endpoint is currently under development and may change at any time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventPredictionsTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // EventPredictions response = api.getEventPredictions(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of team rankings for the Event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventRankingsTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // EventRanking response = api.getEventRankings(eventKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a short-form Event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventSimpleTest() throws ApiException {
        String eventKey = null;
        String ifModifiedSince = null;
        // EventSimple response = api.getEventSimple(eventKey, ifModifiedSince);

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
     * Gets a list of events in the given year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsByYearTest() throws ApiException {
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<Event> response = api.getEventsByYear(year, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of event keys in the given year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsByYearKeysTest() throws ApiException {
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<String> response = api.getEventsByYearKeys(year, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a short-form list of events in the given year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsByYearSimpleTest() throws ApiException {
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<EventSimple> response = api.getEventsByYearSimple(year, ifModifiedSince);

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
    
}
