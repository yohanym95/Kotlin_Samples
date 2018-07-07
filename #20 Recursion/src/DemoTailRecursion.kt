import java.math.BigInteger
// Tail recursion
fun main(args : Array<String>){
    var number = BigInteger("7000")

    println(factorialCalTail(number, BigInteger.ONE))
}

tailrec fun factorialCalTail(number : BigInteger, result : BigInteger) : BigInteger{
    if(number == BigInteger.ZERO)
        return result
    else
        return factorialCalTail(number - BigInteger.ONE, number*result)
}