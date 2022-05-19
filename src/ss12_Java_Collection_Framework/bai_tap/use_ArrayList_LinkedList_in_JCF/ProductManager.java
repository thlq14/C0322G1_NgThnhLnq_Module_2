package ss12_Java_Collection_Framework.bai_tap.use_ArrayList_LinkedList_in_JCF;

import _extra_exercises._product_management.Product;
import java.util.Scanner;

public class ProductManager {
    public static Product[] productList = new Product[100];
    public static int count;
    static Scanner scanner = new Scanner(System.in);

    static {
        productList[0] = new Product(1, "Iphone", 999, 10, "Apple");
        productList[1] = new Product(2, "S21 Ultra", 1000, 9, "Samsung");
        productList[2] = new Product(3, "Aspire", 999, 11, "Acer");

    }
}
