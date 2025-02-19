package com.example.app.Games

fun main() {

    fun isPrimeNumber(num: Int): Boolean {
        if (num < 2) return false
        for (i in 2 until num) {
            if (num % i == 0) return false
        }
        return true
    }
    while (true) {
        println("Ingrese un número entero")
        val number = readlnOrNull()?.toIntOrNull()


        if (number == null || number < 1) {
            println("Por favor, ingrese un número entero")
            return
        } else {

            val isPrime = isPrimeNumber(number)
            println(if (isPrime) "$number es prime" else "$number not prime")
        }
    }
}