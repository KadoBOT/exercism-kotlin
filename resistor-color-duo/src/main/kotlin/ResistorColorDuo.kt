object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        val color1 = colors[0].ordinal * 10
        return color1 + colors[1].ordinal
    }
}
