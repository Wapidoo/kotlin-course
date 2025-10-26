package org.example.org.example.lessons.lesson15.homework

open class School(
    buildings: Int,
    numberOfFloors: Int,
    principalName: String,
    workHours: String,
    val listOfClasses: List<String>
) : educationalInstitution(buildings, numberOfFloors, principalName, workHours) {
    fun meeting(day: String) {
        println("родительское собрание проводится каждый $day")
    }
}