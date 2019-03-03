package com.harunkor.retrofitsimplesampleweather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRetroInterface {


    @GET("/data/2.5/forecast?")
    Call<WeatherResources> GetWeatherAll(@Query("id") String id, @Query("APPID") String appid);



}
