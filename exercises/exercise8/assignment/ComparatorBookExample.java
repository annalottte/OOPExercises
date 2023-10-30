package oop.part6.exercises.exercise8.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorBookExample {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(123, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book(456, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(789, "1984", "George Orwell"));


        //Collections.sort(bookList, authorComparator);

        System.out.println("Sorted Books by Author:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
