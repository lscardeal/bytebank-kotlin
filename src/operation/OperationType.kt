package operation

enum class OperationType(val type: String) {
    DEPOSIT("Deposit"),
    WITHDRAW("Withdraw"),
    TRANSFER("Transfer")
}