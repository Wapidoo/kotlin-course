package org.example.org.example.lessons.lesson16.homework.print

class LaserPrinter() : Printer() {
    override fun printString(str: String) {
        val splittedStr = str.split(" ")
        splittedStr.forEach { println("\u001B[30m\u001B[47m$it\u001B[0m") }
    }
}