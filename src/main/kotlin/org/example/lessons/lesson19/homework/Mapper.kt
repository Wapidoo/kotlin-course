package org.example.org.example.lessons.lesson19.homework

//Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
//элементов одного типа в элементы другого типа
//списка элементов одного типа в список элементов другого типа

interface Mapper<Q, W> {

    fun transform(arg: Q) : W

    fun transformList(argList: List<Q>) : List<W>
}