import main.kotlin.AccountBuilder

fun main() {
    val contaMarcelo = AccountBuilder.build("Marcelo");
    val contaRenato = AccountBuilder.build("Renato")

    contaMarcelo.deposite(500.0)
    contaRenato.deposite(1000.0)

    contaRenato.withdraw(300.0)

    contaRenato.transfer(100.0, contaMarcelo)

    println(contaMarcelo.toString())
    println(contaRenato.toString())
}