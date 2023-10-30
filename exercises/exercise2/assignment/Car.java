package oop.part6.exercises.exercise2.assignment;

class Car extends Vehicle {

    private final Integer numDoors;
    public Car(String brand, String model, Integer year, Integer numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of doors: " + numDoors;
    }

    // Additional field: numDoors

    // Constructor

    // Override toString() method
}
