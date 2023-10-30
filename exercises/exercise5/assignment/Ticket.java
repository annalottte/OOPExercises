package oop.part6.exercises.exercise5.assignment;

import java.math.BigDecimal;

class Ticket {

    private final Long bookingNumber;
    private final String origin;
    private final String destination;
    private final BigDecimal price;


    public Ticket(Long bookingNumber, String origin, String destination, BigDecimal price) {
        this.bookingNumber = bookingNumber;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
    }

    public Long getBookingNumber() {
        return bookingNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "bookingNumber=" + bookingNumber +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                '}';
    }
}
