package com.example.pokemonapp.data.repository

import android.util.Log
import com.example.pokemonapp.data.remote.PokemonApi
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(private val api: PokemonApi) {

    suspend fun getPokemonList() {
        val response = try {
            api.getAllPokemonCards()
        } catch (error: Exception) {
            Log.d("Error Message:", error.message!!)
        }
    }

    suspend fun getPokemonById(id: String) {
        val response = try {
            api.getPokemonCardById(id)
        } catch (error: Exception) {
            Log.d("Error Message:", error.message!!)
        }
    }
}