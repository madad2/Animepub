package dev.madad.animepub.data.api

import dev.madad.animepub.data.models.Anime
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://api.anilibria.tv"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface AnilibriaApiService {
    @GET("/v3/title/updates?filter=id,names,posters&items_per_page=10")
    suspend fun getAnimeList(): List<Anime>
}

object AnilibriaApi {
    val retrofitService: AnilibriaApiService by lazy {
        retrofit.create(AnilibriaApiService::class.java)
    }
}