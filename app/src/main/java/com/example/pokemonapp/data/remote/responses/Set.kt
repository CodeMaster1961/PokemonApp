package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Set(
    @SerialName("id")
    val id: String,
    @SerialName("images")
    val images: ImagesX,
    @SerialName("legalities")
    val legalities: Legalities,
    @SerialName("name")
    val name: String,
    @SerialName("printedTotal")
    val printedTotal: Int,
    @SerialName("ptcgoCode")
    val ptcgoCode: String,
    @SerialName("releaseDate")
    val releaseDate: String,
    @SerialName("series")
    val series: String,
    @SerialName("total")
    val total: Int,
    @SerialName("updatedAt")
    val updatedAt: String
)