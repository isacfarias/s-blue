package first.exercicios


/**
 * EXERCICIO
 * ---------
 *
 * Encontre o resultado da seguinte expresão
 *
 * (5 + 3) * 2 < 30 / 2 || !( 5 -1 <= 8 % 3 )
 **/
fun main() {

    var exp = (5 + 3) * 2 < 30 / 2 || !( 5 -1 <= 8 % 3 )
    println(exp)

    // Resolução
    // (5 + 3) * 2 < 30 / 2 || !( 5 -1 <= 8 % 3 )
    // (5 + 3) * 2 < 30 / 2 || !( 4 <= 8 % 3 )
    // (5 + 3) * 2 < 30 / 2 || !( 4 <= 2 )
    // 8 * 2 < 30 / 2 || !( 4 <= 2 )
    // 16 < 30 / 2 || !( 4 <= 2 )
    // 16 < 15 || !( 4 <= 2 )
    // 16 < 15 || !false
    // false || true
    // true
}