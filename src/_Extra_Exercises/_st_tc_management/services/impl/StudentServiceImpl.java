package _Extra_Exercises._st_tc_management.services.impl;

import _Extra_Exercises._st_tc_management.controllers.PersonController;
import _Extra_Exercises._st_tc_management.models.Student;
import _Extra_Exercises._st_tc_management.models.Teacher;
import _Extra_Exercises._st_tc_management.services.service.StudentService;
import _Extra_Exercises._st_tc_management.sorts.SortByNameIncrease;
import _Extra_Exercises._st_tc_management.utils.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();
    static final String PATH_STUDENT = "src/_Extra_Exercises/_st_tc_management/data/student.csv";
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void add() {
        students.clear();
        students = ReadAndWriteFile.readStudent(PATH_STUDENT);

        int id = 0;
        int max = 0;
        if (students.isEmpty()) {
            id = 1;
        } else {
            for (Student item : students) {
                if (item.getId() > max) {
                    max = item.getId();
                }
            }
            id = max + 1;
        }
        System.out.println("Enter Name Student: ");
        String name = scanner.nextLine();

        System.out.println("Enter Gender Student: 1. Male; 2. Female; 3. Other Genders.");
        String gender;
        int isGender;
        do {
            isGender = Integer.parseInt(scanner.nextLine());
            switch (isGender) {
                case 1:
                    gender = "Male";
                    break;
                case 2:
                    gender = "Female";
                    break;
                case 3:
                    gender = "Other Genders";
                    break;
                default:
                    gender = "Error: Enter Again.. (1 -> 4)";
                    break;
            }
        } while (isGender < 1 || isGender > 3);

        System.out.println("Enter Birth Employee..Format: dd/MM/yyyy: ");
        LocalDate birth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Enter Address Student: ");
        String address = scanner.nextLine();

        System.out.println("Enter Id Student: ");
        String studentId = scanner.nextLine();

        System.out.println("Enter Point Average: ");
        double pointAvg = Double.parseDouble(scanner.nextLine());

        Student student = new Student(id, name, gender, birth, address, studentId, pointAvg);
        students.add(student);

        ReadAndWriteFile.writeStudent(PATH_STUDENT, students);
        System.out.println("Added Student Success.");
    }

    @Override
    public void display() {
        students.clear();
        students = ReadAndWriteFile.readStudent(PATH_STUDENT);

        System.out.println("List Student: ");
        for (Student item : students) {
            System.out.println(item);
        }
    }

    @Override
    public void edit() {
        students.clear();
        students = ReadAndWriteFile.readStudent(PATH_STUDENT);

        int countEdit = 0;
        System.out.println("Enter ID Student want to Edit: ");
        int inputEdit = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == inputEdit) {
                System.out.println("Enter Name Student: ");
                String name = scanner.nextLine();

                System.out.println("Enter Gender Student: 1. Male; 2. Female; 3. Other Genders.");
                String gender;
                int isGender;
                do {
                    isGender = Integer.parseInt(scanner.nextLine());
                    switch (isGender) {
                        case 1:
                            gender = "Male";
                            break;
                        case 2:
                            gender = "Female";
                            break;
                        case 3:
                            gender = "Other Genders";
                            break;
                        default:
                            gender = "Error: Enter Again.. (1 -> 4)";
                            break;
                    }
                } while (isGender < 1 || isGender > 3);

                System.out.println("Enter Birth Employee..Format: dd/MM/yyyy: ");
                LocalDate birth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

                System.out.println("Enter Address Student: ");
                String address = scanner.nextLine();

                System.out.println("Enter Id Student: ");
                String studentId = scanner.nextLine();

                System.out.println("Enter Point Average: ");
                double pointAvg = Double.parseDouble(scanner.nextLine());

                students.get(i).setName(name);
                students.get(i).setGender(gender);
                students.get(i).setBirth(birth);
                students.get(i).setAddress(address);
                students.get(i).setStudentId(studentId);
                students.get(i).setPointAvg(pointAvg);
                ReadAndWriteFile.writeStudent(PATH_STUDENT, students);
                countEdit++;
                System.out.println("Edited Student Success.");
            }
        }
        if (countEdit == 0) {
            System.out.println("ID NOT found!!");
        }
    }

    @Override
    public void remove() {
        students.clear();
        students = ReadAndWriteFile.readStudent(PATH_STUDENT);

        for (Student item : students) {
            if (item != null) {
                System.out.println(item);
            }
        }

        System.out.println("Enter Id Student Want Remove: ");
        String inputId = scanner.nextLine();
        int choose;
        for (int i = 0; i < students.size(); i++) {
            try {
                if (inputId.equals(students.get(i).getId())) {
                    System.out.println("Are You Want To Remove: \n" +
                            "1. Yes.\n" +
                            "2. No.\n" +
                            "Choose Option: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            students.remove(i);
                            System.out.println("Removed Manager Success.");
                            break;
                        case 2:
                            PersonController.displayMainMenu();
                            break;
                        default:
                            System.err.println("Error: Enter Again (1 - 2):");

                    }
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.err.println("Incorrect Format. Enter Again: ");
            }
        }
    }

    @Override
    public void sortByName() {
        Collections.sort(students, new SortByNameIncrease());
        for (Student item : students) {
            System.out.println(item);
        }
    }

    @Override
    public void sortByBirth() {

    }
}
