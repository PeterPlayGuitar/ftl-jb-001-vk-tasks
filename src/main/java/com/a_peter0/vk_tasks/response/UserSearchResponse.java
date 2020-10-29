package com.a_peter0.vk_tasks.response;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class UserSearchResponse {

    @Getter
    @ToString
    public static class Response {
        private Integer count;
        private List<UserResponse> items;
    }

    private Response response;
}
