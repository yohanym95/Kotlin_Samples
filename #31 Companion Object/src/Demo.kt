class A{

    //Companion objects or objects can be called using the "className.function".
    //But they are not static.
    companion object {

        //By using @JvmStatic annotation, we can give static behaviours.
        @JvmStatic
        fun show(){
            println("Demo...")
        }
    }
}

fun main(args : Array<String>){
    A.show()
}