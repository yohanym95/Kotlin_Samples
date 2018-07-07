// In previous (Demo) code, we can't find the factorial of "70"
// Because the factorial of 70 in very big, and a Int value can't hold it.
// The output is "0".

// So we have to use "BigInteger".

// First we have to import "BigInteger".
import java.math.BigInteger

fun main(args : Array<String>){
    var number = BigInteger("70") //Now the "number" is BigInteger type.

    println(factorialCalBig(number))
}

fun factorialCalBig(number : BigInteger) : BigInteger{
    if(number == BigInteger.ZERO) //BigInteger of 0 is "BigInteger.ZERO"
        return BigInteger.ONE //BigInteger of 1 is "BigInteger.ONE"
    else
        return number * factorialCalBig(number - BigInteger.ONE)
}

// output: 11978571669969891796072783721689098736458938142546425857555362864628009582789845319680000000000000000