package oop.part6.exercises.exercise3.solution;

import java.time.LocalDate;

class Transaction {
    private final int transactionId;
    private final LocalDate transactionDate;
    private final double amount;

    public Transaction(int transactionId, LocalDate transactionDate, double amount) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.amount = amount;
    }

    public Transaction(int transactionId, double amount) {
        this(transactionId, LocalDate.now(), amount);
    }

    public Transaction(int transactionId) {
        this(transactionId, 0.0);
    }

    public int getTransactionId() {
        return transactionId;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Date: " + transactionDate + ", Amount: " + amount;
    }
}