package _Extra_Exercises._school_management.controllers;

import _Extra_Exercises._school_management.services.impl.StudentServiceImpl;
import _Extra_Exercises._school_management.services.impl.TeacherServiceImpl;

import java.util.Scanner;

public class PersonController {
    static Scanner scanner = new Scanner(System.in);
    static StudentServiceImpl studentService = new StudentServiceImpl();
    static TeacherServiceImpl teacherService = new TeacherServiceImpl();

    public static void displayMainMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Menu_____\n" +
                        "1. Display List Person.\n" +
                        "2. Add New Person.\n" +
                        "3. Remove Person.\n" +
                        "4. Sort List Person.\n" +
                        "5. Edit List Person.\n" +
                        "6. Exit.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        displayList();
                        break;
                    case 2:
                        addMenu();
                        break;
                    case 3:
                        removeMenu();
                        break;
                    case 4:
                        sortMenu();
                        break;
                    case 5:
                        editMenu();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.err.println("Error. Enter Again: ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Enter Again: ");
            }
        }
    }

    public static void displayList() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Display Menu_____\n" +
                        "1. Display All.\n" +
                        "2. Display List Student.\n" +
                        "3. Display List Teacher.\n" +
                        "4. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("List All Person: ");
                        studentService.display();
                        teacherService.display();
                        break;
                    case 2:
                        System.out.println("List Student: ");
                        studentService.display();
                        break;
                    case 3:
                        System.out.println("List Teacher: ");
                        teacherService.display();
                        break;
                    case 4:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Enter Again: ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.err.println("Enter Again: ");
            }
        }
    }

    public static void addMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Add Menu_____\n" +
                        "1. Add Student.\n" +
                        "2. Add Teacher.\n" +
                        "3. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Add Student: ");
                        studentService.add();
                        break;
                    case 2:
                        System.out.println("Add Teacher: ");
                        teacherService.add();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error. Enter Again: ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Enter Again: ");
            }
        }
    }

    public static void removeMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Remove Menu_____\n" +
                        "1. Remove Student.\n" +
                        "2. Remove Teacher.\n" +
                        "3. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Remove Student: ");
                        studentService.remove();
                        break;
                    case 2:
                        System.out.println("Remove Teacher: ");
                        teacherService.remove();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error. Enter Again: ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Enter Again: ");
            }
        }
    }

    public static void editMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Edit Menu_____\n" +
                        "1. Edit Student.\n" +
                        "2. Edit Teacher.\n" +
                        "3. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Edit Student: ");
                        studentService.edit();
                        break;
                    case 2:
                        System.out.println("Edit Teacher: ");
                        teacherService.edit();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error. Enter Again: ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Enter Again: ");
            }
        }
    }

    public static void sortMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Sort Menu_____\n" +
                        "1. Sort By Name Increase.\n" +
                        "2. Sort By Birth Decrease.\n" +
                        "3. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Sorted List By Name Increase: ");
                        System.out.println("List Student Sorted: ");
                        studentService.sortByName();
                        System.out.println("List Teacher Sorted: ");
                        teacherService.sortByName();
                        break;
                    case 2:
                        System.out.println("Sorted List By Birth Decrease: ");
                        System.out.println("List Student Sorted: ");
                        studentService.sortByBirth();
                        System.out.println("List Teacher Sorted: ");
                        teacherService.sortByBirth();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error. Enter Again: ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Enter Again: ");
            }
        }
    }
}
