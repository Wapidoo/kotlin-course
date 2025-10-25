package org.example.org.example.lessons.lesson14.homework

//Мероприятие: концерт. Создайте класс, который будет представлять концерт. У него должны быть свойства “группа”,
// “место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”. Добавьте метод,
// который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов
// на один.

class Concert(
    val band: String,
    val venue: String,
    val price: Double,
    val capacity: Int
) {
    private var soldTickets: Int = 0

    fun buyTicket(): Boolean {
        return if (soldTickets < capacity) {
            soldTickets++
            true
        } else {
            false
        }
    }

    fun showInfo() {
        println("Концерт группы: $band")
        println("Место проведения: $venue")
        println("Стоимость билета: $$price")
        println("Вместимость зала: $capacity")
        println("Проданные билеты: $soldTickets")
    }
}

fun main() {
    val concert = Concert("The Beatles", "Madison Square Garden", 150.0, 20000)

    concert.showInfo()

    // Покупка билета
    if (concert.buyTicket()) {
        println("Билет успешно куплен!")
    } else {
        println("Нет доступных мест!")
    }

    concert.showInfo()
}
