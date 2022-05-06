package ss02_Loop_Java.bai_tap;

import java.util.Scanner;

public class HienThi20SNT {
    public static void main(String[] args) {

        int count = 0;
        int number = 3;
        boolean flag = true;
        System.out.println(20 + " số nguyên tố đầu tiên: ");
        System.out.println(2);
        for (int i = 2; i <= 20; ) {
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                System.out.println(number);
                i++;
                count++;
            }
            flag = true;
            number++;
        }
    }
}

