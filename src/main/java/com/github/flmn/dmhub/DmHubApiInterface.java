package com.github.flmn.dmhub;

import com.github.flmn.dmhub.dto.DmhAccessToken;
import com.github.flmn.dmhub.dto.DmhData;
import com.github.flmn.dmhub.dto.DmhResult;
import com.github.flmn.dmhub.dto.DmhScopes;
import com.github.flmn.dmhub.dto.customer.CreateCustomerRequest;
import com.github.flmn.dmhub.dto.customer.DmhCustomer;
import com.github.flmn.dmhub.dto.customer.IdMappingResult;
import com.github.flmn.dmhub.dto.wechat.DmhWechatPubAccount;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.time.ZonedDateTime;
import java.util.List;

public interface DmHubApiInterface {

    //  ******************** 基础 ********************
    @GET("oauth2/token")
    Call<DmhAccessToken> oauth2Token(@Query("app_id") String appId,
                                     @Query("secret") String appSecret,
                                     @Query("grant_type") String grantType);

    @POST("oauth2/scopes")
    Call<DmhScopes> oauth2Scopes(@Query("access_token") String accessToken);

    // ******************** 客户 ********************

    @POST("customers")
    Call<DmhCustomer> customers(@Query("access_token") String accessToken,
                                @Query("forceUpdate") boolean forceUpdate,
                                @Body CreateCustomerRequest request);

    @POST("customers/bulkAdd")
    Call<DmhResult> customersBulkAdd(@Query("access_token") String accessToken,
                                     @Query("forceUpdate") boolean forceUpdate,
                                     @Body List<CreateCustomerRequest> request);

    @GET("customers")
    Call<DmhData<DmhCustomer>> customers(@Query("access_token") String accessToken,
                                         @Query("select") String select,
                                         @Query("sort") String sort,
                                         @Query("limit") Integer limit,
                                         @Query("id") Long id,
                                         @Query("dateJoin") ZonedDateTime dateJoin,
                                         @Query("lastUpdated") ZonedDateTime lastUpdated,
                                         @Query("stage") String stage,
                                         @Query("mobile") String mobile,
                                         @Query("email") String email);

    @GET("customerService/findCustomerByIdentity")
    Call<DmhCustomer> customerServiceFindCustomerByIdentity(@Query("access_token") String accessToken,
                                                            @Query("identityType") String identityType,
                                                            @Query("identityValue") String identityValue);

    @GET("customerService/idMapping")
    Call<IdMappingResult> customerServiceIdMapping(@Query("access_token") String accessToken,
                                                   @Query("customerId") Long customerId,
                                                   @Query("cl_cid") String clCid);

    // ******************** 微信 ********************
    @GET("wechatPubAccounts")
    Call<DmhData<DmhWechatPubAccount>> wechatPubAccounts(@Query("access_token") String accessToken);
}
