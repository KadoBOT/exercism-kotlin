object Transpose {

    fun transpose(input: List<String>): List<String> {
        val result: MutableList<String> = mutableListOf()
        input.forEachIndexed { i, word ->
            word.forEachIndexed { j, letter ->
                if (result.size <= j) result.add(j, "".padEnd(i, ' ')+letter)
                else result.set(j, result[j].padEnd(i, ' ')+letter)
            }
        }
        return result
    }
}
