package org.example.org.example.lessons.lesson05.homework

fun main() {
    val initialIntensity: Double = 5.0
    val coefficient: Double? = null
    val baseCoefficient = 0.5
    val resultintensity = initialIntensity * (coefficient ?: baseCoefficient)
    println(resultintensity)


    val standardPrice: Double = 50.00
    val price: Double? = null
    val insuranceCoefficient = 0.005
    val insuranceCost = (price ?: standardPrice) * insuranceCoefficient
    val totalPrice: Double = (price ?: standardPrice) +  insuranceCost
    println(totalPrice)

    val pressure: String? = null
    val message: String = "Внимание"
    val overallPressure = (pressure ?: message)
    println(overallPressure)
}

