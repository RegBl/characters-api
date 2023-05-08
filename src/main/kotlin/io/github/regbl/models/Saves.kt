package io.github.regbl.models

import kotlinx.serialization.Serializable

@Serializable
data class Saves(
    val wands: Int,
    val breath: Int,
    val stone: Int,
    val magic: Int,
    val poison: Int
)