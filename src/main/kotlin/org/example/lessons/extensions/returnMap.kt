package org.example.org.example.lessons.extensions

//Создайте функцию-расширение для nullable словаря с дженериком:
//Ключ является дженериком
//Значение является списком из дженериков
//Принимает целое число
//Возвращает nullable словарь из ключей изначального словаря приведённых к строке через toString()
//Значений из nullable дженерика, взятых из изначального ключа-списка по индексу из аргумента,
//если такого индекса нет - значением будет null

fun <T> Map<T, List<T>>?.returnMap(arg: Int): Map<String, T?>? {
    return this?.asIterable()?.associate {
        it.key.toString() to it.value.getOrNull(arg)
    }
}