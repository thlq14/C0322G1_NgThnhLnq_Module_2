package _Extra_Exercises._codegym_management.controllers;

import java.util.Scanner;

public class CodegymController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        int choose = 0;
        do {
            try {
                System.out.println("_____CodeGym Management_____" +
                        "1. Add New Teachers or Students: " +
                        "2. Remove Teachers or Students: " +
                        "3. Display List Teachers or Students: " +
                        "4. Find Teachers or Students: " +
                        "5. Exit. " +
                        "Choose Options: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Add Menu.");
                        addMenu();
                        break;
                    case 2:
                        System.out.println("Remove Menu.");
                        removeMenu();
                        break;
                    case 3:
                        System.out.println("Display Menu.");
                        displayMenu();
                        break;
                    case 4:
                        System.out.println("Find Menu.");
                        findMenu();
                        break;
                    default:
                        System.out.println("Error: Enter Again..(1 - 5):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 6):");
            }
        } while (true);
    }

    public static void addMenu() {
        int choose = 0;
        do {
            try {
                System.out.println("_____Add_____" +
                        "1. Add New Teacher: " +
                        "2. Add New Student: " +
                        "3. Return Menu: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:

                    case 2:

                    case 3:
                    default:
                        System.out.println("Error: Enter Again..(1 - 3):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 3):");
            }
        } while (true);
    }

    public static void displayMenu() {
        int choose = 0;
        do {
            try {
                System.out.println("_____Display_____" +
                        "1. Display Teacher: " +
                        "2. Display Student: " +
                        "3. Return Menu: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:

                    case 2:

                    case 3:

                    default:
                        System.out.println("Error: Enter Again..(1 - 3):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 3):");
            }
        } while (true);
    }

    public static void removeMenu() {
        int choose = 0;
        do {
            try {
                System.out.println("_____Remove_____" +
                        "1. Remove Teacher: " +
                        "2. Remove Student: " +
                        "3. Return Menu: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                    case 2:
                    case 3:
                    default:
                        System.out.println("Error: Enter Again..(1 - 3):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 3):");
            }
        } while (true);
    }

    public static void findMenu() {
        int choose = 0;
        do {
            try {
                System.out.println("_____Find_____" +
                        "1. Find Teacher: " +
                        "2. Find Student: " +
                        "3. Return Menu: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                    case 2:
                    case 3:
                    default:
                        System.out.println("Error: Enter Again..(1 - 3):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 3):");
            }
        } while (true);
    }

    public static void confirmDelete() {
        int choose = 0;
        do {
            try {
                System.out.println("Are You Sure Delete: " +
                        "1. Yes: " +
                        "2. No: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                    case 2:
                    default:
                        System.out.println("Error: Enter Again..(1 - 2):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 2):");
            }
        } while (true);
    }
}
