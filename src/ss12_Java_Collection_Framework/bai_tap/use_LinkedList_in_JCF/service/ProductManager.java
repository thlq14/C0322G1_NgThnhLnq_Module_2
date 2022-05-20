package ss12_Java_Collection_Framework.bai_tap.use_LinkedList_in_JCF.service;

import ss12_Java_Collection_Framework.bai_tap.use_LinkedList_in_JCF.model.Product;
import ss12_Java_Collection_Framework.bai_tap.use_LinkedList_in_JCF.utils.DecreasePriceComparator;
import ss12_Java_Collection_Framework.bai_tap.use_LinkedList_in_JCF.utils.IncreasePriceComparator;

import java.util.*;

public class ProductManager implements IProductService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new LinkedList<>();

    static {
        productList.add(new Product(1, "Iphone", 999, 10, "Apple"));
        productList.add(new Product(2, "S21 Ultra", 1000, 9, "Samsung"));
        productList.add(new Product(3, "Aspire", 999, 11, "Acer"));
        productList.add(new Product(4, "Thinkpad", 998, 8, "Lenovo"));
        productList.add(new Product(5, "Macbook", 1001, 12, "Apple"));

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
        System.out.println("List Product: ");
        for (Product item : productList) {
            System.out.println(item);
        }
    }

    public void displayListProductByInCrease() {
        Collections.sort(productList, new IncreasePriceComparator());
        System.out.println("List Product Increase: ");
        for (Product item : productList) {
            System.out.println(item);
        }
    }

    public void displayListProductByDecrease() {
        Collections.sort(productList, new DecreasePriceComparator());
        System.out.println("List Product Decrease: ");
        for (Product item : productList) {
            System.out.println(item);
        }
    }

    public void searchProductByName() {
        int countSearch = 0;
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