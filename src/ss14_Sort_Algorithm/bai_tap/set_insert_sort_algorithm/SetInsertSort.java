package ss14_Sort_Algorithm.bai_tap.set_insert_sort_algorithm;

import java.util.Scanner;

public class SetInsertSort {
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

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
