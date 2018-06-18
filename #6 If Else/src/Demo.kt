fun main(args : Array<String>){

    var x = 7
    var y = 4
    var max : Int
    var min : Int

    if(x > y)
        max = x
    else
        max = y

    // Another way to use if-else on Kotlin
    min = if(x < y)
        x
    else
        y

    println(max)
    println(min)
}