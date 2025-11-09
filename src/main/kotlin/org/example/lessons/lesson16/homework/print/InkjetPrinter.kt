package org.example.org.example.lessons.lesson16.homework.print

class InkjetPrinter() : Printer() {
    private val colors = listOf(
        "\u001B[33m" to "\u001B[45m", // жёлтый на фиолетовом
        "\u001B[32m" to "\u001B[40m",
        "\u001B[31m" to "\u001B[47m",
        "\u001B[34m" to "\u001B[40m",
        "\u001B[37m" to "\u001B[31m"
    )

    override fun printString(str: String) {
        val splittedStr2 = str.split(" ")
        var indexColors = 0
        for (i in splittedStr2.indices) {
            if (indexColors < colors.size) {
                println("${colors[indexColors].first}${colors[indexColors].second}${splittedStr2[i]}\u001B[0m")
                indexColors++
            } else {
                indexColors = 0
            }
         }
    }
}