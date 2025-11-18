package org.example.org.example.lessons.lesson19.homework

// Напиши интерфейс Validator с дженериком с функцией валидации, которая будет принимать элемент
// с типом дженерика и возвращать булево значение.

interface Validator<H> {
    fun validate(arg3: H): Boolean
}