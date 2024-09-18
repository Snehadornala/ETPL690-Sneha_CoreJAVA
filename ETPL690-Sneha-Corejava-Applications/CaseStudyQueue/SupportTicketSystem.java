package com.evergent.corejava.CaseStudyQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SupportTicketSystem {

    // Initialize the ticket queue using ArrayDeque
    private Deque<String> ticketQueue = new ArrayDeque<>();

    // Method to add a ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }

    // Method to process the next ticket in the queue
    public void processNextTicket() {
        // Check if the queue is empty
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
            return;
        }

        // Retrieve and remove the next ticket from the queue
        String ticket = ticketQueue.poll();
        System.out.println("Processing ticket: " + ticket);
    }

    // Method to peek at the next ticket without removing it
    public void peekNextTicket() {
        // Check if the queue is empty
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
            return;
        }

        // Retrieve the next ticket without removing it
        String ticket = ticketQueue.peek();
        System.out.println("Next ticket: " + ticket);
    }

    // Method to display all tickets currently in the queue
    public void displayQueue() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
        } else {
            System.out.println("Tickets in the queue: " + ticketQueue);
        }
    }

    // Main method to simulate the ticketing system
    public static void main(String[] args) {
        SupportTicketSystem system = new SupportTicketSystem();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Customer Support Ticketing System");
        System.out.println("Available commands:");
        System.out.println("1. add <ticket> - Add a new ticket");
        System.out.println("2. process - Process the next ticket");
        System.out.println("3. peek - Peek at the next ticket");
        System.out.println("4. display - Display all tickets in the queue");
        System.out.println("5. exit - Exit the system");

        while (true) {
           System.out.print("Enter command: ");
           command = scanner.nextLine();

            if (command.startsWith("add ")) {
                // Add a new ticket
                String ticket = command.substring(4);
                system.addTicket(ticket);
            } else if (command.equals("process")) {
                // Process the next ticket
                system.processNextTicket();
            } else if (command.equals("peek")) {
                // Peek at the next ticket
                system.peekNextTicket();
            } else if (command.equals("display")) {
                // Display all tickets in the queue
                system.displayQueue();
            } else if (command.equals("exit")) {
                // Exit the system
                System.out.println("Exiting the system.");
                break;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
    }
}
