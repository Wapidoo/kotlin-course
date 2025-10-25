package org.example.org.example.lessons.lesson14.homework

fun main() {
    val emotion = Emotion("Happiness", 7)
    emotion.express()

}

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        if (type == "Happiness" && intensity in 7..10) {
            println("Strong feeling of $type")
        }
        else if (type == "Sadness" && intensity in 1..5) {
            println("A person feels a little $type")
        }
        else if (type == "Fear" && intensity in 1..5) {
            println("A person is a bit scared and feels $type")
        }
        else {
            println("Other emotional spectrum")
        }
    }
}