package com.example.pinterestimage.model.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    @SerialName("hits")
    val hits: List<Hit?>?= null,
    @SerialName("total")
    val total: Int? = null,
    @SerialName("totalHits")
    val totalHits: Int? = null
) {

    @Serializable
    data class Hit(
        @SerialName("collectionId")
        val collections: Int? = null,
        @SerialName("comments")
        val comments: Int? = null,
        @SerialName("downloads")
        val downloads: Int? = null,
        @SerialName("id")
        val id: Int? = null,
        @SerialName("imageHeight")
        val imageHeight: Int? = null,
        @SerialName("imageSize")
        val imageSize: Int? = null,
        @SerialName("imageWidth")
        val imageWidth: Int? = null,
        @SerialName("largeImageURL")
        val largeImageURL: String? = null,
        @SerialName("likes")
        val likes: Int? = null,
        @SerialName("pageURL")
        val pageURL: String? = null,
        @SerialName("previewHeight")
        val previewHeight: Int? = null,
        @SerialName("previewURL")
        val previewURL: String? = null,
        @SerialName("previewWidth")
        val previewWidth: Int? = null,
        @SerialName("tags")
        val tags: String? = null,
        @SerialName("type")
        val type: String? = null,
        @SerialName("user")
        val user: String? = null,
        @SerialName("userImageURL")
        val userImageURL: String? = null,
        @SerialName("userId")
        val user_id: Int? = null,
        @SerialName("views")
        val views: Int? = null,
        @SerialName("webformatHeight")
        val webformatHeight: Int? = null,
        @SerialName("webformatURL")
        val webformatURL: String? = null,
        @SerialName("webformatWidth")
        val webformatWidth: Int? = null
    )
}