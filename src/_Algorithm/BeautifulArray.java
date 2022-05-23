package _Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        System.out.print("Input Number: ");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < num / 2; i++) {
            sum1 += arr[i];
        }
        System.out.println(sum1);
        for (int i = num / 2; i < num; i++) {
            sum2 += arr[i];
        }
        System.out.println(sum2);
        if (sum1 == sum2) {
            System.out.println("Beautiful!");
        } else {
            System.out.println("Bad!");
        }
    }

}
