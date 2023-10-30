package oop.part6.examples.example3;

public class TicketConstructorExample {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(123, "Alice");
        Ticket ticket2 = new Ticket(456);
        Ticket ticket3 = new Ticket(789, "Bob");

        System.out.println(ticket1.toString());
        System.out.println(ticket2.toString());
        System.out.println(ticket3.toString());
    }
}