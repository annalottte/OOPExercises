package oop.part6.examples.example6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ComparableTicketExample {
    public static void main(String[] args) {
        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(new Ticket(789));
        ticketList.add(new Ticket(123));
        ticketList.add(new Ticket(456));

        Collections.sort(ticketList);

        System.out.println("Sorted Tickets:");
        for (Ticket ticket : ticketList) {
            System.out.println(ticket);
        }

        TreeSet<Ticket> treeSet = new TreeSet<>();
        treeSet.add(new Ticket(789));
        treeSet.add(new Ticket(123));
        treeSet.add(new Ticket(456));

        System.out.println("Ticket in TreeSet:");
        for (Ticket ticket : treeSet) {
            System.out.println(ticket);
        }
    }
}