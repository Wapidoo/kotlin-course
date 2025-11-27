package org.example.org.example.lessons.lesson22.homework

//Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:

fun main() {
    // NullPointerException: попытка обратиться к объекту, если он null
    try {
        null!!
    } catch (e: NullPointerException) {
        println("It is NullPointerException! \uD83C\uDF89")
    }
// IndexOutOfBoundsException: попытка обратиться к элементу за пределами списка
    try {
        listOf("")[1]
    } catch (e: IndexOutOfBoundsException) {
        println("It is IndexOutOfBoundsException! \uD83C\uDF89")
    }
// ClassCastException: попытка привести объект к типу, с которым он не совместим
    try {
        "" as Int
    } catch (e: ClassCastException) {
        println("It is ClassCastException! \uD83C\uDF89")
    }
// IllegalArgumentException: методу передан неправильный или неподходящий элемент
    try {
        require(false)
    } catch (e: IllegalArgumentException) {
        println("It is IllegalArgumentException! \uD83C\uDF89")
    }
// NumberFormatException: попытка преобразовать строку в числовой тип
    try {
        "".toInt()
    } catch (e: NumberFormatException) {
        println("It is NumberFormatException! \uD83C\uDF89")
    }
// IllegalStateException: попытка обращения к объекту, который находится в неправильном состоянии
    try {
        check(false)
    } catch (e: IllegalStateException) {
        println("It is IllegalStateException! \uD83C\uDF89")
    }
// OutOfMemoryError: выполнение кода, который съедает память, выделенную на выполнение
    try {
        (0..Long.MAX_VALUE).map { Long.MAX_VALUE }
    } catch (e: OutOfMemoryError) {
        println("It is OutOfMemoryError! \uD83C\uDF89")
    }
// StackOverflowError: рекурсия выполнения кода
    try {
        a()
    } catch (e: StackOverflowError) {
        println("It is StackOverflowError! \uD83C\uDF89")
    }

//    ex2(null)
//    ex2("WTF?")
//    ex2(listOf(""))
//    ex2(listOf(1, 2, 3))
//    ex2(listOf(1, 2, "WTF?"))
    ex2(listOf(1, 2, "3"))
}

fun a() {
    a()
}

fun ex2(arg: Any?) {
    try {
        arg!!
        arg as List<*>
        arg[2]
        require(arg[2] is String)
        check((arg[2] as String).toInt() == 3)
    } catch (e: Throwable) {
        val result = when (e) {
            is NullPointerException -> "It is NullPointerException"
            is ClassCastException -> "It is ClassCastException"
            is IndexOutOfBoundsException -> "It is IndexOutOfBoundsException"
            is NumberFormatException -> "It is NumberFormatException"
            is IllegalArgumentException -> "It is IllegalArgumentException"
            is IllegalStateException -> "It is IllegalStateException"
            else -> "It is unknown exception"
        }
        println(result)
        throw e
    }
    println("We have a fantastically good argument!")

}