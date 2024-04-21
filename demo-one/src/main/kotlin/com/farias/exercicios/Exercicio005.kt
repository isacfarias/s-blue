package com.farias.exercicios


/**
 * EXERCICIO
 * ---------
 *
 * Escreva um programa que recebe um valor numérico pelo teclado, multiplicado por ele mesmo e imprime o resultado
 * Entretanto, se o valor fornecido for maior que 10, ele deve ser ajustado para 10 antes de ser multiplicado
 **/
fun main() {

    print("Informe um valor inteiro > ")
    var valor = readln().toInt()
    var calculo : Int
    var msg = ""
    if (valor > 10) {
        calculo = 10;
        msg = "informado era maior que 10, foi ajustado para 10 e"
    } else {
        calculo = valor
    }

    println("Valor digitado $valor $msg o resultado da multiplicação dele por ele mesmo é ${calculo * calculo}")
}