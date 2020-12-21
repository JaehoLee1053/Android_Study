package com.example.StudyAndroidApp.kotlin

fun main(args: Array<String>): Unit {
    first()
    println()
    println(second(79))
    println()
    println(third(79))
    fourth()
}

fun first(): Unit {
    val firstList: List<Int> = List(9) { it -> it + 1 }
    val secondList: MutableList<Boolean> = MutableList(9) { true }

//    for (i in firstList.indices) {
//        if (firstList[i] % 2 == 1) {
//            secondList[i] = false
//        }
//    }

    secondList.forEachIndexed { index, value ->
        if (firstList[index] % 2 == 1) {
            secondList[index] = false
        }
    }

    println(firstList)
    println(secondList)
}

fun second(score: Int): String {
    return when (score) {
        in 90..100 -> "A"
        in 80 until 90 -> "B"
        in 70 until 80 -> "C"
        else -> "F"
    }
}

fun third(number: Int): Int {
    return number % 10 + number / 10
}

fun fourth(): Unit {
    for (i in 1..9) {
        for (j in 2..9) {
            print("$j X $i = ${i * j}\t")
        }
        println()
    }
}