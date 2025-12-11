package org.example.org.example.lessons.lesson23.homework

//Создай функцию-расширение списка чисел, которая будет возвращать множество дубликатов чисел
// (встречающихся в списке более одного раза).
fun List<Int>.duplicates(): Set<Int> {
    return toSet().associate { element ->
        element to this.count { it == element }
    }.filter { it.value > 1 }
        .keys
}

fun main() {
    //Создай аналогичную анонимную функцию.
    val d1 = fun List<Int>.(): Set<Int> {
        return toSet().associate { element ->
            element to this.count { it == element }
        }.filter { it.value > 1 }
            .keys
    }
    //Создай аналогичное лямбда выражение с указанием типа.
    val d11: List<Int>.() -> Set<Int> = {
        toSet().associate { element ->
            element to this.count { it == element }
        }.filter { it.value > 1 }
            .keys
    }
    //Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
    val l = listOf(0, 1, 2, 4, 2, 5, 6, 5, 7)
    println(l.d11())
}