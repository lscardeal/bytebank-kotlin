fun main() {
    verifica(0)
    verifica(1)
    verifica(2)
}

fun verifica(saldo: Int) {
    when(saldo) {
        1 -> println("Batata")
        2 -> println("Arroz")
        else -> println("Mandioca")
    }
}