package questions

fun main() {
    println("Enter the number")
    val digit = readln().toInt()
//    val count = countDigit(digit)
//    println("Number of digits: $count")
    reverseDigit(digit)
}


fun countDigit(digit: Int): Int {
    var mutableDigit = digit;
    var count = 0;
    while(mutableDigit > 0) {
        mutableDigit /= 10;
        count++;
    }
    return count;
}

fun reverseDigit(digit:Int) {
    var mutableDigit = digit;
    var newNumber:String = ""
    while(mutableDigit > 0) {
        newNumber += (mutableDigit%10).toString()
        mutableDigit /= 10;

    }
    println(newNumber)
}