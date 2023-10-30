package oop.part6.exercises.exercise5.solution;

import java.math.BigDecimal;
import java.util.Objects;

public class TrainTicket extends Ticket {

    private final TravelClass travelClass;
    private final Integer carriageNumber;
    private final Integer seatNumber;

    public TrainTicket(Long bookingNumber, String origin, String destination, BigDecimal price,
                       TravelClass tClass, Integer carriageNum, Integer seatNum) {
        super(bookingNumber, origin, destination, price);
        this.travelClass = tClass;
        this.carriageNumber = carriageNum;
        this.seatNumber = seatNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrainTicket that = (TrainTicket) o;
        return travelClass == that.travelClass && Objects.equals(carriageNumber, that.carriageNumber) && Objects.equals(seatNumber, that.seatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), travelClass, carriageNumber, seatNumber);
    }

    @Override
    public String toString() {
        return super.toString() +
                "travelClass=" + travelClass +
                ", carriageNumber=" + carriageNumber +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
