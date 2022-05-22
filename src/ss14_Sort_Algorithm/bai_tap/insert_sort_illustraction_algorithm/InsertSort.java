package ss14_Sort_Algorithm.bai_tap.insert_sort_illustraction_algorithm;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter List Size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " Values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your Input List: \n");
        for (int j : list) {
            System.out.print(j + "\t");
        }
        System.out.println("\nAfter Sort: ");
        insertionSort(list);
        for (int item : list) {
            System.out.print(item + "\t");
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) { // đoạn array[0] đã sắp xếp
            int temp = array[i];
            while (i > 0 && temp < array[i - 1]) {
                array[i] = array[i - 1]; // đổi chỗ
                i--;
            }
            array[i] = temp;
        }
    }
}

