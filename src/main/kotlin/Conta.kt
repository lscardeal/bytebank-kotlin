package main.kotlin

class Conta constructor(titular: String, numero: Int) {

    private val titular = titular
        get() = field

    private val numero = numero
        get() = field

    private var saldo: Double = 0.0
        get() = field

    fun depositar(valor: Double) {
        this.saldo += valor
    }

    fun sacar(valor: Double) {
        this.saldo -= valor
    }

    fun transferir(valor: Double, beneficiario: Conta) {
        this.sacar(valor)
        beneficiario.depositar(valor)
    }

    override fun toString(): String {
        return "Titular: $titular || Numero: $numero || Saldo: $saldo"
    }
}