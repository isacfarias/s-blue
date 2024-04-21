package com.farias.inicio.inputs

import java.util.Scanner

fun main() {
    /*
    print("Gigite seu nome:")
    var nome = readln()
    println("seu nome invertido é ${nome.reversed()}")
    */

    val scanner = Scanner(System.`in`)
    print("> ")
    val n1 = scanner.nextInt()
    print("> ")
    val n2 = scanner.nextInt()

    println("valores ${n1 + n2}")
}