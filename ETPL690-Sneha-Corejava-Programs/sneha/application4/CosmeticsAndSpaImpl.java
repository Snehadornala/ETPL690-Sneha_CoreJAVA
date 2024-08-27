package com.evergent.corejava.sneha.application4;

import java.util.Scanner;

enum MainMenu {
    B, S, P, R, E
}

enum BookingModule {
    B, C, M
}

enum AdditionalServicesModule {
    S, E, M
}

enum PaymentModule {
    T, P, M
}

enum ReportModule {
    I, S, M
}

public class CosmeticsAndSpaImpl extends OutModule implements Modules {

    private int serviceRate = 0;
    private int additionalCost = 0;
    private int totalAmount = 0;
    private int finalAmount = 0;

    public static void main(String[] args) {
    	FirstImple fi=new FirstImple();
        new CosmeticsAndSpaImpl().displayMainMenu();
    }

    @Override
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME_MESSAGE");

        while (true) {
            System.out.println("======================");
            System.out.println("Cosmetics and Spa Main Menu");
            System.out.println("======================");
            System.out.println("B - Booking Module");
            System.out.println("S - Additional Services Module");
            System.out.println("P - Payment Module");
            System.out.println("R - Report Module");
            System.out.println("E - Exit");
            System.out.println("======================");
            System.out.print("Enter your Module code (B,S,P,R,E): ");
            String module = scanner.nextLine().toUpperCase();

            if (isValidMainMenuOption(module)) {
                processSelection(module);
                if (module.equals("E")) {
                    exitModule();
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid module code.");
            }
        }
    }

    private boolean isValidMainMenuOption(String option) {
        for (MainMenu menu : MainMenu.values()) {
            if (menu.name().equals(option)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void processSelection(String selection) {
        switch (MainMenu.valueOf(selection)) {
            case B:
                bookingModule();
                break;

            case S:
                additionalServicesModule();
                break;

            case P:
                paymentModule();
                break;

            case R:
                reportModule();
                break;

            case E:
                exitModule();
                break;
        }
    }

    @Override
    public void bookingModule() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Booking Module");
        System.out.println("======================");
        System.out.println("B - Book Service");
        System.out.println("C - Check Availability");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (B,C,M): ");
        String option = scanner.nextLine().toUpperCase();

        if (isValidBookingOption(option)) {
            switch (BookingModule.valueOf(option)) {
                case B:
                    bookService(scanner);
                    break;

                case C:
                    checkAvailability();
                    break;

                case M:
                    break;
            }
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }

    private boolean isValidBookingOption(String option) {
        for (BookingModule module : BookingModule.values()) {
            if (module.name().equals(option)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void additionalServicesModule() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Additional Services Module");
        System.out.println("======================");
        System.out.println("S - Services");
        System.out.println("E - Extra Amenities");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (S,E,M): ");
        String option = scanner.nextLine().toUpperCase();

        if (isValidAdditionalServicesOption(option)) {
            switch (AdditionalServicesModule.valueOf(option)) {
                case S:
                    additionalServices(scanner);
                    break;

                case E:
                    extraAmenities(scanner);
                    break;

                case M:
                    break;
            }
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }

    private boolean isValidAdditionalServicesOption(String option) {
        for (AdditionalServicesModule module : AdditionalServicesModule.values()) {
            if (module.name().equals(option)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void paymentModule() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Payment Module");
        System.out.println("======================");
        System.out.println("T - Display Total Amount");
        System.out.println("P - Make Payment");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (T,P,M): ");
        String option = scanner.nextLine().toUpperCase();

        if (isValidPaymentOption(option)) {
            switch (PaymentModule.valueOf(option)) {
                case T:
                    System.out.println("Total Amount to be Paid: INR " + (totalAmount + additionalCost));
                    break;

                case P:
                    finalAmount = totalAmount + additionalCost;
                    System.out.println("Payment Processed. Total Amount Paid: INR " + finalAmount);
                    break;

                case M:
                    break;
            }
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }

    private boolean isValidPaymentOption(String option) {
        for (PaymentModule module : PaymentModule.values()) {
            if (module.name().equals(option)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void reportModule() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Report Module");
        System.out.println("======================");
        System.out.println("I - Display Invoice");
        System.out.println("S - Display Summary");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (I,S,M): ");
        String option = scanner.nextLine().toUpperCase();

        if (isValidReportOption(option)) {
            switch (ReportModule.valueOf(option)) {
                case I:
                    System.out.println("Invoice");
                    System.out.println("==================");
                    System.out.println("Service Rate: INR " + serviceRate);
                    System.out.println("Additional Costs: INR " + additionalCost);
                    System.out.println("Total Amount: INR " + (serviceRate + additionalCost));
                    break;

                case S:
                    System.out.println("Summary");
                    System.out.println("==================");
                    System.out.println("Service Rate: INR " + serviceRate);
                    System.out.println("Total Service Cost: INR " + serviceRate);
                    System.out.println("Additional Costs: INR " + additionalCost);
                    System.out.println("Total Amount: INR " + (serviceRate + additionalCost));
                    break;

                case M:
                    break;
            }
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }

    private boolean isValidReportOption(String option) {
        for (ReportModule module : ReportModule.values()) {
            if (module.name().equals(option)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void exitModule() {
        System.out.println("Thank you for using the Cosmetics and Spa Application!");
    }

    private void bookService(Scanner scanner) {
        System.out.println("Service Types");
        System.out.println("1 - Facial - INR 200");
        System.out.println("2 - Massage - INR 250");
        System.out.println("3 - Manicure - INR 80");
        System.out.print("Enter your service type (1,2,3): ");
        
        int serviceChoice = getValidInteger(scanner, 1, 3);

        switch (serviceChoice) {
            case 1:
                serviceRate = 200;
                break;
            case 2:
                serviceRate = 250;
                break;
            case 3:
                serviceRate = 80;
                break;
        }
        totalAmount = serviceRate;
        System.out.println("Total Service Cost: INR " + totalAmount);
    }

    private void checkAvailability() {
        System.out.println("Check Service Availability");
        System.out.println("======================");
        System.out.println("1 - Facial");
        System.out.println("2 - Massage");
        System.out.print("Enter your Service type (1,2): ");
        
        int checkServiceChoice = getValidInteger(new Scanner(System.in), 1, 2);

        switch (checkServiceChoice) {
            case 1:
                System.out.println("***Facial Service is Available***");
                break;
            case 2:
                System.out.println("***Massage Service is Available***");
                break;
        }
    }

    private void additionalServices(Scanner scanner) {
        System.out.println("Available Services");
        System.out.println("1 - Hair Treatment - INR 150");
        System.out.println("2 - Body Scrub - INR 120");
        System.out.print("Enter your service choice (1,2): ");
        
        int additionalServiceChoice = getValidInteger(scanner, 1, 2);

        switch (additionalServiceChoice) {
            case 1:
                additionalCost += 150;
                break;
            case 2:
                additionalCost += 120;
                break;
        }
        System.out.println("Additional Cost for selected services: INR " + additionalCost);
    }

    private void extraAmenities(Scanner scanner) {
        System.out.println("Extra Amenities");
        System.out.println("1 - Products - INR 50");
        System.out.println("2 - Hair Styling - INR 30");
        System.out.print("Enter your amenity choice (1,2): ");
        
        int amenityChoice = getValidInteger(scanner, 1, 2);

        switch (amenityChoice) {
            case 1:
                additionalCost += 50;
                break;
            case 2:
                additionalCost += 30;
                break;
        }
        System.out.println("Additional Cost for selected amenities: INR " + additionalCost);
    }

    private int getValidInteger(Scanner scanner, int min, int max) {
        int value = -1;
        boolean valid = false;
        while (!valid) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    valid = true;
                } else {
                    System.out.println("Please enter a number between " + min + " and " + max + ": ");
                }
            } else {
                System.out.println("Invalid input. Please enter a number: ");
                scanner.next(); // Consume invalid input
            }
        }
        return value;
    }
}
