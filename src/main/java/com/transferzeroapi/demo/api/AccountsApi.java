/*
 * TransferZero API
 * Reference documentation for the TransferZero API V1
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.transferzeroapi.demo.api;

import com.transferzero.sdk.ApiCallback;
import com.transferzero.sdk.ApiClient;
import com.transferzero.sdk.ApiException;
import com.transferzero.sdk.ApiResponse;
import com.transferzero.sdk.Configuration;
import com.transferzero.sdk.Pair;
import com.transferzero.sdk.ProgressRequestBody;
import com.transferzero.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.transferzero.sdk.model.AccountListResponse;
import com.transferzero.sdk.model.AccountResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountsApi {
    private ApiClient localVarApiClient;

    public AccountsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call getAccountCall(String currency, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/accounts/{Currency}"
            .replaceAll("\\{" + "Currency" + "\\}", localVarApiClient.escapeString(currency.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAccountValidateBeforeCall(String currency, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new ApiException("Missing the required parameter 'currency' when calling getAccount(Async)");
        }
        

        okhttp3.Call localVarCall = getAccountCall(currency, _callback);
        return localVarCall;

    }


    private ApiResponse<AccountResponse> getAccountWithHttpInfo(String currency) throws ApiException {
        okhttp3.Call localVarCall = getAccountValidateBeforeCall(currency, null);
        Type localVarReturnType = new TypeToken<AccountResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAccountAsync(String currency, final ApiCallback<AccountResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccountValidateBeforeCall(currency, _callback);
        Type localVarReturnType = new TypeToken<AccountResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetAccountRequest {
        private final String currency;

        private APIgetAccountRequest(String currency) {
            this.currency = currency;
        }

        /**
         * Build call for getAccount
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAccountCall(currency, _callback);
        }

        /**
         * Execute getAccount request
         * @return AccountResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public AccountResponse execute() throws ApiException {
            ApiResponse<AccountResponse> localVarResp = getAccountWithHttpInfo(currency);
            return localVarResp.getData();
        }

        /**
         * Execute getAccount request with HTTP info returned
         * @return ApiResponse&lt;AccountResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ApiResponse<AccountResponse> executeWithHttpInfo() throws ApiException {
            return getAccountWithHttpInfo(currency);
        }

        /**
         * Execute getAccount request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<AccountResponse> _callback) throws ApiException {
            return getAccountAsync(currency, _callback);
        }
    }

    /**
     * Fetches account balance for specified currrency
     * Fetches account balance for specified currrency, and returns current balance and associated currency code
     * @param currency Currency code of account balance to fetch  Example: &#x60;/v1/accounts/USD&#x60; (required)
     * @return APIgetAccountRequest
     */
    public APIgetAccountRequest getAccount(String currency) {
        return new APIgetAccountRequest(currency);
    }
    private okhttp3.Call getAccountsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/accounts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAccountsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAccountsCall(_callback);
        return localVarCall;

    }


    private ApiResponse<AccountListResponse> getAccountsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAccountsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<AccountListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAccountsAsync(final ApiCallback<AccountListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccountsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<AccountListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetAccountsRequest {

        private APIgetAccountsRequest() {
        }

        /**
         * Build call for getAccounts
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAccountsCall(_callback);
        }

        /**
         * Execute getAccounts request
         * @return AccountListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public AccountListResponse execute() throws ApiException {
            ApiResponse<AccountListResponse> localVarResp = getAccountsWithHttpInfo();
            return localVarResp.getData();
        }

        /**
         * Execute getAccounts request with HTTP info returned
         * @return ApiResponse&lt;AccountListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ApiResponse<AccountListResponse> executeWithHttpInfo() throws ApiException {
            return getAccountsWithHttpInfo();
        }

        /**
         * Execute getAccounts request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<AccountListResponse> _callback) throws ApiException {
            return getAccountsAsync(_callback);
        }
    }

    /**
     * Fetches account balances for all currencies
     * Fetches account balances for all currencies, and returns an array of the current balances and associated currency codes.
     * @return APIgetAccountsRequest
     */
    public APIgetAccountsRequest getAccounts() {
        return new APIgetAccountsRequest();
    }
}
