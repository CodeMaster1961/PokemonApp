package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Cardmarket(
    @SerialName("prices")
    val prices: Prices,
    @SerialName("updatedAt")
    val updatedAt: String,
    @SerialName("url")
    val url: String
)