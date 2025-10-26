package org.example.org.example.lessons.lesson15.homework

class Uni(
    buildings: Int,
    numberOfFloors: Int,
    principalName: String,
    workHours: String,
    val professors: List<String>
)  : educationalInstitution(buildings, numberOfFloors, principalName, workHours) {
}