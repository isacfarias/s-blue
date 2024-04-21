package com.farias.exercicios


/**
 * EXERCICIO
 * ---------
 * Escreva um programa que, com base em uma idade fornecida, classifica a pessoa nos grupos abaixo:
 *
 * -- CRIANÇA: 0 a 12 anos
 * -- ADOLECENTE: 13 a 17 anos
 * -- ADULTO: 18 a 65 anos
 * -- SÊNIOR: 66 anos ou mais
 **/
fun main() {

    print("Informe um valor inteiro > ")

    var age = readln().toInt()
    val type : String
    if (age >= 0 && age <= 12) {
        type = "CRIANÇA"
    } else if (age >= 13 && age <= 17) {
        type = "ADOLECENTE"
    } else if (age >= 18 && age <= 65) {
        type = "ADULTO"
    } else if (age >= 66){
        type = "SÊNIOR"
    }

    println("Você é $type")
}