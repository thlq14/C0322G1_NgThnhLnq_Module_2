package ss02_Loop_Java.bai_tap;

import java.util.Scanner;

public class HienThi20SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int num = 4;
        System.out.println(number + " số nguyên tố đầu tiên: ");
        System.out.println(2 + "\n" + 3 + "\n");
        while (count < number) {
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(num + "\n");
                count++;
            }
            num++;
        }
    }
}
