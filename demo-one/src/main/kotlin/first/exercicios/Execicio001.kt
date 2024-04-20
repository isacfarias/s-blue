package first.exercicios

import java.util.*

/**
 * EXERCÍCIO
 * ---------
 *
 * Solicite 3 informaçãoes do usuario: nome, idade e peso, Depois imprima uma frase que contenha
 * essas informações (use string templates para manter a frase).
 **/

fun main() {
    val scanner = Scanner(System.`in`)
    print("Informe o nome > ")
    val nome = scanner.next()
    print("Informe o idade > ")
    val idade = scanner.nextInt()
    print("Informe o peso > ")
    val peso = scanner.nextBigDecimal()

    println("Olá sou(a) $nome tenho $idade anos e peso $peso Kg.")
    println("Olá sou(a) ${nome} tenho ${idade} anos e peso ${peso} Kg.")
}