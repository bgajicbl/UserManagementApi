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

import io.swagger.client.ApiException;
import io.swagger.client.model.CommonErrorResp;
import io.swagger.client.model.CommonResp;
import io.swagger.client.model.KycDocsInput;
import io.swagger.client.model.KycUpdateInput;
import io.swagger.client.model.UserResp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KycApi
 */
@Ignore
public class KycApiTest {

    private final KycApi api = new KycApi();

    /**
     * Send Mail OTP
     *
     * Sends Mail OTP. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendMailOTPTest() throws ApiException {
        Long userId = null;
        UserResp response = api.sendMailOTP(userId);

        // TODO: test validations
    }
    /**
     * Send Mobile OTP
     *
     * Sends Mobile OTP. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendMobileOTPTest() throws ApiException {
        Long userId = null;
        UserResp response = api.sendMobileOTP(userId);

        // TODO: test validations
    }
    /**
     * Update KYC info
     *
     * Approve KYC. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateKycTest() throws ApiException {
        KycUpdateInput body = null;
        Long userId = null;
        CommonResp response = api.updateKyc(body, userId);

        // TODO: test validations
    }
    /**
     * Upload KYC Docs
     *
     * Uploads KYC Docs. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadKycDocsTest() throws ApiException {
        KycDocsInput body = null;
        Long userId = null;
        UserResp response = api.uploadKycDocs(body, userId);

        // TODO: test validations
    }
    /**
     * Verify Mail OTP
     *
     * Verifies Mail OTP. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyMailOTPTest() throws ApiException {
        Long userId = null;
        UserResp response = api.verifyMailOTP(userId);

        // TODO: test validations
    }
    /**
     * Verify Mobile OTP
     *
     * Verifies Mobile OTP. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyMobileOTPTest() throws ApiException {
        Long userId = null;
        UserResp response = api.verifyMobileOTP(userId);

        // TODO: test validations
    }
}
