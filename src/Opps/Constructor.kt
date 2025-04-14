package Opps

//Constructor -> it initializes the object at the time of instantiating the object
// types -> 1. Primary constructor, 2. Secondary constructor
//Primary Constructor -> its a part of class header
class Car(val name: String, val color: String) {
    //body for primary constructor is defined and declared using init block
    //it is called with the primary constructor
    init {
        println("Creating object with $name, $color")
    }
    fun displayDetails() {}
}

//Secondary constructor
class Car2 {
    //lateinit is used when we want to initialize the variables later
    // without lateinit it will give error
    lateinit var carModel:String;
    lateinit var id:String;
    constructor(model: String) {
        println("Creating car object with $model")
        this.carModel = model
    }
    constructor(name:String, id:Int) {
        println("Creating car object with $name $id")
        this.carModel = name
        this.id = id.toString()
    }
}

fun main () {
    //Primary Constructor
//    var car1 = Car("Honda", "Black")
//    car1.displayDetails()

    //Secondary Constructor
//    var obj1 = Car2("Honda")
//    println(obj1.carModel)
    var obj2 = Car2("honda", 23)
    println(obj2.id)
}




