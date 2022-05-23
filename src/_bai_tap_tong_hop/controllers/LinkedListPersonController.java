package _bai_tap_tong_hop.controllers;

import _bai_tap_tong_hop.services.LinkedListPersonImpl;
import _bai_tap_tong_hop.services.PersonService;

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
                    "5. Display List All Person By Salary Increase.\n" +
                    "6. Display List All Person By Name Increase.\n" +
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
                    personService.displayListSalaryByIncrease();
                    break;
                case 6:
                    personService.displayListNameByDecrease();
                    break;
                default:
                    System.out.println("Enter Again!!");
                    break;
            }
        }
    }
}
