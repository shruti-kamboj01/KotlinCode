package Basics

fun main() {
    val addition = {x:Int, y:Int ->
        println("adding 2 numbers")
            x + y
        }

    println("sum of 4 &5 is ${addition(4,5)}")
}