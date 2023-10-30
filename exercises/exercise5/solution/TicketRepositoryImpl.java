package oop.part6.exercises.exercise5.solution;

import java.util.*;

public class TicketRepositoryImpl implements TicketRepository {

    private Map<Long, Ticket> bookedTickets = new HashMap<>();

    @Override
    public Ticket getTicket(Long ticketId) {
        Collection<Ticket> values = bookedTickets.values();
        for (Ticket ticket : values) {
            if (ticket.getBookingNumber().equals(ticketId)) {
                return ticket;
            }

        }
        return null;
    }

    @Override
    public Ticket getTicketByCustomerId(Long customerId) {
        return bookedTickets.get(customerId);
    }

    @Override
    public void addTicket(Long customerId, Ticket ticket) {
        bookedTickets.put(customerId, ticket);
    }
}
