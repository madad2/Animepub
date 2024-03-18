package dev.madad.animepub.data.models

import kotlinx.serialization.Serializable

@Serializable
data class Posters(
    val small: Small,
    val medium: Medium,
    val original: Original
)