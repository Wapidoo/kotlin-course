package org.example.org.example.lessons.lesson15.homework

fun main() {
    val circle = circle(10.0, 100, true, 5.5, 11.0)
    circle.findDiameter(5.5)

}

class circle(
    area: Double,
    symmetry: Int,
    flat: Boolean,
    val radius: Double = 5.5,
    val diameter: Double
): geometryFigure(area, symmetry, flat) {
    fun findDiameter(radius: Double) {
        println(radius * 2)
    }
}