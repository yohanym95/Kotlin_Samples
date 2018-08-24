package input

fun main(args : Array<String>){

    println("Enter Your Name : ")
    var name :String = readLine().toString()

    println("Enter your Age : ")
    var age : Int = readLine()!!.toInt()

    println("Enter Your Age :")
    var age1 : Int = Integer.valueOf(readLine()) //another way to get input in kotlin
}