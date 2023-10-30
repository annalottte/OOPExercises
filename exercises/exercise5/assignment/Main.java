package oop.part6.exercises.exercise5.assignment;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BookingService bookingService = new BookingService(new TicketRepositoryImpl());

        Long customerId = 12345L;
        Long customerId2 = 54321L;
        Ticket planeTicket = new PlaneTicket(1L, "Munich", "London",
                BigDecimal.TEN, TravelClass.FIRST, 4);
        Ticket trainTicket = new TrainTicket(4L, "London", "Munich",
                BigDecimal.TEN, TravelClass.SECOND, 12, 45);

        bookingService.bookTicket(customerId, planeTicket);
        bookingService.bookTicket(customerId2, trainTicket);

        Ticket ticket = bookingService.getTicket(1L);
        System.out.println(ticket);

        Ticket customerTicket = bookingService.getCustomerTicket(customerId2);
        System.out.println(customerTicket);
    }
}
