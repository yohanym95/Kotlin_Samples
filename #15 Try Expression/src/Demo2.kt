fun main(args : Array<String>){

    var str : String = "4a" // When we assign a String value like "4a" we can't assign it to an Int variable.
    // An expression throws when we try to assign "4a" to an Int value.

    // We can use "try" as an expression.
    var num : Int = try {
        str.toInt()
    }
    catch(e : NumberFormatException){
        0 // If something goes wrong, it assigns 0.
    }

    num++ // Add 1 to the Int value.
    println(num) // Print the value.
}