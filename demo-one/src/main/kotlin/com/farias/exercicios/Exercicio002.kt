package com.farias.exercicios

/**
 * EXERCÍCIO
 * --------
 *
 * Crie um programa que arrendonda um valor decimal informado pelo usuário e mostre
 * a resposta na tela.
 *
 * O arredondamento pode ser feito truncando as casas decimais.
 *
 */
fun main() {

    print("Digite um valor quebrado >")
    val valor = readln().toDouble()
    println("O valor inteiro é  ${valor.toInt()}")

    print("Digite um valor quebrado >")
    val valor2 = readln().toDouble().toInt()
    println("O valor inteiro é  $valor2")

    print("Digite um valor quebrado >")

    println(readln().toDouble().toInt())
}