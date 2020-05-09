import kotlin.math.pow

object ResistorColorTrio {
    private fun Int.pow(i: Int) = this.toDouble().pow(i).toInt()
    fun text(vararg input: Color): String {
        val value = (input[0].ordinal * 10 + input[1].ordinal) * 10.pow(input[2].ordinal)
        return when {
            value >= 10.pow(6) -> "${value/10.pow(6)} megaohms"
            value >= 10.pow(3) -> "${value/10.pow(3)} kiloohms"
            else -> "$value ohms"
        }
    }
}
