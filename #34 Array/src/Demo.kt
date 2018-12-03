fun main(args : Array<String>){
    var ar = intArrayOf(12,34,71,41)
    for(i in ar)
        println(i)

    //Change an element.
    ar[1] = 13
    for(i in ar)
        println(i)

    //Another way of change an element
    ar.set(2,14)
    for(i in ar)
        println(i)

    //Fetch a value.
    println(ar[3])
    println(ar.get[3])

    //And there are lots of methods to use with arrays.

    //When we don't know the values of the array,
    var arr = IntArray(4)
    arr.set(0, 10)
    arr.set(1, 13)
    arr.set(2, 12)
    arr.set(3, 14)
    for(i in arr)
        println(i)

    //There are many array types,
    var arn = arrayOfNulls<String>(3) //arrayOfNulls can use for any data type.
    arn.set(0,"AAA")
    arn.set(1,"BBB")
    arn.set(2,"CCC")
    for(i in arn)
        println(i)
}