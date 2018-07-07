fun main(args : Array<String>){

    var str : String = "4a" // When we assign a String value like "4a" we can't assign it to an Int variable.
    // An expression throws when we try to assign "4a" to an Int value.

    var num : Int = 0

    // Try block
    try {
        num = str.toInt()
    }
    catch(e : NumberFormatException){
        println("Invalid String value")
    }

    num++ // Add 1 to the Int value.
    println(num) // Print the value.
}