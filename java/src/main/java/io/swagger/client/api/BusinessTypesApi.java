/*
 * UserManagementAPI
 * API for user management
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@naqdina.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

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


import io.swagger.client.model.BusinessTypeNotFoundResp;
import io.swagger.client.model.BusinessTypeReq;
import io.swagger.client.model.BusinessTypeResp;
import io.swagger.client.model.CommonErrorResp;
import io.swagger.client.model.InlineResponse2002;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessTypesApi {
    private ApiClient apiClient;

    public BusinessTypesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BusinessTypesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for businessTypesBusinessTypeIdDelete
     * @param businessTypeId Business Type ID (required)
     * @param adminId Admin user ID who delete the business type (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call businessTypesBusinessTypeIdDeleteCall(Long businessTypeId, Integer adminId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/business-types/{businessTypeId}"
            .replaceAll("\\{" + "businessTypeId" + "\\}", apiClient.escapeString(businessTypeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (adminId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("adminId", adminId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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

        String[] localVarAuthNames = new String[] { "application" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call businessTypesBusinessTypeIdDeleteValidateBeforeCall(Long businessTypeId, Integer adminId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'businessTypeId' is set
        if (businessTypeId == null) {
            throw new ApiException("Missing the required parameter 'businessTypeId' when calling businessTypesBusinessTypeIdDelete(Async)");
        }
        // verify the required parameter 'adminId' is set
        if (adminId == null) {
            throw new ApiException("Missing the required parameter 'adminId' when calling businessTypesBusinessTypeIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = businessTypesBusinessTypeIdDeleteCall(businessTypeId, adminId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * To Delte Existing Business Types
     * Delete Business Type
     * @param businessTypeId Business Type ID (required)
     * @param adminId Admin user ID who delete the business type (required)
     * @return BusinessTypeResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BusinessTypeResp businessTypesBusinessTypeIdDelete(Long businessTypeId, Integer adminId) throws ApiException {
        ApiResponse<BusinessTypeResp> resp = businessTypesBusinessTypeIdDeleteWithHttpInfo(businessTypeId, adminId);
        return resp.getData();
    }

    /**
     * To Delte Existing Business Types
     * Delete Business Type
     * @param businessTypeId Business Type ID (required)
     * @param adminId Admin user ID who delete the business type (required)
     * @return ApiResponse&lt;BusinessTypeResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BusinessTypeResp> businessTypesBusinessTypeIdDeleteWithHttpInfo(Long businessTypeId, Integer adminId) throws ApiException {
        com.squareup.okhttp.Call call = businessTypesBusinessTypeIdDeleteValidateBeforeCall(businessTypeId, adminId, null, null);
        Type localVarReturnType = new TypeToken<BusinessTypeResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * To Delte Existing Business Types (asynchronously)
     * Delete Business Type
     * @param businessTypeId Business Type ID (required)
     * @param adminId Admin user ID who delete the business type (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call businessTypesBusinessTypeIdDeleteAsync(Long businessTypeId, Integer adminId, final ApiCallback<BusinessTypeResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = businessTypesBusinessTypeIdDeleteValidateBeforeCall(businessTypeId, adminId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BusinessTypeResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for businessTypesBusinessTypeIdPut
     * @param body Input Business type data to be update (required)
     * @param businessTypeId Business Type ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call businessTypesBusinessTypeIdPutCall(BusinessTypeReq body, Long businessTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/business-types/{businessTypeId}"
            .replaceAll("\\{" + "businessTypeId" + "\\}", apiClient.escapeString(businessTypeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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

        String[] localVarAuthNames = new String[] { "application" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call businessTypesBusinessTypeIdPutValidateBeforeCall(BusinessTypeReq body, Long businessTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling businessTypesBusinessTypeIdPut(Async)");
        }
        // verify the required parameter 'businessTypeId' is set
        if (businessTypeId == null) {
            throw new ApiException("Missing the required parameter 'businessTypeId' when calling businessTypesBusinessTypeIdPut(Async)");
        }
        
        com.squareup.okhttp.Call call = businessTypesBusinessTypeIdPutCall(body, businessTypeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * To Update the Business Types
     * Update Business Type
     * @param body Input Business type data to be update (required)
     * @param businessTypeId Business Type ID (required)
     * @return BusinessTypeResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BusinessTypeResp businessTypesBusinessTypeIdPut(BusinessTypeReq body, Long businessTypeId) throws ApiException {
        ApiResponse<BusinessTypeResp> resp = businessTypesBusinessTypeIdPutWithHttpInfo(body, businessTypeId);
        return resp.getData();
    }

    /**
     * To Update the Business Types
     * Update Business Type
     * @param body Input Business type data to be update (required)
     * @param businessTypeId Business Type ID (required)
     * @return ApiResponse&lt;BusinessTypeResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BusinessTypeResp> businessTypesBusinessTypeIdPutWithHttpInfo(BusinessTypeReq body, Long businessTypeId) throws ApiException {
        com.squareup.okhttp.Call call = businessTypesBusinessTypeIdPutValidateBeforeCall(body, businessTypeId, null, null);
        Type localVarReturnType = new TypeToken<BusinessTypeResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * To Update the Business Types (asynchronously)
     * Update Business Type
     * @param body Input Business type data to be update (required)
     * @param businessTypeId Business Type ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call businessTypesBusinessTypeIdPutAsync(BusinessTypeReq body, Long businessTypeId, final ApiCallback<BusinessTypeResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = businessTypesBusinessTypeIdPutValidateBeforeCall(body, businessTypeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BusinessTypeResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for businessTypesGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call businessTypesGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/business-types";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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

        String[] localVarAuthNames = new String[] { "application" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call businessTypesGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = businessTypesGetCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get All Business Types
     * Get Business Types
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 businessTypesGet() throws ApiException {
        ApiResponse<InlineResponse2002> resp = businessTypesGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get All Business Types
     * Get Business Types
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> businessTypesGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = businessTypesGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Business Types (asynchronously)
     * Get Business Types
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call businessTypesGetAsync(final ApiCallback<InlineResponse2002> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = businessTypesGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for businessTypesPost
     * @param body Input Business type data to be add (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call businessTypesPostCall(BusinessTypeReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/business-types";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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

        String[] localVarAuthNames = new String[] { "application" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call businessTypesPostValidateBeforeCall(BusinessTypeReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling businessTypesPost(Async)");
        }
        
        com.squareup.okhttp.Call call = businessTypesPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add new Business Type
     * Add Business Type
     * @param body Input Business type data to be add (required)
     * @return BusinessTypeResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BusinessTypeResp businessTypesPost(BusinessTypeReq body) throws ApiException {
        ApiResponse<BusinessTypeResp> resp = businessTypesPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Add new Business Type
     * Add Business Type
     * @param body Input Business type data to be add (required)
     * @return ApiResponse&lt;BusinessTypeResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BusinessTypeResp> businessTypesPostWithHttpInfo(BusinessTypeReq body) throws ApiException {
        com.squareup.okhttp.Call call = businessTypesPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<BusinessTypeResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add new Business Type (asynchronously)
     * Add Business Type
     * @param body Input Business type data to be add (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call businessTypesPostAsync(BusinessTypeReq body, final ApiCallback<BusinessTypeResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = businessTypesPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BusinessTypeResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
