fun main(args : Array<String>){

    var a1 = Test() // Creating an object from Test class.
    a1.str = "a1" // Assign "a1" to str in Test class object(a1).
    a1.testStr()

    var a2 = Test() // Creating another object.
    a2.str = "a2" // Assign "a2" to str in Test class object(a2).
    a2.testStr()

    // If we want to add both values of "str" in a1 and a2 objects.
    var a3 = a1.plus(a2) // There's no plus() function in Test class to call.
    a3.testStr()

    // So we can use an extension function of test class.
}

// Extension Function. Defining a function outside the class (Defining th plus() of Test).
// plus becomes an extension function of Test.
// When defining an extension class we use ClassName.functionName(){} syntax.
fun Test.plus(a : Test //Parameter) : Test //Return type{

    var newTest = Test()

    // this.str is the a1's str and the parameter is a2.
    newTest.str = this.str +" "+ a.str

    // returning newTest object.
    return newTest
}