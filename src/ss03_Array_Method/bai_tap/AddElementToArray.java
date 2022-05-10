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
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("\n" + "Insert Element: ");
        int indexElm = scanner.nextInt();
        System.out.print("Insert Position: ");
        int indexPos = scanner.nextInt();
        if (indexPos <= -1 || indexPos >= array.length - 1) {
            System.out.print("NOT insert a element into array");
        } else {
            for (int j = 0; j < array.length; j++) {
                if (indexPos == j && indexElm != array[array.length - 1]) {
                    for (int k = array.length - 1; k > j; k--) {
                        array[k] = array[k - 1];
                    }
                    array[j] = indexElm;
                }
            }
            System.out.print("New Value: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
        }
    }
}
