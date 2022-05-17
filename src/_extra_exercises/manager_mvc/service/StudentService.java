//package _extra_exercises.manager_mvc.service;
//
//import _extra_exercises.manager_mvc.model.Person;
//import _extra_exercises.manager_mvc.model.Student;
//import _extra_exercises.manager_mvc.model.Teacher;
//
//import java.util.Scanner;
//
//public class StudentService implements StudentServiceSV {
//    public static Scanner scanner = new Scanner(System.in);
//    public static Person[] personList = new Person[100];
//    public static int count = 0;
//
//    public static void add() {
//        System.out.print("Nhập tên Student: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Nhập Tuổi: ");
//        int age = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("Chọn Giới tính: ");
//        boolean gender = Boolean.parseBoolean(scanner.nextLine());
//
//        System.out.print("Nhập Điểm: ");
//        double point = Double.parseDouble(scanner.nextLine());
//
//        Person student = new Student(count + 1, name, age, gender, point);
//        personList[count] = student;
//        count++;
//        System.out.println("Thêm Student Thành công.");
//    }
//
//    public static void delete() {
//        System.out.print("Nhập ID Student muốn Xóa: ");
//        int inputIDStudent = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < personList.length; i++) {
//            if (personList[i] instanceof Student && personList[i].getId() == inputIDStudent) {
//                for (int j = i + 1; j < personList.length && personList[j + 1] != null; j++) {
//                    personList[j] = personList[j + 1];
//                }
//            }
//        }
//        System.out.println("Xoá Student Thành công.");
//    }
//
//    public static void search() {
//        int count = 0;
//        System.out.print("Nhập Tên Student muốn Tìm kiếm: ");
//        String inputPerson = scanner.nextLine();
//
//        for (Person item : personList) {
//            if (item instanceof Student && item.getName().contains(inputPerson)) {
//                System.out.println(item);
//                count++;
//            }
//        }
//        if (count == 0) {
//            System.out.println("KHÔNG tìm thấy Tên Student.");
//        }
//    }
//
//    public static void display() {
//        for (Person item : personList) {
//            if (item instanceof Student) {
//                System.out.println(item);
//            }
//        }
//    }
//
//    public static void update() {
//        int count = 0;
//        System.out.print("Nhập ID Student muốn Sửa: ");
//        int inputUpdate = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < personList.length; i++) {
//            if (personList[i] != null) {
//                if (personList[i].getId() == inputUpdate) {
//                    System.out.print("Nhập tên Student: ");
//                    String name = scanner.nextLine();
//
//                    System.out.print("Nhập Tuổi: ");
//                    int age = Integer.parseInt(scanner.nextLine());
//
//                    System.out.print("Chọn Giới tính: ");
//                    boolean gender = Boolean.parseBoolean(scanner.nextLine());
//
//                    System.out.print("Nhập Điểm: ");
//                    double point = Double.parseDouble(scanner.nextLine());
//
//                    Person person = new Teacher(count + 1, name, age, gender, point);
//                    personList[count] = person;
//                    count++;
//                    System.out.println("Sửa Student Thành công.");
//                }
//            }
//        }
//        if (count == 0) {
//            System.out.println("KHÔNG tìm thấy ID Student!");
//        }
//    }
//}
