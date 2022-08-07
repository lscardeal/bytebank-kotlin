package account

class Account constructor(holder: String, number: Int) {

    private val holder = holder
    private val number = number
    private var balance: Double = 0.0

    internal fun increment(value: Double) {
        this.balance += value
    }

    internal fun decrement(value: Double) {
        this.balance -= value
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
    fun getDetails(): String {
        return "Holder: $holder | Number: $number | Balance: $balance"
    }
}