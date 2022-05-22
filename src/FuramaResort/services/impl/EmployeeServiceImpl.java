package FuramaResort.services.impl;

import FuramaResort.models.persons.Employee;
import FuramaResort.models.persons.Person;
import FuramaResort.services.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        employeeList.add(new Employee(111, "Kakarot", 18, true, 563, 789123, "kakarot@gmail.com", "kkr563", "University", "Manager", 6000));
        employeeList.add(new Employee(222, "Chichi", 17, false, 798, 564321, "chichi@gmail.com", "ch145", "Colleges", "Monitor", 5400));
        employeeList.add(new Employee(212, "Gohan", 16, true, 632, 452397, "gohan@gmail.com", "gh178", "University", "Management", 5700));
    }

    @Override
    public void displayListEmployee() {
        System.out.println("List Employee: ");
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNewEmployee() {
        System.out.println("Enter Name Employee: ");
        String name = scanner.nextLine();
        System.out.println("Enter Birth Employee: ");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Gender Employee: 1. Male; 2. Female ");
        int isGender = Integer.parseInt(scanner.nextLine());
        boolean gender = false;
        boolean checkGender = isGender == 1;
        if (checkGender) {
            gender = false;
        } else {
            gender = true;
        }
        System.out.println("Enter ID Employee: ");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Phone Number Employee: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Email Employee: ");
        String email = scanner.nextLine();
        System.out.println("Enter Id Employee: ");
        String employeeId = scanner.nextLine();
        System.out.println("Enter Level Employee: 1. Intermediate; 2. Colleges; 3. University; 4. After University.");
        String level = scanner.nextLine();
        System.out.println("Enter Position Employee: 1. Receptionist; 2. Server; 3. Specialist; 4. Monitor; 5. Management; 6. Manager.");
        String position = scanner.nextLine();
        System.out.println("Enter Salary Employee: ");
        int salary = Integer.parseInt(scanner.nextLine());
        int id = employeeList.get(employeeList.size() - 1).getId() + 1;
        Employee employee = new Employee(id, name, birth, gender, idCard, phoneNumber, email, employeeId, level, position, salary);
        employeeList.add(employee);
        System.out.println("Added Employee Success.");
    }

    @Override
    public void editEmployeebyId() {
        int countUpdate = 0;
        System.out.println("Enter ID Employee want to Update: ");
        int inputUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == inputUpdate) {
                System.out.println("Enter Name Employee: ");
                String name = scanner.nextLine();
                System.out.println("Enter Birth Employee: ");
                int birth = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Gender Employee: 1. Male; 2. Female ");
                int isGender = Integer.parseInt(scanner.nextLine());
                boolean gender = false;
                boolean checkGender = isGender == 1;
                if (checkGender) {
                    gender = false;
                } else {
                    gender = true;
                }
                System.out.println("Enter ID Employee: ");
                int idCard = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Phone Number Employee: ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Email Employee: ");
                String email = scanner.nextLine();
                System.out.println("Enter Id Employee: ");
                String employeeId = scanner.nextLine();
                System.out.println("Enter Level Employee: 1. Intermediate; 2. Colleges; 3. University; 4. After University.");
                String level = scanner.nextLine();
                System.out.println("Enter Position Employee: 1. Receptionist; 2. Server; 3. Specialist; 4. Monitor; 5. Management; 6. Manager.");
                String position = scanner.nextLine();
                System.out.println("Enter Salary Employee: ");
                int salary = Integer.parseInt(scanner.nextLine());
                int id = employeeList.get(employeeList.size() - 1).getId() + 1;
                Employee employee = new Employee(id, name, birth, gender, idCard, phoneNumber, email, employeeId, level, position, salary);
                employeeList.set(i, employee);
                countUpdate++;
                System.out.println("Updated Employee Success.");
            }
        }
        if (countUpdate == 0) {
            System.out.println("ID NOT found!!");
        }
    }

    @Override
    public void deleteEmployeeById() {
        System.out.println("Enter ID Employee want to Delete: ");
        int inputRemove = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == inputRemove) {
                for (int j = i + 1; j < employeeList.size(); j++) {
                    employeeList.remove(employeeList.get(i));
                    break;
                }
                System.out.println("Delete Employee Success.");
                inputRemove++;
            }
        }
        if (inputRemove == 0)
            System.out.println("ID NOT found!!");
    }
}
