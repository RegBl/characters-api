package io.github.regbl.models

import kotlinx.serialization.Serializable

@Serializable
data class Character(
    val attributes: Attributes,
    val saves: Saves,
    val characterClass: String,
    val level: Int,
    val ac: Int,
    val hp: Int,
    val xp: Int,
    val system: String
)

fun getDefaultCharacter() = Character(
    attributes = Attributes(
        strength = 16,
        dexterity = 13,
        constitution = 14,
        intelligence = 7,
        wisdom = 9,
        charisma = 8
    ),
    saves = Saves(
        wands = 13,
        breath = 15,
        stone = 14,
        magic = 16,
        poison = 12
    ),
    characterClass = "Fighter",
    level = 1,
    ac = 9,
    hp = 6,
    xp = 0,
    system = "Basic D&D"
)