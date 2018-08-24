package input

// Should import java.util.Scanner or *
import java.util.*

fun main(args:Array<String>){

    var reader = Scanner (System.`in`) // Creating object from Scanner class.
    //Here we use backtick as an escape character.

    var x = reader.nextInt()

    println("ANOTHER WAY IN INPUT OUT KOTLIN")
    println("Enter your Name")

    // Take input
    var Name : String = reader.nextLine()
    println("Enter your age")

    var age : Int =reader.nextInt()


}