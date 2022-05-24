package ss14_Sort_Algorithm.bai_tap.illustraction_insert_sort_algorithm;

import java.util.Scanner;

public class IllustrationInsertSort {
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
        System.out.println();
        insertionSort(list);
        for (int item : list) {
            System.out.print(item + "\t");
        }
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { // đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
                System.out.println("Di chuyển Phần tử: " + array[pos]);
            }
            if (pos != i) {
                System.out.println("Chèn Phần tử: " + x + ", tại vị trí: " + pos);
                array[pos] = x;
            }
            System.out.println("\nVòng lặp thứ: " + i);
            System.out.print("[");
            for (int j : array) {
                System.out.print(j + " ");
            }
            System.out.print("]\n");
        }
        System.out.println("Array After Sort: ");
    }
}

