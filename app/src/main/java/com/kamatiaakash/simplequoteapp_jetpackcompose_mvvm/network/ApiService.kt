package com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.network

import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.models.QuoteModel
import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.utils.ApiConstants
import retrofit2.http.GET

interface ApiService {

    @GET(ApiConstants.END_POINTS)
    suspend fun getQuoteList():List<QuoteModel>
}