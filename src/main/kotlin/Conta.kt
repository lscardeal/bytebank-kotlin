package main.kotlin

class Account constructor(holder: String, number: Int) {

    private val holder = holder
    private val number = number
    private var balance: Double = 0.0

    fun deposite(value: Double): Boolean {
        return when {
            isValuePositive(value) -> {
                this.balance += value
                true
            }
            else -> false
        }
    }

    fun withdraw(value: Double): Boolean {
        return when {
            isValueValid(value) -> {
                this.balance -= value
                true
            }
            else -> false
        }
    }

    fun transfer(value: Double, beneficiario: Account): Boolean {
        return when {
            isValueValid(value) -> {
                this.withdraw(value)
                beneficiario.deposite(value)
                true
            }
            else -> false
        }
    }

    private fun isValuePositive(value: Double): Boolean {
        return value >= 0
    }

    private fun isValueWithinBalance(value: Double): Boolean {
        return value <= this.balance
    }

    private fun isValueValid(value: Double): Boolean {
        return isValuePositive(value) && isValueWithinBalance(value)
    }

    fun getHolder(): String {
        return this.holder
    }

    fun getNumber(): Int {
        return this.number
    }

    fun getBalance(): Double {
        return this.balance
    }
    override fun toString(): String {
        return "Holder: $holder || Number: $number || Balance: $balance"
    }
}