package oop.part6.exercises.exercise7.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableBookExample {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(123, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book(456, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(789, "1984", "George Orwell"));
        bookList.add(new Book(423, "A beautiful Christmas", "J. J. Lee"));

        Collections.sort(bookList);

        System.out.println("Sorted Books:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
