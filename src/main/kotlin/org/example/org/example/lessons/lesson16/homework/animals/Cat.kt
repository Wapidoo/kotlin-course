package org.example.lessons.lesson16.homework.animals

import org.example.org.example.lessons.lesson16.homework.animals.Animal
import org.example.org.example.lessons.lesson16.homework.animals.printColored

class Cat(
    val animalType: String,
    val catSound: String
) : Animal() {
    override fun makeSound() = println("$animalType goes $catSound")

}

fun main() {
    val cat = Cat("Cat", "Meow")
    cat.makeSound()

}