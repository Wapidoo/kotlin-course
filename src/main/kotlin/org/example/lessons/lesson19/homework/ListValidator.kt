package org.example.org.example.lessons.lesson19.homework

//Создай класс ListValidator с дженериком, ограниченным типом Number, имплементируй интерфейс Validator
// типизированный по типу List с nullable типом дженерика класса
//Реализуй проверку:
//Ни один элемент списка не является null
//Ни один элемент приведённый к типу Double не равен 0.0

class ListValidator<J: Number> : Validator<List<J?>> {

    override fun validate(arg3: List<J?>): Boolean {
        return arg3.all { it != null && it.toDouble() != 0.0 }
    }
}