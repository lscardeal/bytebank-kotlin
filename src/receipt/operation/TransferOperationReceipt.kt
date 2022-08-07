package receipt.operation

import account.Account
import operation.OperationType

class TransferOperationReceipt(override val operationalAccount: Account,
                               val counterpartAccount: Account,
                               override val value: Double) : OperationReceipt() {

    override val operationType: OperationType = OperationType.TRANSFER

    override fun print() {
        println()
        println("RECEIPT ---")
        println("   Operation Type: $operationType")
        println("   Operational Account: ${operationalAccount.getHolder()}/#${operationalAccount.getNumber()}")
        println("   Counterpart Account: ${counterpartAccount.getHolder()}/#${counterpartAccount.getNumber()}")
        println("   Value: $value")
        println()
    }
}