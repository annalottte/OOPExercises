package oop.part6.examples.example5;

class VIPTicket extends Ticket {
    private final String benefits;

    public VIPTicket(int ticketNumber, String benefits) {
        super(ticketNumber);
        this.benefits = benefits;
    }

    public String getBenefits() {
        return benefits;
    }
}
