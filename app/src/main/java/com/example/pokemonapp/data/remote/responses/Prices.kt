package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Prices(
    @SerialName("averageSellPrice")
    val averageSellPrice: Double,
    @SerialName("avg1")
    val avg1: Double,
    @SerialName("avg30")
    val avg30: Double,
    @SerialName("avg7")
    val avg7: Double,
    @SerialName("germanProLow")
    val germanProLow: Double,
    @SerialName("lowPrice")
    val lowPrice: Double,
    @SerialName("lowPriceExPlus")
    val lowPriceExPlus: Double,
    @SerialName("reverseHoloAvg1")
    val reverseHoloAvg1: Double,
    @SerialName("reverseHoloAvg30")
    val reverseHoloAvg30: Double,
    @SerialName("reverseHoloAvg7")
    val reverseHoloAvg7: Double,
    @SerialName("reverseHoloLow")
    val reverseHoloLow: Double,
    @SerialName("reverseHoloSell")
    val reverseHoloSell: Double,
    @SerialName("reverseHoloTrend")
    val reverseHoloTrend: Double,
    @SerialName("suggestedPrice")
    val suggestedPrice: Double,
    @SerialName("trendPrice")
    val trendPrice: Double
)