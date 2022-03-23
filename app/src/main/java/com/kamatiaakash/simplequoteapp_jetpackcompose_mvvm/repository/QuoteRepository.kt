package com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.repository

import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.models.QuoteModel
import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.network.ApiService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getListOfQuote(): List<QuoteModel> {
        return apiService.getQuoteList()
    }
}