package org.example.org.example.lessons.lesson14.homework

object Moon {
    val isVisible: Boolean = false
    val phase: String = "Full moon"
    fun showPhase() {
        if (isVisible) {
            println("Today is the $phase")
        }
        else {
            println("The moon is not visible")
        }
    }
}

fun main() {
    Moon.showPhase()
}
