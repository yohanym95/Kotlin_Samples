fun main(args : Array<String>){

    var x = 10 // Using var (Vars are variables)
    val y = 20 // Using val (Vals are constants)

    println(x)
    println(y)

    x = 100
    // y = 200 We Can't reassign values to Vals (Just like final in Java)

    println(x)
    println(y)
}