import kotlin.math.pow

fun main() {

    println()
    val int = 439
    println("Перевод числа $int из десятичной системы в двоичную систему: " +
            convertingNumberFromDecimalSystemToBinary(int)
    )
    println()

    println("Перевод числа \"110110111\" из двоичной системы в десятичную систему: "
            + convertingNumberFromBinaryToDecimal("110110111"))
    println()

    println("Проверка, является ли слово палиндромом:")
    println("racecar - " + isWordPalindrome("racecar"))
    println("3553 - " + isWordPalindrome("3553"))
    println("palindrome - " + isWordPalindrome("palindrome"))
}

/*
Написать программу перевода числа из десятичной системы в двоичную систему счисления.
*/
fun convertingNumberFromDecimalSystemToBinary(int: Int): String {
    val list = mutableListOf<Int>()
    var number = int
    while (number > 0) {
        list.add(number % 2)
        number /= 2
    }
    return list.reversed().joinToString("")
}

/*
Написать программу перевода числа из двоичной системы в десятичную систему счисления.
*/
fun convertingNumberFromBinaryToDecimal(string: String): Int {
    val reversedDigits = string.reversed()
        .toCharArray()
        .map{it.digitToInt()}
    var number = 0
    for ((count, n) in reversedDigits.withIndex()) number += (n * 2.0.pow(count)).toInt()
    return number
}

/*
Написать программу, которая проверяет, является ли слово палиндромом.
*/
fun isWordPalindrome(string: String): Boolean {
    val reversed = string.reversed()
    return string == reversed
}