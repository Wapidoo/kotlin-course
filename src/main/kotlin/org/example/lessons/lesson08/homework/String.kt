package org.example.org.example.lessons.lesson08.homework

fun main() {
    example1("Удача")
    example2()
    example3()
    example4()
    example5("username@example.com")
    example6("D:/good.themes/dracula.theme")
    example7("Котлин лучший язык программирования")
}
fun example1(arg: String) {
    val result = when {
        arg.contains("невозможно") -> {
            arg.replace("невозможно", "совершенно точно возможно, просто требует времени")
        }

        arg.startsWith("Я не уверен") -> {
            "$arg ..., но моя интуиция говорит об обратном"
        }

        arg.contains("катастрофа") -> {
            arg.replace("катастрофа", "интересное событие")
        }

        arg.endsWith("без проблем") -> {
            arg.replace("без проблем", "с парой интересных вызовов на пути")
        }

        !arg.contains(" ") -> {
            arg.replace(arg, "Иногда, $arg, но не всегда")
        }

        else -> {
            arg
        }
    }
    println(result)
}

fun example2() {
    val string = "Kotlin: The Fun Way to Learn Programming"
    val subString = string.substring(8)
    println(subString)
}

fun example3() {
    val string = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val words = string.split(" ")
    val secondLastWord = words[words.size - 2]
    val lastWord = words[words.size - 1]
    println(secondLastWord)
    println(lastWord)
}

fun example4() {
    val card = "4539 1488 0343 6467"
    val card1 = card.substring(15)
    val mask = "**** **** **** $card1"
    println(mask)
}

fun example5(email: String) {
    val result = email.replace("@", " [at] ")
        .replace(".", " [dot] ")
    println(result)
}

fun example6(path: String) {
    val path = path.split("/").reversed()
    println(path[0])
}

fun example7(phrase: String) {
    val splitPhrase = phrase.split(" ")
    var counter = ""
    for (word in splitPhrase) {
        val firstLetter = word[0].uppercase()
        counter += firstLetter
    }
    println(counter)
}