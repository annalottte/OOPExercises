package oop.part6.exercises.exercise2.assignment;

class Motorcycle extends Vehicle {

    private final boolean hasSidecar;
    public Motorcycle(String brand, String model, Integer year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Has side car: " + (hasSidecar ? "Yes" : "No");
    }
}
    // Additional fields: hasSidecar

    // Constructor

    // Override toString() method

