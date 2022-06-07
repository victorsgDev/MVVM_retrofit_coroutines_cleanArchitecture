package com.example.mvvm_livedata.data.network

import com.example.mvvm_livedata.core.RetrofitInstance
import com.example.mvvm_livedata.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class QuoteService {
    private val retrofit =RetrofitInstance.getRetrofit()

    suspend fun getQuotes() : List<QuoteModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }

    }
}