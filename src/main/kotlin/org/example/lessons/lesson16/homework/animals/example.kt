package org.example.org.example.lessons.lesson16.homework.animals

import org.example.lessons.lesson16.homework.animals.Cat
import org.example.org.example.lessons.lesson16.homework.geometry.Circle
import org.example.org.example.lessons.lesson16.homework.geometry.Square
import org.example.org.example.lessons.lesson16.homework.geometry.Triangle
import org.example.org.example.lessons.lesson16.homework.logger.Logger
import org.example.org.example.lessons.lesson16.homework.print.InkjetPrinter
import org.example.org.example.lessons.lesson16.homework.print.LaserPrinter

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}
object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}
fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${Colors.RESET}")
}
abstract class MusicalInstrument {
    abstract fun playNote(note: String)
    protected fun shortNote(note: String, color: String) {
        printColored("Play short note $note", color)
    }

    protected fun longNote(note: String, color: String) {
        printColored("Play long note $note", color)
    }
}

fun main() {
//    val listOfAnimals = listOf(
//        Cat("Cat", "meow"),
//        Dog("Dog", "Bark"),
//        Bird("Bird", "Tweet")
//    )
//
//    listOfAnimals.forEach {it.makeSound()}

//    val listOfFigures = listOf(
//        Triangle(),
//        Circle(),
//        Square()
//    )
//
//    listOfFigures.forEach { println("Площадь = ${it.area()}") }

//    val laserPrinter = LaserPrinter()
//    laserPrinter.printString("А потом я увидела свое прошлое. Как ленту кинофильма, кто-то просматривал мою жизнь. " +
//            "Моменты пролистывались один за другим, некоторые задерживались, заставляя меня вновь переживать те " +
//            "ощущения. Слезы полились по моим щекам, когда я увидела лицо отца. Его добрый взгляд, его улыбку, моменты, " +
//            "когда он поддерживал меня в трудные времена.")

//    val inkjetPrinter = InkjetPrinter()
//        inkjetPrinter.printString("А потом я увидела свое прошлое. Как ленту кинофильма, кто-то просматривал " +
//                "мою жизнь. Моменты пролистывались один за другим, некоторые задерживались, заставляя меня вновь " +
//                "переживать те ощущения. Слезы полились по моим щекам, когда я увидела лицо отца. Его добрый взгляд, " +
//                "его улыбку, моменты, когда он поддерживал меня в трудные времена.")

    val logger = Logger()
    logger.log("some text")

    try {
        throw ArrayIndexOutOfBoundsException("моменты, когда он поддерживал меня в трудные времена")
    }
    catch (e: ArrayIndexOutOfBoundsException) {
        logger.log(exception = e)
    }

}