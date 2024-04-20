package operadores

fun main() {

    val value = 5 + 4 - 3 * 2 * (1+ 1) / 3
    println("Resultado: $value")

    //Resolução
    // 5 + 4 - 3 * 2 * (1+ 1) / 3
    // 5 + 4 - 3 * 2 * 2 / 3
    // 5 + 4 - 6 * 2 / 3
    // 5 + 4 - 12 / 3
    // 5 + 4 - 4
    // 9 - 4
    // 6

    val exp2 = true && false || true && !false
    println("Resolução $exp2")

    //Resolução
    // true && false || true && !false
    // true && false || true
    // false || true
    // true



}