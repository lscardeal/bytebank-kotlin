import main.kotlin.Conta
import main.kotlin.ContaBuilder

fun main() {
    val contaMarcelo = ContaBuilder.build("Marcelo");
    val contaRenato = ContaBuilder.build("Renato")

    contaMarcelo.depositar(500.0)
    contaRenato.depositar(1000.0)

    contaRenato.sacar(300.0)

    contaRenato.transferir(100.0, contaMarcelo)

    println(contaMarcelo.toString())
    println(contaRenato.toString())
}