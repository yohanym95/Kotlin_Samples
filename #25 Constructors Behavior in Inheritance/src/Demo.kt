open class Father{ //Parent class

    // init block is the primary constructor of a class.
    init{
        println("Father")
    }

    open fun think(){
        println("Thinking...")
    }
}

class Son : Father(){ //Child class

    init{
        println("Son")
    }

    override fun think(){
        println("Son is Thinking...")
    }
}

fun main(args : Array<String>){
    var tom : Father = Son() //When we call "son()" constructor, son constructor calls "Father()" constructor first.
}

// So the output is,
// Father
// Son
