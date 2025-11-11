package org.example.org.example.lessons.lesson17.homework

abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    //приватная переменная доступна для всех подклассов основного класса
    private val privateVal: String,
    // 2. объясни, почему это поле недоступно в main()
    //переменная protected доступна только для инициализации внутри класса и подклассов
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"
    // это поле нельзя изменить, потому что оно protected
    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }
    fun printText() {
        privatePrint()
    }
    // 7. объясни, почему эта функция не может быть публичной
    // функция protected доступна только внутри класса и наследников
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }
    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }
    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }
    // 9. объясни, почему эта функция не может быть публичной или protected
    // потому что приватная функция доступна только в рамках класса
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}
class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // В мейн доступно одноимённое поле, а не этот аргумент
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // благодаря тому, что это класс-наследник
    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // Переопределения нет, потому что метод доступен только в классе, не наследуется, здесь privatePrint() - это просто одноимённый метод
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    override fun verifyPublicField(value: String): Boolean {
        return value.length < 100
    }

    fun updateProtectedField(value: String) {
        protectedField = value
    }
}

fun main() {
    val example1 = ChildrenClass("Bla1", "Bla2", "Bla3")
    example1.publicField = "Антонио Бандерас"
    example1.updateProtectedField("Новое значение ProtectedField")
    println(example1.getAll())
}