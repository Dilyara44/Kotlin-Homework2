package ru.netology


fun main() {

    val likes = (0..10000).random()


    if (likes % 10 != 1) {
        println("Понравилось $likes людям")
    } else {
        if (likes % 100 == 11) {
            println("Понравилось $likes людям")
        } else {
            println("Понравилось $likes человеку")
        }
    }

}
