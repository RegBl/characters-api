package regbl.github.io.models

data class Character(
    val id: Int,
    val attributes: Attributes,
    val saves: Saves,
    val characterClass: String,
    val level: Int,
    val ac: Int,
    val hp: Int,
    val xp: Int,
    val system: String
)