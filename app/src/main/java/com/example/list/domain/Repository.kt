package com.example.list.domain

import com.example.list.data.network.dto.ArticlesResponseItem

interface Repository {
   suspend fun getArctilcls():List<ArticlesResponseItem>
}