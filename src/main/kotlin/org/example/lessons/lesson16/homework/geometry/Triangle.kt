package org.example.org.example.lessons.lesson16.homework.geometry

class Triangle(
    val side: Double = 10.0,
    val height: Double = 5.0
) : Shape() {
    override fun area(): Double {
        return (side * height) / 2
    }
}