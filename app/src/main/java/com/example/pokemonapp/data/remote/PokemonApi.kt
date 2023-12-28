package com.example.pokemonapp.data.remote

import com.example.pokemonapp.data.remote.responses.Data
import com.example.pokemonapp.data.remote.responses.PokemonResponses
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {

    @GET("cards")
    suspend fun getAllPokemonCards(): PokemonResponses

    @GET("cards/{id}")
    suspend fun getPokemonCardById(@Path("id") id: String): Data
}