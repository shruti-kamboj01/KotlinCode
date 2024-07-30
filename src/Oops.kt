
class Complex(private var a: Int = 0, private var b: Int = 0) {
//    var a = real;
//    var b = img;

    fun setA(value:Int) {
        a = value
    }

    fun getA(): Int {
        return a
    }

    fun setB(value: Int) {
        b = value
    }

    fun getB(): Int {
        return b
    }

    fun print() {
        println("$a + ${b}i")
    }


}


fun main() {
    val c1 = Complex(4,5)
    c1.print()
    println("a: ${c1.getA()}")
    val c2 = Complex()
    c2.print()

}