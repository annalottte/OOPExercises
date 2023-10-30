package oop.part6.exercises.exercise5.assignment;

import java.math.BigDecimal;

public class TrainTicket extends Ticket {

    private TravelClass travelClass;
    private Integer carriageNumber;
    private Integer seatNumber;

    public TrainTicket(Long bookingNumber, String origin, String destination, BigDecimal price,
                       TravelClass tClass, Integer carriageNum, Integer seatNum) {
        super(bookingNumber, origin, destination, price);
        this.travelClass = tClass;
        this.carriageNumber = carriageNum;
        this.seatNumber = seatNum;
    }

    @Override
    public String toString() {
        return "Train" + super.toString();
    }
}
