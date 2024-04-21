package com.farias.exercicios


/**
 * EXERCICIO
 * ---------
 * Escreva um programa que recebe um valor numérico pelo teclado, e diz se é par ou impar
 **/
fun main() {

    print("Informe um valor inteiro > ")

    var valor = readln().toInt()
    val type : String
    if (valor % 2 == 0) {
        type = "par"
    } else {
       type = "impar"
    }

    println("Valor digitado $valor é $type")
}