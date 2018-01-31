package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.APIStatus;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TBAApi
 */
public class TBAApiTest {

    private final TBAApi api = new TBAApi();

    
    /**
     * 
     *
     * Returns API status, and TBA status information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        String ifModifiedSince = null;
        // APIStatus response = api.getStatus(ifModifiedSince);

        // TODO: test validations
    }
    
}
