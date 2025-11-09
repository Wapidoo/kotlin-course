package org.example.org.example.lessons.lesson16.homework.animals

class Bird(
    val animalType: String,
    val birdSound: String
) : Animal() {
    override fun makeSound() = println("$animalType goes $birdSound")

}

fun main() {
    val bird = Bird("Bird", "tweet")
    bird.makeSound()

}