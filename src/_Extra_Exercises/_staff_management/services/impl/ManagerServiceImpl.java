package _Extra_Exercises._staff_management.services.impl;

import _Extra_Exercises._staff_management.controllers.StaffController;
import _Extra_Exercises._staff_management.exception.NotFoundEmployeeException;
import _Extra_Exercises._staff_management.models.Manager;
import _Extra_Exercises._staff_management.models.Staff;
import _Extra_Exercises._staff_management.services.service.ManagerService;
import _Extra_Exercises._staff_management.utils.ReadAndWriteFile;
import _Extra_Exercises._staff_management.utils.Regex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerServiceImpl implements ManagerService {
    static Scanner scanner = new Scanner(System.in);
    static List<Manager> managers = new ArrayList<>();
    static List<Staff> list = new ArrayList<>();
    static final String PATH_STAFF = "src/_Extra_Exercises/_staff_management/data/staff.csv";

    @Override
    public void display() {
        managers.clear();
        ReadAndWriteFile.readManager(PATH_STAFF, managers);

        System.out.println("List Manager: ");
        for (Manager item : managers) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        list.clear();
        ReadAndWriteFile.readStaff(PATH_STAFF, list);

        int id = 0;
        int max = 0;
        if (list.isEmpty()) {
            id = 1;
        } else {
            for (Staff staff : list) {
                if (staff.getId() > max) {
                    max = staff.getId();
                }
            }
            id = max + 1;
        }

        System.out.println("Enter Staff Id: ");
        String staffId = scanner.nextLine();

        System.out.println("Enter Name Manager: ");
        String name = scanner.nextLine();

        System.out.println("Enter Birth Manager: ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Enter Address Manager: ");
        String address = scanner.nextLine();

        System.out.println("Enter Basic Salary: ");
        double basicSalary = Double.parseDouble(Regex.inputBasicSalary());

        System.out.println("Enter Coefficient Salary: ");
        double coefficientSalary = Double.parseDouble(Regex.inputCoefficientSalary());

        Manager manager = new Manager(id, staffId, name, birth, address, basicSalary, coefficientSalary);
        list.add(manager);

        ReadAndWriteFile.writeStaff(PATH_STAFF, list);
        System.out.println("Added Manager Success.");
    }

    @Override
    public void remove() {
        list.clear();
        ReadAndWriteFile.readStaff(PATH_STAFF, list);

        for (Manager item : managers) {
            if (item != null) {
                System.out.println(item);
            }
        }

        System.out.println("Enter Id Manager Want Remove: ");
        String staffId = scanner.nextLine();
        int choose;
        for (int i = 0; i < list.size(); i++) {
            try {
                if (staffId.equals(list.get(i).getStaffId())) {
                    System.out.println("Are You Want To Remove: \n" +
                            "1. Yes.\n" +
                            "2. No.\n" +
                            "Choose Option: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            list.remove(i);
                            System.out.println("Removed Manager Success.");
                            break;
                        case 2:
                            StaffController.displayMainMenu();
                            break;
                        default:
                            System.err.println("Error: Enter Again (1 - 2):");
                            throw new NotFoundEmployeeException("Error: Incorrect Format..Enter Again: ");
                    }
                }
            } catch (NotFoundEmployeeException e) {
                System.out.println("Staff Id Doesn't Exist.");
            }
        }
    }

    @Override
    public void find() {
        ReadAndWriteFile.readManager(PATH_STAFF, managers);
        managers.clear();

        System.out.println("Enter Want Find: ");
        String findStaff = scanner.nextLine();
        boolean flag = false;
        for (Manager item : managers) {
            if (findStaff.contains(item.getStaffId()) || findStaff.contains(item.getName())
                    || findStaff.contains(item.getBirth().toString()) || findStaff.contains(item.getAddress())) {
                System.out.println(item);
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.err.println("NOT found Staff Id.");
        }
    }
}
