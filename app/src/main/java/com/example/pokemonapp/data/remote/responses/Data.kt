package com.example.pokemonapp.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("abilities")
    val abilities: List<Ability>,
    @SerialName("artist")
    val artist: String,
    @SerialName("attacks")
    val attacks: List<Attack>,
    @SerialName("cardmarket")
    val cardmarket: Cardmarket,
    @SerialName("convertedRetreatCost")
    val convertedRetreatCost: Int,
    @SerialName("evolvesFrom")
    val evolvesFrom: String,
    @SerialName("evolvesTo")
    val evolvesTo: List<String>,
    @SerialName("flavorText")
    val flavorText: String,
    @SerialName("hp")
    val hp: String,
    @SerialName("id")
    val id: String,
    @SerialName("images")
    val images: Images,
    @SerialName("legalities")
    val legalities: Legalities,
    @SerialName("level")
    val level: String,
    @SerialName("name")
    val name: String,
    @SerialName("nationalPokedexNumbers")
    val nationalPokedexNumbers: List<Int>,
    @SerialName("number")
    val number: String,
    @SerialName("rarity")
    val rarity: String,
    @SerialName("regulationMark")
    val regulationMark: String,
    @SerialName("resistances")
    val resistances: List<Resistance>,
    @SerialName("retreatCost")
    val retreatCost: List<String>,
    @SerialName("rules")
    val rules: List<String>,
    @SerialName("set")
    val `set`: Set,
    @SerialName("subtypes")
    val subtypes: List<String>,
    @SerialName("supertype")
    val supertype: String,
    @SerialName("tcgplayer")
    val tcgplayer: Tcgplayer,
    @SerialName("types")
    val types: List<String>,
    @SerialName("weaknesses")
    val weaknesses: List<Weaknesse>
)