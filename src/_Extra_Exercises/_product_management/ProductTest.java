package _Extra_Exercises._product_management;

import java.util.Scanner;

public class ProductTest {
    public static Product[] productList = new Product[100];
    public static int count;
    static Scanner scanner = new Scanner(System.in);

    static {
        productList[0] = new Product(1, "Iphone", 999, 10, "Apple");
        productList[1] = new Product(2, "S21 Ultra", 1000, 9, "Samsung");
        productList[2] = new Product(3, "Aspire", 999, 11, "Acer");
        productList[3] = new Product(4, "Thinkphp", 998, 8, "Lenovo");
        productList[4] = new Product(5, "Macbook", 1001, 12, "Apple");
        count = 5;
    }

    public static void displayList() {
        for (Product item : productList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void addNewProduct() {
        System.out.print("Nhập Tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập Giá: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập Số lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập Nhà sản xuất: ");
        String production = scanner.nextLine();

        Product product = new Product(count + 1, name, price, amount, production);
        productList[count] = product;
        count++;
        System.out.println("Thêm Thành công.");
    }

    public static void searchProduct() {
        int countSearch = 0;
        System.out.println("Nhập Tên hoặc Nhà SX muốn tìm: ");
        String inputSearch = scanner.nextLine();
        for (Product item : productList) {
            if (item != null) {
                if (item.getName().contains(inputSearch) || (item.getProduction().contains(inputSearch))) {
                    System.out.println(item);
                    countSearch++;
                }
            }
        }
        if (countSearch == 0) {
            System.out.println("KHÔNG tìm thấy Tên SP hoặc Nhà SX!");
        }
    }

    public static void deleteProduct() {
        int countDelete = 0;
        System.out.println("Nhập ID muốn xoá: ");
        int inputDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null) {
                if (productList[i].getId() != inputDelete) {
                    productList[i] = productList[i + 1];
                    for (int j = i + 1; j < productList.length && productList[j + 1] != null; j++) {
                        productList[j] = productList[j + 1];
                    }
                    System.out.println("Xoá Thành công.");
                    countDelete++;
                }
            }
        }
        if (countDelete == 0) {
            System.out.println("KHÔNG thể Xoá!");
        }
    }

    public static void updateProduct() {
        int countUpdate = 0;
        System.out.println("Nhập ID muốn Sửa: ");
        int inputUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null) {
                if (productList[i].getId() == inputUpdate) {
                    System.out.print("Nhập Tên: ");
                    String name = scanner.nextLine();

                    System.out.print("Nhập Giá: ");
                    double price = Double.parseDouble(scanner.nextLine());

                    System.out.print("Nhập Số lượng: ");
                    int amount = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nhập Nhà sản xuất: ");
                    String production = scanner.nextLine();

                    productList[i] = new Product(i + 1, name, price, amount, production);
                    countUpdate++;
                    System.out.println("Sửa Thành công.");
                }
            }
        }
        if (countUpdate == 0) {
            System.out.println("KHÔNG tìm thấy ID!");
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("____Product Management____");
            System.out.println("1. Display List Product.");
            System.out.println("2. Add New Product.");
            System.out.println("3. Search Product.");
            System.out.println("4. Delete Product.");
            System.out.println("5. Update Product.");
            System.out.println("6. Exit.");
            System.out.println("Choose Options: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display List.");
                    displayList();
                    break;
                case 2:
                    System.out.println("Add New.");
                    addNewProduct();
                    break;
                case 3:
                    System.out.println("Search.");
                    searchProduct();
                    break;
                case 4:
                    System.out.println("Delete.");
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Update.");
                    updateProduct();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
