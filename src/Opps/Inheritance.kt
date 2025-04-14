package Opps

open class Shape {
    open fun draw() {
        print("drawing")
    }
    fun fill() {
        print("filling shape with colours")
    }

}

interface Shape2 {
    val vertexCount: Int
}

class Circle : Shape() {
    override fun draw() {
        println("drawing cicle")
    }

}

class Rectange: Shape2 {
    override val vertexCount: Int = 4
}

fun main() {
    val c1 = Circle()
    c1.draw()
}