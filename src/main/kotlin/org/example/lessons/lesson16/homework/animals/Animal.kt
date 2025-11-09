package org.example.org.example.lessons.lesson16.homework.animals

abstract class Animal {
    open fun makeSound() {
        printColored(
            "This animal makes no sound.",
            Colors.CYAN,
            "WHITE")
    }
}

