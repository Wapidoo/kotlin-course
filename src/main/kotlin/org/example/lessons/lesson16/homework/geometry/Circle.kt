package org.example.org.example.lessons.lesson16.homework.geometry

class Circle(
    val constanta: Double = 3.14,
    val radius: Double = 8.0
) : Shape() {
    override fun area(): Double {
        return (constanta * radius * radius)
    }
}