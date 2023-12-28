package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Weaknesse(
    @SerialName("type")
    val type: String,
    @SerialName("value")
    val value: String
)