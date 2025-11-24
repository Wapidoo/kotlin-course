package org.example.org.example.lessons.extensions

//Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из
// чисел - первое и последнее. Если массив был пуст то вернуть пару из null значений.
fun Array<Int>.firstAndLast(): Pair<Int?, Int?> {
    return if (this.isEmpty()) {
        Pair(null, null)
    } else {
        Pair(this.first(), this.last())
    }
}

