fun main(args : Array<String>){

    var a1 = Test() // Creating an object from Test class.
    a1.str = "a1"
    a1.testStr()

    var a2 = Test() // Creating another object.
    a2.str = "a2"
    a2.testStr()

    var a3 = a1.plus(a2)
    a3.testStr()
}

// Extension Function.
// plus becomes an extension function of Test.
fun Test.plus(a : Test) : Test{

    var t = Test()
    t.str = this.str +" "+ a.str
    return t
}