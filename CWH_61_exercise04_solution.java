package com.company;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100]; // memory allocated for 100 books i.e strings
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for(String book: this.books){
            if(book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
            for (int i=0; i<this.books.length;i++){
            if(this.books[i].equals (book)){ // comparing.equals(with), function is used to check the == equal strings
                System.out.println("The book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book){
//        this.books[no_of_books] = book;
//        or
        addBook(book);

    }
}
public class CWH_61_exercise04_solution {
    public static void main(String[] args) {
        // You have to implement a library using Java Class Library
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books.

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Naruto");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();

    }
}
