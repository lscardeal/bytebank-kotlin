package main.kotlin

object ContaBuilder {

    private var numeroConta: Int = 0

    fun build(titular: String): Conta {
        numeroConta++
        return Conta(titular, numeroConta);
    }
}