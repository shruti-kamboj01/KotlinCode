package Basics
//function return type is Int, return int value
fun multiply(a: Int=1, b: Int): Int {// a has a default value as 1
    return a*b
}

// a function body can be an expression(a/b is the expression). its return type is inferred(hidden)
// its too obvious for compiler to find the return type  of this function
fun divide(a: Int, b: Int) = a/b

// a function that return no meaningful value
// function return type is unit, its just like void that returns nothing
    fun add(a: Int, b: Int):Unit {
        println("sum of $a and $b is ${a+b}")
    }

// unit return type can be omitted
    //fun add(a: Int, b: Int){
    //    println("sum of$a and $b is ${a+b}")
    //}


fun main() {
    println(multiply(b = 4, a = 5)) // named arguments
    println(divide(5,6))
    add(3,4)
}
