package com.example.list.di

import com.example.list.data.network.api.RetroftApi
import com.example.list.domain.Repository
import com.example.list.domain.RepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Singleton
    @Provides
    fun provideRetrofit()= Retrofit.Builder()
        .baseUrl("https://dev.to/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit) = retrofit.create(RetroftApi::class.java)

    @Provides
    fun provideRepository(api: RetroftApi): Repository = RepositoryImpl(api)

}