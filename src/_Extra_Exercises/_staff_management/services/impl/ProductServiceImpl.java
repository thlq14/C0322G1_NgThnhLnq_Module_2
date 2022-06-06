package _Extra_Exercises._staff_management.services.impl;

import _Extra_Exercises._staff_management.models.Product;
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
    static List<Product> productList = new ArrayList<>();
    private static final String PATH_PRODUCT = "src/_Extra_Exercises/_staff_management/data/product.csv";

    @Override
    public void display() {
        productList = ReadAndWriteFile.readProduct(PATH_PRODUCT);

        System.out.println("List Product: ");
        for (Product item : productList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        productList.clear();
        productList = ReadAndWriteFile.readProduct(PATH_PRODUCT);

        int id = 0;
        int max = 0;
        if (productList.isEmpty()) {
            id = 1;
        } else {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId() > max) {
                    max = productList.get(i).getId();
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

        double numberProduct = Double.parseDouble(Regex.inputNumberProduct());

        double priceProduct = Double.parseDouble(Regex.inputPriceProduct());

        Product product = new Product(id, staffId, name, birth, address, numberProduct, priceProduct);
        productList.add(product);

        ReadAndWriteFile.writeProduct(PATH_PRODUCT, productList);
        System.out.println("Added Product Success.");
    }

    @Override
    public void remove() {
        productList.clear();
        productList = ReadAndWriteFile.readProduct(PATH_PRODUCT);

        for (Product item : productList) {
            System.out.println(item);
        }

        System.out.println("Enter Id Product Want Remove: ");
        String staffId = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (staffId.equals(productList.get(i).getStaffId())) {
                productList.remove(i);
            }
        }
        ReadAndWriteFile.writeProduct(PATH_PRODUCT, productList);
        System.out.println("Removed Product Success.");
    }

    @Override
    public void findByStaffId() {
        productList = ReadAndWriteFile.readProduct(PATH_PRODUCT);
        productList.clear();

        String findStaffId = scanner.nextLine();
        boolean flag = false;
        for (Product item : productList) {
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
        productList.clear();
        productList = ReadAndWriteFile.readProduct(PATH_PRODUCT);

        String findName = scanner.nextLine();
        boolean flag = false;
        for (Product item : productList) {
            if (findName.contains(item.getName())) {
                System.out.println(item);
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.err.println("NOT found Name Product.");
        }
    }

    @Override
    public void findByBirth() {
        productList.clear();
        productList = ReadAndWriteFile.readProduct(PATH_PRODUCT);

        LocalDate findBirth = LocalDate.parse(scanner.nextLine());
        boolean flag = false;
        for (Product item : productList) {
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
        productList.clear();
        productList = ReadAndWriteFile.readProduct(PATH_PRODUCT);

        String findAddress = scanner.nextLine();
        boolean flag = false;
        for (Product item : productList) {
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
