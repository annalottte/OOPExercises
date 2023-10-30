package oop.part6.exercises.exercise4.solution;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Transaction {
    private int transactionId;
    private LocalDate transactionDate;
    private double amount;



    public Transaction(int transactionId, LocalDate transactionDate, double amount) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.amount = amount;
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

    public void processTransaction(List<Transaction> transactions) {
        if (isValidTransactionDate()) {
            transactions.add(this);
        }
    }

    public void processTransaction(int transactionThreshold, List<Transaction> transactions) {
        if (transactionThreshold < 10) {
            transactions.add(this);
        }
    }

    private boolean isValidTransactionDate() {
        LocalDate currentDate = LocalDate.now();
        return transactionDate.isBefore(currentDate);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", transactionDate=" + transactionDate +
                ", amount=" + amount +
                '}';
    }
}