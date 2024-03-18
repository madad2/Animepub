package dev.madad.animepub.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Small(
    val url: String,
    @SerialName(value = "raw_base64_file")
    val rawBase64File: String?
)