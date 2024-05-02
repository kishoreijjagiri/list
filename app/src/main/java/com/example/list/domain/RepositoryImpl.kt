package com.example.list.domain

import com.example.list.data.network.api.RetroftApi
import com.example.list.data.network.dto.ArticlesResponseItem

class RepositoryImpl (val retroftApi: RetroftApi) :Repository {
    override suspend fun getArctilcls(): List<ArticlesResponseItem> {
       return retroftApi.getArticles()
    }

}