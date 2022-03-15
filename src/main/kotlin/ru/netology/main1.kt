package ru.netology

fun main() {
    val sumOfPreviousDay = (0..15000).random()
    val standardDiscount = 100
    val highDiscount = 5
    val vipDiscount = 1
    val vip = Math.random() < 0.5
    var amount = 1500.toDouble()

    println("Предыдущая сумма вашей покупки: $sumOfPreviousDay")

    if (sumOfPreviousDay in 1..1000) {
        println("Нельзя применить скидку к данной покупке. Сумма: $amount")
    } else if (sumOfPreviousDay in 1001..10000) {
        amount -= standardDiscount
        println("Сумма с учетом стандартной скидки составит: $amount")
    } else {
        val discount = amount * highDiscount / 100
        amount -= discount
        println("Сумма с учетом повышенной скидки составит: $amount")
    }

    if (vip) {
        val discount = amount * vipDiscount / 100
        amount -= discount
        println("Итоговая сумма к оплате $amount (с учетом скидки постоянного покупателя). ")
    } else {
        println("Итоговая сумма к оплате $amount (Покупатель не является постоянным клиентом. Скидку применить нельзя)")
    }
}


