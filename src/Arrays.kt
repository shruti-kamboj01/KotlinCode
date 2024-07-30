fun main() {
//    val names = "Shruti, Mamta"
//    println(names)
//    val arraysOfNames = arrayOf("Shruti", "Mamta", 7)
//    println( arraysOfNames.contentToString() )
//    println(arraysOfNames.binarySearch("Mamta"))
//    if("Shruti" in arraysOfNames) {
//        println("found")
//    }
//    else{
//        println("not found")
//    }
    val names: List<String> = listOf("Alice", "Bob", "Charlie")
    val lines = listOf("Shared room in Mumbai", "Daksha's Dormitory")
    val text = "Shared room in Navi Mumbai" +
    "Jagjanani Niwas"+
           " 1 bed"+
            "₹866"+
            "5.0 out of 5 average rating, 8 reviews"

    val fruits = text.split("/n")
         val phrase = fruits[0].trim()
        println(phrase[0])

    println(names.getOrNull(0).orEmpty())
    //other ways to create arrays
    val arrayOfNulls =  arrayOfNulls<String>(5)
    arrayOfNulls[4] = "hello"
//    println(arrayOfNulls.contentToString())
    }

