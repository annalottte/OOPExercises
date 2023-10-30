package oop.part6.exercises.exercise5.assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TicketRepositoryImpl implements TicketRepository {

    protected Map<Long, Ticket> bookedTickets = new HashMap<>();


    @Override
    public Ticket getTicket(Long ticketId) {
        Collection<Ticket> values = bookedTickets.values();
        for (Ticket ticket : values) {
            if (ticket.getBookingNumber().equals(ticketId)) {
                return ticket;
            }
        }

        // implement here
        //use bookedTickets.values() to get all tickets
        return null;
    }

    @Override
    public Ticket getTicketByCustomerId(Long customerId) {
        return bookedTickets.get(customerId);
    }

    @Override
    public void addTicket(Long customerId, Ticket ticket) {
        bookedTickets.put(customerId, ticket);

        //implement here
    }
}
