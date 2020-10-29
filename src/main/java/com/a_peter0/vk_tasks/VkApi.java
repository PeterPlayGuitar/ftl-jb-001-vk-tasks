package com.a_peter0.vk_tasks;

import com.a_peter0.vk_tasks.response.FollowerIdsResponse;
import com.a_peter0.vk_tasks.response.UserSearchResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface VkApi {

    @GET("/method/users.search")
    Call<UserSearchResponse> userSearch(@Query("access_token") String accessToken, @Query("v") String v, @Query("count") int count);

    @GET("/method/users.getFollowers")
    Call<FollowerIdsResponse> getFollowers(@Query("access_token") String accessToken, @Query("v") String v, @Query("user_id") String userId);
}
