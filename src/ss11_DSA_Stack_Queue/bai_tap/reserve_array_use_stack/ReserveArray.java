package ss11_DSA_Stack_Queue.bai_tap.reserve_array_use_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReserveArray {
    public static void main(String[] args) {
        // Đảo ngược phần tử trong mảng số nguyên.
        Stack<Integer> stackInterger = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng trước khi đảo: " + Arrays.toString(array));

        for (Integer item : array) {
            stackInterger.push(item);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stackInterger.pop();
        }
        System.out.println("Mảng sau khi đảo: " + Arrays.toString(array));

    }
}
