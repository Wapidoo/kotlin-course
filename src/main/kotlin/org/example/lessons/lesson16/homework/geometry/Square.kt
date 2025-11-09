package org.example.org.example.lessons.lesson16.homework.geometry

class Square(
    val squareSide: Double = 4.0
) : Shape() {
    override fun area(): Double {
        return squareSide * squareSide
    }
}