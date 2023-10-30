package oop.part6.examples.example4;

public class PolymorphismTicketExample {
    public static void main(String[] args) {
        VIPTicket vipTicket = new VIPTicket(456, "Priority seating");

        // Accessing through references of the same type
        System.out.println("Accessing through references of the same type:");
        vipTicket.print();     // Ticket Number: 456, VIP Benefits: Priority seating
        vipTicket.getTicketNumber();
        vipTicket.getBenefits();

        // Accessing through reference of the parent type
        System.out.println("\nAccessing through reference of the parent type:");
        Ticket ticketReference = vipTicket; // VIPTicket is a Ticket
        ticketReference.print(); // Ticket Number: 456, VIP Benefits: Priority seating
        ticketReference.getTicketNumber();
        //ticketReference.getBenefits();//not compiling

        // Accessing through reference of the interface type
        System.out.println("\nAccessing through reference of the interface type:");
        Printable printableReference = vipTicket; // VIPTicket is Printable
        printableReference.print(); // Ticket Number: 456, VIP Benefits: Priority seating
        //printableReference.getTicketNumber();
        ((VIPTicket)printableReference).getBenefits(); //not compiling
    }
}
