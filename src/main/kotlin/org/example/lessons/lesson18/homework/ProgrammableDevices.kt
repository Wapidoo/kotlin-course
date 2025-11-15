package org.example.org.example.lessons.lesson18.homework

//Задача 3. Создай абстрактный класс для программируемого оборудования (с имплементацией соответствующего интерфейса
//и реализацией методов) и наследуй его от абстрактного класса включаемого оборудования.

abstract class ProgrammableDevices(name: String) : PowerOn(name), Programmable {
    override fun programAction(action: String) {
        println("$action is done")
    }

    override fun execute() {
    }
}