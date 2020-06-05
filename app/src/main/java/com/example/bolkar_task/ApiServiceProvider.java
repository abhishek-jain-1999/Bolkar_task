package com.example.bolkar_task;

import com.example.bolkar_task.dataHolder.AllDataClass;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServiceProvider {
    @GET("https://d51md7wh0hu8b.cloudfront.net/android/v1/prod/Radio/hi/show.json")
    Call<List<AllDataClass>> getAllData();
}
