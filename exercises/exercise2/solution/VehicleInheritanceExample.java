package oop.part6.exercises.exercise2.solution;

public class VehicleInheritanceExample {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2022, 4);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, true);

        System.out.println("Car Information:");
        System.out.println(car);

        System.out.println("Motorcycle Information:");
        System.out.println(motorcycle);
    }
}