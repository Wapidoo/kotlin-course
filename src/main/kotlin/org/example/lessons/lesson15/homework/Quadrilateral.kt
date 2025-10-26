package org.example.org.example.lessons.lesson15.homework

class Quadrilateral(
    area: Double,
    symmetry: Int,
    flat: Boolean,
    simple: Boolean,
    angleCount: Int,
    val angleSum: Int
)  : polygon(area, symmetry, flat, simple, 4) {
}