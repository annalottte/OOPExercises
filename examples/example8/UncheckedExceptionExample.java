package oop.part6.examples.example8;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This line will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        }

        String text = null;

        int length = text.length(); // This line will throw a NullPointerException

    }
}