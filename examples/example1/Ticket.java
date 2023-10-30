package oop.part6.examples.example1;

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
}
