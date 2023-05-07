package regbl.github.io.models.responses

data class Saves(
    val breath: Int,
    val magic: Int,
    val poison: Int,
    val stone: Int,
    val wands: Int
)

fun Saves.toSaves(): regbl.github.io.models.Saves {
    return regbl.github.io.models.Saves(
        wands = this.wands,
        breath = this.breath,
        stone = this.stone,
        magic = this.magic,
        poison = this.poison
    )
}