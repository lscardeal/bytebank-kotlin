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
        println("   Operational Account: ${operationalAccount.holder}/#${operationalAccount.number}")
        println("   Counterpart Account: ${counterpartAccount.holder}/#${counterpartAccount.number}")
        println("   Value: $value")
        println()
    }
}