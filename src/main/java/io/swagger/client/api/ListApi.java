

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

import java.math.BigDecimal;
import io.swagger.client.model.DistrictRanking;
import io.swagger.client.model.Event;
import io.swagger.client.model.EventSimple;
import io.swagger.client.model.Team;
import io.swagger.client.model.TeamSimple;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListApi {
    private ApiClient apiClient;

    public ListApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ListApi(ApiClient apiClient) {
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
