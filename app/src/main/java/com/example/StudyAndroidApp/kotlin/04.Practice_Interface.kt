package com.example.StudyAndroidApp.kotlin

fun main(args: Array<String>): Unit {
    val student = Student__()
    student.eat()
    student.study()
}

// Inherit와 달리 지침서 느낌
// 각 함수가 각각 기능이 완전히 다를 때 / 협업 시 지침에 유용
interface Person__ {
    fun sleep() {
        println("Sleep")
    }

    open fun eat() {
        println("Eat")
    }

    abstract fun study() // abstract 명시하면 반드시 새로 작성해야 함
}

class Student__ : Person__ {
    override fun study() {
        println("Study Student")
    }
}