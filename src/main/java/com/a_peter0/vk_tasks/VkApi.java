package com.a_peter0.vk_tasks;

import com.a_peter0.vk_tasks.response.UserSearchResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface VkApi {

    @GET("/method/users.search")
    Call<UserSearchResponse> userSearch(@Query("access_token") String accessToken, @Query("v") String v);
}
