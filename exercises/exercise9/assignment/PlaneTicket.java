package oop.part6.exercises.exercise9.assignment;

import java.math.BigDecimal;
import java.util.Objects;

public class PlaneTicket extends Ticket {

    private final TravelClass travelClass;
    private final Integer seatNumber;

    public PlaneTicket(Long bookingNumber, String origin, String destination, BigDecimal price, TravelClass tClass,
                       Integer seatNum) {
        super(bookingNumber, origin, destination, price);
        this.travelClass = tClass;
        this.seatNumber = seatNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PlaneTicket that = (PlaneTicket) o;
        return travelClass == that.travelClass && Objects.equals(seatNumber, that.seatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), travelClass, seatNumber);
    }

    @Override
    public String toString() {
        return super.toString() +
                "travelClass=" + travelClass +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
