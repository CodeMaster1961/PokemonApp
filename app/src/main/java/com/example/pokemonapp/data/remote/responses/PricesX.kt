package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PricesX(
    @SerialName("holofoil")
    val holofoil: Holofoil,
    @SerialName("normal")
    val normal: Normal,
    @SerialName("reverseHolofoil")
    val reverseHolofoil: ReverseHolofoil,
    @SerialName("1stEditionHolofoil")
    val stEditionHolofoil: StEditionHolofoil,
    @SerialName("unlimitedHolofoil")
    val unlimitedHolofoil: UnlimitedHolofoil
)