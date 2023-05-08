package io.github.regbl.models.responses

import io.github.regbl.models.Saves as SavesResponse

data class Saves(
    val breath: Int,
    val magic: Int,
    val poison: Int,
    val stone: Int,
    val wands: Int
)

fun Saves.toSaves() = SavesResponse(
    wands = this.wands,
    breath = this.breath,
    stone = this.stone,
    magic = this.magic,
    poison = this.poison
)