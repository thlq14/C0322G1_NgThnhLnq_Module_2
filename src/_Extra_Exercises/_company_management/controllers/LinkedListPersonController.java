package _Extra_Exercises._company_management.controllers;

import _Extra_Exercises._company_management.services.LinkedListPersonImpl;
import _Extra_Exercises._company_management.services.PersonService;

import java.util.Scanner;

public class LinkedListPersonController {
    private static Scanner scanner = new Scanner(System.in);
    static PersonService personService = new LinkedListPersonImpl();

    public static void displayMenu() {
        while (true) {
            System.out.println("Display List Person: \n" +
                    "1. Display List All Person.\n" +
                    "2. Display List Quan Ly.\n" +
                    "3. Display List Cong Nhat.\n" +
                    "4. Display List San Xuat.\n" +
                    "5. Display List Sorted.\n" +
                    "6. Exit.\n" +
                    "Choose Option: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    personService.displayListAll();
                    break;
                case 2:
                    personService.displayListQuanly();
                    break;
                case 3:
                    personService.displayListCongNhat();
                    break;
                case 4:
                    personService.displayListSanXuat();
                    break;
                case 5:
                    displayListSorted();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Enter Again!!");
                    break;
            }
        }
    }

    public static void displayListSorted() {
        System.out.println("1. Display List Increase By Salary: ");
        System.out.println("2. Display List Decrease By Name: ");
        int inputDisplay = Integer.parseInt(scanner.nextLine());
        if (inputDisplay == 1) {
            System.out.println("1. Display List Increase By Salary: ");
            personService.displayListSalaryByIncrease();
        } else if (inputDisplay == 2) {
            System.out.println("2. Display List Increase By Name: ");
            personService.displayListNameByIncrease();
        } else {
            System.out.println("Nhập lại ( 1 -> 2 ) !!");
        }
    }
}
