package dev.madad.animepub.data.api

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dev.madad.animepub.data.models.Anime
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET

private const val BASE_URL = "https://api.anilibria.tv"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
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