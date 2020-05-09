fun reverse(input: String): String {
    var word = ""
    val last = input.length - 1
    for(x in last downTo 0){
        word += input[x]
    }
    return word
}
