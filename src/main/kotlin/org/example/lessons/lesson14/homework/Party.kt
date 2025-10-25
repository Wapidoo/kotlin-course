package org.example.org.example.lessons.lesson14.homework

fun main() {
    val party = Party("Moscow", 250)
    party.details()
}

class Party(val location: String, val attendees: Int) {
    fun details() {
        println("Party will take place in $location and $attendees guests are expected")
    }
}
