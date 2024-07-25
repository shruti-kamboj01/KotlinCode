fun main() {
    val name:String = "Shruti"
    println(name[0])
    //length->property(as it is without brackets)
    println(name.length)
    //last()->function or method(it is with brackets)
    println(name.last())
    println(name.isEmpty())

    //*****concatenating string with value
    val age = 20
    //msg is a string
    val msg = "Name $name, Age $age"
    println(msg)

    val email = "  Hello How are   you  "
    //it only removes the leading and trailing whitespce
    //use replace function to remove all whitespaces in between

    //\s: This is a predefined character class in regex that matches any whitespace character. This includes spaces, tabs, newlines, and other whitespace characters.
    //+: This is a quantifier in regex that means "one or more times." When used with \s, it matches one or more consecutive whitespace characters.
    //.toRegex(): This converts the string containing the regex pattern into a Regex object in Kotlin, which can then be used for matching and replacing operations.
    val trimmedEmail = email.trim().replace("\\s+".toRegex(), " ")
        println(trimmedEmail)

    //****String equality****
    // it is in string pool-> it's special area of memory only for strings. In this strings are stored by jvm
    var name1 = "Shruti"
    var name2 = "Mamta"
    //String -> it is in heap memory
    var name3 = String("Shruti".toCharArray())
    var name4 = "Shruti"
    // it compares contents only
    println("== ${name1 == name3}")
    //so if there is same name already present in string pool name4 will point to that name only
    println("== ${name1 === name4}")
    // it compares memory locations, so even if contents is same but stored in different memory location
    println("=== ${name1 === name3}")
    println(".equals ${name1.equals(name3)}")
}