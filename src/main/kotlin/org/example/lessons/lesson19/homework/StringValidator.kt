package org.example.org.example.lessons.lesson19.homework

//Создай класс StringValidator и имплементируй интерфейс Validator с типом String?.
// Реализуй проверку, что строка не является null, не пустая и не состоит из одних пробелов.

class StringValidator : Validator<String?> {

    override fun validate(arg3: String?): Boolean {
        return arg3?.isNotBlank() ?: false
    }
}