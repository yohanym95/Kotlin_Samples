fun main(args : Array<String>){

    var amount1 = calAmount1(50, 0.04) // Calling calAmount1() method with two parameters.
    println(amount1)

    var amount2 = calAmount2(50) // Calling calAmount2() method without a Double parameter.
    println(amount2)

    var amount3 = calAmount2(50, 0.03) // Calling calAmount2() method with a Double parameter.
    println(amount3)

    var amount4 = calAmount2(i = 0.06, a = 50) // Calling calAmount2() method with a Named Parameter.
    // We can use named parameters in any order.
    println(amount4)
}

//A method with an Int parameter and a Double parameter
fun calAmount1(a : Int, i : Double) : Int{
    return (a+a*i).toInt() // By toInt() method, the double value casts to an integer value.
}

// In here we set a default value to "i" (Default Parameters).
// So if we didn't pass an argument, "i" assigns the default value.
// If we pass an argument, "i" will replace with the new argument.
@JvmOverloads // This annotation is for Java file.
fun calAmount2(a : Int, i : Double = 0.04) : Int{
    return (a+a*i).toInt() // By toInt() method, the double value casts to an integer value.
}