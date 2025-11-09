package org.example.org.example.lessons.lesson16.homework.logger

import java.lang.Exception

class Logger() {
    fun log(message: String) {
        println("INFO:$message")
    }

    fun log(message: String, level: String) {
        when (level) {
            "WARNING" -> println("\u001B[33mWARNING: $message\u001B[0m")
            "ERROR" -> println("\u001B[37mERROR: $message\u001B[0m")
            else -> println("INFO: $message")
        }
    }

    fun log(messageList: List<String>) {
        messageList.forEach { println("INFO: $it") }
    }

    fun log(exception: Exception,) {
        println("ERROR: ${exception.message}")
    }
}