package receipt.operation

import account.Account
import operation.OperationType

class SingleOperationReceipt(override val operationalAccount: Account,
                             override val value: Double,
                             override val operationType: OperationType) : OperationReceipt() {

    override fun print() {
        println()
        println("RECEIPT ---")
        println("   Operation Type: $operationType")
        println("   Operational Account: ${operationalAccount.getHolder()}/#${operationalAccount.getNumber()}")
        println("   Value: $value")
        println()
    }
}