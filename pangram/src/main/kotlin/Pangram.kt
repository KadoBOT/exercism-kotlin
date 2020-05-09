object Pangram {
    fun isPangram(input: String): Boolean = ('A'..'Z').all { input.contains(it, ignoreCase = true) }
}
