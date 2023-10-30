package oop.part6.exercises.exercise6.solution;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(new Ticket(123));
        ticketList.add(new VIPTicket(456, "Access to VIP lounge"));
        ticketList.add(new Ticket(789));
        ticketList.add(new VIPTicket(101, "Front row seat"));

        int vipTicketCount = countVIPTickets(ticketList);
        System.out.println("Number of VIP tickets: " + vipTicketCount);
    }

    public static int countVIPTickets(List<Ticket> tickets) {
        int count = 0;
        for (Ticket ticket : tickets) {
            if (ticket instanceof VIPTicket) {
                count++;
            }
        }
        return count;
    }
}
