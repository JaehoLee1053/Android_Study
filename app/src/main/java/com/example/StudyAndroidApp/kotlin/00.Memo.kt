package com.example.StudyAndroidApp.kotlin

fun main(args: Array<String>): Unit {
    println(solution("hit", "cog", arrayOf<String>("hot", "dot", "dog", "lot", "log", "cog")))
}

fun solution(begin: String, target: String, words: Array<String>): Int {
    var answer = 0
    var isVisited: BooleanArray = BooleanArray(words.size) { false }
    var word1 = begin
    var n = words.size

    fun bfs(start: Int) {
        val queue = mutableListOf<String>()
        queue.add(words[0])

        while (!queue.isEmpty()) {
            val d = queue.removeAt(0)
            for (i in 0 until n) {
                if (!isVisited[i]) {
                    val word2 = words[i]
                    if (compareWord(word1, target)) {
                        println("Target $word1 $word2 $target")
                        answer++
                        break
                    } else if (compareWord(word1, word2)) {
                        println("NonTarget $word1 $word2")
                        isVisited[i] = true
                        word1 = word2
                        answer++
                    }
                }
            }
        }
    }
    bfs(0)
    return answer
}

fun compareWord(word1: String, word2: String): Boolean {
    val n = word1.length
    var count = 0
    for (i in 0 until n) {
        if (word1[i] != word2[i]) count++
        if (count >= 2) return false
    }
    return true
}
