import kotlin.math.pow

object Darts {

    fun score(x: Number, y: Number): Int {
        val result = x.toDouble().pow(2) + y.toDouble().pow(2)
        return when {
            result <= 1 -> 10
            result <= 25 -> 5
            result <= 100 -> 1
            else -> 0
        }
    }
}

