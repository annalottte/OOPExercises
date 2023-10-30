package oop.part6.exercises.exercise3.assignment;

import java.time.LocalDate;

public class TransactionConstructorExample {

    public static void main(String[] args) {
        Transaction transaction1 = new Transaction(123, LocalDate.of(2023, 8, 15), 100.0);
        Transaction transaction2 = new Transaction(456, 250.0);
        Transaction transaction3 = new Transaction(789);

        System.out.println(transaction1.toString());
        System.out.println(transaction2.toString());
        System.out.println(transaction3.toString());
    }
}
