package com.example.mvvm_livedata.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel(
    @SerializedName("quote") val quote:String,      // serializedName -- nombre que se recibe de backend
    @SerializedName("author") val author:String
)
