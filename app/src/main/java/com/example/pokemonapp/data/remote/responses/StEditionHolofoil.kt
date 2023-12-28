package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StEditionHolofoil(
    @SerialName("directLow")
    val directLow: Double,
    @SerialName("high")
    val high: Double,
    @SerialName("low")
    val low: Double,
    @SerialName("market")
    val market: Double,
    @SerialName("mid")
    val mid: Double
)