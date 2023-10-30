package oop.part6.exercises.exercise3.assignment;

import java.time.LocalDate;

class Transaction {
    private int transactionId;
    private LocalDate transactionDate;
    private Double amount;

    public Transaction(int transactionId, LocalDate transactionDate, Double amount) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.amount = amount;
    }

public Transaction (int transactionId, Double amount) {
        this(transactionId, LocalDate.now(), amount);
}
public Transaction (int transactionId) {
        this(transactionId, LocalDate.now(), null);
}

    @Override
    public String toString() {

        return "Transaction{" +
                "transactionId=" + transactionId +
                ", transactionDate=" + transactionDate +
                ", amount=" + (amount == null ? "Unknown" : amount)  +
                '}';
    }
}