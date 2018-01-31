

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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamApi {
    private ApiClient apiClient;

    public TeamApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TeamApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getDistrictRankings */
    private com.squareup.okhttp.Call getDistrictRankingsCall(String districtKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'districtKey' is set
        if (districtKey == null) {
            throw new ApiException("Missing the required parameter 'districtKey' when calling getDistrictRankings(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/district/{district_key}/rankings".replaceAll("\\{format\\}","json")
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
     * Gets a list of team district rankings for the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;DistrictRanking&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DistrictRanking> getDistrictRankings(String districtKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<DistrictRanking>> resp = getDistrictRankingsWithHttpInfo(districtKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of team district rankings for the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;DistrictRanking&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DistrictRanking>> getDistrictRankingsWithHttpInfo(String districtKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getDistrictRankingsCall(districtKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<DistrictRanking>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of team district rankings for the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDistrictRankingsAsync(String districtKey, String ifModifiedSince, final ApiCallback<List<DistrictRanking>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDistrictRankingsCall(districtKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DistrictRanking>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getDistrictTeams */
    private com.squareup.okhttp.Call getDistrictTeamsCall(String districtKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'districtKey' is set
        if (districtKey == null) {
            throw new ApiException("Missing the required parameter 'districtKey' when calling getDistrictTeams(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/district/{district_key}/teams".replaceAll("\\{format\\}","json")
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
     * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Team> getDistrictTeams(String districtKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Team>> resp = getDistrictTeamsWithHttpInfo(districtKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Team&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Team>> getDistrictTeamsWithHttpInfo(String districtKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getDistrictTeamsCall(districtKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDistrictTeamsAsync(String districtKey, String ifModifiedSince, final ApiCallback<List<Team>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDistrictTeamsCall(districtKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getDistrictTeamsKeys */
    private com.squareup.okhttp.Call getDistrictTeamsKeysCall(String districtKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'districtKey' is set
        if (districtKey == null) {
            throw new ApiException("Missing the required parameter 'districtKey' when calling getDistrictTeamsKeys(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/district/{district_key}/teams/keys".replaceAll("\\{format\\}","json")
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
     * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getDistrictTeamsKeys(String districtKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<String>> resp = getDistrictTeamsKeysWithHttpInfo(districtKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getDistrictTeamsKeysWithHttpInfo(String districtKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getDistrictTeamsKeysCall(districtKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDistrictTeamsKeysAsync(String districtKey, String ifModifiedSince, final ApiCallback<List<String>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDistrictTeamsKeysCall(districtKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getDistrictTeamsSimple */
    private com.squareup.okhttp.Call getDistrictTeamsSimpleCall(String districtKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'districtKey' is set
        if (districtKey == null) {
            throw new ApiException("Missing the required parameter 'districtKey' when calling getDistrictTeamsSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/district/{district_key}/teams/simple".replaceAll("\\{format\\}","json")
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
     * Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;TeamSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TeamSimple> getDistrictTeamsSimple(String districtKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<TeamSimple>> resp = getDistrictTeamsSimpleWithHttpInfo(districtKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;TeamSimple&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TeamSimple>> getDistrictTeamsSimpleWithHttpInfo(String districtKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getDistrictTeamsSimpleCall(districtKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<TeamSimple>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.
     * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDistrictTeamsSimpleAsync(String districtKey, String ifModifiedSince, final ApiCallback<List<TeamSimple>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDistrictTeamsSimpleCall(districtKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TeamSimple>>(){}.getType();
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
    /* Build call for getTeam */
    private com.squareup.okhttp.Call getTeamCall(String teamKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeam(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}".replaceAll("\\{format\\}","json")
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
     * Gets a &#x60;Team&#x60; object for the team referenced by the given key.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return Team
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Team getTeam(String teamKey, String ifModifiedSince) throws ApiException {
        ApiResponse<Team> resp = getTeamWithHttpInfo(teamKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a &#x60;Team&#x60; object for the team referenced by the given key.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Team> getTeamWithHttpInfo(String teamKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamCall(teamKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a &#x60;Team&#x60; object for the team referenced by the given key.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamAsync(String teamKey, String ifModifiedSince, final ApiCallback<Team> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamCall(teamKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamAwards */
    private com.squareup.okhttp.Call getTeamAwardsCall(String teamKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamAwards(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/awards".replaceAll("\\{format\\}","json")
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
     * Gets a list of awards the given team has won.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Award&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Award> getTeamAwards(String teamKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Award>> resp = getTeamAwardsWithHttpInfo(teamKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of awards the given team has won.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Award&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Award>> getTeamAwardsWithHttpInfo(String teamKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamAwardsCall(teamKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Award>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of awards the given team has won.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamAwardsAsync(String teamKey, String ifModifiedSince, final ApiCallback<List<Award>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamAwardsCall(teamKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Award>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamAwardsByYear */
    private com.squareup.okhttp.Call getTeamAwardsByYearCall(String teamKey, BigDecimal year, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamAwardsByYear(Async)");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getTeamAwardsByYear(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/awards/{year}".replaceAll("\\{format\\}","json")
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
     * Gets a list of awards the given team has won in a given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Award&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Award> getTeamAwardsByYear(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Award>> resp = getTeamAwardsByYearWithHttpInfo(teamKey, year, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of awards the given team has won in a given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Award&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Award>> getTeamAwardsByYearWithHttpInfo(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamAwardsByYearCall(teamKey, year, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Award>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of awards the given team has won in a given year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamAwardsByYearAsync(String teamKey, BigDecimal year, String ifModifiedSince, final ApiCallback<List<Award>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamAwardsByYearCall(teamKey, year, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Award>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamDistricts */
    private com.squareup.okhttp.Call getTeamDistrictsCall(String teamKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamDistricts(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/districts".replaceAll("\\{format\\}","json")
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
     * Gets a list or year and district pairs to denote each year the team was in a district. Will return an empty array if the team was never in a district.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return Map&lt;String, String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Map<String, String> getTeamDistricts(String teamKey, String ifModifiedSince) throws ApiException {
        ApiResponse<Map<String, String>> resp = getTeamDistrictsWithHttpInfo(teamKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list or year and district pairs to denote each year the team was in a district. Will return an empty array if the team was never in a district.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Map<String, String>> getTeamDistrictsWithHttpInfo(String teamKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamDistrictsCall(teamKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Map<String, String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list or year and district pairs to denote each year the team was in a district. Will return an empty array if the team was never in a district.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamDistrictsAsync(String teamKey, String ifModifiedSince, final ApiCallback<Map<String, String>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamDistrictsCall(teamKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Map<String, String>>(){}.getType();
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
    /* Build call for getTeamMatchesByYear */
    private com.squareup.okhttp.Call getTeamMatchesByYearCall(String teamKey, BigDecimal year, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamMatchesByYear(Async)");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getTeamMatchesByYear(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/matches/{year}".replaceAll("\\{format\\}","json")
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
     * Gets a list of matches for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Match&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Match> getTeamMatchesByYear(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Match>> resp = getTeamMatchesByYearWithHttpInfo(teamKey, year, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of matches for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Match&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Match>> getTeamMatchesByYearWithHttpInfo(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamMatchesByYearCall(teamKey, year, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Match>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of matches for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamMatchesByYearAsync(String teamKey, BigDecimal year, String ifModifiedSince, final ApiCallback<List<Match>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamMatchesByYearCall(teamKey, year, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Match>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamMatchesByYearKeys */
    private com.squareup.okhttp.Call getTeamMatchesByYearKeysCall(String teamKey, BigDecimal year, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamMatchesByYearKeys(Async)");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getTeamMatchesByYearKeys(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/matches/{year}/keys".replaceAll("\\{format\\}","json")
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
     * Gets a list of match keys for matches for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getTeamMatchesByYearKeys(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        ApiResponse<List<String>> resp = getTeamMatchesByYearKeysWithHttpInfo(teamKey, year, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of match keys for matches for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getTeamMatchesByYearKeysWithHttpInfo(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamMatchesByYearKeysCall(teamKey, year, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of match keys for matches for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamMatchesByYearKeysAsync(String teamKey, BigDecimal year, String ifModifiedSince, final ApiCallback<List<String>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamMatchesByYearKeysCall(teamKey, year, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamMatchesByYearSimple */
    private com.squareup.okhttp.Call getTeamMatchesByYearSimpleCall(String teamKey, BigDecimal year, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamMatchesByYearSimple(Async)");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getTeamMatchesByYearSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/matches/{year}/simple".replaceAll("\\{format\\}","json")
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
     * Gets a short-form list of matches for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;MatchSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MatchSimple> getTeamMatchesByYearSimple(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        ApiResponse<List<MatchSimple>> resp = getTeamMatchesByYearSimpleWithHttpInfo(teamKey, year, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a short-form list of matches for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;MatchSimple&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MatchSimple>> getTeamMatchesByYearSimpleWithHttpInfo(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamMatchesByYearSimpleCall(teamKey, year, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<MatchSimple>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a short-form list of matches for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamMatchesByYearSimpleAsync(String teamKey, BigDecimal year, String ifModifiedSince, final ApiCallback<List<MatchSimple>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamMatchesByYearSimpleCall(teamKey, year, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MatchSimple>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamMediaByYear */
    private com.squareup.okhttp.Call getTeamMediaByYearCall(String teamKey, BigDecimal year, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamMediaByYear(Async)");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getTeamMediaByYear(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/media/{year}".replaceAll("\\{format\\}","json")
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
     * Gets a list of Media (videos / pictures) for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Media&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Media> getTeamMediaByYear(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Media>> resp = getTeamMediaByYearWithHttpInfo(teamKey, year, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of Media (videos / pictures) for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Media&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Media>> getTeamMediaByYearWithHttpInfo(String teamKey, BigDecimal year, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamMediaByYearCall(teamKey, year, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Media>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of Media (videos / pictures) for the given team and year.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamMediaByYearAsync(String teamKey, BigDecimal year, String ifModifiedSince, final ApiCallback<List<Media>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamMediaByYearCall(teamKey, year, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Media>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamRobots */
    private com.squareup.okhttp.Call getTeamRobotsCall(String teamKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamRobots(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/robots".replaceAll("\\{format\\}","json")
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
     * Gets a list of year and robot name pairs for each year that a robot name was provided. Will return an empty array if the team has never named a robot.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return Map&lt;String, TeamRobot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Map<String, TeamRobot> getTeamRobots(String teamKey, String ifModifiedSince) throws ApiException {
        ApiResponse<Map<String, TeamRobot>> resp = getTeamRobotsWithHttpInfo(teamKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of year and robot name pairs for each year that a robot name was provided. Will return an empty array if the team has never named a robot.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;Map&lt;String, TeamRobot&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Map<String, TeamRobot>> getTeamRobotsWithHttpInfo(String teamKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamRobotsCall(teamKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Map<String, TeamRobot>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of year and robot name pairs for each year that a robot name was provided. Will return an empty array if the team has never named a robot.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamRobotsAsync(String teamKey, String ifModifiedSince, final ApiCallback<Map<String, TeamRobot>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamRobotsCall(teamKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Map<String, TeamRobot>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamSimple */
    private com.squareup.okhttp.Call getTeamSimpleCall(String teamKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/simple".replaceAll("\\{format\\}","json")
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
     * Gets a &#x60;Team_Simple&#x60; object for the team referenced by the given key.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return TeamSimple
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TeamSimple getTeamSimple(String teamKey, String ifModifiedSince) throws ApiException {
        ApiResponse<TeamSimple> resp = getTeamSimpleWithHttpInfo(teamKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a &#x60;Team_Simple&#x60; object for the team referenced by the given key.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;TeamSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TeamSimple> getTeamSimpleWithHttpInfo(String teamKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamSimpleCall(teamKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<TeamSimple>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a &#x60;Team_Simple&#x60; object for the team referenced by the given key.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamSimpleAsync(String teamKey, String ifModifiedSince, final ApiCallback<TeamSimple> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamSimpleCall(teamKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TeamSimple>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamSocialMedia */
    private com.squareup.okhttp.Call getTeamSocialMediaCall(String teamKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamSocialMedia(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/social_media".replaceAll("\\{format\\}","json")
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
     * Gets a list of Media (social media) for the given team.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Media&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Media> getTeamSocialMedia(String teamKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Media>> resp = getTeamSocialMediaWithHttpInfo(teamKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of Media (social media) for the given team.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Media&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Media>> getTeamSocialMediaWithHttpInfo(String teamKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamSocialMediaCall(teamKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Media>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of Media (social media) for the given team.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamSocialMediaAsync(String teamKey, String ifModifiedSince, final ApiCallback<List<Media>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamSocialMediaCall(teamKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Media>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamYearsParticipated */
    private com.squareup.okhttp.Call getTeamYearsParticipatedCall(String teamKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamKey' is set
        if (teamKey == null) {
            throw new ApiException("Missing the required parameter 'teamKey' when calling getTeamYearsParticipated(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/team/{team_key}/years_participated".replaceAll("\\{format\\}","json")
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
     * Gets a list of years in which the team participated in at least one competition.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getTeamYearsParticipated(String teamKey, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Integer>> resp = getTeamYearsParticipatedWithHttpInfo(teamKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of years in which the team participated in at least one competition.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getTeamYearsParticipatedWithHttpInfo(String teamKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamYearsParticipatedCall(teamKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of years in which the team participated in at least one competition.
     * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamYearsParticipatedAsync(String teamKey, String ifModifiedSince, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamYearsParticipatedCall(teamKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeams */
    private com.squareup.okhttp.Call getTeamsCall(BigDecimal pageNum, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pageNum' is set
        if (pageNum == null) {
            throw new ApiException("Missing the required parameter 'pageNum' when calling getTeams(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/teams/{page_num}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "page_num" + "\\}", apiClient.escapeString(pageNum.toString()));

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
     * Gets a list of &#x60;Team&#x60; objects, paginated in groups of 500.
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Team> getTeams(BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Team>> resp = getTeamsWithHttpInfo(pageNum, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of &#x60;Team&#x60; objects, paginated in groups of 500.
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Team&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Team>> getTeamsWithHttpInfo(BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamsCall(pageNum, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of &#x60;Team&#x60; objects, paginated in groups of 500.
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamsAsync(BigDecimal pageNum, String ifModifiedSince, final ApiCallback<List<Team>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamsCall(pageNum, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamsByYear */
    private com.squareup.okhttp.Call getTeamsByYearCall(BigDecimal year, BigDecimal pageNum, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getTeamsByYear(Async)");
        }
        
        // verify the required parameter 'pageNum' is set
        if (pageNum == null) {
            throw new ApiException("Missing the required parameter 'pageNum' when calling getTeamsByYear(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/teams/{year}/{page_num}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "year" + "\\}", apiClient.escapeString(year.toString()))
        .replaceAll("\\{" + "page_num" + "\\}", apiClient.escapeString(pageNum.toString()));

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
     * Gets a list of &#x60;Team&#x60; objects that competed in the given year, paginated in groups of 500.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Team> getTeamsByYear(BigDecimal year, BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        ApiResponse<List<Team>> resp = getTeamsByYearWithHttpInfo(year, pageNum, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of &#x60;Team&#x60; objects that competed in the given year, paginated in groups of 500.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;Team&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Team>> getTeamsByYearWithHttpInfo(BigDecimal year, BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamsByYearCall(year, pageNum, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of &#x60;Team&#x60; objects that competed in the given year, paginated in groups of 500.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamsByYearAsync(BigDecimal year, BigDecimal pageNum, String ifModifiedSince, final ApiCallback<List<Team>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamsByYearCall(year, pageNum, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamsByYearKeys */
    private com.squareup.okhttp.Call getTeamsByYearKeysCall(BigDecimal year, BigDecimal pageNum, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getTeamsByYearKeys(Async)");
        }
        
        // verify the required parameter 'pageNum' is set
        if (pageNum == null) {
            throw new ApiException("Missing the required parameter 'pageNum' when calling getTeamsByYearKeys(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/teams/{year}/{page_num}/keys".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "year" + "\\}", apiClient.escapeString(year.toString()))
        .replaceAll("\\{" + "page_num" + "\\}", apiClient.escapeString(pageNum.toString()));

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
     * Gets a list Team Keys that competed in the given year, paginated in groups of 500.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getTeamsByYearKeys(BigDecimal year, BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        ApiResponse<List<String>> resp = getTeamsByYearKeysWithHttpInfo(year, pageNum, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list Team Keys that competed in the given year, paginated in groups of 500.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getTeamsByYearKeysWithHttpInfo(BigDecimal year, BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamsByYearKeysCall(year, pageNum, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list Team Keys that competed in the given year, paginated in groups of 500.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamsByYearKeysAsync(BigDecimal year, BigDecimal pageNum, String ifModifiedSince, final ApiCallback<List<String>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamsByYearKeysCall(year, pageNum, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamsByYearSimple */
    private com.squareup.okhttp.Call getTeamsByYearSimpleCall(BigDecimal year, BigDecimal pageNum, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getTeamsByYearSimple(Async)");
        }
        
        // verify the required parameter 'pageNum' is set
        if (pageNum == null) {
            throw new ApiException("Missing the required parameter 'pageNum' when calling getTeamsByYearSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/teams/{year}/{page_num}/simple".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "year" + "\\}", apiClient.escapeString(year.toString()))
        .replaceAll("\\{" + "page_num" + "\\}", apiClient.escapeString(pageNum.toString()));

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
     * Gets a list of short form &#x60;Team_Simple&#x60; objects that competed in the given year, paginated in groups of 500.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;TeamSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TeamSimple> getTeamsByYearSimple(BigDecimal year, BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        ApiResponse<List<TeamSimple>> resp = getTeamsByYearSimpleWithHttpInfo(year, pageNum, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of short form &#x60;Team_Simple&#x60; objects that competed in the given year, paginated in groups of 500.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;TeamSimple&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TeamSimple>> getTeamsByYearSimpleWithHttpInfo(BigDecimal year, BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamsByYearSimpleCall(year, pageNum, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<TeamSimple>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of short form &#x60;Team_Simple&#x60; objects that competed in the given year, paginated in groups of 500.
     * @param year Competition Year (or Season). Must be 4 digits. (required)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamsByYearSimpleAsync(BigDecimal year, BigDecimal pageNum, String ifModifiedSince, final ApiCallback<List<TeamSimple>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamsByYearSimpleCall(year, pageNum, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TeamSimple>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamsKeys */
    private com.squareup.okhttp.Call getTeamsKeysCall(BigDecimal pageNum, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pageNum' is set
        if (pageNum == null) {
            throw new ApiException("Missing the required parameter 'pageNum' when calling getTeamsKeys(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/teams/{page_num}/keys".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "page_num" + "\\}", apiClient.escapeString(pageNum.toString()));

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
     * Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getTeamsKeys(BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        ApiResponse<List<String>> resp = getTeamsKeysWithHttpInfo(pageNum, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getTeamsKeysWithHttpInfo(BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamsKeysCall(pageNum, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamsKeysAsync(BigDecimal pageNum, String ifModifiedSince, final ApiCallback<List<String>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamsKeysCall(pageNum, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamsSimple */
    private com.squareup.okhttp.Call getTeamsSimpleCall(BigDecimal pageNum, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pageNum' is set
        if (pageNum == null) {
            throw new ApiException("Missing the required parameter 'pageNum' when calling getTeamsSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/teams/{page_num}/simple".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "page_num" + "\\}", apiClient.escapeString(pageNum.toString()));

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
     * Gets a list of short form &#x60;Team_Simple&#x60; objects, paginated in groups of 500.
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return List&lt;TeamSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TeamSimple> getTeamsSimple(BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        ApiResponse<List<TeamSimple>> resp = getTeamsSimpleWithHttpInfo(pageNum, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a list of short form &#x60;Team_Simple&#x60; objects, paginated in groups of 500.
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;List&lt;TeamSimple&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TeamSimple>> getTeamsSimpleWithHttpInfo(BigDecimal pageNum, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getTeamsSimpleCall(pageNum, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<List<TeamSimple>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a list of short form &#x60;Team_Simple&#x60; objects, paginated in groups of 500.
     * @param pageNum Page number of results to return, zero-indexed (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamsSimpleAsync(BigDecimal pageNum, String ifModifiedSince, final ApiCallback<List<TeamSimple>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamsSimpleCall(pageNum, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TeamSimple>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
