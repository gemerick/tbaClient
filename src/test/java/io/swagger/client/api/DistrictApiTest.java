package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.math.BigDecimal;
import io.swagger.client.model.DistrictList;
import io.swagger.client.model.DistrictRanking;
import io.swagger.client.model.Event;
import io.swagger.client.model.EventDistrictPoints;
import io.swagger.client.model.EventSimple;
import io.swagger.client.model.Team;
import io.swagger.client.model.TeamSimple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DistrictApi
 */
public class DistrictApiTest {

    private final DistrictApi api = new DistrictApi();

    
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
     * Gets a list of districts and their corresponding district key, for the given year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictsByYearTest() throws ApiException {
        BigDecimal year = null;
        String ifModifiedSince = null;
        // List<DistrictList> response = api.getDistrictsByYear(year, ifModifiedSince);

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
    
}
