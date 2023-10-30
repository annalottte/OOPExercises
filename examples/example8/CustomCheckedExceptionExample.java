package oop.part6.examples.example8;

import java.util.ArrayList;
import java.util.List;

public class CustomCheckedExceptionExample {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(123, "The Great Gatsby"));
        bookList.add(new Book(456, "To Kill a Mockingbird"));
        bookList.add(new Book(789, "1984"));

        Library library = new Library(bookList);

        try {
            Book foundBook = library.findBookByTitle("The Catcher in the Rye");
            System.out.println("Found Book: " + foundBook.getBookTitle());
        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}