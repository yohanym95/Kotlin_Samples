package input

fun main(args : Array<String>){

    var x = readLine() //readLine() do the BufferedReader's job in the backend.
    println(x)

    println("Enter Your Name : ")
    var name : String = readLine().toString()

    println("Enter your Age : ")
    var age : Int = readLine()!!.toInt()

    println("Enter Your Age :")
    var age1 : Int = Integer.valueOf(readLine()) //another way to get input in kotlin
}