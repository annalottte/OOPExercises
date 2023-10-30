package oop.part6.exercises.exercise2.solution;

class Motorcycle extends Vehicle {
    private final boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Has Sidecar: " + (hasSidecar ? "Yes" : "No");
    }
}