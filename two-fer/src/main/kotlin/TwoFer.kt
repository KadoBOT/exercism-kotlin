internal fun twofer(name: String? = null): String {
    val defaultName = name ?: "you"
    return "One for $defaultName, one for me."
}
