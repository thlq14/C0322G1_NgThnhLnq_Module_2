package _Extra_Exercises._staff_management.controllers;

import _Extra_Exercises._staff_management.services.impl.ManagerServiceImpl;
import _Extra_Exercises._staff_management.services.impl.ProductServiceImpl;

import java.util.Scanner;

public class StaffController {
    static Scanner scanner = new Scanner(System.in);
    static ManagerServiceImpl managerService = new ManagerServiceImpl();
    static ProductServiceImpl productService = new ProductServiceImpl();

    public static void displayMainMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Staff Manager_____\n" +
                        "1. Display List Staff.\n" +
                        "2. Add Staff.\n" +
                        "3. Remove Staff.\n" +
                        "4. Find Staff.\n" +
                        "5. Exit.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        displayListMenu();
                        break;
                    case 2:
                        addMenu();
                        break;
                    case 3:
                        removeMenu();
                        break;
                    case 4:
                        findMenu();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.err.println("Error: Enter Number.. (1 - 5).");
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Incorrect Format.. Enter Again: ");
            }
        }
    }

    public static void displayListMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Display List_____\n" +
                        "1. Display Manager List.\n" +
                        "2. Display Product List.\n" +
                        "3. Display List All.\n" +
                        "4. Return Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Manager List: ");
                        managerService.display();
                        break;
                    case 2:
                        System.out.println("Product List: ");
                        productService.display();
                        break;
                    case 3:
                        System.out.println("All List: ");
                        managerService.display();
                        productService.display();
                        break;
                    case 4:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error: Enter Again (1 - 2): ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Incorrect Format.. Enter Again: ");
            }
        }
    }

    public static void addMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Add Menu_____\n" +
                        "1. Add Manager.\n" +
                        "2. Add Product.\n" +
                        "3. Return Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Add Manager: ");
                        managerService.add();
                        break;
                    case 2:
                        System.out.println("Add Product: ");
                        productService.add();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error: Enter Again (1 - 2): ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Incorrect Format.. Enter Again: ");
            }
        }
    }

    public static void removeMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Remove Menu_____\n" +
                        "1. Remove Manager.\n" +
                        "2. Remove Product.\n" +
                        "3. Return Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Remove Manager: ");
                        managerService.remove();
                        break;
                    case 2:
                        System.out.println("Remove Product: ");
                        productService.remove();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error: Enter Again (1 - 2): ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Incorrect Format.. Enter Again: ");
            }
        }
    }

    public static void findMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Find Menu_____\n" +
                        "1. Find Manager.\n" +
                        "2. Find Product.\n" +
                        "3. Return Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Find Manager: ");
                        managerService.find();
                        break;
                    case 2:
                        System.out.println("Find Product: ");
                        productService.find();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error: Enter Again (1 - 2): ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Incorrect Format.. Enter Again: ");
            }
        }
    }
}
//    public static int checkException(int choose) {
//        boolean flag = false;
//        do {
//            try {
//                choose = Integer.parseInt(scanner.nextLine());
//                flag = false;
//            } catch (NumberFormatException e) {
//                System.err.println("Enter Incorrect Format.. Enter Again: ");
//                flag = true;
//            }
//        } while (false);
//        return choose;
//    }
