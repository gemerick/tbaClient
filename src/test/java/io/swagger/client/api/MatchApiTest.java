package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.math.BigDecimal;
import io.swagger.client.model.Match;
import io.swagger.client.model.MatchSimple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MatchApi
 */
public class MatchApiTest {

    private final MatchApi api = new MatchApi();

    
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
     * Gets a &#x60;Match&#x60; object for the given match key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMatchTest() throws ApiException {
        String matchKey = null;
        String ifModifiedSince = null;
        // Match response = api.getMatch(matchKey, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a short-form &#x60;Match&#x60; object for the given match key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMatchSimpleTest() throws ApiException {
        String matchKey = null;
        String ifModifiedSince = null;
        // MatchSimple response = api.getMatchSimple(matchKey, ifModifiedSince);

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
    
}
