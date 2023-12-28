package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attack(
    @SerialName("convertedEnergyCost")
    val convertedEnergyCost: Int,
    @SerialName("cost")
    val cost: List<String>,
    @SerialName("damage")
    val damage: String,
    @SerialName("name")
    val name: String,
    @SerialName("text")
    val text: String
)