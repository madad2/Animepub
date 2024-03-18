package dev.madad.animepub.data.models

import kotlinx.serialization.Serializable

@Serializable
data class AnimeList(
    val list: List<Anime>,
    val pagination: Pagination
)