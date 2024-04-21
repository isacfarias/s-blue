package com.farias.operadores

fun main() {

    /**
     * TODO:
     * Detalhes, na divisão de inteiros deve se observar que o kotlin não retorna casas decimais mesmo essa,
     * existindo, pois ele considera o tipo do dado que esta sendo dividido, se for um numero decima e um numero
     * interio, o resultado da divisão será o valor mais abrangente.
     *
     */


    // exemplo de  divisão com inteiros, é esperado um valor quebrado, porem isso não acontece, o kotlin trunca as casa decimais
    val a = 10
    var b = 3
    println("Divisão entre inteiros ${a/b} ")

    //no exemplo abaixo o kotlin considera que o 10 e decimal e nesse caso vai fazer a divisão e exibir as casas decimeis
    val c = 10.0
    var d = 3
    println("Divisão entre dicimal / inteiros ${c/d} ")


}