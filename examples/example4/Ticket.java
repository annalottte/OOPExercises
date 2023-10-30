package oop.part6.examples.example4;

class Ticket implements Printable {
    private int ticketNumber;

    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public void print() {
        System.out.println("Ticket Number: " + ticketNumber);
    }
}
