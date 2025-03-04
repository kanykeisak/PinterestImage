package com.example.pinterestimage.model.service

import com.example.pinterestimage.model.models.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("api/")
    suspend fun getImages(
        @Query("key") apiKey: String,
        @Query("q") query: String,
        ): ApiResponse
}