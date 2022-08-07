package operation

import account.Account
import receipt.operation.SingleOperationReceipt
import receipt.operation.TransferOperationReceipt

object OperationManager {

    private val validator = OperationValidator

    fun transfer(sender: Account, receiver: Account, value: Double): Boolean {
        return when {
            validator.isDecrementalOperationValid(sender.balance, value) -> {
                sender.decrement(value)
                receiver.increment(value)
                TransferOperationReceipt(sender, receiver, value).print()
                true
            }
            else -> false
        }
    }

    fun deposite(account: Account, value: Double): Boolean {
        return when {
            validator.isIncrementalOperantionValid(value) -> {
                account.increment(value)
                SingleOperationReceipt(account, value, OperationType.DEPOSIT).print()
                true
            }
            else -> false
        }
    }

    fun withdraw(account: Account, value: Double): Boolean {
        return when {
            validator.isDecrementalOperationValid(account.balance, value) -> {
                account.decrement(value)
                SingleOperationReceipt(account, value, OperationType.WITHDRAW).print()
                true
            }
            else -> false
        }
    }
}