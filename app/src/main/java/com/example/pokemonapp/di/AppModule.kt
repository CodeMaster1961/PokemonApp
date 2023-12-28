package com.example.pokemonapp.di

import com.example.pokemonapp.data.remote.PokemonApi
import com.example.pokemonapp.data.repository.PokemonRepository
import com.example.pokemonapp.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    /**
     * this function provides the repository
     * @author Ömer Aynaci
     * @param api the pokemon api
     * @return an instance of pokemon repository
     */
    @Singleton
    @Provides
    fun providePokemonRepository(api: PokemonApi) = PokemonRepository(api)

    /**
     * this function provides the pokemon api
     * @author Ömer Aynaci
     * @return the pokemon api interface
     */
    @Singleton
    @Provides
    fun providePokemonApi(): PokemonApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PokemonApi::class.java)
    }
}
