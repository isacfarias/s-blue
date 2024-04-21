package com.farias.inicio.caracteres

fun main() {
    var s1 = "abc"
    var s2 = "def"
//    val s1s2 = "Soma: "+ (s1 + s2)
    val s1s2 = "Soma: '$s1$s2'. O Tamanho é : ${(s1 + s2).length} "

    println(s1s2)
}