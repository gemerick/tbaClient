

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
import io.swagger.client.model.Match;
import io.swagger.client.model.MatchSimple;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchApi {
    private ApiClient apiClient;

    public MatchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MatchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
    /* Build call for getMatch */
    private com.squareup.okhttp.Call getMatchCall(String matchKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'matchKey' is set
        if (matchKey == null) {
            throw new ApiException("Missing the required parameter 'matchKey' when calling getMatch(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/match/{match_key}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "match_key" + "\\}", apiClient.escapeString(matchKey.toString()));

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
     * Gets a &#x60;Match&#x60; object for the given match key.
     * @param matchKey TBA Match Key, eg &#x60;2016nytr_qm1&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return Match
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Match getMatch(String matchKey, String ifModifiedSince) throws ApiException {
        ApiResponse<Match> resp = getMatchWithHttpInfo(matchKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a &#x60;Match&#x60; object for the given match key.
     * @param matchKey TBA Match Key, eg &#x60;2016nytr_qm1&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;Match&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Match> getMatchWithHttpInfo(String matchKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getMatchCall(matchKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Match>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a &#x60;Match&#x60; object for the given match key.
     * @param matchKey TBA Match Key, eg &#x60;2016nytr_qm1&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMatchAsync(String matchKey, String ifModifiedSince, final ApiCallback<Match> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMatchCall(matchKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Match>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMatchSimple */
    private com.squareup.okhttp.Call getMatchSimpleCall(String matchKey, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'matchKey' is set
        if (matchKey == null) {
            throw new ApiException("Missing the required parameter 'matchKey' when calling getMatchSimple(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/match/{match_key}/simple".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "match_key" + "\\}", apiClient.escapeString(matchKey.toString()));

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
     * Gets a short-form &#x60;Match&#x60; object for the given match key.
     * @param matchKey TBA Match Key, eg &#x60;2016nytr_qm1&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return MatchSimple
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MatchSimple getMatchSimple(String matchKey, String ifModifiedSince) throws ApiException {
        ApiResponse<MatchSimple> resp = getMatchSimpleWithHttpInfo(matchKey, ifModifiedSince);
        return resp.getData();
    }

    /**
     * 
     * Gets a short-form &#x60;Match&#x60; object for the given match key.
     * @param matchKey TBA Match Key, eg &#x60;2016nytr_qm1&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;MatchSimple&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MatchSimple> getMatchSimpleWithHttpInfo(String matchKey, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = getMatchSimpleCall(matchKey, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<MatchSimple>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets a short-form &#x60;Match&#x60; object for the given match key.
     * @param matchKey TBA Match Key, eg &#x60;2016nytr_qm1&#x60; (required)
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMatchSimpleAsync(String matchKey, String ifModifiedSince, final ApiCallback<MatchSimple> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMatchSimpleCall(matchKey, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MatchSimple>(){}.getType();
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
}
