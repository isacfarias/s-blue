package com.farias.estrutura.de.selecao

fun main() {


    print("Informe um valor > ")
    var value = readln().toInt()

    when(value) {
        10 -> println("É 10")
        20 -> println("É 20")
        30 -> println("É 30")
        40 -> println("É 40")
        50 -> println("É 50")
        60 -> println("É 60")
        else -> println("Tem certeza que sabe o que esta fazendo ?????")
    }


    print("Informe um valor > ")
    value = readln().toInt()

    when(value) {
        in 0 .. 10 -> println("Range de 0 a 10")
        in 11 .. 20 -> println("Range de 11 a 20")
        else -> println("Tem certeza que sabe o que esta fazendo ?????")
    }


    print("Informe um valor > ")
    value = readln().toInt()

    when(value) {
        0,2,4,6 -> println("é par")
        else -> println("Não faz parte do range, e agora ?")
    }


    print("Informe um valor > ")
    value = readln().toInt()

    when {
        value > 0 -> println("POSITIVO")
        value < 0 -> println("NEGATIVO")
        else -> println("ZERO")
    }


    print("Informe um valor > ")
    value = readln().toInt()

   var result =  when {
        value > 0 -> "POSITIVO"
        value < 0 -> "NEGATIVO"
        else -> "ZERO"
    }

    println("Resultado $result")

    print("Informe um dos valores (A, B) > ")
    var str = readln()[0]

    result =  when(str) {
        'A', 'a' -> "AAAAAAAAA"
        'B', 'b' -> "BBBBBBBBB"
        else -> "Não sei qume é"
    }

    println("Resultado $result")
}