package ru.xpendence.kotlintasksstepik

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @since 05.05.2020
 * @author Вячеслав Чернышов
 */

fun main(args: Array<String>) {
    val input = readLine()!!.toInt()
    var hours = input.div(60)
    if (input % 60 >= 30) {
        hours++
    }
    val days = hours / 24
    hours -= (days * 24)
    println("days: $days")
    println("hours: $hours")
}