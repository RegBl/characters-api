package io.github.regbl.models

import kotlinx.serialization.Serializable

@Serializable
data class Attributes(
    val strength: Int,
    val dexterity: Int,
    val constitution: Int,
    val intelligence: Int,
    val wisdom: Int,
    val charisma: Int
)