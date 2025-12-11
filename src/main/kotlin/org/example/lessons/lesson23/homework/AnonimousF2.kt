package org.example.org.example.lessons.lesson23.homework

//Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа. Сделай проверку, что входящее
// число больше нуля. Подсказка: для парсинга символа в число можно использовать функцию digitToInt()
fun example02(bigNumber: Long): Int {
    require(bigNumber > 0) { "Число должно быть больше нуля" }
    return "$bigNumber".sumOf { it.digitToInt() }
}

fun main() {
    //Создай аналогичную анонимную функцию.
    val e2 = fun (bigNumber: Long): Int {
        require(bigNumber > 0) { "Число должно быть больше нуля" }
        return "$bigNumber".sumOf { it.digitToInt() }
    }
    //Создай аналогичное лямбда выражение с указанием типа.
    val e22: (Long) -> Int = { number ->
        require(number > 0) { "Число должно быть больше нуля" }
        "$number".sumOf { it.digitToInt() }
    }
    //Создай лямбда выражение без указания типа.
    //Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
    val e222 = { number: Long ->
        require(number > 0) { "Число должно быть больше нуля" }
        "$number".sumOf { it.digitToInt() }
    }
    val bigNumber1 = 0
    val bigNumber2 = 3563563566
    println(e222(bigNumber2))
}
