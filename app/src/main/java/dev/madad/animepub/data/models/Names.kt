package dev.madad.animepub.data.models

import kotlinx.serialization.Serializable

@Serializable
data class Names(
    val ru: String,
    val en: String,
    val alternative: String
)