fun main(args : Array<String>){
    var obj = Test() //Creating an object
    println ("Name is : " + obj.name) //Using Concatenation

    obj.name = "Name 2" //Changing the value of "name" in class Test
    println("Name is : ${obj.name}") //Another way (raw String)
}