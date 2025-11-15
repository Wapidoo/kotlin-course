package org.example.org.example.lessons.lesson18.homework

//Задача 4. Создай абстрактный класс оборудования с возможностью устанавливать температуру и открываться
//и с наследованием от программируемого оборудования. Также имплементируй интерфейсы.

abstract class OpenAndSetTempDevices(name: String, override val maxTemperature: Int) :
    ProgrammableDevices(name),
    Openable,
    TemperatureRegulatable {
        private var currentTemp: Int = 18
        private var isOpen: Boolean = false

        override fun setTemperature(temp: Int) {
            if (temp <= maxTemperature) {
                currentTemp = temp
                println("Temperature is set on $temp degrees")
            } else { println("Unable to set temperature - number is too big") }

    }

    override fun open() {
        isOpen = true
        println("$name is open")
    }

    override fun close() {
        isOpen = false
        println("$name is closed")
    }

}