package org.example.org.example.lessons.lesson16.homework.products

class BasketOfGoods(
    var goods: MutableMap<Int, Int> = mutableMapOf(
        1 to 6,
        2 to 4,
        3 to 18,
        4 to 12
    )
) {
    fun addToCart(itemId: Int) {
        goods[itemId] = goods.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) {
        goods[itemId] = goods.getOrDefault(itemId, 0) + amount
    }

    fun addToCart(listItemId: List<Int>) {
        listItemId.forEach { addToCart(it) }
    }

    fun addToCart(map: Map<Int, Int>) {
        map.forEach { addToCart(it.key, it.value)}
    }

    override fun toString(): String {
//        var countAmount = 0
//        var str = " "
//        for ((itemId, amount) in goods.toSortedMap()) {
//            str += "Артикул $itemId        Количество $amount \n"
//            countAmount = amount
//        }
//        return str + "Всего артикулов: ${goods.size}\nВсего товаров: ${countAmount}\n"

        val countId = goods.size
        val countAmount = goods.values.sum()
        val list = goods.map { "Артикул: ${it.key}        Количество: ${it.value}"}.joinToString(" \n ")
        return list + "Всего артикулов: ${countId}\nВсего товаров: ${countAmount}\n"
    }
}