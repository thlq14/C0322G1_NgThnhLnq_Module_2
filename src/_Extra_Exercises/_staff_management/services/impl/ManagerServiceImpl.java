package _Extra_Exercises._staff_management.services.impl;

import _Extra_Exercises._staff_management.models.Manager;
import _Extra_Exercises._staff_management.services.service.ManagerService;
import _Extra_Exercises._staff_management.utils.ReadAndWriteFile;
import _Extra_Exercises._staff_management.utils.Regex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerServiceImpl implements ManagerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Manager> managerList = new ArrayList<>();
    private static final String PATH_MANAGER = "src/_Extra_Exercises/_staff_management/data/manager.csv";

    @Override
    public void display() {
        managerList = ReadAndWriteFile.readManager(PATH_MANAGER);

        System.out.println("List Manager: ");
        for (Manager item : managerList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        managerList.clear();
        managerList = ReadAndWriteFile.readManager(PATH_MANAGER);

        int id = 0;
        int max = 0;
        if (managerList.isEmpty()) {
            id = 1;
        } else {
            for (int i = 0; i < managerList.size(); i++) {
                if (managerList.get(i).getId() > max) {
                    max = managerList.get(i).getId();
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
        managerList.add(manager);

        ReadAndWriteFile.writeManager(PATH_MANAGER, managerList);
        System.out.println("Added Manager Success.");
    }


    @Override
    public void remove() {
        managerList.clear();
        managerList = ReadAndWriteFile.readManager(PATH_MANAGER);

        for (Manager item : managerList) {
            System.out.println(item);
        }

        System.out.println("Enter Id Manager Want Remove: ");
        String staffId = scanner.nextLine();
        for (int i = 0; i < managerList.size(); i++) {
            if (staffId.equals(managerList.get(i).getStaffId())) {
                managerList.remove(i);
            }
        }

        ReadAndWriteFile.writeManager(PATH_MANAGER, managerList);
        System.out.println("Removed Manager Success.");
    }

    @Override
    public void findByStaffId() {
        managerList = ReadAndWriteFile.readManager(PATH_MANAGER);
        managerList.clear();

        String findStaffId = scanner.nextLine();
        boolean flag = false;
        for (Manager item : managerList) {
            if (findStaffId.contains(item.getStaffId())) {
                System.out.println(item);
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.err.println("NOT found Staff Id.");
        }
    }

    @Override
    public void findByName() {
        managerList.clear();
        managerList = ReadAndWriteFile.readManager(PATH_MANAGER);

        String findName = scanner.nextLine();
        boolean flag = false;
        for (Manager item : managerList) {
            if (findName.contains(item.getName())) {
                System.out.println(item);
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.err.println("NOT found Name Manager.");
        }
    }

    @Override
    public void findByBirth() {
        managerList.clear();
        managerList = ReadAndWriteFile.readManager(PATH_MANAGER);

        LocalDate findBirth = LocalDate.parse(scanner.nextLine());
        boolean flag = false;
        for (Manager item : managerList) {
            if (findBirth.equals(item.getBirth())) {
                System.out.println(item);
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.err.println("NOT found Birth.");
        }
    }

    @Override
    public void findByAddress() {
        managerList.clear();
        managerList = ReadAndWriteFile.readManager(PATH_MANAGER);

        String findAddress = scanner.nextLine();
        boolean flag = false;
        for (Manager item : managerList) {
            if (findAddress.contains(item.getAddress())) {
                System.out.println(item);
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.err.println("NOT found Address.");
        }
    }
}
