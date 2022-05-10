package ss03_Array_Method.bai_tap;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
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
        System.out.println("Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("\n" + "Delete Value: ");
        int indexDel = scanner.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (indexDel == array[j] && indexDel != array[array.length - 1]) {
                array[j] = array[j + 1];
                for (int k = j + 1; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
                array[array.length - 1] = 0;
                j--;
            } else if (indexDel == array[array.length - 1]) {
                array[array.length - 1] = 0;
            }
        }
        System.out.print("New Value: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
