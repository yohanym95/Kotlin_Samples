class Test2 (n : String){

    var name : String = n
    var age : Int = 0

    // Making a secondary constructor.
    // Should call the primary constructor.
    // Using constructor chain, we use "this(name)" to call the primary constructor.
    constructor(age : Int, name : String) : this(name){
        this.age = age
    }

    fun m(){
        println("Test Class is $name : $age")
    }
}

fun main(args : Array<String>){
    // Passing Int and String values to Test2 class constructor.
    var t = Test2(123,"Testing")
    t.m()

}