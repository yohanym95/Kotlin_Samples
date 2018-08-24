package input

// Should import java.util.Scanner or *
import java.util.*

fun main(args:Array<String>){

    var reader = Scanner (System.`in`) // Creating object from Scanner class.
    //Here we use backtick as an escape character (Lesson #33).

    println("Enter your age")
    var name : String = reader.nextLine() //Take input
    println(name)    

    println("Enter your age")
    var age = reader.nextInt() //Take input
    println(age)
}