package receipt.operation

import account.Account
import operation.OperationType
import receipt.Receipt

abstract class OperationReceipt : Receipt {

    abstract val operationalAccount: Account;
    abstract val operationType: OperationType;
    abstract val value: Double;
}