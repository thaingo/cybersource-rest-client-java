/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import Model.Body2;
import Model.Body3;
import Model.InlineResponse2016;
import Model.InlineResponse4006;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentInstrumentApi {
    private ApiClient apiClient;

    public PaymentInstrumentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentInstrumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for paymentinstrumentsPost
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param body Please specify the customers payment details for card or bank account. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentinstrumentsPostCall(String profileId, Body2 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/tms/v1/paymentinstruments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (profileId != null)
        localVarHeaderParams.put("profile-id", apiClient.parameterToString(profileId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
        		"application/json"
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

        String[] localVarAuthNames = new String[] {  };
         return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paymentinstrumentsPostValidateBeforeCall(String profileId, Body2 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new ApiException("Missing the required parameter 'profileId' when calling paymentinstrumentsPost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling paymentinstrumentsPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentinstrumentsPostCall(profileId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a Payment Instrument
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param body Please specify the customers payment details for card or bank account. (required)
     * @return InlineResponse2016
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2016 paymentinstrumentsPost(String profileId, Body2 body) throws ApiException {
        ApiResponse<InlineResponse2016> resp = paymentinstrumentsPostWithHttpInfo(profileId, body);
        return resp.getData();
    }

    /**
     * Create a Payment Instrument
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param body Please specify the customers payment details for card or bank account. (required)
     * @return ApiResponse&lt;InlineResponse2016&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2016> paymentinstrumentsPostWithHttpInfo(String profileId, Body2 body) throws ApiException {
        com.squareup.okhttp.Call call = paymentinstrumentsPostValidateBeforeCall(profileId, body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2016>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Payment Instrument (asynchronously)
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param body Please specify the customers payment details for card or bank account. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentinstrumentsPostAsync(String profileId, Body2 body, final ApiCallback<InlineResponse2016> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentinstrumentsPostValidateBeforeCall(profileId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2016>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentinstrumentsTokenIdDelete
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentinstrumentsTokenIdDeleteCall(String profileId, String tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/tms/v1/paymentinstruments/{tokenId}"
            .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (profileId != null)
        localVarHeaderParams.put("profile-id", apiClient.parameterToString(profileId));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paymentinstrumentsTokenIdDeleteValidateBeforeCall(String profileId, String tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new ApiException("Missing the required parameter 'profileId' when calling paymentinstrumentsTokenIdDelete(Async)");
        }
        
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling paymentinstrumentsTokenIdDelete(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentinstrumentsTokenIdDeleteCall(profileId, tokenId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a Payment Instrument
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void paymentinstrumentsTokenIdDelete(String profileId, String tokenId) throws ApiException {
        paymentinstrumentsTokenIdDeleteWithHttpInfo(profileId, tokenId);
    }

    /**
     * Delete a Payment Instrument
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> paymentinstrumentsTokenIdDeleteWithHttpInfo(String profileId, String tokenId) throws ApiException {
        com.squareup.okhttp.Call call = paymentinstrumentsTokenIdDeleteValidateBeforeCall(profileId, tokenId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a Payment Instrument (asynchronously)
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentinstrumentsTokenIdDeleteAsync(String profileId, String tokenId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentinstrumentsTokenIdDeleteValidateBeforeCall(profileId, tokenId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for paymentinstrumentsTokenIdGet
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentinstrumentsTokenIdGetCall(String profileId, String tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/tms/v1/paymentinstruments/{tokenId}"
            .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (profileId != null)
        localVarHeaderParams.put("profile-id", apiClient.parameterToString(profileId));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paymentinstrumentsTokenIdGetValidateBeforeCall(String profileId, String tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new ApiException("Missing the required parameter 'profileId' when calling paymentinstrumentsTokenIdGet(Async)");
        }
        
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling paymentinstrumentsTokenIdGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentinstrumentsTokenIdGetCall(profileId, tokenId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve a Payment Instrument
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @return InlineResponse2016
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2016 paymentinstrumentsTokenIdGet(String profileId, String tokenId) throws ApiException {
        ApiResponse<InlineResponse2016> resp = paymentinstrumentsTokenIdGetWithHttpInfo(profileId, tokenId);
        return resp.getData();
    }

    /**
     * Retrieve a Payment Instrument
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @return ApiResponse&lt;InlineResponse2016&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2016> paymentinstrumentsTokenIdGetWithHttpInfo(String profileId, String tokenId) throws ApiException {
        com.squareup.okhttp.Call call = paymentinstrumentsTokenIdGetValidateBeforeCall(profileId, tokenId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2016>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a Payment Instrument (asynchronously)
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentinstrumentsTokenIdGetAsync(String profileId, String tokenId, final ApiCallback<InlineResponse2016> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentinstrumentsTokenIdGetValidateBeforeCall(profileId, tokenId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2016>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentinstrumentsTokenIdPatch
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @param body Please specify the customers payment details. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentinstrumentsTokenIdPatchCall(String profileId, String tokenId, Body3 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/paymentinstruments/{tokenId}"
            .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (profileId != null)
        localVarHeaderParams.put("profile-id", apiClient.parameterToString(profileId));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paymentinstrumentsTokenIdPatchValidateBeforeCall(String profileId, String tokenId, Body3 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new ApiException("Missing the required parameter 'profileId' when calling paymentinstrumentsTokenIdPatch(Async)");
        }
        
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling paymentinstrumentsTokenIdPatch(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling paymentinstrumentsTokenIdPatch(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentinstrumentsTokenIdPatchCall(profileId, tokenId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a Payment Instrument
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @param body Please specify the customers payment details. (required)
     * @return InlineResponse2016
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2016 paymentinstrumentsTokenIdPatch(String profileId, String tokenId, Body3 body) throws ApiException {
        ApiResponse<InlineResponse2016> resp = paymentinstrumentsTokenIdPatchWithHttpInfo(profileId, tokenId, body);
        return resp.getData();
    }

    /**
     * Update a Payment Instrument
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @param body Please specify the customers payment details. (required)
     * @return ApiResponse&lt;InlineResponse2016&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2016> paymentinstrumentsTokenIdPatchWithHttpInfo(String profileId, String tokenId, Body3 body) throws ApiException {
        com.squareup.okhttp.Call call = paymentinstrumentsTokenIdPatchValidateBeforeCall(profileId, tokenId, body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2016>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a Payment Instrument (asynchronously)
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of a Payment Instrument. (required)
     * @param body Please specify the customers payment details. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentinstrumentsTokenIdPatchAsync(String profileId, String tokenId, Body3 body, final ApiCallback<InlineResponse2016> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentinstrumentsTokenIdPatchValidateBeforeCall(profileId, tokenId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2016>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
