package _Extra_Exercises._company_management.controllers;

import _Extra_Exercises._company_management.services.PersonService;
import _Extra_Exercises._company_management.services.ArrayPersonImpl;

import java.util.Scanner;

public class ArrayPersonController {
    private static Scanner scanner = new Scanner(System.in);
    static PersonService personService = new ArrayPersonImpl();

    public static void displayMenu() {
        while (true) {
            System.out.println("Display List Person: \n" +
                    "1. Display List All Person.\n" +
                    "2. Display List Quan Ly.\n" +
                    "3. Display List Cong Nhat.\n" +
                    "4. Display List San Xuat.\n" +
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
                default:
                    System.out.println("Enter Again!!");
                    break;
            }
        }
    }
}
