package oop.part6.exercises.exercise5.solution;

public interface TicketRepository {

    Ticket getTicket(Long ticketId);

    Ticket getTicketByCustomerId(Long customerId);

    void addTicket(Long customerId, Ticket ticket);

}
