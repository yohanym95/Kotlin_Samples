fun main(args : Array<String>){

    //It's not compulsary to define "List<Int>" after the variable name.
    var value : List<Int> = listOf<Int>(2, 5, 3, 9) //A list of Integers.
    for( i in value)
        println(i)

    //There are lots of method which we can use with lists.


    //Also we can create List of Objects
    var aliens : List<Alien> = listOf<Alien>(Alien("Navin",70), Alien("Shweta",80))

    for(alien in aliens){
	println(alien)
	println(alien.name)
    }
}

data class Alien(var name : String, var points : Int)