import account.AccountBuilder
import operation.OperationManager

fun main() {
    val contaMarcelo = AccountBuilder.build("Marcelo");
    val contaRenato = AccountBuilder.build("Renato")

    val operationManager = OperationManager

    operationManager.deposite(contaMarcelo, 500.0)
    operationManager.deposite(contaRenato, 1000.0)

    operationManager.withdraw(contaRenato, 300.0)

    operationManager.transfer(contaRenato, contaMarcelo, 100.0)

    println(contaMarcelo.getDetails())
    println(contaRenato.getDetails())
}