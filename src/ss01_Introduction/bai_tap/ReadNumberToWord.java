package ss01_Introduction.bai_tap;

import java.util.Scanner;

public class ReadNumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc (0 - 999): ");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("Nhập lại (0 - 999):");
        } else if (number < 10) {
            switch (number) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
        } else {
            switch (number / 100) {
                case 1:
                    System.out.print("One hundred ");
                    break;
                case 2:
                    System.out.print("Two hundred ");
                    break;
                case 3:
                    System.out.print("Three hundred ");
                    break;
                case 4:
                    System.out.print("Four hundred ");
                    break;
                case 5:
                    System.out.print("Five hundred ");
                    break;
                case 6:
                    System.out.print("Six hundred ");
                    break;
                case 7:
                    System.out.print("Seven hundred ");
                    break;
                case 8:
                    System.out.print("Eight hundred ");
                    break;
                case 9:
                    System.out.print("Nine hundred ");
                    break;
            }
            if (number >= 100 && number % 100 != 0) {
                System.out.print("and ");
            }
            switch (((number / 10) * 10) % 100) {
                case 10:
                    System.out.print("Ten ");
                    break;
                case 20:
                    System.out.print("Twenty ");
                    break;
                case 30:
                    System.out.print("Thirty ");
                    break;
                case 40:
                    System.out.print("Forty ");
                    break;
                case 50:
                    System.out.print("Fifty ");
                    break;
                case 60:
                    System.out.print("Sixty ");
                    break;
                case 70:
                    System.out.print("Seventy ");
                    break;
                case 80:
                    System.out.print("Eighty ");
                    break;
                case 90:
                    System.out.print("Ninety ");
                    break;
            }
            switch (number % 10) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
        }
    }
}
