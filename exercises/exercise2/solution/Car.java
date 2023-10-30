package oop.part6.exercises.exercise2.solution;

class Car extends Vehicle {
    private final int numDoors;

    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Doors: " + numDoors;
    }
}
