data class Book(var name : String, var price : Int)

//When we use Object keyword it creates an object. There's only one object of this class could have.
object BookShelf{
    var books = arrayListOf<Book>()

    fun showBooks(){
        for(i in books){
	    println(i)
	}
    }
}

fun main(args : Array<String>){

    // So we can call "books" using "BookShelf" object.
    BookShelf.books.add(Book("JAVA", 600))
    BookShelf.books.add(Book("PHP", 600))
    BookShelf.books.add(Book("JS", 600))

    BookShelf.showBooks()
}