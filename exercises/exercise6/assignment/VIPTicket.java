package oop.part6.exercises.exercise6.assignment;

class VIPTicket extends Ticket {
    private final String privileges;

    public VIPTicket(int ticketNumber, String privileges) {
        super(ticketNumber);
        this.privileges = privileges;
    }

    public String getPrivileges() {
        return privileges;
    }
}