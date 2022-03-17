package ru.netology

fun main() {
    val sum = 1345
    val sumOfCommission = 0.75
    val minCommission = 35

    val commission = sum * sumOfCommission / 100
    val amount = if (commission < minCommission) sum - minCommission else sum - commission
    println ("Вы хотите перевести: $sum руб. После комиссии сумма составит: $amount руб.")
}
