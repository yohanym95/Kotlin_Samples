//Human is an abstract class
abstract class Human{

    //think() is an abstract method
    abstract fun think()

    fun talk(){
        println("Talking...")
    }
}


class American : Human(){

    //If the super class is an abstract class, we should override abstract methods
    //or we should make the sub class an abstract class.
    override fun think(){
        println("American Thinking...")
    }
}

fun main(args : Array<String>){
    var tom : Human = American()
    tom.think()
    tom.talk()
}