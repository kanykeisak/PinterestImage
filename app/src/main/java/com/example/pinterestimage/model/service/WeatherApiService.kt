package com.example.pinterestimage.model.service

import com.example.pinterestimage.model.models.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService{
    @GET("https://api.weatherapi.com/v1/current.json")
    suspend fun getWeather(
        @Query("key") apiKey: String,
        @Query("q") query: String
    ): WeatherResponse
}