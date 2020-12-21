package com.example.StudyAndroidApp.kotlin

fun main(array: Array<String>) {
    val knight = Knight(30, 5, "Shield")
    val monster = Monster(20, 3)

    knight.attack(monster, knight.power)
    monster.attack(knight, monster.power)
    monster.bite(knight, monster.power)
    monster.bite(knight, monster.power)
    monster.attack(knight, monster.power)

}

open class Character(private var hp: Int, val power: Int) {
    open fun attack(character: Character, power: Int = this.power) {
        character.defence(power)
    }

    open fun defence(damage: Int) {
        hp -= damage
        if (hp > 0) println("${javaClass.simpleName} HP : $hp") else println("You Died")
    }
}

class Knight(hp: Int, power: Int, var item: String) : Character(hp, power) {
    init {
        println(
            "--------------------\n" +
                    "${javaClass.simpleName}\n" +
                    "HP : $hp\n" +
                    "Power : $power\n" +
                    "Item : $item\n" +
                    "--------------------\n\n"
        )
    }

    override fun defence(damage: Int) {
        if(item == "Shield") super.defence(damage - 2) else super.defence(damage)
    }
}

class Monster(hp: Int, power: Int) : Character(hp, power) {
    init {
        println(
            "--------------------\n" +
                    "${javaClass.simpleName}\n" +
                    "HP : $hp\n" +
                    "Power : $power\n" +
                    "--------------------\n\n"
        )
    }

    fun bite(character: Character, power: Int) {
        super.attack(character, power + 2)
    }
}