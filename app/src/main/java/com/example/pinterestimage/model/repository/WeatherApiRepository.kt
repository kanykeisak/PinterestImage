package com.example.pinterestimage.model.repository

import com.example.pinterestimage.model.core.Either
import com.example.pinterestimage.model.models.WeatherResponse
import com.example.pinterestimage.model.service.WeatherApiService
import javax.inject.Inject

class WeatherApiRepository @Inject constructor(
    private val apiService: WeatherApiService
) {
    suspend fun getImages(apiKey: String, query: String): Either<Throwable, WeatherResponse> {
        return try {
            val response = apiService.getWeather(apiKey, query)
            Either.Success(response)
        }catch (e: Exception) {
            Either.Error(e)

        }
    }
}