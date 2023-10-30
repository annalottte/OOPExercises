package oop.part6.exercises.exercise1.assignment;

public class BookEqualsExample {
    public static void main(String[] args) {
        Book book1 = new Book(123, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book(123, "The Great Gats", "Fitzgerald");
        Book book3 = new Book (142, "Tommie is lief", "B. van den Berg");

        // Expecting true
        System.out.println("Are books equal? " + book1.equals(book2));
        System.out.println("Are books equal? " + book1.equals(book3));
    }
}
