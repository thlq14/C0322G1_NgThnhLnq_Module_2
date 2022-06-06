package _Extra_Exercises._codegym_management.controllers;

import _Extra_Exercises._codegym_management.services.impl.StudentServiceImpl;
import _Extra_Exercises._codegym_management.services.impl.TeacherServiceImpl;

import java.util.Scanner;

public class CodegymController {
    static Scanner scanner = new Scanner(System.in);
    static TeacherServiceImpl teacherService = new TeacherServiceImpl();
    static StudentServiceImpl studentService = new StudentServiceImpl();

    public static void displayMainMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____CodeGym Management_____\n" +
                        "1. Add New Teachers or Students: \n" +
                        "2. Remove Teachers or Students: \n" +
                        "3. Display List Teachers or Students: \n" +
                        "4. Find Teachers or Students: \n" +
                        "5. Exit. \n" +
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
                    case  5:
                        System.exit(0);
                    default:
                        System.out.println("Error: Enter Again..(1 - 5):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 6):");
            }
        }
    }

    public static void addMenu() {
        int choose = 0;
        while (true) {
            try {
                System.out.println("_____Add_____\n" +
                        "1. Add New Teacher: \n" +
                        "2. Add New Student: \n" +
                        "3. Return Menu: \n" +
                        "Choose Options: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Add New Teacher: ");
                        teacherService.add();
                        break;
                    case 2:
                        studentService.add();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.out.println("Error: Enter Again..(1 - 3):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 3):");
            }
        }
    }

    public static void displayMenu() {
        int choose = 0;
        while (true) {
            try {
                System.out.println("_____Display_____\n" +
                        "1. Display Teacher: \n" +
                        "2. Display Student: \n" +
                        "3. Return Menu: \n" +
                        "Choose Options: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("List Teacher: ");
                        teacherService.display();
                        break;
                    case 2:
                        System.out.println("List Student: ");
                        studentService.display();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.out.println("Error: Enter Again..(1 - 3):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 3):");
            }
        }
    }

    public static void removeMenu() {
        int choose = 0;
        while (true) {
            try {
                System.out.println("_____Remove_____\n" +
                        "1. Remove Teacher: \n" +
                        "2. Remove Student: \n" +
                        "3. Return Menu: \n" +
                        "Choose Options: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Remove Teacher: ");
                        confirmRemoveTeacher();
                        break;
                    case 2:
                        System.out.println("Remove Student: ");
                        confirmRemoveTeacher();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.out.println("Error: Enter Again..(1 - 3):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 3):");
            }
        }
    }

    public static void findMenu() {
        int choose = 0;
        while (true) {
            try {
                System.out.println("_____Find_____\n" +
                        "1. Find Teacher: \n" +
                        "2. Find Student: \n" +
                        "3. Return Menu: \n" +
                        "Choose Options: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Find Teacher: ");
                        teacherService.find();
                        break;
                    case 2:
                        System.out.println("Find Student: ");
                        studentService.find();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.out.println("Error: Enter Again..(1 - 3):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 3):");
            }
        }
    }

    public static void confirmRemoveTeacher() {
        int choose = 0;
        while (true) {
            try {
                System.out.println("Are You Sure Remove Teacher: \n" +
                        "1. Yes: \n" +
                        "2. No: \n" +
                        "Choose Options: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Remove Teacher: ");
                        teacherService.remove();
                    case 2:
                        System.out.println("Return Remove Menu: ");
                        removeMenu();
                        return;
                    default:
                        System.out.println("Error: Enter Again..(1 - 2):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 2):");
            }
        }
    }

    public static void confirmRemoveStudent() {
        int choose = 0;
        while (true) {
            try {
                System.out.println("Are You Sure Remove Student: \n" +
                        "1. Yes: \n" +
                        "2. No: \n" +
                        "Choose Options: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Remove Student: ");
                        studentService.remove();
                    case 2:
                        System.out.println("Return Remove Menu: ");
                        removeMenu();
                        return;
                    default:
                        System.out.println("Error: Enter Again..(1 - 2):");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Incorrect Format..Enter Number (1 - 2):");
            }
        }
    }
}
