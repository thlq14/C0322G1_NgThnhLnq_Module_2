package FuramaResort.controllers;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        while (true) {
            System.out.println("1. Employee Management.");
            System.out.println("2. Customer Management.");
            System.out.println("3. Facility Management.");
            System.out.println("4. Booking Management.");
            System.out.println("5. Promotion Management.");
            System.out.println("6. Exit.");
            System.out.println("Choose Options: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayEmployeeMenu();
                case 2:
                    displayCustomerMenu();
                case 3:
                    displayFacilityMenu();
                case 4:
                    displayBookingMenu();
                case 5:
                    displayPromotionMenu();
                case 6:
                    System.exit(0);
            }
        }
    }

    public static void displayEmployeeMenu() {
        while (true) {
            System.out.println("1. Display List Employees.");
            System.out.println("2. Add New Employee.");
            System.out.println("3. Edit Employee.");
            System.out.println("4. Return Main Menu.");
        }
    }

    public static void displayCustomerMenu() {
        while (true) {
            System.out.println("1. Display List Customers.");
            System.out.println("2. Add New Customer.");
            System.out.println("3. Edit Customer.");
            System.out.println("4. Return Main Menu.");
        }
    }

    public static void displayFacilityMenu() {
        while (true) {
            System.out.println("1 Display List Facility");
            System.out.println("2 Add New Facility");
            System.out.println("3 Display List Facility Maintenance");
            System.out.println("4. Return Main Menu.");
        }
    }

    public static void displayBookingMenu() {
        while (true) {
            System.out.println("1. Add New Booking.");
            System.out.println("2. Display List Booking.");
            System.out.println("3. Create New Constracts.");
            System.out.println("4. Display List Contracts.");
            System.out.println("5. Edit Contracts.");
            System.out.println("6. Return Main Menu.");
        }
    }

    public static void displayPromotionMenu() {
        while (true) {
            System.out.println("1. Display List Customers Use Service.");
            System.out.println("2. Display List Customers Get Voucher.");
            System.out.println("3. Return Main Menu.");
        }
    }
}


