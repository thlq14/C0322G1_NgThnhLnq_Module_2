package ss03_Array_Method.bai_tap;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Elements in array: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.print("\n" + "Insert Element: ");
        int insertEle = scanner.nextInt();
        System.out.print("Insert Position: ");
        int insertPos = scanner.nextInt();
        if (insertPos <= -1 || insertPos >= array.length - 1) {
            System.out.print("NOT insert a element into array");
        } else {
            for (int j = 0; j < array.length; j++) {
                if (insertPos == j && insertEle != array[array.length - 1]) {
                    for (int k = array.length - 1; k > j; k--) {
                        array[k] = array[k - 1];
                    }
                    array[j] = insertEle;
                }
            }
            System.out.print("New Value: ");
            for (int k : array) {
                System.out.print(k + "\t");
            }
        }
    }
}
