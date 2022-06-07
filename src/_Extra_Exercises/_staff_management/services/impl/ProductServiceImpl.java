package _Extra_Exercises._staff_management.services.impl;

import _Extra_Exercises._staff_management.controllers.StaffController;
import _Extra_Exercises._staff_management.exception.NotFoundEmployeeException;
import _Extra_Exercises._staff_management.models.Product;
import _Extra_Exercises._staff_management.models.Staff;
import _Extra_Exercises._staff_management.services.service.ProductService;
import _Extra_Exercises._staff_management.utils.ReadAndWriteFile;
import _Extra_Exercises._staff_management.utils.Regex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();
    static List<Staff> list = new ArrayList<>();
    private static final String PATH_STAFF = "src/_Extra_Exercises/_staff_management/data/staff.csv";

    @Override
    public void display() {
        products.clear();
        ReadAndWriteFile.readProduct(PATH_STAFF, products);

        System.out.println("List Product: ");
        for (Product item : products) {
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

        System.out.println("Enter Name Product: ");
        String name = scanner.nextLine();

        System.out.println("Enter Birth Product: ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Enter Address Product: ");
        String address = scanner.nextLine();

        System.out.println("Enter Number Product: ");
        double numberProduct = Double.parseDouble(Regex.inputNumberProduct());

        System.out.println("Enter Price Product: ");
        double priceProduct = Double.parseDouble(Regex.inputPriceProduct());

        Product product = new Product(id, staffId, name, birth, address, numberProduct, priceProduct);
        list.add(product);

        ReadAndWriteFile.writeStaff(PATH_STAFF, list);
        System.out.println("Added Product Success.");
    }

    @Override
    public void remove() {
        list.clear();
        ReadAndWriteFile.readStaff(PATH_STAFF, list);

        for (Product item : products) {
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
        ReadAndWriteFile.writeStaff(PATH_STAFF, list);
    }

    @Override
    public void find() {
        ReadAndWriteFile.readProduct(PATH_STAFF, products);
        products.clear();
        System.out.println("Enter Want Find: ");
        String findStaff = scanner.nextLine();
        boolean flag = false;
        for (Product item : products) {
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
