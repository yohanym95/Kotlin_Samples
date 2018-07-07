package input

// Should import java.util.Scanner or *
import java.util.*

fun main(args:Array<String>){

    val reader = Scanner (System.`in`) // Creating object from Scanner class

    println("ANOTHER WAY IN INPUT OUT KOTLIN")
    println("Enter your Name")

    // Take input
    var Name : String = reader.nextLine()
    println("Enter your age")

    var age : Int =reader.nextInt()


}