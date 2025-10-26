package org.example.org.example.lessons.lesson15.homework

class musicSchool(
    buildings: Int,
    numberOfFloors: Int,
    principalName: String,
    workHours: String,
    listOfClasses: List<String>,
    val schedule: Map<String, String>
) : School(buildings, numberOfFloors, principalName, workHours, listOfClasses) {
}