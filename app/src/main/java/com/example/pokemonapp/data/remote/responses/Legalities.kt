package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Legalities(
    @SerialName("expanded")
    val expanded: String,
    @SerialName("unlimited")
    val unlimited: String
)