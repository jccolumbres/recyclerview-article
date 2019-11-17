package com.example.recyclerview_article

fun randomBook1(): Book {
    val newBook = Book()
    newBook.title = "The Revival"
    newBook.author = "Stephen King"
    newBook.datePublished = "11 November 2014"

    return newBook
}

fun randomBook2(): Book {
    val newBook = Book()
    newBook.title = "Carrie"
    newBook.author = "Stephen King"
    newBook.datePublished = "5 April 1974"

    return newBook
}

fun randomBook3(): Book {
    val newBook = Book()
    newBook.title = "The Return of the King"
    newBook.author = "J. R. R. Tolkien"
    newBook.datePublished = "20 October 1955"

    return newBook
}

fun randomBook4(): Book {
    val newBook = Book()
    newBook.title = "The Fault in Our Stars"
    newBook.author = "John Green"
    newBook.datePublished = "10 January 2012"

    return newBook
}

fun randomBook5(): Book {
    val newBook = Book()
    newBook.title = "The Hunger Games"
    newBook.author = "Suzanne Collins"
    newBook.datePublished = "14 September 2008"

    return newBook
}
fun populateBooksList(): MutableList<Book>{
    val books = mutableListOf<Book>()
    books.add(randomBook1())
    books.add(randomBook2())
    books.add(randomBook3())
    books.add(randomBook4())
    books.add(randomBook5())
    return books
}