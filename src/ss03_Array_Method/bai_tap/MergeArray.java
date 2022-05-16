package ss03_Array_Method.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        System.out.println("Enter Element of array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        int[] array2 = new int[5];
        System.out.println("Enter Element of array 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        System.out.println("Array 1: ");
        for (int k : array1) {
            System.out.print(k + "\t");
        }
        System.out.println("\n" + "Array 2: ");
        for (int k : array2) {
            System.out.print(k + "\t");
        }
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("\n" + "Array 3: ");
        for (int i : array3) {
            System.out.print(i + "\t");
        }
    }
}
