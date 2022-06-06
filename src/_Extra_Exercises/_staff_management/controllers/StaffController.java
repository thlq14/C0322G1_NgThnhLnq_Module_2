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
                        "1. Display List.\n" +
                        "2. Add.\n" +
                        "3. Remove.\n" +
                        "4. Find.\n" +
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
                        "1. Manager List.\n" +
                        "2. Product List.\n" +
                        "3. Return Menu.\n" +
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
                        confirmManagerMenu();
                        break;
                    case 2:
                        System.out.println("Remove Product: ");
                        productService.remove();
                        confirmProductMenu();
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
                        findManager();
                        break;
                    case 2:
                        System.out.println("Find Product: ");
                        findProduct();
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

    public static void confirmManagerMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("Are You Want Remove: \n" +
                        "1. Yes.\n" +
                        "2. No.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        managerService.remove();
                        break;
                    case 2:
                        removeMenu();
                        return;
                    default:
                        System.err.println("Error: Enter Again (1 - 2): ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Incorrect Format.. Enter Again: ");
            }
        }
    }

    public static void confirmProductMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("Are You Want Remove: \n" +
                        "1. Yes.\n" +
                        "2. No.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        productService.remove();
                        break;
                    case 2:
                        removeMenu();
                        return;
                    default:
                        System.err.println("Error: Enter Again (1 - 2): ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Incorrect Format.. Enter Again: ");
            }
        }
    }

    public static void findManager() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Find Manager_____\n" +
                        "1. Find By Staff Id.\n" +
                        "2. Find By Name Manager.\n" +
                        "3. Find By Birth Manager.\n" +
                        "4. Find By Address Manager.\n" +
                        "5. Return Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        managerService.findByStaffId();
                        break;
                    case 2:
                        managerService.findByName();
                        break;
                    case 3:
                        managerService.findByBirth();
                        break;
                    case 4:
                        managerService.findByAddress();
                        break;
                    case 5:
                        findMenu();
                        return;
                    default:
                        System.err.println("Error: Enter Again (1 - 5): ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Incorrect Format.. Enter Again: ");
            }
        }
    }

    public static void findProduct() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Find Product_____\n" +
                        "1. Find By Staff Id.\n" +
                        "2. Find By Name Product.\n" +
                        "3. Find By Birth Product.\n" +
                        "4. Find By Address Product.\n" +
                        "5. Return Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        productService.findByStaffId();
                        break;
                    case 2:
                        productService.findByName();
                        break;
                    case 3:
                        productService.findByBirth();
                        break;
                    case 4:
                        productService.findByAddress();
                        break;
                    case 5:
                        findMenu();
                        return;
                    default:
                        System.err.println("Error: Enter Again (1 - 5): ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Incorrect Format.. Enter Again: ");
            }
        }
    }
}
