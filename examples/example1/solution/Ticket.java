package oop.part6.examples.example1.solution;

import java.util.Objects;

class Ticket {
    private final String ticketNumber;
    private final String passengerName;

    public Ticket(String ticketNumber, String passengerName) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;

        return Objects.equals(ticketNumber, ticket.ticketNumber) && Objects.equals(passengerName, ticket.passengerName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(ticketNumber, passengerName);
    }
}
