package org.example.org.example.lessons.lesson19.homework

//Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
// Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
// Метод преобразования списков с аналогичной механикой.

class PhrasesToListOfStrings(): Mapper<String, List<String>> {

    override fun transform(arg: String): List<String> {
        return arg.split(" ")
    }

    override fun transformList(argList: List<String>): List<List<String>> {
        return argList.map {it.split(" ")}
    }
}
