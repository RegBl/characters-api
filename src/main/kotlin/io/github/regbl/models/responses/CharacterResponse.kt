package io.github.regbl.models.responses

import io.github.regbl.models.Character

data class CharacterResponse(
    val ac: Int,
    val appearance: String,
    val attr: Attr,
    val attributes: List<List<Any>>,
    val characterClass: String,
    val equipment: List<String>,
    val hp: Int,
    val languages: List<String>,
    val notes: List<String>,
    val personality: String,
    val saves: Saves,
    val skills: Any,
    val spell: List<String>,
    val system: String,
    val thac9: Int,
    val toHit: List<List<Int>>
)

fun CharacterResponse.toCharacter() = Character(
    attributes = attr.toAttributes(),
    saves = this.saves.toSaves(),
    characterClass = this.characterClass,
    level = 1,
    ac = this.ac,
    hp = this.hp,
    xp = 0,
    system = this.system
)
