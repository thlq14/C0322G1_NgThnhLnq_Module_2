package _Extra_Exercises._st_tc_management.services.impl;

import _Extra_Exercises._st_tc_management.controllers.PersonController;
import _Extra_Exercises._st_tc_management.models.Teacher;
import _Extra_Exercises._st_tc_management.services.service.TeacherService;
import _Extra_Exercises._st_tc_management.utils.ReadAndWriteFile;
import _Extra_Exercises._st_tc_management.utils.Regex;
import _Extra_Exercises._staff_management.controllers.StaffController;
import _Extra_Exercises._staff_management.exception.NotFoundEmployeeException;
import _Extra_Exercises._staff_management.models.Manager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherServiceImpl implements TeacherService {
    static Scanner scanner = new Scanner(System.in);
    static List<Teacher> teachers = new ArrayList<>();
    static final String PATH_TEACHER = "src/_Extra_Exercises/_st_tc_management/data/teacher.csv";
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void add() {
        teachers.clear();
        teachers = ReadAndWriteFile.readTeacher(PATH_TEACHER);

        int id = 0;
        int max = 0;
        if (teachers.isEmpty()) {
            id = 1;
        } else {
            for (Teacher item : teachers) {
                if (item.getId() > max) {
                    max = item.getId();
                }
            }
            id = max + 1;
        }
        System.out.println("Enter Name Teacher: ");
        String name = scanner.nextLine();

        System.out.println("Enter Gender Teacher: 1. Male; 2. Female; 3. Other Genders.");
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

        System.out.println("Enter Address Teacher: ");
        String address = scanner.nextLine();

        System.out.println("Enter Class Teacher: ");
        String classTeach = scanner.nextLine();

        System.out.println("Enter Salary Teacher: ");
        double salaryTeach = Double.parseDouble(Regex.inputInt());

        System.out.println("Enter Hour Teacher: ");
        double hourTeach = Double.parseDouble(Regex.inputInt());

        Teacher teacher = new Teacher(id, name, gender, birth, address, classTeach, salaryTeach, hourTeach);
        teachers.add(teacher);

        ReadAndWriteFile.writeTeacher(PATH_TEACHER, teachers);
        System.out.println("Added Teacher Success.");
    }

    @Override
    public void display() {
        teachers.clear();
        teachers = ReadAndWriteFile.readTeacher(PATH_TEACHER);

        System.out.println("List Teacher: ");
        for (Teacher item : teachers) {
            System.out.println(item);
        }
    }

    @Override
    public void edit() {
        teachers.clear();
        teachers = ReadAndWriteFile.readTeacher(PATH_TEACHER);

        int countEdit = 0;
        System.out.println("Enter ID Teacher want to Edit: ");
        int inputEdit = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == inputEdit) {
                System.out.println("Enter Name Teacher: ");
                String name = scanner.nextLine();

                System.out.println("Enter Gender Teacher: 1. Male; 2. Female; 3. Other Genders.");
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

                System.out.println("Enter Address Teacher: ");
                String address = scanner.nextLine();

                System.out.println("Enter Class Teacher: ");
                String classTeach = scanner.nextLine();

                System.out.println("Enter Salary Teacher: ");
                double salaryTeach = Double.parseDouble(Regex.inputInt());

                System.out.println("Enter Hour Teacher: ");
                double hourTeach = Double.parseDouble(Regex.inputInt());

                teachers.get(i).setName(name);
                teachers.get(i).setGender(gender);
                teachers.get(i).setBirth(birth);
                teachers.get(i).setAddress(address);
                teachers.get(i).setClassTeach(classTeach);
                teachers.get(i).setSalaryTeach(salaryTeach);
                teachers.get(i).setHourTeach(hourTeach);
                ReadAndWriteFile.writeTeacher(PATH_TEACHER, teachers);
                countEdit++;
                System.out.println("Edited Teacher Success.");
            }
        }
        if (countEdit == 0) {
            System.out.println("ID NOT found!!");
        }
    }

    @Override
    public void remove() {
        teachers.clear();
        teachers = ReadAndWriteFile.readTeacher(PATH_TEACHER);

        for (Teacher item : teachers) {
            if (item != null) {
                System.out.println(item);
            }
        }

        System.out.println("Enter Id Teacher Want Remove: ");
        String inputId = scanner.nextLine();
        int choose;
        for (int i = 0; i < teachers.size(); i++) {
            if (inputId.equals(teachers.get(i).getId())) {
                System.out.println("Are You Want To Remove: \n" +
                        "1. Yes.\n" +
                        "2. No.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        teachers.remove(i);
                        System.out.println("Removed Manager Success.");
                        break;
                    case 2:
                        PersonController.displayMainMenu();
                        break;
                    default:
                        System.err.println("Error: Enter Again (1 - 2):");

                }
            }
        }
    }

    @Override
    public void sortByName() {

    }

    @Override
    public void sortByBirth() {

    }
}
