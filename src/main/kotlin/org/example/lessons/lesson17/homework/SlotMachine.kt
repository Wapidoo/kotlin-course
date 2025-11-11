package org.example.org.example.lessons.lesson17.homework

class SlotMachine(
    private val color: String,
    private val model: String,
    private val installedGames: List<String>,
    val isThereAJoystick: Boolean,
    private val owner: String,
    val supportNumber: String,
    val gamePrice: Double,
    private val pin: String
) {
    private var isOn: Boolean = true
    private var isOSWorking: Boolean = false
    private var currentBalance: Double = 0.0
    private var isSessionPaid: Boolean = false

    fun isMachineOn() {
        isOn = true
        loadOS()
    }

    fun isMachineOff() {
        unloadOS()
        isOn = false
    }

    fun isOSWorking() {
        isOSWorking = true
    }

    fun showGameList() {
        println(installedGames)
    }

    private fun loadOS() {
        isOSWorking = false
        println("OS is loading")
    }

    private fun unloadOS() {
        isOSWorking = true
        println("System is turned off")
    }

    fun turnOnTheGame(game: String) {
        if (isSessionPaid) {
            println("$game is on, have a good one")
        } else {
            println("Please, pay for the session")
        }
    }

    fun payForTheGame(price: Double) {
        val gamePrice: Double = 10.0
        if (gamePrice <= price) {
            isSessionPaid = true
            currentBalance += price
        } else {
            println("Недостаточно денег на балансе")
        }
    }

    fun takeMoney(pin: String): Boolean {
        val pin: String = "6789"
        if (this.pin == pin) {
            println("Успешно")
            return true
        } else {
            println("Ошибка. попробуйте ещё раз")
            return false
        }
    }

    fun openSafe() {
        if (takeMoney(pin)) {
            println("Сейф открыт")
        } else {
            println("Ошибка, попробуйте ещё раз")
        }
    }

}