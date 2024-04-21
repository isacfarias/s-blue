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

    var valor = readln().toInt()
    val type : String
    if (valor >= 0 && valor <= 12) {
        type = "CRIANÇA"
    } else if (valor >= 13 && valor <= 17) {
        type = "ADOLECENTE"
    } else if (valor >= 18 && valor <= 65) {
        type = "ADULTO"
    } else {
        type = "SÊNIOR"
    }

    println("Você é $type")
}