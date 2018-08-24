package input

// Should import java.util.Scanner or *
import java.util.*

fun main(args:Array<String>){

    var reader = Scanner (System.`in`) // Creating object from Scanner class.
    //Here we use backtick as an escape character (Lesson #33).

    var x = reader.nextInt()
    println(x)
    
    var Name : String = reader.nextLine()
    println("Enter your age")

    var age : Int =reader.nextInt()


}