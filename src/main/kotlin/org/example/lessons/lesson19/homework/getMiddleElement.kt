package org.example.org.example.lessons.lesson19.homework

//Напиши функцию getMiddleElement с дженериком, которая будет принимать список и возвращать средний элемент,
//если он существует, иначе возвращать null. Например, у списка из четырёх элементов - среднего элемента нет.

fun <T> getMiddleElement(arg1: List<T>): T? {
        if (arg1.size % 2 != 0) {
            println(arg1[arg1.size / 2])
            return arg1[arg1.size / 2]
        }
    return null
}

fun main() {
    val arg1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    getMiddleElement(arg1)
}