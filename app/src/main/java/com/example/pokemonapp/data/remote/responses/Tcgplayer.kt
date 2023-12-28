package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Tcgplayer(
    @SerialName("prices")
    val prices: PricesX,
    @SerialName("updatedAt")
    val updatedAt: String,
    @SerialName("url")
    val url: String
)