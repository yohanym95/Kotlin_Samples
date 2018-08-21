class A{

    //If the function create() was not inside the companion object. There's no way to call call create method to create an object of class A, without creating an object as "var a = A()".
    companion object {
	//create() returns object of class A.
        fun create() : A = A()
    }

    fun show(){
        println("Test...")
    }
}

fun main(args : Array<String>){

    var obj = A.create()
    obj.show()
}