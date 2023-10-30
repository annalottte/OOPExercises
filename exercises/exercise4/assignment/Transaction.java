package oop.part6.exercises.exercise4.assignment;

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

    public void processTransaction(List<Transaction> processed) {

    }

    public void processTransaction(int transactionThreshold, List<Transaction> processed) {

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