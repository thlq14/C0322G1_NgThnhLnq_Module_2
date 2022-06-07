//package _extra_exercises.manager_mvc.controller;
//
//import _extra_exercises.manager_mvc.model.Person;
//import _extra_exercises.manager_mvc.model.Student;
//import _extra_exercises.manager_mvc.model.Teacher;
//import _extra_exercises.manager_mvc.service.StudentService;
//import _extra_exercises.manager_mvc.service.TeacherService;
//
//import java.util.Scanner;
//
//public class DisplayMenu {
//    public static Person[] personList = new Person[100];
//    public static int count = 5;
//    public static Scanner scanner = new Scanner(System.in);
//
//    static {
//        personList[0] = new Teacher(1, "Kakarot", 26, true, 1000);
//        personList[1] = new Teacher(2, "Vegeta", 27, true, 1200);
//        personList[2] = new Student(3, "Bulma", 18, false, 9);
//        personList[3] = new Student(4, "Brolly", 19, true, 10);
//        personList[4] = new Student(5, "Pan", 17, false, 8);
//    }
//
//    public static void menu() {
//        do {
//            System.out.println("____Person Management____");
//            System.out.println("1. Display List Person.");
//            System.out.println("2. Add New Person.");
//            System.out.println("3. Search Person.");
//            System.out.println("4. Delete Person.");
//            System.out.println("5. Update Person.");
//            System.out.println("6. Exit.");
//            System.out.println("Choose Options: ");
//            int choose = Integer.parseInt(scanner.nextLine());
//            StudentService studentService = new StudentService();
//            TeacherService teacherService = new TeacherService();
//            switch (choose) {
//                case 1:
//                    System.out.println("Display: ");
//                    System.out.println("1. Display All Person: ");
//                    System.out.println("2. Display Teacher: ");
//                    System.out.println("3. Display Student: ");
//                    int inputDisplay = Integer.parseInt(scanner.nextLine());
//
//                    if (inputDisplay == 1) {
//                        System.out.println("1. Display All Person: ");
//                        teacherService.display();
//                        studentService.display();
//                        break;
//                    } else if (inputDisplay == 2) {
//                        System.out.println("2. Display Teacher: ");
//                        teacherService.display();
//                        break;
//                    } else if (inputDisplay == 3) {
//                        System.out.println("3. Display Student: ");
//                        studentService.display();
//                        break;
//                    } else {
//                        System.out.println("Incorrect Input.");
//                    }
//                    break;
//                case 2:
//                    System.out.println("Add New: ");
//                    System.out.println("1. Add New Teacher: ");
//                    System.out.println("2. Add New Student: ");
//                    int inputAdd = Integer.parseInt(scanner.nextLine());
//
//                    if (inputAdd == 1) {
//                        System.out.println("1. Add New Teacher: ");
//                        teacherService.add();
//                    } else if (inputAdd == 2) {
//                        System.out.println("2. Add New Student: ");
//                        studentService.add();
//                    } else {
//                        System.out.println("Incorrect Input.");
//                    }
//                    break;
//                case 3:
//                    System.out.println("Search: ");
//                    System.out.println("1. Search Teacher: ");
//                    System.out.println("2. Search Student: ");
//                    int inputSearch = Integer.parseInt(scanner.nextLine());
//
//                    if (inputSearch == 1) {
//                        System.out.println("1. Search Teacher: ");
//                        teacherService.search();
//                    } else if (inputSearch == 2) {
//                        System.out.println("2. Search Student: ");
//                        studentService.search();
//                    } else {
//                        System.out.println("Incorrect Input.");
//                    }
//                    break;
//                case 4:
//                    System.out.println("Delete: ");
//                    System.out.println("1. Delete Teacher: ");
//                    System.out.println("2. Delete Student: ");
//                    int inputDelete = Integer.parseInt(scanner.nextLine());
//
//                    if (inputDelete == 1) {
//                        System.out.println("1. Delete Teacher: ");
//                        teacherService.delete();
//                    } else if (inputDelete == 2) {
//                        System.out.println("2. Delete Student: ");
//                        studentService.delete();
//                    } else {
//                        System.out.println("Incorrect Input.");
//                    }
//                    break;
//                case 5:
//                    System.out.println("Update: ");
//                    System.out.println("1. Update Teacher: ");
//                    System.out.println("2. Update Student: ");
//                    int inputUpdate = Integer.parseInt(scanner.nextLine());
//
//                    if (inputUpdate == 1) {
//                        System.out.println("1. Update Teacher: ");
//                        teacherService.update();
//                    } else if (inputUpdate == 3) {
//                        System.out.println("2. Update Student: ");
//                        studentService.update();
//                    } else {
//                        System.out.println("Incorrect Input.");
//                    }
//                    break;
//                case 6:
//                    System.exit(0);
//            }
//        } while (true);
//    }
//}
