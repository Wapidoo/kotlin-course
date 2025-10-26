package org.example.org.example.lessons.lesson15.homework

class Triangle(
    area: Double,
    symmetry: Int,
    flat: Boolean,
    simple: Boolean,
    angleCount: Int,
    val angleSum: Int = 180
) : polygon(area, symmetry, flat, simple, 3) {

}