package oop.part6.examples.example1.solution;

public class EqualsMethodProblem {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("T123", "Alice");
        Ticket ticket2 = new Ticket("T123", "Alice");

        // output is true
        System.out.println("Are tickets equal? " + (ticket1.equals(ticket2)));
    }
}
