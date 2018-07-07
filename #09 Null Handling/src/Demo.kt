fun main(args : Array<String>){

    var test = Test()
    println(test.str)

    //If you want to get properties of test.str, you should use "?" with str.
    println(test.str?.length)

    //Also if you wan to assign a "null" to some variable, we should add "?" with the data type, when we declare the variable.
    // Eg: var test : Test? = Test()

    //test = null

    // (then we should use "?" every time we we call something with "test.". Eg: test?.str)

}