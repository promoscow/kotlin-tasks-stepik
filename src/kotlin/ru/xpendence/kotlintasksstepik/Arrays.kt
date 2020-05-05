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
//    println(isAnagram(readLine()!!, readLine()!!))
    println(findSubstrings(readLine()!!, readLine()!!))
}

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

//Решим данную задачу, Вы научитесь использовать строки и регулярные выражения. Синтаксис для регулряных выражений
//в Kotlin достаточно удобен. Например, такое выражение:
//fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""
//соответствует любой дате в формате 13.06.1992 (DD.DD.DDDD, где D - цифра).
//Переделайте, пожалуйста, это выражение так, чтобы оно соответствовало любой дате в формате
//13 JUN 1992 (DD MNH DDDD, число месяц год). Используйте переменную month .
fun getPattern(): String = """\d{2} $month \d{4}"""

//Продолжаем готовить функции для образовательной системы.
//Теперь вам нужно разработать функцию для распределения пользователей по разделам классного журнала.
//На вход функции подаётся список фамилий учеников (могут быть на русском, английском языках).
//Программа должна возвращать список, каждый элемент которого содержит фамилии учеников, начинающиеся с одной и той же буквы. Элементы списка должны быть упорядочены в алфавитном порядке, как и фамилии, содержащиеся в них.
//Такая функция будет очень полезна для образовательной системы.
//Sample Input:
//Smith Jones Bambury Patel Brown Singh Williams Taylor Wilson Davies Evans Scott
//Sample Output:
//Bambury Brown
//Davies
//Evans
//Jones
//Patel
//Scott Singh Smith
//Taylor
//Williams Wilson

//fun main() {
//    sortLists(readLine()!!.split(" ")).map { it.joinToString(separator = " ", postfix = "", prefix = "") }.forEach { println(it) }
//}
fun sortLists(inputList: List<String>) : MutableList<MutableList<String>>
        = inputList.groupBy { it.substring(0, 1) }.toSortedMap().values.map { it.sorted().toMutableList() }.toMutableList()

fun findSubstrings(text: String, substring: String) : MutableList<Int> {
    while (text.contains(substring)) {

    }
}

//Необходимо разработать программу, которая проверяет, может ли одно предложение быть образовано из другого как анаграмма.
//Пример:  "rail safety" <-> "fairy tales"
fun isAnagram(s1: String, s2: String) : Boolean {
    var result = s2
    for (char in s1.replace(" ", "")) {
        if (s2.toUpperCase().contains(char.toUpperCase())) {
            result = result.replaceFirst(char, ' ', true)
        }
    }
    return result.trim().isEmpty()
}

//fun permutationLexicographically() {
//    val numbers = "0 1 2 3 4 5 6 7 8 9".split(" ").map { it.toInt() }
//
//    println()
//}