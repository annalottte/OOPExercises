package oop.part6.examples.example7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTicketExample {
    public static void main(String[] args) {
        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(new Ticket(789));
        ticketList.add(new Ticket(123));
        ticketList.add(new Ticket(456));


        Comparator<Ticket> ticketComparator = new Comparator<Ticket>() {
            @Override
            public int compare(Ticket ticket1, Ticket ticket2) {
                return Integer.compare(ticket1.getTicketNumber(), ticket2.getTicketNumber());
            }
        };

        Collections.sort(ticketList, ticketComparator);

        System.out.println("Sorted Tickets:");
        for (Ticket ticket : ticketList) {
            System.out.println(ticket);
        }
    }
}
