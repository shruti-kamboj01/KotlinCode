package Basics

import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    println("Enter the number")
    var num1 = sc.nextInt()
    var num2 = sc.nextInt()
//    if(num > 10) {
//        println("Yes")
//    }
//    else {
//        println("No")
//    }

    //if expression
    if(num1 > num2) println(num1) else println(num2)

    //when expression
    var day = 5
    var day_in_words = when(day) {
        1 -> "monday"
        2 -> "tuesday"
       in 4..6 -> "wednesday"
        else -> "Invalid day number"
    }
    println(day_in_words)
}