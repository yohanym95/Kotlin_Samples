interface A{
    fun m()
}

interface B{
    fun n()
}

class C : A, B{

    //Must override abstract functions in interfaces.
    override fun m(){
        println("Interface A")
    }
    override fun n(){
        println("Interface B")
    }
}

fun main(args : Array<String>){
    var obj = C()
    obj.m()
    obj.n()
}