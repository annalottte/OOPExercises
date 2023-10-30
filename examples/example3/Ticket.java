package oop.part6.examples.example3;

class Ticket {
    private final int ticketNumber;
    private final String passengerName;

    public Ticket(int ticketNumber, String passengerName) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
    }

    public Ticket(int ticketNumber) {
        this(ticketNumber, "Unknown");
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    @Override
    public String toString() {
        return "Ticket Number: " + ticketNumber + ", Passenger Name: " + passengerName;
    }
}