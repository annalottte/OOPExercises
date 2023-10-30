package oop.part6.exercises.exercise5.assignment;

import java.math.BigDecimal;

public class PlaneTicket extends Ticket {

    private TravelClass travelClass;
    private Integer seatNumber;

    public PlaneTicket(Long bookingNumber, String origin, String destination, BigDecimal price, TravelClass tClass,
                       Integer seatNum) {
        super(bookingNumber, origin, destination, price);
        this.travelClass = tClass;
        this.seatNumber = seatNum;
    }

    @Override
    public String toString() {
        return "Plane" + super.toString();
    }
}
