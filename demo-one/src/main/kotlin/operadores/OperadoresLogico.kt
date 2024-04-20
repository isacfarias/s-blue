package operadores
/**
 * >> TABELA DA VERDADE<<
 * && -> AND -> E
 * true && true
 * true && false
 * false && true
 * false && false
 **/
fun main() {

    println("T AND T ${true && true}")
    println("T AND F ${true && false}")
    println("F AND T ${false && true}")
    println("F AND F ${false && false}")

}