package com.example.pinterestimage.model.repository

import android.util.Log
import com.example.pinterestimage.model.core.Either
import com.example.pinterestimage.model.models.ApiResponse
import com.example.pinterestimage.model.service.ApiService
import javax.inject.Inject

class ApiRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getImages(apiKey: String, query: String):Either<Throwable, ApiResponse>{
        return try {
            val response = apiService.getImages(apiKey, query)
            Either.Success(response)
        } catch (e: Exception) {
            Log.e("ololo", "getImages: returned: $e", )
            Either.Error(e)
        }
    }
}