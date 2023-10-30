package oop.part6.exercises.exercise2.solution;

class Vehicle {
    private final String brand;
    private final String model;
    private final int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Year: " + year;
    }
}
