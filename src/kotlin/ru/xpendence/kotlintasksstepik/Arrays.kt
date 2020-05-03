package ru.xpendence.kotlintasksstepik

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @since 30.04.2020
 * @author Вячеслав Чернышов
 */

//Необходимо разработать программу для поиска среднего и медианного значений списка действительных чисел со знаком,
//подаваемого на вход программы. Медианным значением считается такое число выборки, что ровно половина из элементов
//выборки больше него, а другая половина меньше него. Если в выборке чётное число элементов, медиана вычисляется как
//полусумма двух центральных элементов в упорядоченной выборке.
//Вход: список с n элементами.
//Выход: два значения (среднее, медиана)
fun countAverageAndMedian(args: Array<String>) {
    val array = readLine()!!.split(" ").map { it.toDouble() }
    println(array.average())
    array.sorted().let { (it[it.size / 2] + it[(it.size - 1) / 2]) / 2 }.let { println(it) }
}

//Представьте, что Вы - разработчик образовательной системы.
//Вам надо написать функцию для удаления повторных регистраций от пользователей с одинаковыми именами.
//Список пользователей подаётся на вход программы в виде списка строк.
//Необходимо разработать программу для поиска повторов в таком списке и их удаления.
//На выход ваша функция должна выдавать список строк без повторов.
fun deleteCopies(inputList: List<String>) : List<String> = inputList.distinct()

fun main() {
    println(deleteCopies(readLine()!!.split(" ")))
}