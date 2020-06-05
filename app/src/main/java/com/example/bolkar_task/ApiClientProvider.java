package com.example.bolkar_task;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientProvider {
    private static Retrofit retrofit;
    private static ApiServiceProvider apiClientService;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            Retrofit.Builder builder;
            builder = new Retrofit.Builder()
                    .baseUrl("https://d51md7wh0hu8b.cloudfront.net/android/v1/prod/Radio/hi/")
                    .addConverterFactory(GsonConverterFactory.create());
            retrofit = builder.build();
        }

        return retrofit;

    }

    public static ApiServiceProvider getApiClientService() {
        if (apiClientService == null) {

            apiClientService = getRetrofit().create(ApiServiceProvider.class);
        }
        return apiClientService;

    }


}
