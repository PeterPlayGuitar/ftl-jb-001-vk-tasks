package com.a_peter0.vk_tasks.response;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class UserSearchResponse {

    private Response<UserResponse> response;
}
