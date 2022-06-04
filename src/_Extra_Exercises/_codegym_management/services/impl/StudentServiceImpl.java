package _Extra_Exercises._codegym_management.services.impl;

import _Extra_Exercises._codegym_management.models.Student;
import _Extra_Exercises._codegym_management.services.service.StudentService;
import _Extra_Exercises._codegym_management.utils.files.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    static List<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static final String PATH_SAVING = "src/_Extra_Exercises/_codegym_management/data/saving.csv";

    @Override
    public void add() {
        students = ReadAndWriteFile.readStudent(PATH_SAVING);

        System.out.println("Enter Id Student: ");
        String id = scanner.nextLine();

        System.out.println("Enter Name Student: ");
        String name = scanner.nextLine();

        System.out.println("Enter Birth Student: ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Enter Gender Student: 1. Male; 2. Female; 3. Other Gender: ");
        String gender;
        int choose;
        do {
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    gender = "Male";
                    break;
                case 2:
                    gender = "Female";
                    break;
                case 3:
                    gender = "Other Gender";
                    break;
                default:
                    gender = ("Error..Enter Again (1 - 3): ");
                    break;
            }
        } while (choose < 1 || choose > 3);

        System.out.println("Enter Name Class: ");
        String nameClass = scanner.nextLine();

        System.out.println("Enter Point: ");
        Double point = Double.parseDouble(scanner.nextLine());

        Student student = new Student(id, name, birth, gender, nameClass, point);
        students.add(student);

        ReadAndWriteFile.writeStudent(PATH_SAVING, students);
        System.out.println("Added Student Success");
    }

    @Override
    public void remove() {
        students.clear();
        students = ReadAndWriteFile.readStudent(PATH_SAVING);

        for (Student item : students) {
            System.out.println(item);
        }

        System.out.println("Enter Id Student Want To Remove: ");
        String id = scanner.nextLine();
        boolean flag = false;
        for (Student item : students) {
            if (id.equals(item.getId())) {
                students.remove(item);
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("NOT found Id.");
        }
    }

    @Override
    public void display() {
        students.clear();
        students = ReadAndWriteFile.readStudent(PATH_SAVING);

        System.out.println("List Student: ");
        for (Student item : students) {
            System.out.println(item);
        }
    }

    @Override
    public void find() {
        students.clear();
        ReadAndWriteFile.writeStudent(PATH_SAVING, students);
        System.out.println("Enter Name Student Want Find: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for (Student item : students) {
            if (name.contains(item.getName())) {
                System.out.println(item);
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("NOT found Name Student.");
        }
    }
}
