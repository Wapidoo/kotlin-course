package org.example.org.example.lessons.lesson14.homework

fun main() {
    var shelf = Shelf(150, mutableListOf("Cup", "Glass", "Book", "Pencil"))
    shelf.addItem("Bottle")
    shelf.removeItem("Book")
    shelf.canAccommodate("Harry Potter books")
    shelf.containsItem("Cup")
    shelf.getThings()

}

class Shelf(var capacity: Int, val items: MutableList<String> = mutableListOf()) {
    fun addItem(item: String): Boolean {
        var currentLength = items.sumOf {it.length}
        if (currentLength + item.length <= capacity) {
            items.add(item)
            println("Item added")
            return true

        }
        else {
            println("There is not enough space")
            return false

        }
    }
    fun removeItem(item: String): Boolean {
        if (items.contains(item)) {
            items.remove(item)
            println("Item removed")
            return true
        }
        else {
            println("There is no such item")
            return false
        }
    }
    fun canAccommodate(item: String): Boolean {
        var currentLength = items.sumOf {it.length}
        if (currentLength + item.length <= capacity) {
            println("You can put the item on the shelf")
            return true
        }
        else {
            println("There is not enough space")
            return false
        }
    }
    fun containsItem(item: String): Boolean {
        return if (items.contains(item)) {
            println("The shelf contains $item")
            true
        } else {
            println("The $item is not on the shelf")
            false
        }
    }
    fun getThings(): MutableList<String> {
        println("$items")
        return items
    }
}