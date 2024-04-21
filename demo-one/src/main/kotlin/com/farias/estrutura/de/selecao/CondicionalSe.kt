package com.farias.estrutura.de.selecao

fun main() {


    print("Informe a temperatura > ")
    val temp = readln().toInt()

    if (temp > 22) {
        println("Está calor")
        println("A tempreatura é $temp° ")
    } else {
        println("Não estou pronto pra essa conversa")
    }

    println("E fim ;>")
}
