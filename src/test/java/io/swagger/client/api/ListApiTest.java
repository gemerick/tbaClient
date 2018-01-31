package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.math.BigDecimal;
import io.swagger.client.model.DistrictRanking;
import io.swagger.client.model.Event;
import io.swagger.client.model.EventSimple;
import io.swagger.client.model.Team;
import io.swagger.client.model.TeamSimple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ListApi
 */
public class ListApiTest {

    private final ListApi api = new ListApi();

    
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
