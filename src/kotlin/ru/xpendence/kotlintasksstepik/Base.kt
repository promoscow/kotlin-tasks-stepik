package ru.xpendence.kotlintasksstepik

import java.math.BigInteger
import kotlin.math.pow

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @since 26.04.2020
 * @author Вячеслав Чернышов
 */
//Реализовать сортировку пузырьком (или другим более увлекательным способом), дополнив функцию bubbleSort.
fun bubbleSort(inputList: List<String>): IntArray {
    val list = inputList.map { it.toInt() }.toMutableList()
    for (i in 1 until list.size) {
        for (j in 1..list.size - i) {
            if (list[j] < list[j - 1]) {
                val temp = list[j]
                list[j] = list[j - 1]
                list[j - 1] = temp
            }
        }
    }
    return list.toIntArray()
}

//Вывести треугольник Паскаля до n-ой строки включительно.
fun pascalTriangle(rows: Int) {
    val data: MutableList<MutableList<String>> = mutableListOf()
    for (i in 1..rows) {
        val row = mutableListOf<String>()
        for (j in 1 until i * 2) {
            if (j == 1 || j == (i * 2 - 1)) {
                row.add("1")
                print(row[j - 1])
            } else if (j % 2 == 0) {
                row.add(".")
                print(row[j - 1])
            } else {
                row.add((data[i - 2][j - 3].toInt() + data[i - 2][j - 1].toInt()).toString())
                print(row[j - 1])
            }
        }
        data.add(row)
        println()
    }
}

//Дан следующий Java-код, в котором  foo()  имеет несколько перегрузок:
//public String foo(String name, int number, boolean toUpperCase) {
//    return (toUpperCase ? name.toUpperCase() : name) + number;
//}
//public String foo(String name, int number) {
//    return foo(name, number, false);
//}
//public String foo(String name, boolean toUpperCase) {
//    return foo(name, 42, toUpperCase);
//}
//public String foo(String name) {
//    return foo(name, 42);
//}
//В Kotlin аналогичное поведение можно реализовать с помощью одной функции с аргументами по умолчанию.
// Необходимо поменять объявление функции foo так, чтобы код ниже был успешно собран компилятором.
// При этом надо использовать именованные аргументы и аргументы по умолчанию.
//* по мотивам Kotlin Koans
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
    (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)

//Аргументы по умолчанию (default), а также именованные (named) аргументы помогают уменьшить количество перегрузок,
// что может упростить чтение кода с вызовами функций (почему?). Функция  joinToString объявлена со следующими
// значениями по умолчанию для параметров:
//
//fun joinToString(
//    separator: String = ", ",
//    prefix: String = "",
//    postfix: String = "",
//    /* ... */
//): String
//Эта функция умеет, например, объединять коллекцию (будут подробно рассмотрены в следующих уроках) строк в одну
// большую строку. Вам надо доработать определение функции  joinOptions() так, чтобы она формировала из список строчку
// в JSON-формате. Например, список для списка из элементов "a", "b" и  "с" формируется строка  "[a, b, c]" .
//
//Для решения задачи вы должны задать только два аргумента функции.
fun joinOptions(options: Collection<String>) = options.joinToString(separator = ", ", prefix = "[", postfix = "]")

//Написать элементарную программу кодирования строки. Каждый символ кодируется своим обозначением и количеством повторений.
//Например, для строки «aaaaaabbbbbaccccddeeeee» результатом кодирования будет строка «a6b5a1c4d2e5».
fun compressing() {
    val string = readLine()!!
    var char: Char? = null
    var counter = 0
    for (ch in string) {
        when {
            char == null -> {
                char = ch
                print(ch)
                counter++
            }
            ch == char -> {
                counter++
            }
            else -> {
                print(counter)
                char = ch
                print(ch)
                counter = 1
            }
        }
    }
    print(counter)
}

//Интеллектуальная среда разработки IntelliJ IDEA умеет конвертировать Java-код в Kotlin-код.
//Ваша задача состоит в том, чтобы конвертировать функцию toJSON в Kotlin-код:
fun toJSON(collection: Collection<Int?>): String {
    val sb = StringBuilder()
    sb.append("[")
    val iterator = collection.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        sb.append(element)
        if (iterator.hasNext()) {
            sb.append(", ")
        }
    }
    sb.append("]")
    return sb.toString()
}

//Даны 111 беззнаковых целых, каждое из которых состоит из 47 цифр (см. пример ниже).
//Необходимо вывести первые 9 цифр их суммы. В данной задаче не предполагает использование коллекций.
fun countBigInts() {
    var sum = 0.toBigInteger()
    var i = readLine()
    while (i != null && !i.isBlank()) {
        sum += i.toBigInteger()
        i = readLine()
    }
    var result = sum.toString()
    result = result.substring(0, 9)
    print(result)
}

//Реализовать функцию для перевода числа, заданного в двоичной системе счисления в шестнадцатеричную.
fun binaryToHex() {
    val binary = readLine()!!
    var sum = 0
    var index = 1
    for (ch in binary) {
        if (ch == '1') {
            val doubleVal = 2.0
            val toInt = StrictMath.pow(doubleVal, (binary.length - index).toDouble()).toInt()
            sum += toInt
        }
        index++
    }
    println(sum.toString(16))
}