package ss12_Java_Collection_Framework.bai_tap.use_ArrayList_in_JCF.use_ArrayList;

import ss12_Java_Collection_Framework.bai_tap.use_ArrayList_in_JCF.MVC.service.IProductService;
import ss12_Java_Collection_Framework.bai_tap.use_ArrayList_in_JCF.MVC.service.ProductService;

import java.util.Scanner;

public class ProductTest {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        IProductService productService = new ProductService();
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
                    System.exit(0);
            }
        }
        while (true);
    }
}
