open class Father{ //Parent class
    open fun think(){
        println("Thinking...")
    }
}

class Son : Father(){ //Child class
    override fun think(){
        println("Son is Thinking...")
    }
}

fun main(args : Array<String>){
    // "tom" is a "Father" type variable, and assigns a "son" object
    var tom : Father = Son()
    tom.think()
}

// POLYMORPHISM MEANS ASSIGN A SUBCLASS OBJECT TO A SUPER CLASS VARIABLE..
