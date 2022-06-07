package com.example.mvvm_livedata.domain

import com.example.mvvm_livedata.data.QuoteRepository
import com.example.mvvm_livedata.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? =  repository.getAllQuotes() // = -- { return... }

}