//package _extra_exercises.manager_mvc.service;
//
//import _extra_exercises.manager_mvc.model.Person;
//import _extra_exercises.manager_mvc.model.Teacher;
//
//import java.util.Scanner;
//
//public class TeacherService implements Service {
//    Scanner scanner = new Scanner(System.in);
//
//    public static void add() {
//        System.out.print("Nhập tên Teacher: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Nhập Tuổi: ");
//        int age = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("Chọn Giới tính: ");
//        boolean gender = Boolean.parseBoolean(scanner.nextLine());
//
//        System.out.print("Nhập Lương: ");
//        double salary = Double.parseDouble(scanner.nextLine());
//
//        Person teacher = new Teacher(count + 1, name, age, gender, salary);
//        personList[count] = teacher;
//        count++;
//        System.out.println("Thêm Teacher Thành công.");
//    }
//
//    public static void delete() {
//        System.out.print("Nhập ID Teacher muốn Xóa: ");
//        int inputIDTeacher = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < personList.length; i++) {
//            if (personList[i] instanceof Teacher && personList[i].getId() == inputIDTeacher) {
//                for (int j = i; j < personList.length && personList[j] != null; j++) {
//                    personList[j] = personList[j + 1];
//                }
//            }
//        }
//        System.out.println("Xoá Teacher Thành công.");
//    }
//
//    public static void search() {
//        int countSearch = 0;
//        System.out.print("Nhập Tên Teacher muốn Tìm kiếm: ");
//        String inputPerson = scanner.nextLine();
//
//        for (Person item : personList) {
//            if (item instanceof Teacher && item.getName().contains(inputPerson)) {
//                System.out.println(item);
//                countSearch++;
//            }
//        }
//        if (countSearch == 0) {
//            System.out.println("KHÔNG tìm thấy Tên Teacher.");
//        }
//    }
//
//    public static void display() {
//        for (Person item : personList) {
//            if (item instanceof Teacher) {
//                System.out.println(item);
//            }
//        }
//    }
//
//    public static void update() {
//        int countUpdate = 0;
//        System.out.print("Nhập ID Teacher muốn Sửa: ");
//        int inputUpdate = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < personList.length; i++) {
//            if (personList[i] != null) {
//                if (personList[i].getId() == inputUpdate) {
//                    System.out.print("Nhập tên Teacher: ");
//                    String name = scanner.nextLine();
//
//                    System.out.print("Nhập Tuổi: ");
//                    int age = Integer.parseInt(scanner.nextLine());
//
//                    System.out.print("Chọn Giới tính: ");
//                    boolean gender = Boolean.parseBoolean(scanner.nextLine());
//
//                    System.out.print("Nhập Lương: ");
//                    double salary = Double.parseDouble(scanner.nextLine());
//
//                    Person person = new Teacher(count + 1, name, age, gender, salary);
//                    personList[count] = person;
//                    countUpdate++;
//                    System.out.println("Sửa Teacher Thành công.");
//                }
//            }
//        }
//        if (countUpdate == 0) {
//            System.out.println("KHÔNG tìm thấy ID Teacher!");
//        }
//    }
