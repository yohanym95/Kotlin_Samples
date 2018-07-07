// Main function (main method in java).
fun main(args : Array<String>){
    add(4,5) // calling "add: function.

    var result = addWithReturn(5,6) // Calling "addWithReturn" function.
    println(result)

    println(add2(6,7)) // Calling "add2" function.

    println("Max : ${max(7,8)}") // Calling "max" function
}

// "add" function
fun add(a :Int, b : Int){
    println(a + b)
}

// Using return type. to add a return type use ":" and return type.
fun addWithReturn(a : Int, b : Int) : Int{
    return a+b
}

// Also we can do this way.
fun add2(a : Int, b : Int) : Int = a+b

// Finding max in one line example.
fun max(a : Int, b : Int) : Int = if(a < b) b else a