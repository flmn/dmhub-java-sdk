package com.github.flmn.dmhub.event;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.Map;

public interface DmhEventInterface {

    @POST("customerEvents")
    Call<Map<String, Object>> customerEvents(@Query("access_token") String accessToken,
                                             @Query("trackIp") boolean trackIp,
                                             @Body Map<String, Object> event);
}
