package com.example.StudyAndroidApp.kotlin

fun main(args: Array<String>): Unit {
    val calculator: Calculator = Calculator(5)
    println(calculator.plus(3).minus(2).times(38).divide(5))
    println()

    val accout1: AccountBanking = AccountBanking(1000, "Lee", 931202)
    accout1.withdraw(1000)
    accout1.getBalance()
    accout1.deposit(300)
    accout1.getBalance()
    println()
    val account2:AccountBanking = AccountBanking(-1000, "Kim", 950213)
    println()

    var television: Television = Television()
    television.turnPower()
    television.turnPower()
    television.turnPower()
    television.channelControl(true)
    television.channelControl(true)
    television.channelControl(true)
    television.channelControl(false)
    television.turnPower()
    television.channelControl(true)
}

class Calculator(val initialValue: Int) {
    fun plus(num: Int): Calculator {
        return Calculator(this.initialValue + num)
    }

    fun minus(num: Int): Calculator {
        return Calculator(this.initialValue - num)
    }

    fun times(num: Int): Calculator {
        return Calculator(this.initialValue * num)
    }

    fun divide(num: Int): Calculator {
        return Calculator(this.initialValue / num)
    }
}

class AccountBanking(initialBalance: Int, val name: String, val birthday: Int) {
    var balance: Int = if(initialBalance >= 0) initialBalance else 0

    init {
        println("Name : ${name}")
        println("Birth : ${birthday}")
        println("Balance : ${balance}")
        println("New Account is Created!!")
    }

    fun getBalance() {
        println("This is Your Balance")
        println("Balance : ${balance}")
    }

    fun withdraw(money: Int) {
        balance += money
        println("Withdraw!!!")
        println("Balance : ${balance}")
    }

    fun deposit(money: Int) {
        val tempBalance: Int = balance - money
        if (tempBalance >= 0) {
            this.balance = tempBalance
            println("Deposit!!!")
            println("Balance : ${balance}")
        } else {
            println("Deposit Failed!!!")
            println("Balance : ${balance}")
        }
    }
}

class Television {
    var channel: CharArray = charArrayOf('S', 'K', 'M')
    var channelIndex: Int = 0
        set(value) {
            field = value
            if (field > 2) field = 0
            if (field < 0) field = 2
        }
    var power: Boolean = false


    fun turnPower() {
        this.power = !this.power
        print("Television Power Turn ")
        if (this.power) {
            println("On")
        } else {
            println("Off")
        }
    }

    fun channelControl(isUp: Boolean) {
        if (this.power) {
            println("Current Channel is ${this.channel[channelIndex]}")
        } else {
            println("Please Turn on TV")
        }
        this.channelIndex += 1
    }
}