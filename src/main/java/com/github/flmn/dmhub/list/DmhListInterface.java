package com.github.flmn.dmhub.list;

import com.github.flmn.dmhub.list.dto.DmhExternalListsRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.Map;

public interface DmhListInterface {

    @POST("externalLists")
    Call<Map<String, Object>> externalLists(@Query("access_token") String accessToken,
                                            @Body DmhExternalListsRequest request);
}
