package org.example.org.example.lessons.lesson19.homework

//Создай функцию transposition с двумя дженериками, которая принимает словарь с дженериками и возвращает словарь,
// в котором ключ и значения поменялись местами.

fun <Z, X>Transposition(map: Map<Z, X>): Map<X, Z> {
    val arg2 = mutableMapOf<X, Z>()
    map.forEach {
        arg2[it.value] = it.key
    }
    return map.map { it }.associate { it.value to it.key }
}