package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ImagesX(
    @SerialName("logo")
    val logo: String,
    @SerialName("symbol")
    val symbol: String
)