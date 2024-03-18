package dev.madad.animepub.data.models

import kotlinx.serialization.Serializable

@Serializable
data class Anime(
    val id: Int,
    val names: Names,
    val posters: Posters
)
