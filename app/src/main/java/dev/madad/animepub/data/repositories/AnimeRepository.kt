package dev.madad.animepub.data.repositories

import dev.madad.animepub.data.datasources.AnimeDataSource
import dev.madad.animepub.data.models.Anime
import javax.inject.Inject

interface AnimeRepository {
    // Fetches list of Anime from AnilibriaApi
    suspend fun getAnimeList(): List<Anime>
}

class RemoteAnimeRepository @Inject constructor(private val remoteDataSource: AnimeDataSource) : AnimeRepository {
    override suspend fun getAnimeList(): List<Anime> {
        return remoteDataSource.getAnimeList()
    }
}