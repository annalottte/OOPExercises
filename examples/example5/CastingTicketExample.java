package oop.part6.examples.example5;

public class CastingTicketExample {
    public static void main(String[] args) {
        // Casting primitives
        int intValue = 10;
        double doubleValue = 15.5;

        // Widening (automatic) casting from int to double
        doubleValue = intValue;

        // Narrowing (explicit) casting from double to int
        intValue = (int) doubleValue;

        double double2 = Double.MAX_VALUE;

        intValue = (int) double2;// the value is truncated

        System.out.println("Casting primitives:");
        System.out.println("intValue: " + intValue);           // 15 (narrowing)
        System.out.println("doubleValue: " + doubleValue);     // 15.0 (widening)

        // Casting objects
        Ticket regularTicket = new Ticket(123);
        VIPTicket vipTicket = new VIPTicket(456, "Priority seating");
        Ticket anotherTicket = new VIPTicket(789, "Front row");

        // Downcasting from Ticket to VIPTicket (explicit casting)
        VIPTicket castedVipTicket = (VIPTicket) anotherTicket;

         VIPTicket vip2= (VIPTicket) regularTicket; //ClassCastException

        System.out.println("\nCasting objects:");
        System.out.println("regularTicket: " + regularTicket.getTicketNumber());
        System.out.println("vipTicket: " + vipTicket.getTicketNumber() + " - " + vipTicket.getBenefits());
        System.out.println("castedVipTicket: " + castedVipTicket.getTicketNumber() + " - " + castedVipTicket.getBenefits());
    }
}
