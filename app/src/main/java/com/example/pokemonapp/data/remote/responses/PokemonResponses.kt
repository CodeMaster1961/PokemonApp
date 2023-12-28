package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonResponses(
    @SerialName("count")
    val count: Int,
    @SerialName("data")
    val `data`: List<Data>,
    @SerialName("page")
    val page: Int,
    @SerialName("pageSize")
    val pageSize: Int,
    @SerialName("totalCount")
    val totalCount: Int
)