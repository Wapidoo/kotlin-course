package org.example.org.example.lessons.lesson15.homework

open class educationalInstitution(
    val buildings: Int,
    val numberOfFloors: Int,
    val principalName: String,
    val workHours: String
) {
    open fun openingHours() {
        println("Часы работы: с 8:00 до 22:00")
    }
}