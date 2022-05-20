package ss12_Java_Collection_Framework.bai_tap.use_LinkedList_in_JCF.controller;

import ss12_Java_Collection_Framework.bai_tap.use_LinkedList_in_JCF.service.IProductService;
import ss12_Java_Collection_Framework.bai_tap.use_LinkedList_in_JCF.service.ProductManager;

import java.util.Scanner;

public class ProductTest {
    private static Scanner scanner = new Scanner(System.in);
    static IProductService productService = new ProductManager();

    public void displayMain() {
        do {
            System.out.println("____Product Management____");
            System.out.println("1. Display List Product.");
            System.out.println("2. Add New Product.");
            System.out.println("3. Search Product.");
            System.out.println("4. Delete Product.");
            System.out.println("5. Update Product.");
            System.out.println("6. Display Product Sorted By Price.");
            System.out.println("7. Exit.");
            System.out.println("Choose Options: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productService.displayListProduct();
                    break;
                case 2:
                    productService.addNewProduct();
                    break;
                case 3:
                    productService.searchProductByName();
                    break;
                case 4:
                    productService.removeProductById();
                    break;
                case 5:
                    productService.updateProductById();
                    break;
                case 6:
                    displaySortListProduct();
                    break;
                case 7:
                    System.exit(0);
            }
        }
        while (true);
    }

    public void displaySortListProduct() {
        System.out.println("1. Hiển Thị Danh sách Tăng dần theo Giá: ");
        System.out.println("2. Hiển Thị Danh sách Giảm dần theo Giá: ");
        int inputDisplay = Integer.parseInt(scanner.nextLine());
        if (inputDisplay == 1) {
            System.out.println("1. Danh sách Tăng dần theo Giá: ");
            productService.displayListProductByInCrease();
        } else if (inputDisplay == 2) {
            System.out.println("2. Danh sách Giảm dần theo Giá: ");
            productService.displayListProductByDecrease();
        } else {
            System.out.println("Nhập lại ( 1 -> 2 ) !!");
        }
    }
}
