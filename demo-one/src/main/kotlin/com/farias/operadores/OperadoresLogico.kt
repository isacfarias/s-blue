package com.farias.operadores
/**
 * >> TABELA DA VERDADE<<
 *
 * && -> AND -> E
 *        T AND T = true
 *        T AND F = false
 *        F AND T = false
 *        F AND F = false
 *
 * || -> OR -> OU
 *        T OR T = true
 *        T OR F = false
 *        F OR T = false
 *        F OR F = false
 *
 * !<?> -> NOT -> NÃO
 *        NOT T = false
 *        NOT F = true

 **/
fun main() {

    //AND
    println("&& -> AND -> E")
    println("T AND T = ${true && true}")
    println("T AND F = ${true && false}")
    println("F AND T = ${false && true}")
    println("F AND F = ${false && false}")
    println()
    //OR
    println("|| -> OR -> OU")
    println("T OR T = ${true && true}")
    println("T OR F = ${true && false}")
    println("F OR T = ${false && true}")
    println("F OR F = ${false && false}")
    println()
    //NOT
    println("!<?> -> NOT -> NÃO")
    println("NOT T = ${!true}")
    println("NOT F = ${!false}")
}