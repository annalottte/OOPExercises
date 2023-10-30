package oop.part6.examples.example1;

public class EqualsVsOperatorPrimitivesStrings {
    public static void main(String[] args) {
        // Comparing primitives
        int num1 = 5;
        int num2 = 5;

        System.out.println("Comparing primitives:");
        System.out.println("num1 == num2: " + (num1 == num2)); // true (both have the same value)

        // Comparing Strings
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = "Hello";

        System.out.println("\nComparing Strings:");
        System.out.println("str1 == str2: " + (str1 == str2)); // false (different objects)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different objects)
        System.out.println("str3 == str4: " + (str3 == str4)); // true (same object)

        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (content comparison)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (content comparison)
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // true (content comparison)
    }
}
