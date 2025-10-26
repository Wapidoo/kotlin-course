package org.example.org.example.lessons.lesson15.homework

open class Table(
    weight: Double,
    color: String,
    val material: String,
    val height: Int
) : Furniture(weight, color) {
}