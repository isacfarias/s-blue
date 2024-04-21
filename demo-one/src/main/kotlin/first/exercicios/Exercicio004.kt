package first.exercicios


/**
 * EXERCICIO
 * ---------
 *
 * Encontre o resultado da seguinte expresão
 *
 * !(2 * 4 >= 16 /2 && 5 == 4 + 1)
 **/
fun main() {

    var exp = !(2 * 4 >= 16 / 2 && 5 == 4 + 1)
    println(exp)

    // Resolução
    // !(2 * 4 >= 16 /2 && 5 == 4 + 1)
    // !(8 >= 16 /2 && 5 == 4 + 1)
    // !(8 >= 8 && 5 == 4 + 1)
    // !(8 >= 8 && 5 == 5)
    // !(true && 5 == 5)
    // !(true && true)
    // !true
    // false
}