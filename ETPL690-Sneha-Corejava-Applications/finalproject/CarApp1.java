package com.evegent.corejava.finalproject;

import java.util.List;
import java.util.Scanner;

public class CarApp1 {
    static int serviceRate;
    static int additionalCost = 0;
    static int totalAmount;
    static int finalAmount;
    static int serviceId;
    static int additionalServiceId;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceDAO serviceDAO = new ServiceDAO();
        AdditionalServiceDAO additionalServiceDAO = new AdditionalServiceDAO();
        PaymentDAO paymentDAO = new PaymentDAO();
        ReportDAO reportDAO = new ReportDAO();

        System.out.println("\n\t\t\t **Welcome To CAR SERVICE PROVIDER SYSTEM**");

        while (true) {
            System.out.println("======================");
            System.out.println(" Car Service Main Menu");
            System.out.println("======================");
            System.out.println("B - Booking Module");
            System.out.println("S - Additional Services Module");
            System.out.println("P - Payment Module");
            System.out.println("R - Report Module");
            System.out.println("E - Quit");
            System.out.println("======================");
            System.out.print("Enter your Module code (B,S,P,R,E): ");
            String module = scanner.nextLine().toUpperCase();

            switch (module) {
                case "B":
                    handleBooking(scanner, serviceDAO);
                    break;
                case "S":
                    handleAdditionalServices(scanner, additionalServiceDAO);
                    break;
                case "P":
                    handlePayment(scanner, paymentDAO);
                    break;
                case "R":
                    handleReport(scanner, reportDAO);
                    break;
                case "E":
                    System.out.println("Thank you! Visit again :)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid module code.");
            }
        }
    }

    private static void handleBooking(Scanner scanner, ServiceDAO serviceDAO) {
        System.out.println(" Booking Module");
        System.out.println("======================");
        System.out.println("B - Book Service");
        System.out.println("C - Check Availability");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (B,C,M): ");
        String bookingModule = scanner.nextLine().toUpperCase();

        if ("B".equals(bookingModule)) {
            try {
                List<String> services = serviceDAO.getServices();
                for (int i = 0; i < services.size(); i++) {
                    System.out.println((i + 1) + " - " + services.get(i));
                }
                System.out.print("Enter your service choice (1-" + services.size() + "): ");
                int choice = Integer.parseInt(scanner.nextLine());
                String[] selectedService = services.get(choice - 1).split(" - INR");
                serviceId = Integer.parseInt(selectedService[0].split(" ")[0]);
                serviceRate = Integer.parseInt(selectedService[1]);
                totalAmount = serviceRate;
                System.out.println("Total Service Cost: INR" + totalAmount);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else if ("C".equals(bookingModule)) {
            System.out.println("**All Car Services are Available**");
        }
    }

    private static void handleAdditionalServices(Scanner scanner, AdditionalServiceDAO additionalServiceDAO) {
        System.out.println(" Additional Services Module");
        System.out.println("======================");
        System.out.println("S - Services");
        System.out.println("E - Extra Amenities");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (S,E,M): ");
        String additionalServicesModule = scanner.nextLine().toUpperCase();

        if ("S".equals(additionalServicesModule)) {
            try {
                List<String> additionalServices = additionalServiceDAO.getAdditionalServices();
                for (int i = 0; i < additionalServices.size(); i++) {
                    System.out.println((i + 1) + " - " + additionalServices.get(i));
                }
                System.out.print("Enter your service choice (1-" + additionalServices.size() + "): ");
                int choice = Integer.parseInt(scanner.nextLine());
                String[] selectedService = additionalServices.get(choice - 1).split(" - INR");
                additionalServiceId = Integer.parseInt(selectedService[0].split(" ")[0]);
                additionalCost += Integer.parseInt(selectedService[1]);
                System.out.println("Additional Cost for selected services: INR" + additionalCost);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else if ("E".equals(additionalServicesModule)) {
            System.out.println("No extra amenities available.");
        }
    }

    private static void handlePayment(Scanner scanner, PaymentDAO paymentDAO) {
        System.out.println(" Payment Module");
        System.out.println("======================");
        System.out.println("T - Display Total Amount");
        System.out.println("P - Make Payment");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (T,P,M): ");
        String paymentModule = scanner.nextLine().toUpperCase();

        if ("T".equals(paymentModule)) {
            System.out.println("Total Amount to be Paid: INR" + (totalAmount + additionalCost));
        } else if ("P".equals(paymentModule)) {
            try {
                paymentDAO.processPayment(serviceId, additionalServiceId, totalAmount + additionalCost);
                System.out.println("Payment Processed. Total Amount Paid: INR" + (totalAmount + additionalCost));
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void handleReport(Scanner scanner, ReportDAO reportDAO) {
        System.out.println(" Report Module");
        System.out.println("======================");
        System.out.println("I - Display Invoice");
        System.out.println("S - Display Summary");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (I,S,M): ");
        String reportModule = scanner.nextLine().toUpperCase();

        if ("I".equals(reportModule)) {
            try {
                String invoice = reportDAO.generateInvoice(serviceId, additionalServiceId);
                System.out.println("Invoice:");
                System.out.println("==================");
                System.out.println(invoice);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else if ("S".equals(reportModule)) {
            System.out.println("Summary");
            System.out.println("==================");
            System.out.println("Service Rate: INR" + serviceRate);
            System.out.println("Total Service Cost: INR" + serviceRate);
            System.out.println("Additional Costs: INR" + additionalCost);
            System.out.println("Total Amount: INR" + (serviceRate + additionalCost));
        }
    }
}