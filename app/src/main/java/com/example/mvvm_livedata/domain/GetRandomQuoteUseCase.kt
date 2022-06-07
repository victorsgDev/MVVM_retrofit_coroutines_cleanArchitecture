package com.example.mvvm_livedata.domain

import com.example.mvvm_livedata.data.QuoteRepository
import com.example.mvvm_livedata.data.model.QuoteModel
import com.example.mvvm_livedata.data.model.QuoteProvider


class GetRandomQuoteUseCase {
    val repository = QuoteRepository()

    operator fun invoke(): QuoteModel? {
        val quotes=QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()){
            val randomNumber=(0..quotes.size-1).random()
            return quotes[randomNumber]
        }
        return null
    }
}