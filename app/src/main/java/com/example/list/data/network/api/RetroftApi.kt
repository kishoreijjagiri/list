package com.example.list.data.network.api

import com.example.list.data.network.dto.ArticlesResponseItem
import retrofit2.http.GET

interface RetroftApi {

    @GET("api/articles")
    suspend fun getArticles() :List<ArticlesResponseItem>
}