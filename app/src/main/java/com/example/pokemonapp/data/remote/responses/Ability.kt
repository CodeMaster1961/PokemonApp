package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Ability(
    @SerialName("name")
    val name: String,
    @SerialName("text")
    val text: String,
    @SerialName("type")
    val type: String
)