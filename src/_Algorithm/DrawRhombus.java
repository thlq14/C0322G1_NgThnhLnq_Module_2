package _Algorithm;

import java.util.Scanner;

public class DrawRhombus { // Vẽ Hình Thoi Rỗng bằng Số..
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the the Height: ");
        int height = scanner.nextInt();

        for (int i = 1; i < height; i++) {
            for (int j = - height; j <= height; j++) {
                if (j == i || i == - j) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//
        for (int i = height - 2; i > 0; i--) {
            for (int j = - height; j <= height; j++) {
                if (j == i || i == - j) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
