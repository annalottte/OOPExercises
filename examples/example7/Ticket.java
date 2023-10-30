package oop.part6.examples.example7;

class Ticket {
    private final int ticketNumber;

    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public String toString() {
        return "Ticket Number: " + ticketNumber;
    }
}