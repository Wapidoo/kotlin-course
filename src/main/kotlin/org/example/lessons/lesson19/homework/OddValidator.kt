package org.example.org.example.lessons.lesson19.homework

//Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int.
// Реализуй проверку, что число чётное.

class OddValidator : Validator<Int> {

    override fun validate(arg3: Int): Boolean {
        return arg3 % 2 == 0
    }

}