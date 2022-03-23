package com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class QuoteModel(
    @Json(name = "a")
    val a: String,
    @Json(name = "c")
    val c: String,
    @Json(name = "h")
    val h: String,
    @Json(name = "q")
    val q: String
)