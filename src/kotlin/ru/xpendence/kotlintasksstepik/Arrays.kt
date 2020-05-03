package ru.xpendence.kotlintasksstepik

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @since 30.04.2020
 * @author Вячеслав Чернышов
 */
fun main(args: Array<String>) {
    var array = readLine()!!.split(" ").map { it.toDouble() }
    print(array.average())
    array.sorted().
}