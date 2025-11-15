package org.example.org.example.lessons.lesson18.homework

// Задача 2. Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий интерфейс
// с реализацией методов (достаточно println с выполняемым действием).

abstract class PowerOn(val name: String) : Powerable {
    private var state: Boolean = false
    override fun powerOn() {
        state = true
        println("Device $name is on")
    }

    override fun powerOff() {
        state = false
        println("Device $name is off")
    }
    private fun getDeviceState(): Boolean = state
}