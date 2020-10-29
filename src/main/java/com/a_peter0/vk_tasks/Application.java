package com.a_peter0.vk_tasks;

import lombok.val;
import lombok.var;

import java.io.IOException;

public class Application {

    private static final String ACCESS_TOKEN = "b4e2deabd6e9c0b6989eea04c3d041aeeb12128f0684edee14e4e19a123059944977039b45e5653df522d";
    private static final String V = "5.124";

    public static void main(String[] args) throws IOException, InterruptedException {
        val api = VkService.getInstance().getApi();

        val response = api.userSearch(ACCESS_TOKEN, V, 20).execute();
        val userResponses = response.body().getResponse().getItems();

        System.out.println("is successful?: " + response.isSuccessful());
        System.out.println("number of items: " + userResponses.size());

        for (var user : userResponses)
            if (!user.getIs_closed()) {
                val userFollowers = api.getFollowers(ACCESS_TOKEN, V, user.getId().toString())
                        .execute()
                        .body()
                        .getResponse()
                        .getItems();
                System.out.println(userFollowers);
                Thread.sleep(300);
            }

    }
}
