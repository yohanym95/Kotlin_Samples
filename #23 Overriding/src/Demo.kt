open class Father{ //Parent class
    // By default functions are "final in Kotlin. So we should use "open" keyword.
    open fun think(){
        println("Thinking...")
    }
}

class Son : Father(){ //Child class
    // Overriding "think" function.
    // We should use "override" keyword.
    override fun think(){
        println("Son is Thinking...")
    }
}

fun main(args : Array<String>){
    var tom = Son()
    tom.think() //Calling Son's inherited think() function.
}