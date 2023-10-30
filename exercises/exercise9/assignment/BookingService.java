package oop.part6.exercises.exercise9.assignment;


public class BookingService {

    TicketRepository bookedTickets;

    public BookingService(TicketRepository bookedTickets) {
        this.bookedTickets = bookedTickets;
    }

    public void bookTicket(Long customerId, Ticket planeTicket) {
        bookedTickets.addTicket(customerId, planeTicket);
    }

    public Ticket getTicket(Long bookingId) {
        return bookedTickets.getTicket(bookingId);
    }

    public Ticket getCustomerTicket(Long customerId) {
        return bookedTickets.getTicketByCustomerId(customerId);

    }
}
