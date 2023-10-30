package oop.part6.exercises.exercise5.assignment;

public class BookingService {

    TicketRepository ticketRepository;

    public BookingService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public void bookTicket(Long clientId, Ticket planeTicket) {
        ticketRepository.addTicket(clientId, planeTicket);
    }

    public Ticket getTicket(Long bookingId) {

        return ticketRepository.getTicket(bookingId);

        //call method from ticketRepository
    }

    public Ticket getCustomerTicket(Long customerId) {
        //call method from ticketRepository
        return ticketRepository.getTicketByCustomerId(customerId);

    }
}
