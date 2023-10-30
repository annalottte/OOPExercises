package oop.part6.examples.example6;

class Ticket implements Comparable<Ticket> {
    private final int ticketNumber;

    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public int compareTo(Ticket otherTicket) {
        return Integer.compare(this.ticketNumber, otherTicket.ticketNumber);
    }

    @Override
    public String toString() {
        return "Ticket Number: " + ticketNumber;
    }
}