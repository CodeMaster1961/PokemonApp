package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Images(
    @SerialName("large")
    val large: String,
    @SerialName("small")
    val small: String
)