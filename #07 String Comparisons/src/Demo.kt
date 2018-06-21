fun main(args : Array<String>){
    var str1 = "Osusara"
    var str2 = "osusara"

    if(str1.equals(str2))
        println("Same")
    else
        println("Not Same")

    //Ignoring case
    if(str1.equals(str2, true))
        println("Same")
    else
        println("Not Same")

    //Using ==
    if(str1 == str2)
        println("Same")
    else
        println("Not Same")
}