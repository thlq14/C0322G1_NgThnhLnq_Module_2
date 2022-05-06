package ss03_Array_Method_Java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("\n" + "Delete Element: ");
        int indexDelete = scanner.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (indexDelete == array[j] && indexDelete != array[array.length - 1]) {
                array[j] = array[j + 1];
                array[j + 1] = 0;
            } else if (indexDelete == array[array.length - 1]) {
                array[array.length - 1] = 0;
            }
        }
        System.out.print("Deleted Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
