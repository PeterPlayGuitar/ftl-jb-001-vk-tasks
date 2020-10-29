package com.a_peter0.vk_tasks.response;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UserResponse {
    private Integer id;
    private String first_name;
    private String last_name;
    private Boolean can_access_closed;
    private Boolean is_closed;
    private String deactivated;
/*
    private String photo;
    private String track_code;
    private String about;
    private String activities;
    private String bdate;
    private Integer blacklisted;
    private Integer blacklisted_by_me;
    private String books;
    private Integer can_post;
    private Integer can_see_all_posts;
    private Integer can_see_audio;
    private  Integer can_send_friend_request;
    private Integer can_write_private_message;
    private
*/
}
