interface Human{
    fun think()
}

fun main(args : Array<String>){

    // In Kotlin, when we want to create an object of an interface, we use "object" keyword.
    // An object of Human type,
    // Human is an interface, so we can use anonymous inner class to override.
    var programmer : Human = object : Human{
                                        // This is an anonymous inner class.
                                        override fun think(){
                                            println("Programmer thinking...")
                                        }
                                    }

    programmer.think()
}