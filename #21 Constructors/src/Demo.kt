
// This how to create Primary Constructor which take a String value as a parameter.
// Doesn't need to declare "n" as "var n" and if wanted we can use "constructor" keyword after class name.
class Test (n : String){

    var name : String = n
    fun m(){
        println("Test Class is $name")
    }
}

fun main(args : Array<String>){
    // Passing a String value to Test class constructor.
    var t = Test("Testing")
    t.m()

}