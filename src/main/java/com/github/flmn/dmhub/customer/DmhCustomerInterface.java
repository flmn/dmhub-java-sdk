package com.github.flmn.dmhub.customer;

import com.github.flmn.dmhub.common.dto.DmhData;
import com.github.flmn.dmhub.common.dto.DmhResult;
import com.github.flmn.dmhub.customer.dto.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.time.ZonedDateTime;
import java.util.List;

public interface DmhCustomerInterface {

    @POST("customers")
    Call<DmhCustomer> customers(@Query("access_token") String accessToken,
                                @Query("forceUpdate") boolean forceUpdate,
                                @Body DmhCreateCustomerRequest request);

    @POST("customers/bulkAdd")
    Call<DmhResult> customersBulkAdd(@Query("access_token") String accessToken,
                                     @Query("forceUpdate") boolean forceUpdate,
                                     @Body List<DmhCreateCustomerRequest> request);

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
    Call<DmhIdMappingResult> customerServiceIdMapping(@Query("access_token") String accessToken,
                                                      @Query("customerId") Long customerId,
                                                      @Query("cl_cid") String clCid);

    @POST("customerIdentities")
    Call<DmhCustomerIdentity> createIdentity(@Query("access_token") String accessToken,
                                             @Body DmhCreateIdentityRequest request);

    @POST("customerIdentityService/bulkGetByCustomerId")
    Call<DmhBulkGetByCustomerIdResult> bulkGetByCustomerId(@Query("access_token") String accessToken,
                                                           @Body DmhBulkGetByCustomerIdRequest request);

    // 客户App推送身份
    @POST("pushInfo/register")
    Call<PushInfoRegisterResult> pushInfoRegister(@Query("access_token") String accessToken,
                                                  @Query("identityPriorityStrategy") String identityPriorityStrategy,
                                                  @Body PushInfoRegisterRequest request);

    @GET("pushInfo/getByCustomerIdentity")
    Call<PushInfoGetByCustomerIdentityResult> pushInfoGetByCustomerIdentity(@Query("access_token") String accessToken,
                                                                            @Query("identityType") String identityType,
                                                                            @Query("identityValue") String identityValue);
}
