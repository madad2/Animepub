package dev.madad.animepub.data.repositories

import dev.madad.animepub.data.datasources.AnimeDataSource
import dev.madad.animepub.data.models.Anime

interface AnimeRepository {
    // Fetches list of Anime from AnilibriaApi
    suspend fun getAnimeList(): List<Anime>
}

class RemoteAnimeRepository(private val remoteDataSource: AnimeDataSource) : AnimeRepository {
    override suspend fun getAnimeList(): List<Anime> {
        return remoteDataSource.getAnimeList()
    }
}