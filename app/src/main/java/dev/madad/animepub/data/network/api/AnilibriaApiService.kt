package dev.madad.animepub.data.network.api

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://api.anilibria.tv"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface AnilibriaApiService {
    @GET("/v3/title/list")
    suspend fun getTitleList(): String
}

object AnilibriaApi {
    val retrofitService: AnilibriaApiService by lazy {
        retrofit.create(AnilibriaApiService::class.java)
    }
}