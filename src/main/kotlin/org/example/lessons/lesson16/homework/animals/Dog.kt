package org.example.org.example.lessons.lesson16.homework.animals

class Dog(
    val animalType: String,
    val dogSound: String
) : Animal() {
    override fun makeSound() = println("$animalType goes $dogSound")

}

fun main() {
    val cat = Dog("Dog", "Bark")
    cat.makeSound()

}