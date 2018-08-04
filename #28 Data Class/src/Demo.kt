
//data classes are also normal classes
// 1. By default data classes has toString() method.
// 2. By default data classes has equals and hashCode implementation.
// 3. By default data classes has copy method.
data class A(val s : String, val i : Int){
    fun test(){
        println("Test")
    }
}

fun main(args : Array<String>){
    var a1 = A("demo", 10)
    var a2 = A("demo", 10)

    //copy method clones a method,
    //if we want we can change the values.
    var a3 = a1.copy(i = 20)

    println(a1 == a2)
    println(a3)
}
