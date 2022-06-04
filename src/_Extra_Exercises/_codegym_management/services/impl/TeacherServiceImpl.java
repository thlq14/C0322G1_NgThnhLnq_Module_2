package _Extra_Exercises._codegym_management.services.impl;

import _Extra_Exercises._codegym_management.models.Teacher;
import _Extra_Exercises._codegym_management.services.service.TeacherService;
import _Extra_Exercises._codegym_management.utils.files.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherServiceImpl implements TeacherService {
    static List<Teacher> teachers = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static final String PATH_SAVING = "src/_Extra_Exercises/_codegym_management/data/saving.csv";

    @Override
    public void add() {
        teachers = ReadAndWriteFile.readTeacher(PATH_SAVING);

        System.out.println("Enter Id Teacher: ");
        String id = scanner.nextLine();

        System.out.println("Enter Name Teacher: ");
        String name = scanner.nextLine();

        System.out.println("Enter Birth Teacher: ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Enter Gender Teacher: 1. Male; 2. Female; 3. Other Gender: ");
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

        System.out.println("Enter Specialize Teacher: ");
        String specialize = scanner.nextLine();

        Teacher teacher = new Teacher(id, name, birth, gender, specialize);
        teachers.add(teacher);

        ReadAndWriteFile.writeTeacher(PATH_SAVING, teachers);
        System.out.println("Added Teacher Success.");
    }

    @Override
    public void remove() {
        teachers.clear();
        teachers = ReadAndWriteFile.readTeacher(PATH_SAVING);

        for (Teacher item : teachers) {
            System.out.println(item);
        }

        System.out.println("Enter Id Teacher Want To Remove: ");
        String id = scanner.nextLine();
        boolean flag = false;
        for (Teacher item : teachers) {
            if (id.equals(item.getId())) {
                teachers.remove(item);
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
        teachers.clear();
        teachers = ReadAndWriteFile.readTeacher(PATH_SAVING);

        System.out.println("List Teacher: ");
        for (Teacher item : teachers) {
            System.out.println(item);
        }
    }

    @Override
    public void find() {
        teachers.clear();
        ReadAndWriteFile.writeTeacher(PATH_SAVING, teachers);
        System.out.println("Enter Name Teacher Want Find: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for (Teacher item : teachers) {
            if (name.contains(item.getName())) {
                System.out.println(item);
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("NOT found Name Teacher.");
        }
    }
}
