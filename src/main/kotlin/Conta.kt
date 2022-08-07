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

    fun sacar(valor: Double): Boolean {
        return when {
            valor <= this.saldo -> {
                this.saldo -= valor
                true
            }
            else -> false
        }
    }

    fun transferir(valor: Double, beneficiario: Conta): Boolean {
        return when {
            valor <= this.saldo -> {
                this.sacar(valor)
                beneficiario.depositar(valor)
                true
            }
            else -> false
        }
    }

    override fun toString(): String {
        return "Titular: $titular || Numero: $numero || Saldo: $saldo"
    }
}