package oop.part6.examples.example2.solution;

import java.util.HashMap;
import java.util.Map;

public class HashMapHashCodeExample {
    public static void main(String[] args) {
        Map<Book, Integer> bookQuantityMap = new HashMap<>();

        Book book1 = new Book(123, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book(321, "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book(123, "The Great Gatsby", "F. Scott Fitzgerald");

        bookQuantityMap.put(book1, 5);
        bookQuantityMap.put(book2, 3);


        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());


        System.out.println("Quantity of book1: " + bookQuantityMap.get(book1)); // Expecting 5
        System.out.println("Quantity of book2: " + bookQuantityMap.get(book2)); // Expecting 3
        System.out.println("Quantity of book3: " + bookQuantityMap.get(book3)); // Expecting 5
    }
}
