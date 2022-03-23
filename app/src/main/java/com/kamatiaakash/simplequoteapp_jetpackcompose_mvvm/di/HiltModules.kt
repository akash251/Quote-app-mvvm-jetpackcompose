package com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.di

import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.network.ApiService
import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.utils.ApiConstants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object HiltModules {


    @Provides
    @Singleton
    fun providesApiService():ApiService{
        return Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

}