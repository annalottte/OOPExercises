package oop.part6.exercises.exercise1.solution;

public class BookEqualsExample {
    public static void main(String[] args) {
        Book book1 = new Book(123, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book(123, "The Great Gats", "Fitzgerald");

        // Expecting true
        System.out.println("Are books equal? " + book1.equals(book2));
    }
}
