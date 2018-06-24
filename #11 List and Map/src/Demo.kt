import java.util.* // Should import this for "Maps".

fun main(args : Array<String>){

    var numbers = listOf(1,2,3,4) // Declare and initialize a List.

    println(numbers) // We can print the list by a println.

    // We can print the elements in the list one by one using a "for" loop.
    for(i in numbers){
        print("$i ")
    }

    println("")

    // To print elements with the index.
    for((i,j) in numbers.withIndex()){
        print("$i,$j ")
    }

    println("")

    //Declaring map in Kotlin.
    // Should import java.util.*
    var testMap = TreeMap<String,Int>()

    testMap["Number 1"] = 100
    testMap["Number 2"] = 200

    for((i,j) in testMap){
        println("$i, $j")
    }
}
