package ss17_IO_Binary_File_Serialization.bai_tap.product_management_binary_file.service;

import ss17_IO_Binary_File_Serialization.bai_tap.product_management_binary_file.model.Product;
import ss17_IO_Binary_File_Serialization.bai_tap.product_management_binary_file.utils.ReadAndWriteBinaryFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements IProductService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Realme", 200, 10, "CN"));
    }

    public void addNewProduct() {
        System.out.print("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập Giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập Số lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Nhà sản xuất: ");
        String production = scanner.nextLine();
        int id = productList.get(productList.size() - 1).getId() + 1;
        Product product = new Product(id, name, price, amount, production);
        productList.add(product);
        ReadAndWriteBinaryFile.writeFile("src/ss17_IO_Binary_File_Serialization/bai_tap/product_management_binary_file/data/product_binary.csv", productList);
        System.out.println("Thêm Thành công.");
    }

    public void updateProductById() {
        int countUpdate = 0;
        System.out.println("Nhập ID muốn Sửa: ");
        int inputUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == inputUpdate) {
                System.out.print("Nhập Tên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập Giá: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập Số lượng: ");
                int amount = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập Nhà sản xuất: ");
                String production = scanner.nextLine();

                productList.get(i).setName(name);
                productList.get(i).setPrice(price);
                productList.get(i).setAmount(amount);
                productList.get(i).setProduction(production);
                countUpdate++;
                System.out.println("Sửa Thành công.");
            }
        }
        if (countUpdate == 0) {
            System.out.println("KHÔNG tìm thấy ID!");
        }
    }

    public void removeProductById() {
        System.out.println("Nhập ID muốn xoá: ");
        int inputRemove = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == inputRemove) {
                for (int j = i + 1; j < productList.size(); j++) {
                    productList.remove(productList.get(i));
                    break;
                }
                System.out.println("Xoá Thành công.");
                inputRemove++;
            }
        }
        if (inputRemove == 0)
            System.out.println("KHÔNG tìm thấy Id !!!");
    }

    public void displayListProduct() {
        productList = (List<Product>) ReadAndWriteBinaryFile.readFile("src/ss17_IO_Binary_File_Serialization/bai_tap/product_management_binary_file/data/product_binary.csv");
        System.out.println("List Product: ");
        for (Product item : productList) {
            System.out.println(item);
        }
    }

    public void searchProductByName() {
        int countSearch = 0;
        productList = (List<Product>) ReadAndWriteBinaryFile.readFile("src/ss17_IO_Binary_File_Serialization/bai_tap/product_management_binary_file/data/product_binary.csv");
        System.out.println("Nhập Tên SP muốn tìm: ");
        String inputSearch = scanner.nextLine();
        for (Product item : productList) {
            if (item != null) {
                if (item.getName().contains(inputSearch)) {
                    System.out.println(item);
                    countSearch++;
                }
            }
        }
        if (countSearch == 0) {
            System.out.println("KHÔNG tìm thấy Tên SP!");
        }
    }
}
