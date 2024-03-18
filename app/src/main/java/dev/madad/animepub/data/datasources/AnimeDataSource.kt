package dev.madad.animepub.data.datasources

import dev.madad.animepub.data.api.AnilibriaApiService
import dev.madad.animepub.data.models.Anime

interface AnimeDataSource {
    suspend fun getAnimeList(): List<Anime>
}

class RemoteAnimeDataSource(private val apiService: AnilibriaApiService) : AnimeDataSource {
    override suspend fun getAnimeList() = apiService.getAnimeList()
}