package com.a_peter0.vk_tasks;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class VkService {

    private static final String BASE_URL = "https://api.vk.com";
    private static VkService instance = null;
    private Retrofit retrofit;

    private VkService() {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                //.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    public VkApi getApi() {
        return retrofit.create(VkApi.class);
    }

    public static VkService getInstance() {
        if (instance == null) {
            instance = new VkService();
        }
        return instance;
    }
}

