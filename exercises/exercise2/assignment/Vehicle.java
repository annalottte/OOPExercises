package oop.part6.exercises.exercise2.assignment;

class Vehicle {

    private final String brand;
    private final String model;
    private final Integer year;

    public Vehicle (String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    // fields: brand, model, year

    // Constructor

    // toString() method
}
