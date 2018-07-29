interface D{
    fun m()
    fun l(){
        println("l in D")
    }
}

interface E{
    fun n()
    fun l(){
        println("l in E")
    }
}

//When we have same method in two interfaces and if we implement them both to a class,
//We must override the method, unless compiler can't recognize which method we are calling.
class F : D, E{

    //Must override abstract functions in interfaces.
    override fun m(){
        println("Interface A")
    }
    override fun n(){
        println("Interface B")
    }

    override fun l(){
        //If you want to call the method in class D, you can do as following.
        super<D>.l()
        println("l in F")
    }
}

fun main(args : Array<String>){
    var obj = F()
    obj.m()
    obj.n()
    obj.l()
}