package oop.part6.examples.example4;

class VIPTicket extends Ticket {
    private String benefits;

    public VIPTicket(int ticketNumber, String benefits) {
        super(ticketNumber);
        this.benefits = benefits;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("VIP Benefits: " + benefits);
    }

    public String getBenefits() {
        return benefits;
    }
}
