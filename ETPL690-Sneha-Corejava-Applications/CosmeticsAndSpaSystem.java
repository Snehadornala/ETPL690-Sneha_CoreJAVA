
package com.evergent.corejava.sneha.application;

import java.io.IOException;
import java.util.Scanner;
public class CosmeticsAndSpaSystem {

    enum BookingModule {B, C, M}
    enum AdditionalServicesModule {S, E, M}
    enum PaymentModule {T, P, M}
    enum ReportModule {I, S, M}
    enum ServiceType {FACIAL, MASSAGE, MANICURE}

    static int serviceRate;
    static int additionalCost;
    static int totalAmount;
    static int finalAmount;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t \t\t Welcome To COSMETICS AND SPA SYSTEM");

        while (true) {
            System.out.println("======================");
            System.out.println(" Cosmetics and Spa Main Menu");
            System.out.println("======================");
            System.out.println("B - Booking Module");
            System.out.println("S - Additional Services Module");
            System.out.println("P - Payment Module");
            System.out.println("R - Report Module");
            System.out.println("E - Quit");
            System.out.println("======================");
            System.out.println("Enter your Module code (B,S,P,R,E) : ");

            String module = scanner.nextLine();

            switch (module) {
                case "B":
                    System.out.println(" Booking Module");
                    System.out.println("======================");
                    System.out.println("B - Book Service");
                    System.out.println("C - Check Availability");
                    System.out.println("M - Return to Main Menu");
                    System.out.println("======================");
                    System.out.println("Enter your Module code (B,C,M) : ");

                    String bookingChoice = scanner.nextLine();

                    switch (BookingModule.valueOf(bookingChoice)) {
                        case B:
                            System.out.println("Service Types");
                            System.out.println("1 - Facial - 200");
                            System.out.println("2 - Massage - 250");
                            System.out.println("3 - Manicure - 80");
                            System.out.println("Enter your service type (1,2,3) : ");

                            int serviceChoice = Integer.parseInt(scanner.nextLine());
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
                                default:
                                    System.out.println("Invalid service choice.");
                                    return;
                            }

                            totalAmount = serviceRate;
                            System.out.println("Total Service Cost: " + totalAmount);
                            break;

                        case C:
                        	System.out.println("Check Availability ");
                        	System.out.println("===================");
                        	System.out.println("1- hair");
                        	System.out.println("2- face");
                        	System.out.println("Enter your choice(1,2):");
                        	int checkservicechoice = Integer.parseInt(scanner.nextLine());
                        	switch (checkservicechoice) {
                        	case 1:
								System.out.println("Available Hair Service");
								break;
                        	case 2:
								System.out.println("Available Face Service");
								break;	
                        	}
                        case M:
                            break;
                    }
                    break;
                case "S":
                    System.out.println(" Additional Services Module");
                    System.out.println("======================");
                    System.out.println("S - Services");
                    System.out.println("E - Extra Amenities");
                    System.out.println("M - Return to Main Menu");
                    System.out.println("======================");
                    System.out.println("Enter your Module code (S,E,M) : ");

                    String servicesChoice = scanner.nextLine();

                    switch (AdditionalServicesModule.valueOf(servicesChoice)) {
                        case S:
                            System.out.println("Available Services");
                            System.out.println("1 - Hair Treatment - 150");
                            System.out.println("2 - Body Scrub - 120");
                            System.out.println("Enter your service choice (1,2) : ");
                            int additionalServiceChoice = Integer.parseInt(scanner.nextLine());
                            switch (additionalServiceChoice) {
                                case 1:
                                    additionalCost += 150;
                                    break;
                                case 2:
                                    additionalCost += 120;
                                    break;
                                default:
                                    System.out.println("Invalid service choice.");
                                    return;
                            }

                            System.out.println("Additional Cost for selected services: " + additionalCost);
                            break;

                        case E:
                            System.out.println("Extra Amenities");
                            System.out.println("1 - products - 50");
                            System.out.println("2 - Hair styling - 30");
                            System.out.println("Enter your amenity choice (1,2) : ");

                            int amenityChoice = Integer.parseInt(scanner.nextLine());
                            switch (amenityChoice) {
                                case 1:
                                    additionalCost += 50;
                                    break;
                                case 2:
                                    additionalCost += 30;
                                    break;
                                default:
                                    System.out.println("Invalid amenity choice.");
                                    return;
                            }

                            System.out.println("Additional Cost for selected amenities: " + additionalCost);
                            break;

                        case M:
                            break;
                    }
                    break;

                case "P":
                    System.out.println(" Payment Module");
                    System.out.println("======================");
                    System.out.println("T - Display Total Amount");
                    System.out.println("P - Make Payment");
                    System.out.println("M - Return to Main Menu");
                    System.out.println("======================");
                    System.out.println("Enter your Module code (T,P,M) : ");

                    String paymentChoice = scanner.nextLine();

                    switch (PaymentModule.valueOf(paymentChoice)) {
                        case T:
                            System.out.println("Total Amount to be Paid:" + (totalAmount + additionalCost));
                            break;

                        case P:
                            finalAmount = totalAmount + additionalCost;
                            System.out.println("Payment Processed. Total Amount Paid: " + finalAmount);
                            break;

                        case M:
                            break;
                    }
                    break;

                case "R":
                    System.out.println(" Report Module");
                    System.out.println("======================");
                    System.out.println("I - Display Invoice");
                    System.out.println("S - Display Summary");
                    System.out.println("M - Return to Main Menu");
                    System.out.println("======================");
                    System.out.println("Enter your Module code (I,S,M) : ");

                    String reportChoice = scanner.nextLine();

                    switch (ReportModule.valueOf(reportChoice)) {
                        case I:
                            System.out.println("Invoice");
                            System.out.println("==================");
                            System.out.println("Service Rate: " + serviceRate);
                            System.out.println("Additional Costs: " + additionalCost);
                            System.out.println("Total Amount: " + (serviceRate + additionalCost));
                            break;

                        case S:
                            System.out.println("Summary");
                            System.out.println("==================");
                            System.out.println("Service Rate: " + serviceRate);
                            System.out.println("Total Service Cost: " + serviceRate);
                            System.out.println("Additional Costs: " + additionalCost);
                            System.out.println("Total Amount: " + (serviceRate + additionalCost));
                            break;

                        case M:
                            break;
                    }
                    break;

                case "E":
                    System.out.println("Exiting the system. Thank you!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input. Please enter a valid module code.");
                    break;
            }
        }
    }
}