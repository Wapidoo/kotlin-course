package org.example.org.example.lessons.lesson19.homework

//Напиши класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления
//нового элемента и получения всех элементов в виде неизменяемого списка.

class ListHolder<T>() {

    private var list = mutableListOf<T>()

    fun addElement(arg3: T): List<T> {
        list.add(arg3)
        return list.toList()
    }
}
