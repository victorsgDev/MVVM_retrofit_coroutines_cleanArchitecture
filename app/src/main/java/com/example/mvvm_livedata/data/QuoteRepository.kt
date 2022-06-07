package com.example.mvvm_livedata.data

import com.example.mvvm_livedata.data.model.QuoteModel
import com.example.mvvm_livedata.data.model.QuoteProvider
import com.example.mvvm_livedata.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response=api.getQuotes()
        QuoteProvider.quotes=response
        return response
    }
}