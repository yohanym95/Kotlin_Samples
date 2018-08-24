package input

//This is another way. It's easier.
fun main(args : Array<String>){

    var x = readLine() //readLine() do the BufferedReader's job in the backend.
    println(x)

    println("Enter Your Name : ")
    var name : String = readLine().toString()
    println(name)

    println("Enter your Age : ")
    var age : Int = readLine()!!.toInt()
    println(age)

    println("Enter Your Age :")
    var age1 : Int = Integer.valueOf(readLine()) //Another way to get input in kotlin
    print(age1)
}