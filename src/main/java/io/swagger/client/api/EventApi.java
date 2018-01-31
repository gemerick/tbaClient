

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventApi {
    private ApiClient apiClient;

    public EventApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getDistrictEvents */
    private com.squareup.okhttp.Call getDistrictEventsCall(String districtKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'districtKey' is set
        if (districtKey == null) {
            throw new ApiException("Missing the required parameter 'districtKey' when calling getDistrictEvents(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/district/{district_key}/events".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "district_key" + "\\}", apiClient.escapeString(districtKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Event&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Event> getDistrictEvents(String districtKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Event>> resp = getDistrictEventsWithHttpInfo(districtKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Event&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Event>> getDistrictEventsWithHttpInfo(String districtKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getDistrictEventsCall(districtKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDistrictEventsAsync(String districtKey, String ifModifiedSince, final ApiCallback<List<Event>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDistrictEventsCall(districtKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getDistrictEventsKeys */
    private com.squareup.okhttp.Call getDistrictEventsKeysCall(String districtKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'districtKey' is set
        if (districtKey == null) {
            throw new ApiException("Missing the required parameter 'districtKey' when calling getDistrictEventsKeys(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/district/{district_key}/events/keys".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "district_key" + "\\}", apiClient.escapeString(districtKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of event keys for events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getDistrictEventsKeys(String districtKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<String>> resp = getDistrictEventsKeysWithHttpInfo(districtKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of event keys for events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getDistrictEventsKeysWithHttpInfo(String districtKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getDistrictEventsKeysCall(districtKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of event keys for events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDistrictEventsKeysAsync(String districtKey, String ifModifiedSince, final ApiCallback<List<String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDistrictEventsKeysCall(districtKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getDistrictEventsSimple */
    private com.squareup.okhttp.Call getDistrictEventsSimpleCall(String districtKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'districtKey' is set
        if (districtKey == null) {
            throw new ApiException("Missing the required parameter 'districtKey' when calling getDistrictEventsSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/district/{district_key}/events/simple".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "district_key" + "\\}", apiClient.escapeString(districtKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a short-form list of events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;EventSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EventSimple> getDistrictEventsSimple(String districtKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<EventSimple>> resp = getDistrictEventsSimpleWithHttpInfo(districtKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a short-form list of events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;EventSimple&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EventSimple>> getDistrictEventsSimpleWithHttpInfo(String districtKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getDistrictEventsSimpleCall(districtKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<EventSimple>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a short-form list of events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDistrictEventsSimpleAsync(String districtKey, String ifModifiedSince, final ApiCallback<List<EventSimple>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDistrictEventsSimpleCall(districtKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EventSimple>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEvent */
    private com.squareup.okhttp.Call getEventCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEvent(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets an Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return Event
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Event getEvent(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<Event> resp = getEventWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets an Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;Event&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Event> getEventWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets an Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventAsync(String eventKey, String ifModifiedSince, final ApiCallback<Event> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventAlliances */
    private com.squareup.okhttp.Call getEventAlliancesCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventAlliances(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/alliances".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of Elimination Alliances for the given Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;EliminationAlliance&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EliminationAlliance> getEventAlliances(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<EliminationAlliance>> resp = getEventAlliancesWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of Elimination Alliances for the given Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;EliminationAlliance&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EliminationAlliance>> getEventAlliancesWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventAlliancesCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<EliminationAlliance>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of Elimination Alliances for the given Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventAlliancesAsync(String eventKey, String ifModifiedSince, final ApiCallback<List<EliminationAlliance>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventAlliancesCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EliminationAlliance>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventAwards */
    private com.squareup.okhttp.Call getEventAwardsCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventAwards(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/awards".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of awards from the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Award&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Award> getEventAwards(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Award>> resp = getEventAwardsWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of awards from the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Award&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Award>> getEventAwardsWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventAwardsCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Award>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of awards from the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventAwardsAsync(String eventKey, String ifModifiedSince, final ApiCallback<List<Award>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventAwardsCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Award>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventDistrictPoints */
    private com.squareup.okhttp.Call getEventDistrictPointsCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventDistrictPoints(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/district_points".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of team rankings for the Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return EventDistrictPoints
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventDistrictPoints getEventDistrictPoints(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<EventDistrictPoints> resp = getEventDistrictPointsWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of team rankings for the Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;EventDistrictPoints&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EventDistrictPoints> getEventDistrictPointsWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventDistrictPointsCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<EventDistrictPoints>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of team rankings for the Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventDistrictPointsAsync(String eventKey, String ifModifiedSince, final ApiCallback<EventDistrictPoints> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventDistrictPointsCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EventDistrictPoints>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventInsights */
    private com.squareup.okhttp.Call getEventInsightsCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventInsights(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/insights".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a set of Event-specific insights for the given Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object getEventInsights(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<Object> resp = getEventInsightsWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a set of Event-specific insights for the given Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> getEventInsightsWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventInsightsCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a set of Event-specific insights for the given Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventInsightsAsync(String eventKey, String ifModifiedSince, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventInsightsCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventMatches */
    private com.squareup.okhttp.Call getEventMatchesCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventMatches(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/matches".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of matches for the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Match&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Match> getEventMatches(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Match>> resp = getEventMatchesWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of matches for the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Match&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Match>> getEventMatchesWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventMatchesCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Match>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of matches for the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventMatchesAsync(String eventKey, String ifModifiedSince, final ApiCallback<List<Match>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventMatchesCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Match>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventMatchesKeys */
    private com.squareup.okhttp.Call getEventMatchesKeysCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventMatchesKeys(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/matches/keys".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of match keys for the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getEventMatchesKeys(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<String>> resp = getEventMatchesKeysWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of match keys for the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getEventMatchesKeysWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventMatchesKeysCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of match keys for the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventMatchesKeysAsync(String eventKey, String ifModifiedSince, final ApiCallback<List<String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventMatchesKeysCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventMatchesSimple */
    private com.squareup.okhttp.Call getEventMatchesSimpleCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventMatchesSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/matches/simple".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a short-form list of matches for the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;MatchSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MatchSimple> getEventMatchesSimple(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<MatchSimple>> resp = getEventMatchesSimpleWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a short-form list of matches for the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;MatchSimple&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MatchSimple>> getEventMatchesSimpleWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventMatchesSimpleCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<MatchSimple>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a short-form list of matches for the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventMatchesSimpleAsync(String eventKey, String ifModifiedSince, final ApiCallback<List<MatchSimple>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventMatchesSimpleCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MatchSimple>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventOPRs */
    private com.squareup.okhttp.Call getEventOPRsCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventOPRs(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/oprs".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a set of Event OPRs (including OPR, DPR, and CCWM) for the given Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return EventOPRs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventOPRs getEventOPRs(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<EventOPRs> resp = getEventOPRsWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a set of Event OPRs (including OPR, DPR, and CCWM) for the given Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;EventOPRs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EventOPRs> getEventOPRsWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventOPRsCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<EventOPRs>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a set of Event OPRs (including OPR, DPR, and CCWM) for the given Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventOPRsAsync(String eventKey, String ifModifiedSince, final ApiCallback<EventOPRs> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventOPRsCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EventOPRs>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventPredictions */
    private com.squareup.okhttp.Call getEventPredictionsCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventPredictions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/predictions".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets information on TBA-generated predictions for the given Event. Contains year-specific information. *WARNING* This endpoint is currently under development and may change at any time.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return EventPredictions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventPredictions getEventPredictions(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<EventPredictions> resp = getEventPredictionsWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets information on TBA-generated predictions for the given Event. Contains year-specific information. *WARNING* This endpoint is currently under development and may change at any time.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;EventPredictions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EventPredictions> getEventPredictionsWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventPredictionsCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<EventPredictions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets information on TBA-generated predictions for the given Event. Contains year-specific information. *WARNING* This endpoint is currently under development and may change at any time.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventPredictionsAsync(String eventKey, String ifModifiedSince, final ApiCallback<EventPredictions> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventPredictionsCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EventPredictions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventRankings */
    private com.squareup.okhttp.Call getEventRankingsCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventRankings(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/rankings".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of team rankings for the Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return EventRanking
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventRanking getEventRankings(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<EventRanking> resp = getEventRankingsWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of team rankings for the Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;EventRanking&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EventRanking> getEventRankingsWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventRankingsCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<EventRanking>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of team rankings for the Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventRankingsAsync(String eventKey, String ifModifiedSince, final ApiCallback<EventRanking> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventRankingsCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EventRanking>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventSimple */
    private com.squareup.okhttp.Call getEventSimpleCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/simple".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a short-form Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return EventSimple
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventSimple getEventSimple(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<EventSimple> resp = getEventSimpleWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a short-form Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;EventSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EventSimple> getEventSimpleWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventSimpleCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<EventSimple>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a short-form Event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventSimpleAsync(String eventKey, String ifModifiedSince, final ApiCallback<EventSimple> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventSimpleCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EventSimple>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventTeams */
    private com.squareup.okhttp.Call getEventTeamsCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventTeams(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/teams".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of &#x60;Team&#x60; objects that competed in the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Team> getEventTeams(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Team>> resp = getEventTeamsWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of &#x60;Team&#x60; objects that competed in the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Team&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Team>> getEventTeamsWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventTeamsCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of &#x60;Team&#x60; objects that competed in the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventTeamsAsync(String eventKey, String ifModifiedSince, final ApiCallback<List<Team>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventTeamsCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventTeamsKeys */
    private com.squareup.okhttp.Call getEventTeamsKeysCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventTeamsKeys(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/teams/keys".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of &#x60;Team&#x60; keys that competed in the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getEventTeamsKeys(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<String>> resp = getEventTeamsKeysWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of &#x60;Team&#x60; keys that competed in the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getEventTeamsKeysWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventTeamsKeysCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of &#x60;Team&#x60; keys that competed in the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventTeamsKeysAsync(String eventKey, String ifModifiedSince, final ApiCallback<List<String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventTeamsKeysCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventTeamsSimple */
    private com.squareup.okhttp.Call getEventTeamsSimpleCall(String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getEventTeamsSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/event/{event_key}/teams/simple".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a short-form list of &#x60;Team&#x60; objects that competed in the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;TeamSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TeamSimple> getEventTeamsSimple(String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<TeamSimple>> resp = getEventTeamsSimpleWithHttpInfo(eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a short-form list of &#x60;Team&#x60; objects that competed in the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;TeamSimple&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TeamSimple>> getEventTeamsSimpleWithHttpInfo(String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventTeamsSimpleCall(eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<TeamSimple>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a short-form list of &#x60;Team&#x60; objects that competed in the given event.
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventTeamsSimpleAsync(String eventKey, String ifModifiedSince, final ApiCallback<List<TeamSimple>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventTeamsSimpleCall(eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TeamSimple>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventsByYear */
    private com.squareup.okhttp.Call getEventsByYearCall(BigDecimal year, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getEventsByYear(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/events/{year}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "year" + "\\}", apiClient.escapeString(year.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of events in the given year.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Event&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Event> getEventsByYear(BigDecimal year, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Event>> resp = getEventsByYearWithHttpInfo(year, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of events in the given year.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Event&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Event>> getEventsByYearWithHttpInfo(BigDecimal year, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventsByYearCall(year, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of events in the given year.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventsByYearAsync(BigDecimal year, String ifModifiedSince, final ApiCallback<List<Event>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventsByYearCall(year, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventsByYearKeys */
    private com.squareup.okhttp.Call getEventsByYearKeysCall(BigDecimal year, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getEventsByYearKeys(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/events/{year}/keys".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "year" + "\\}", apiClient.escapeString(year.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of event keys in the given year.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getEventsByYearKeys(BigDecimal year, String ifModifiedSince) throws ApiException {
        ApiResponse<List<String>> resp = getEventsByYearKeysWithHttpInfo(year, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of event keys in the given year.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getEventsByYearKeysWithHttpInfo(BigDecimal year, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventsByYearKeysCall(year, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of event keys in the given year.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventsByYearKeysAsync(BigDecimal year, String ifModifiedSince, final ApiCallback<List<String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventsByYearKeysCall(year, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventsByYearSimple */
    private com.squareup.okhttp.Call getEventsByYearSimpleCall(BigDecimal year, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getEventsByYearSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/events/{year}/simple".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "year" + "\\}", apiClient.escapeString(year.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a short-form list of events in the given year.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;EventSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EventSimple> getEventsByYearSimple(BigDecimal year, String ifModifiedSince) throws ApiException {
        ApiResponse<List<EventSimple>> resp = getEventsByYearSimpleWithHttpInfo(year, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a short-form list of events in the given year.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;EventSimple&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EventSimple>> getEventsByYearSimpleWithHttpInfo(BigDecimal year, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getEventsByYearSimpleCall(year, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<EventSimple>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a short-form list of events in the given year.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventsByYearSimpleAsync(BigDecimal year, String ifModifiedSince, final ApiCallback<List<EventSimple>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventsByYearSimpleCall(year, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EventSimple>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamEventAwards */
    private com.squareup.okhttp.Call getTeamEventAwardsCall(String teamKey, String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamEventAwards(Async)");
        }
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getTeamEventAwards(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/event/{event_key}/awards".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "team_key" + "\\}", apiClient.escapeString(teamKey.toString()))
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of awards the given team won at the given event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Award&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Award> getTeamEventAwards(String teamKey, String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Award>> resp = getTeamEventAwardsWithHttpInfo(teamKey, eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of awards the given team won at the given event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Award&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Award>> getTeamEventAwardsWithHttpInfo(String teamKey, String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamEventAwardsCall(teamKey, eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Award>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of awards the given team won at the given event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamEventAwardsAsync(String teamKey, String eventKey, String ifModifiedSince, final ApiCallback<List<Award>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTeamEventAwardsCall(teamKey, eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Award>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamEventMatches */
    private com.squareup.okhttp.Call getTeamEventMatchesCall(String teamKey, String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamEventMatches(Async)");
        }
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getTeamEventMatches(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/event/{event_key}/matches".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "team_key" + "\\}", apiClient.escapeString(teamKey.toString()))
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of matches for the given team and event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Match&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Match> getTeamEventMatches(String teamKey, String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Match>> resp = getTeamEventMatchesWithHttpInfo(teamKey, eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of matches for the given team and event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Match&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Match>> getTeamEventMatchesWithHttpInfo(String teamKey, String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamEventMatchesCall(teamKey, eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Match>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of matches for the given team and event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamEventMatchesAsync(String teamKey, String eventKey, String ifModifiedSince, final ApiCallback<List<Match>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTeamEventMatchesCall(teamKey, eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Match>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamEventMatchesKeys */
    private com.squareup.okhttp.Call getTeamEventMatchesKeysCall(String teamKey, String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamEventMatchesKeys(Async)");
        }
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getTeamEventMatchesKeys(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/event/{event_key}/matches/keys".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "team_key" + "\\}", apiClient.escapeString(teamKey.toString()))
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of match keys for matches for the given team and event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getTeamEventMatchesKeys(String teamKey, String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<String>> resp = getTeamEventMatchesKeysWithHttpInfo(teamKey, eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of match keys for matches for the given team and event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getTeamEventMatchesKeysWithHttpInfo(String teamKey, String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamEventMatchesKeysCall(teamKey, eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of match keys for matches for the given team and event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamEventMatchesKeysAsync(String teamKey, String eventKey, String ifModifiedSince, final ApiCallback<List<String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTeamEventMatchesKeysCall(teamKey, eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamEventMatchesSimple */
    private com.squareup.okhttp.Call getTeamEventMatchesSimpleCall(String teamKey, String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamEventMatchesSimple(Async)");
        }
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getTeamEventMatchesSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/event/{event_key}/matches/simple".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "team_key" + "\\}", apiClient.escapeString(teamKey.toString()))
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a short-form list of matches for the given team and event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Match&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Match> getTeamEventMatchesSimple(String teamKey, String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Match>> resp = getTeamEventMatchesSimpleWithHttpInfo(teamKey, eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a short-form list of matches for the given team and event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Match&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Match>> getTeamEventMatchesSimpleWithHttpInfo(String teamKey, String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamEventMatchesSimpleCall(teamKey, eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Match>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a short-form list of matches for the given team and event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamEventMatchesSimpleAsync(String teamKey, String eventKey, String ifModifiedSince, final ApiCallback<List<Match>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTeamEventMatchesSimpleCall(teamKey, eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Match>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamEventStatus */
    private com.squareup.okhttp.Call getTeamEventStatusCall(String teamKey, String eventKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamEventStatus(Async)");
        }
        
        // verify the required parameter 'eventKey' is set
        if (eventKey == null) {
            throw new ApiException("Missing the required parameter 'eventKey' when calling getTeamEventStatus(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/event/{event_key}/status".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "team_key" + "\\}", apiClient.escapeString(teamKey.toString()))
        .replaceAll("\\{" + "event_key" + "\\}", apiClient.escapeString(eventKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets the competition rank and status of the team at the given event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return TeamEventStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TeamEventStatus getTeamEventStatus(String teamKey, String eventKey, String ifModifiedSince) throws ApiException {
        ApiResponse<TeamEventStatus> resp = getTeamEventStatusWithHttpInfo(teamKey, eventKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets the competition rank and status of the team at the given event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;TeamEventStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TeamEventStatus> getTeamEventStatusWithHttpInfo(String teamKey, String eventKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamEventStatusCall(teamKey, eventKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<TeamEventStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets the competition rank and status of the team at the given event.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamEventStatusAsync(String teamKey, String eventKey, String ifModifiedSince, final ApiCallback<TeamEventStatus> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTeamEventStatusCall(teamKey, eventKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TeamEventStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamEvents */
    private com.squareup.okhttp.Call getTeamEventsCall(String teamKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamEvents(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/events".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "team_key" + "\\}", apiClient.escapeString(teamKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of all events this team has competed at.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Event&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Event> getTeamEvents(String teamKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Event>> resp = getTeamEventsWithHttpInfo(teamKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of all events this team has competed at.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Event&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Event>> getTeamEventsWithHttpInfo(String teamKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamEventsCall(teamKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of all events this team has competed at.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamEventsAsync(String teamKey, String ifModifiedSince, final ApiCallback<List<Event>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTeamEventsCall(teamKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamEventsByYear */
    private com.squareup.okhttp.Call getTeamEventsByYearCall(String teamKey, BigDecimal year, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamEventsByYear(Async)");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getTeamEventsByYear(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/events/{year}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "team_key" + "\\}", apiClient.escapeString(teamKey.toString()))
        .replaceAll("\\{" + "year" + "\\}", apiClient.escapeString(year.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of events this team has competed at in the given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Event&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Event> getTeamEventsByYear(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Event>> resp = getTeamEventsByYearWithHttpInfo(teamKey, year, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of events this team has competed at in the given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Event&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Event>> getTeamEventsByYearWithHttpInfo(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamEventsByYearCall(teamKey, year, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of events this team has competed at in the given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamEventsByYearAsync(String teamKey, BigDecimal year, String ifModifiedSince, final ApiCallback<List<Event>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTeamEventsByYearCall(teamKey, year, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamEventsByYearKeys */
    private com.squareup.okhttp.Call getTeamEventsByYearKeysCall(String teamKey, BigDecimal year, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamEventsByYearKeys(Async)");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getTeamEventsByYearKeys(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/events/{year}/keys".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "team_key" + "\\}", apiClient.escapeString(teamKey.toString()))
        .replaceAll("\\{" + "year" + "\\}", apiClient.escapeString(year.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of the event keys for events this team has competed at in the given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getTeamEventsByYearKeys(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        ApiResponse<List<String>> resp = getTeamEventsByYearKeysWithHttpInfo(teamKey, year, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of the event keys for events this team has competed at in the given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getTeamEventsByYearKeysWithHttpInfo(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamEventsByYearKeysCall(teamKey, year, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of the event keys for events this team has competed at in the given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamEventsByYearKeysAsync(String teamKey, BigDecimal year, String ifModifiedSince, final ApiCallback<List<String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTeamEventsByYearKeysCall(teamKey, year, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamEventsByYearSimple */
    private com.squareup.okhttp.Call getTeamEventsByYearSimpleCall(String teamKey, BigDecimal year, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamEventsByYearSimple(Async)");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getTeamEventsByYearSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/events/{year}/simple".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "team_key" + "\\}", apiClient.escapeString(teamKey.toString()))
        .replaceAll("\\{" + "year" + "\\}", apiClient.escapeString(year.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a short-form list of events this team has competed at in the given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;EventSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EventSimple> getTeamEventsByYearSimple(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        ApiResponse<List<EventSimple>> resp = getTeamEventsByYearSimpleWithHttpInfo(teamKey, year, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a short-form list of events this team has competed at in the given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;EventSimple&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EventSimple>> getTeamEventsByYearSimpleWithHttpInfo(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamEventsByYearSimpleCall(teamKey, year, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<EventSimple>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a short-form list of events this team has competed at in the given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamEventsByYearSimpleAsync(String teamKey, BigDecimal year, String ifModifiedSince, final ApiCallback<List<EventSimple>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTeamEventsByYearSimpleCall(teamKey, year, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EventSimple>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamEventsKeys */
    private com.squareup.okhttp.Call getTeamEventsKeysCall(String teamKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamEventsKeys(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/events/keys".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "team_key" + "\\}", apiClient.escapeString(teamKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a list of the event keys for all events this team has competed at.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getTeamEventsKeys(String teamKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<String>> resp = getTeamEventsKeysWithHttpInfo(teamKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of the event keys for all events this team has competed at.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getTeamEventsKeysWithHttpInfo(String teamKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamEventsKeysCall(teamKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of the event keys for all events this team has competed at.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamEventsKeysAsync(String teamKey, String ifModifiedSince, final ApiCallback<List<String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTeamEventsKeysCall(teamKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamEventsSimple */
    private com.squareup.okhttp.Call getTeamEventsSimpleCall(String teamKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamEventsSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/events/simple".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "team_key" + "\\}", apiClient.escapeString(teamKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Gets a short-form list of all events this team has competed at.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;EventSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EventSimple> getTeamEventsSimple(String teamKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<EventSimple>> resp = getTeamEventsSimpleWithHttpInfo(teamKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a short-form list of all events this team has competed at.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;EventSimple&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EventSimple>> getTeamEventsSimpleWithHttpInfo(String teamKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamEventsSimpleCall(teamKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<EventSimple>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a short-form list of all events this team has competed at.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamEventsSimpleAsync(String teamKey, String ifModifiedSince, final ApiCallback<List<EventSimple>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTeamEventsSimpleCall(teamKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EventSimple>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
