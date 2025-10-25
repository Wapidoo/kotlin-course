package org.example.org.example.lessons.lesson14.homework

data class Product (val name: String, val price: Double, val quantity: Int) {
    val item1 = Product("Noodles", 35.5, 129)
    val item2 = Product("Pears", 234.99, 50)
    val item3 = item2.copy(name = "Apples")
}