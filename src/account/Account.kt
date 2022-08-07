package account

class Account constructor(holder: String, number: Int) {

    val holder = holder
    val number = number
    var balance: Double = 0.0
        private set

    internal fun increment(value: Double) {
        this.balance += value
    }

    internal fun decrement(value: Double) {
        this.balance -= value
    }

//    fun getHolder(): String {
//        return this.holder
//    }
//
//    fun getNumber(): Int {
//        return this.number
//    }
//
//    fun getBalance(): Double {
//        return this.balance
//    }
    fun printDetails() {
        println("Holder: $holder | Number: $number | Balance: $balance")
    }
}