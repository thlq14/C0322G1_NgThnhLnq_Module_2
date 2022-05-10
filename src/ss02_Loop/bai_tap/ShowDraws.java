package ss02_Loop.bai_tap;

import java.util.Scanner;

public class ShowDraws {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle.");
            System.out.println("2. Print the square triangle.");
            System.out.println("3. Print isosceles triangle.");
            System.out.println("4. Exit.");
            System.out.println("Nhập lựa chọn của bạn ( 1 - 4 ): ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print The Rectangle.");
                    System.out.println("Input Width Rectange: ");
                    int width = input.nextInt();
                    System.out.println("Input Height Rectange: ");
                    int height = input.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < height; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Print The Square Triangle.");
                    System.out.println("Input Height Square Triangle: ");
                    int heightST = input.nextInt();
                    System.out.println("Square Triangle botton_left: ");
                    for (int i = 0; i < heightST; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.println("*");
                        }
                        System.out.println("\n");
                    }
                    System.out.println("Triangle top-left:");
                    for (int i = heightST; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Triangle bottom-right:");
                    for (int i = 1; i <= heightST; i++) {
                        for (int k = heightST; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Triangle top-right:");
                    for (int i = 1; i <= heightST; i++) {
                        for (int j = heightST; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                        for (int k = 1; k <= i; k++) {
                            System.out.print(" ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Print Isosceles Triangle.");
                    System.out.println("Input Height Isosceles Triangle: ");
                    int heightIT = input.nextInt();
                    for (int i = 1; i < heightIT; i++) {
                        for (int j = heightIT; j > i; j--) {
                            System.out.println("*");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.println(" ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("No choice !");
            }
        }
    }
}
