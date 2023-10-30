package oop.part6.exercises.exercise5.solution;

import java.math.BigDecimal;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(bookingNumber, ticket.bookingNumber) && Objects.equals(origin, ticket.origin) && Objects.equals(destination, ticket.destination) && Objects.equals(price, ticket.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingNumber, origin, destination, price);
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
