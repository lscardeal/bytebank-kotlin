package main.kotlin

object AccountBuilder {

    private var accountNumber: Int = 0

    fun build(holder: String): Account {
        accountNumber++
        return Account(holder, accountNumber);
    }
}