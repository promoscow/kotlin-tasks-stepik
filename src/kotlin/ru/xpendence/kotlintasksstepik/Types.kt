package ru.xpendence.kotlintasksstepik

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @since 05.05.2020
 * @author Вячеслав Чернышов
 */

//Необходимо разработать программу, получающую по целому число минут приблизительное значение в часах и днях.
//30 минут округляется до часа наверх, 24 часа это 1 день.
fun minutesToHoursAndDays() {
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
