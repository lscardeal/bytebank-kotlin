package operation

object OperationValidator {

    fun isIncrementalOperantionValid(value: Double): Boolean {
        return isValuePositive(value)
    }

    fun isDecrementalOperationValid(balance: Double, value: Double): Boolean {
        return isValuePositive(value) && isValueWithinBalance(balance, value)
    }

    private fun isValuePositive(value: Double): Boolean {
        return value >= 0
    }

    private fun isValueWithinBalance(balance: Double, value: Double): Boolean {
        return value <= balance
    }
}