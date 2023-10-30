package oop.part6.exercises.exercise4.solution;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionValidationExample {
    public static void main(String[] args) {
        List<Transaction> processed = new ArrayList<>();
        LocalDate validDate = LocalDate.now().minusDays(1);
        LocalDate futureDate = LocalDate.now().plusDays(1);

        Transaction validTransaction = new Transaction(123, validDate, 100.0);
        Transaction futureTransaction = new Transaction(456, futureDate, 150.0);

        Transaction transaction3 = new Transaction(89, validDate, 100.0);
        Transaction transaction4 = new Transaction(467, futureDate, 150.0);

        validTransaction.processTransaction(processed);
        futureTransaction.processTransaction(processed);

        transaction3.processTransaction(11, processed);
        transaction4.processTransaction(5, processed);
        System.out.println(processed);
    }
}
