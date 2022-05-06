package ss02_Loop_Java.bai_tap;

import java.util.Scanner;

public class HienThiSNTDuoi100 {
    public static void main(String[] args) {
        int num;
        int number = 3;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hiển thị các số nguyên tố nhỏ hơn: ");
        num = scanner.nextInt();
        if (num >= 1) {
            System.out.println("Các Số nguyên tố nhỏ hơn " + num + ": ");
            System.out.println("2");
        }
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                System.out.println(number);
                i++;
            }
            flag = false;
            number++;
        }
    }
}
