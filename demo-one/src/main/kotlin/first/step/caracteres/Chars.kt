package first.step.caracteres

fun main() {
    val c: Char = 'A'

    println(c)
    println(c.code)

    val i = 65
    println(i.toChar())

    var sequencia = 'A'
    println(sequencia.inc().inc().toChar())
    println(sequencia.isDigit())
    println(sequencia.isLowerCase())
    println(sequencia.digitToInt())

}