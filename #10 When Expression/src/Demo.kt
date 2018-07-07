fun main(args : Array<String>){

    val number : Int = 2 //Able to use any type data for "when".

    //"When" key word is very similar to "switch" in java. Use "when" key word as "switch".
    //Speciality is that no need break statement. Also use "else" key word as "default" part.
    when(number){
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Default")
    }

    //Also we can use this as an expression too.
    var str = when(number){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Default"
    }

    println("str is $str")
}