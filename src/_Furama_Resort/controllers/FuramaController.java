package _Furama_Resort.controllers;

import _Furama_Resort.services.impl.BookingServiceImpl;
import _Furama_Resort.services.impl.CustomerServiceImpl;
import _Furama_Resort.services.impl.EmployeeServiceImpl;
import _Furama_Resort.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static BookingServiceImpl bookingService = new BookingServiceImpl();

    public static void displayMainMenu() {
        while (true) {
            System.out.println("_________MANAGER________");
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
            System.out.println("________EMPLOYEES________");
            System.out.println("1. Display List Employees.");
            System.out.println("2. Add New Employee.");
            System.out.println("3. Edit Employee.");
            System.out.println("4. Return Main Menu.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("1. Display List Employees.");
                    employeeService.displayListEmployee();
                    break;
                case 2:
                    System.out.println("2. Add New Employee.");
                    employeeService.addNewEmployee();
                    break;
                case 3:
                    System.out.println("3. Edit Employee.");
                    employeeService.editEmployeebyId();
                    break;
                case 4:
                    System.out.println("4. Return Main Menu.");
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Error: Enter Again..");
                    break;
            }
        }
    }

    public static void displayCustomerMenu() {
        while (true) {
            System.out.println("________CUSTOMERS________");
            System.out.println("1. Display List Customers.");
            System.out.println("2. Add New Customer.");
            System.out.println("3. Edit Customer.");
            System.out.println("4. Return Main Menu.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("1. Display List Customers.");
                    customerService.displayListCustomer();
                    break;
                case 2:
                    System.out.println("2. Add New Customers.");
                    customerService.addNewCustomer();
                    break;
                case 3:
                    System.out.println("3. Edit Customers.");
                    customerService.editCustomerById();
                    break;
                case 4:
                    System.out.println("4. Return Main Menu.");
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Error: Enter Again..");
                    break;
            }
        }
    }

    public static void displayFacilityMenu() {
        while (true) {
            System.out.println("________FACILITIES________");
            System.out.println("1. Display List Facility.");
            System.out.println("2. Add New Facility.");
            System.out.println("3. Display List Facility Maintenance.");
            System.out.println("4. Return Main Menu.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("1 Display List Facility.");
                    facilityService.displayListFacility();
                    break;
                case 2:
                    System.out.println("2. Add New Facility.");
                    addNewFacility();
                    break;
                case 3:
                    System.out.println("3. Display List Facility Maintenance.");
                    facilityService.editFacilityById();
                    break;
                case 4:
                    System.out.println("4. Return Main Menu.");
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Error: Enter Again..");
                    break;
            }
        }
    }

    public static void displayBookingMenu() {
        while (true) {
            System.out.println("________BOOKINGS________");
            System.out.println("1. Add New Booking.");
            System.out.println("2. Display List Booking.");
            System.out.println("3. Create New Contracts.");
            System.out.println("4. Display List Contracts.");
            System.out.println("5. Edit Contracts.");
            System.out.println("6. Return Main Menu.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Add New Booking.");
                    bookingService.addNewBooking();
                    break;
                case 2:
                    System.out.println("Display List Booking.");
                    bookingService.displayListBooking();
                    break;
                case 3:
                    System.out.println("Create New Contracts.");

                    break;
            }
        }
    }

    public static void displayPromotionMenu() {
        while (true) {
            System.out.println("________PROMOTIONS________");
            System.out.println("1. Display List Customers Use Service.");
            System.out.println("2. Display List Customers Get Voucher.");
            System.out.println("3. Return Main Menu.");
        }
    }

    public static void addNewFacility() {
        System.out.println("________ADD NEW________");
        System.out.println("1. Add New Villa.");
        System.out.println("2. Add New House.");
        System.out.println("3. Add New Room.");
        System.out.println("4. Back To Menu.");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Add New Villa: ");
                facilityService.addNewVilla();
                break;
            case 2:
                System.out.println("Add New House: ");
                facilityService.addNewHouse();
                break;
            case 3:
                System.out.println("Add New Room: ");
                facilityService.addNewRoom();
                break;
            case 4:
                System.out.println("Back To Menu.");
                displayFacilityMenu();
                break;
            default:
                System.out.println("Error: Enter Again..");
                break;
        }
    }
}


