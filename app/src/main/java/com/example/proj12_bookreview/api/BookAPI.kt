package com.example.proj12_bookreview.api

import com.example.proj12_bookreview.model.BestSellerDto
import com.example.proj12_bookreview.model.SearchBooksDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookAPI {

    @GET("/api/bestSeller.api?categoryId=100&output=json")
    fun getBestSeller(@Query("key") apiKey: String): Call<BestSellerDto>

    @GET("/api/search.api?output=json")
    fun getBooksByName(
        @Query("key") apiKey: String,
        @Query("query") keyword: String
    ): Call<SearchBooksDto>
}