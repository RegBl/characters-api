package io.github.regbl.models.responses

import io.github.regbl.models.Attributes

data class Attr(
    val cha: String,
    val con: String,
    val dex: String,
    val int: String,
    val str: String,
    val wis: String
)

fun Attr.toAttributes() = Attributes(
    strength = this.str.toInt(),
    dexterity = this.dex.toInt(),
    constitution = this.con.toInt(),
    intelligence = this.int.toInt(),
    wisdom = this.wis.toInt(),
    charisma = this.cha.toInt()
)