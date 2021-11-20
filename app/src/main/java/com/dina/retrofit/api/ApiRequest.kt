package com.dina.retrofit.api

import retrofit2.http.GET

const val Base_URL = "https://random.dog"

interface ApiRequest{

    @GET("woof.json?ref=apilist.fun")
    suspend fun getRandomDog(): ApiData
}