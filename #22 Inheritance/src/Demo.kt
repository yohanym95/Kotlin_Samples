//In Kotlin classes are "final" by default.
//By default classes are "final" in Kotlin. We should use "open" keyword with the parent class to inherit.
open class Father{ //Parent class
    fun think(){
        println("Thinking...")
    }
}

//We use collen and call the super class constructor to inherit.
class Son : Father(){ //Child class

}

fun main(args : Array<String>){
    var tom = Son()
    tom.think() //Calling Son's inherited think() function.
}

// IN KOTLIN, MULTIPLE INHERITANCE IS NO ALLOWED.