package dev.madad.animepub.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pagination(
    val pages: Int,
    @SerialName(value = "current_page")
    val currentPage: Int,
    @SerialName(value = "items_per_page")
    val itemsPerPage: Int,
    @SerialName(value = "total_items")
    val totalItems: Int
)