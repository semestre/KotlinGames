package com.example.kotlingames.games

//Adivina un numro
//Se debe selefccionar un numero dentro de un rango
//La computadora debe ser capaz de seleccionar ese numero
//El programa debe solicitar al usuario ingresar las suposiciones
//Debe de asegurarse recibir numeros validos
//El juego termina cuando el jugador acierta el numero

fun main() {
    println("Por favor ingrese un número del rango 1-3, donde: \n1. Piedra\n2. Papel\n3. Tijera")
    var choiceInput = readlnOrNull()?.toIntOrNull()
    var isValidInput = choiceInput != null && choiceInput in 1..3

    while (!isValidInput) {
        println("Entrada no válida. Por favor ingresa los números 1, 2 o 3")
        choiceInput = readlnOrNull()?.toIntOrNull()
        isValidInput = choiceInput != null && choiceInput in 1..3
    }

    println("Juego se ejecutó")

    val computerChoice = (1..3).random()
    val computerChoiceString = when (computerChoice) {
        1 -> "Piedra"
        2 -> "Papel"
        3 -> "Tijera"
        else -> "Desconocido"
    }

    println("La computadora seleccionó: $computerChoiceString")

    val winner = when {
        choiceInput == computerChoice -> "Empate"
        choiceInput == 1 && computerChoice == 3 -> "El jugador"
        choiceInput == 2 && computerChoice == 1 -> "El jugador"
        choiceInput == 3 && computerChoice == 2 -> "El jugador"
        else -> "La computadora"
    }

    println("El ganador es: $winner")
}
