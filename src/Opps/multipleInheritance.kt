package Opps

interface Grandfather{
    fun grandfatherMethod() {
        println("grandfather method")
    }
}

interface parent {
    fun parent(){
        println("parent method")
    }
}

class child: Grandfather, parent

fun main() {
    val obj = child()
    obj.parent()
    obj.grandfatherMethod()
}

