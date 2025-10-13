package org.example.org.example.lessons.lesson11.homework

fun main() {
    averageValue(3, 5, 4)
    multiplyByTwo(4)
    val number = 5
    printNumbersUntil(number)
    findFirstNegative(arrayOf(4, 5, 2, 8, 7))
    processList(listOf("Привет", "Гудбай", "Пока", "Хеллоу"))

}
// Задачи на сигнатуру

//Не принимает аргументов и не возвращает значения.
fun returnsNothing() {
}

//Принимает два целых числа и возвращает их сумму.
fun sum(a: Int, b: Int): Int {
    return a+b
}

//Принимает строку и ничего не возвращает.
fun string(a: String) {

}

//Принимает список целых чисел и возвращает среднее значение типа Double.
fun averageValue(a: Int, b: Int, c: Int): Double {
    return (a+b+c) / 3.0
}

//Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun stringLength(a: String?): Int? {
    return a?.length
}

//Не принимает аргументов и возвращает nullable вещественное число.
fun float(): Double? {
    return float()
}

//Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun nullableArray(a: Array<Int?>) {

}

//Принимает целое число и возвращает nullable строку.
fun nullableString(a: Int): String? {
    return null
}

//Не принимает аргументов и возвращает список nullable строк.
fun nullableListOfStrings(): List<String?> {
    return emptyList()
}

//Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun allNullable(a: String?, b: Int?): Boolean? {
    return true
}

//Задачи на написание кода


//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(a: Int): Int {
    return a*2
}

//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(a: Int): Boolean {
    return if (a / 2 == 0) {
        true
    } else {
        false
    }
}

//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n
//меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    for (i in 1..n) {
        println(i)
    }
    if (n < 1) {
        return
    }
}

//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в
//списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(a: Array<Int>) {
    var foundNegative = false
    for (i in a) {
        if (i < 0) {
            foundNegative = true
            println(i)
            break
        }
    }
    if (!foundNegative == true) {
        println(null)
    }
}

//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую
//строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(a: List<String?>) {
    for (i in a) {
        if (i == null) {
            return
        }
        println(i)
    }
}